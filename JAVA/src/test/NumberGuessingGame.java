package test;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class NumberGuessingGame extends Application {
    private int targetNumber;
    private int numAttempts;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Number Guessing Game");

        Label titleLabel = new Label("Welcome to Number Guessing Game!");
        Label instructionLabel = new Label("Guess a number between 1 and 100:");
        TextField inputField = new TextField();
        Button guessButton = new Button("Guess");
        Label resultLabel = new Label();

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(titleLabel, instructionLabel, inputField, guessButton, resultLabel);

        // Generate random number between 1 and 100
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;

        // Event handler for the Guess button
        guessButton.setOnAction(e -> {
            try {
                int userGuess = Integer.parseInt(inputField.getText());
                numAttempts++;

                if (userGuess == targetNumber) {
                    showAlert("Congratulations!", "You guessed the number in " + numAttempts + " attempts!");
                    primaryStage.close();
                } else if (userGuess < targetNumber) {
                    resultLabel.setText("Try higher!");
                } else {
                    resultLabel.setText("Try lower!");
                }
            } catch (NumberFormatException ex) {
                showAlert("Error", "Please enter a valid number.");
            }
        });

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to show an alert dialog
    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
