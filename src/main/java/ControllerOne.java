import java.io.File;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/***
 * This is the controller for the garden options scene. To proceed,
 * the user must click the skip or load button. Both advance to the second scene.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 * 
 *
 */
public class ControllerOne {
	private ViewOne viewOne;
	private Stage stage;
	private ControllerTwo controllerTwo;
	private File bg;
	
	/***
	 * Initializes the Stage to set the next Scene
	 * Passes that to ViewOne that uses it.
	 * @param stage the Stage 
	 */
	public ControllerOne(Stage stage) {
		viewOne = new ViewOne(stage); 
	  	viewOne.getUploadImageButton().setOnMouseClicked(e -> handleUploadGardenButtonPress(e));
	  	viewOne.getSkipGardenImageButton().setOnMouseClicked(e->handleSkipGardenImageButton(e));
		this.stage = stage;
	}
	/***
	 * 
	 * @param e MouseEvent for clicking the button
	 * creates the controllerTwo and sets its viewTwo to be the scene (instead of viewOne).
	 */
	public void handleSkipGardenImageButton(MouseEvent e) {
		controllerTwo = new ControllerTwo(null, stage, viewOne.getHeightField().getText(), viewOne.getWidthField().getText());
		controllerTwo.getViewTwo().startShow();
	}

	/***
	 * Handles the event by setting the Scene for ViewTwo with user selected Background Image for Garden
	 * @param e the MouseEvent for click
	 */
	public void handleUploadGardenButtonPress(MouseEvent e) {
		FileChooser choose = new FileChooser();
		choose.setInitialDirectory(new File("bg/"));
		choose.setTitle("Select your background image");
		bg = choose.showOpenDialog(stage);
		//this is to stop program from crashing if you exit out of filechooser.
		if(getBg() == null) {
			return;
		}
		controllerTwo = new ControllerTwo(getBg(), stage, viewOne.getHeightField().getText(), viewOne.getWidthField().getText());
		controllerTwo.getViewTwo().startShow();
	}
	/***
	 * Getter for viewOne
	 * @return this class's viewOne
	 */

	public ViewOne getViewOne() {
		return viewOne;
	}

	/***
	 * Getter for bg
	 * @return returns the file that holds the background image
	 */
	public File getBg() {
		return bg;
	}
}
