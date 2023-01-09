
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            // Construct controls

            ColorPicker colorPicker = new ColorPicker();

            Color value = colorPicker.getValue();

            ProgressBar progressBar = new ProgressBar(0);

            progressBar.setProgress(0.5);

            TextArea textArea = new TextArea();

            Label label1 = new Label(" Happy ");
            Label label2 = new Label(" New ");
            Label label3 = new Label(" Year !");
            Label label4 = new Label(" Hello !");
            Label label5 = new Label(" You're back !");
            Label label6 = new Label(" More");
            Label label7 = new Label(" controls");
            // Layout the controls
            HBox hbox2 = new HBox(label6,label7);
            VBox vbox1 = new VBox(label4,label5, colorPicker,progressBar,hbox2,textArea);
            HBox hbox1 = new HBox(label1, label2,label3, vbox1);
            Scene scene = new Scene(hbox1, 400, 200);
            // Put the layout into the scene
            primaryStage.setScene(scene);
            primaryStage.setTitle("My First JavaFX App");
            primaryStage.show();
        }

        public static void main(String[] args) {
            Application.launch(args);
        }
    }
