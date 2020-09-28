
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	// declare five buttons, a label, and a textfield
	// declare two HBoxes
	Button helloButton;
	Button howdyButton;
	Button chineseButton;
	Button clearButton;
	Button exitButton;

	Label feedbackLabel;

	TextField txtField;

	HBox buttonBox;
	HBox feedbackBox;

	// student Task #4:
	// declare an instance of DataManager
	DataManager data;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		// instantiate the HBoxes
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");

		feedbackLabel = new Label("Feedback:");

		txtField = new TextField();

		buttonBox = new HBox();
		feedbackBox = new HBox();

		// student Task #4:
		// instantiate the DataManager instance
		// set margins and set alignment of the components
		data = new DataManager();

		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		// add the buttons to the other HBox
		// add the HBoxes to this FXMainPanel (a VBox)
		buttonBox.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton);
		feedbackBox.getChildren().addAll(feedbackLabel, txtField);
		
		// setting margins and alignment of components
		Insets ins = new Insets(3);
		
		HBox.setMargin(helloButton,  ins);
		HBox.setMargin(howdyButton, ins);
		HBox.setMargin(chineseButton, ins);
		HBox.setMargin(clearButton, ins);
		HBox.setMargin(exitButton, ins);
		
		buttonBox.setAlignment(Pos.CENTER);
		feedbackBox.setAlignment(Pos.CENTER);
		this.setAlignment(Pos.CENTER);

		getChildren().addAll(buttonBox, feedbackBox);
	}

	// Task #4:
	// create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			EventTarget target = event.getTarget();
			if (target == helloButton) {
				txtField.setText(data.getHello());
			} else if (target == howdyButton) {
				txtField.setText(data.getHowdy());
			} else if (target == chineseButton) {
				txtField.setText(data.getChinese());
			} else if (target == clearButton) {
				txtField.setText("");
			} else if (target == exitButton) {
				Platform.exit();
				System.exit(0);
			}
		}

	}
}
