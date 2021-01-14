import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/***
 * Controller for the main menu. Depending on what the user inputs, it can go 
 * to the garden option screen, or it can straight to the garden worskpace.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 *
 */
public class MainController {
	private MainView mainView;
	private ControllerOne controllerOne;
	private Stage stage;
	private FileChooser fileChooser;
	private File fileToLoad;
	private ControllerTwo controllerTwo;
	
	/***
	 * Initializes the Stage to set the next Scene
	 * @param stage the Stage
	 */
	public MainController(Stage stage) {
		mainView = new MainView(stage);
		mainView.getNewGardenButton().setOnMouseClicked(e-> handleNewGardenButtonPress(e));
    	mainView.getLoadGardenButton().setOnMouseClicked(e-> handleLoadGardenButton(e));
		this.stage = stage;
		fileChooser = new FileChooser();
		controllerOne = new ControllerOne(stage);
	}
	
	/***
	 * Handles the event by setting Scene for ViewTwo after Deserializing Garden
	 * @param e the MouseEvent for click
	 */
	public void handleLoadGardenButton(MouseEvent e) {
		fileChooser.setTitle("Load Your Garden");
		fileChooser.setInitialDirectory(new File("saves/"));
		fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Serialized File(*.ser)", "*.ser"));
		fileToLoad = fileChooser.showOpenDialog(stage);
		if(fileToLoad == null) {
			return;
		}
		Garden userSavedGarden = deserializeGarden(fileToLoad);
		controllerTwo = new ControllerTwo(stage, userSavedGarden);
		controllerTwo.getViewTwo().startShow();
	}

	/***
	 * Handles the event by setting Scene for ViewOne
	 * @param e the MouseEvent for click
	 */
	public void handleNewGardenButtonPress(MouseEvent e) {
		stage.setScene(controllerOne.getViewOne().getScene());
		controllerOne.getViewOne().startShow();
	}
	
	/***
	 * Renders the Garden from Deserialization
	 * @param file the File that needs to be deserialized
	 * @return the Garden after deserializing
	 */
	public Garden deserializeGarden(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Garden garden = (Garden)ois.readObject();
			ois.close();
			return garden;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
