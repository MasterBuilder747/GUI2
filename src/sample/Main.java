package sample;

//import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene; //in control file
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    //Button button; //not needed here actually, but works in the scope

    public static void main(String[] args) {

        //do not understand what this does specifically yet
        //where it is calling this method is unknown yet
        launch(args);

    }

    //everything here makes sense
    @Override
    public void start(Stage primaryStage) {

        //Button button; //not here either, might as well to clean up the code

        //title on the top of the window
        primaryStage.setTitle("A program");

        //make a button object
        Button button = new Button(); //here
        button.setText("yay spam"); //button will display without text

        //position is an object apparently
        //Pos pos = new Pos();

        Button button2 = new Button(); //make a new button
        button2.setText("another one");
        button2.setLayoutX(100);
        Button button3 = new Button(); //make a new button
        button3.setText("another one");
        button3.setLayoutX(200);
        Button button4 = new Button(); //make a new button
        button4.setText("another one");
        button4.setLayoutX(300);


        //puts the button into the scene
        Pane layout = new Pane(); //makes a stackpane, which stores the layout to be displayed
        //stackpane vs pane: stackpane centers the button automatically, pane does not, and allows for positioning
        layout.getChildren().add(button); //add the button to the stackpane
        layout.getChildren().add(button2); //add the second button to the same stackpane
        layout.getChildren().add(button3); //add the second button to the same stackpane
        layout.getChildren().add(button4); //add the second button to the same stackpane
        //this puts it into the same position, so it needs to be set

        Scene scene = new Scene(layout, 600, 400); //size of the window, default (can be resized), not required

        //stackpane is required
        primaryStage.setScene(scene); //set scene passed in
        //when disabled, it will have a default scene layout anyways
        primaryStage.show(); //output to user, if not working it will not show but the process will be there
        //macOS has issues and the process needs to be terminated manually using force quit

    }

}
