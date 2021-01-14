import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/***
 * This scene allows the user to input the size of the garden and the background image
 * if they want to. They can skip this part now too.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 *
 */
public class ViewOne {	
	private AnchorPane ap;
	private Button uploadGardenImageButton;
	private Button skipGardenImageButton;
	private TextField widthField;
	private TextField heightField;
	private HBox hbox = new HBox();
	private Scene scene;
	private Stage stage;
	final static private int WIDTH = 800;
	final static private int HEIGHT = 600;
	final static private int BUTTONX = 450;
	final static private int LOAD_BUTTONY = 400;
	final static private int SKIP_BUTTONY = 200;
	final static private int BUTTON_HEIGHT = 75;
	final static private int BUTTON_WIDTH = 200;
	final static private int HBOX_X = 50;
	final static private int HBOX_Y = 300;
	
	/***
	 * Initializes the instance variables, sets the Scene, and displays it on Stage
	 * @param stage the Stage to display for ViewOne
	 */
	public ViewOne(Stage stage){
		this.stage = stage;
		ap = new AnchorPane();
    	BackgroundImage backgroundImage = new BackgroundImage(new Image("img/LoadImageBackground.jpg"),BackgroundRepeat.NO_REPEAT, 
    			BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
    	ap.setBackground(new Background(backgroundImage));
    	
    	Label heightLab = new Label("Height");
    	heightLab.setStyle("-fx-font-weight: bold;");
    	heightLab.setTextFill(Color.web("#FFFFFF"));
    	heightLab.setTranslateX(HBOX_X);
    	heightLab.setTranslateY(HBOX_Y - 20);
    	ap.getChildren().add(heightLab);
    	
    	Label  widthLab = new Label("Width");
    	widthLab.setStyle("-fx-font-weight: bold;");
    	widthLab.setTextFill(Color.web("#FFFFFF"));
    	widthLab.setTranslateX(HBOX_X + 150);
    	widthLab.setTranslateY(HBOX_Y - 20);
    	ap.getChildren().add(widthLab);
    	
    	widthField = new TextField("250");
    	widthField.setPromptText("Input yard width (ft):");
    	heightField = new TextField("250");
    	heightField.setPromptText("Input yard height (ft):");
    	
    	hbox.getChildren().add(widthField);
    	hbox.getChildren().add(heightField);
    	hbox.setTranslateX(HBOX_X);
    	hbox.setTranslateY(HBOX_Y);
    	ap.getChildren().add(hbox);
    	
    	uploadGardenImageButton = new Button("Load Garden Background Image");
    	skipGardenImageButton = new Button("No Background");
    	
    	uploadGardenImageButton.setTranslateX(BUTTONX);
    	uploadGardenImageButton.setTranslateY(LOAD_BUTTONY);
    	uploadGardenImageButton.setPrefHeight(BUTTON_HEIGHT);
    	uploadGardenImageButton.setPrefWidth(BUTTON_WIDTH);
    	
    	skipGardenImageButton.setTranslateX(BUTTONX);
    	skipGardenImageButton.setTranslateY(SKIP_BUTTONY);
    	skipGardenImageButton.setPrefHeight(BUTTON_HEIGHT);
    	skipGardenImageButton.setPrefWidth(BUTTON_WIDTH);
    	
    	ap.getChildren().add(uploadGardenImageButton);
    	ap.getChildren().add(skipGardenImageButton);
    	scene = new Scene(ap,WIDTH,HEIGHT);
	}
	
	/***
	 * Starts the show. When this is ran the scene switches over to this one
	 */
	public void startShow() {
		stage.setScene(scene);
		stage.show();
	}
	/***
	 * Returns the most recent Scene for ViewOne
	 * @return the current Scene for ViewOne
	 */
	public Scene getScene() {
		return scene;
	}
	
	/***
	 * Getter the upload image button
	 * @return the upload image button
	 */
	public Button getUploadImageButton() {
		return uploadGardenImageButton;
	}
	
	/***
	 * Getter for the height textfield
	 * @return the text field for height
	 */
	public TextField getHeightField() {
		return heightField;
	}
	
	/***
	 * Getter for the width textfield
	 * @return the text field for width
	 */
	public TextField getWidthField() {
		return widthField;
	}
	
	/***
	 * Getter for the skip button
	 * @return the skip garden image button
	 */
	public Button getSkipGardenImageButton() {
		return skipGardenImageButton;
	}
}
