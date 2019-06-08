package com.githeko.naks1;


        import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.stage.Stage;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.HBox;

/**
 *
 * @author githeko@egerton.ac.ke
 */

public class GUI2 extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
//Create a Grid layout - read about Grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
//Create and add a Label
        Label pw = new Label("Enter word to translate"); //**
        grid.add(pw, 0, 2); //Add Label to grid in Column 0, row 2)
//Create and add a TextField
        TextField pwBox = new TextField(); //**
        grid.add(pwBox, 1, 2); //Add TextField to grid in Column 1, row 2)
//Create Buttons
        Button btn = new Button("Translate"); //**
        Button btn1 = new Button("Clear"); //**
        Button btn2 = new Button("Exit"); //**
//Define an HBox (Horizontal Box layout)
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
// How to add GUI controls to an HBox (Horizontal Box layout) -read about HBox layout
        hbBtn.getChildren().add(btn); //**
        hbBtn.getChildren().add(btn1); //**
        hbBtn.getChildren().add(btn2); //**
//Add the HBox to the Grid
        grid.add(hbBtn, 1, 4); //Add HBox to grid in Column 1, row 4)
//Add window (Stage) title
        primaryStage.setTitle("Translate!");
//Make the Stage (window) visible.
        primaryStage.show(); //**
//Set the Scene size
        Scene scene = new Scene(grid, 400, 150); //**
        primaryStage.setScene(scene); //Attach the Scene to the Stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
