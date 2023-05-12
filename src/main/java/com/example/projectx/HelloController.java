package com.example.projectx;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView img;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("bienvenue");
    }

    @FXML
    protected void onTestButtonClick() {

        welcomeText.setText("Le test fonctionne");
    }
    @FXML
    private Label LabelTitle1;
    @FXML
    protected void SetRedLabel(){

        LabelTitle1.setTextFill(Color.RED);
    }
    @FXML
    protected void SetBlueLabel(){
        LabelTitle1.setTextFill(Color.BLUE);}
    @FXML
    protected void SetYellowLabel(){
        LabelTitle1.setTextFill(Color.YELLOW);}
    @FXML
    FileChooser fileChooser = new FileChooser();
    @FXML
    protected void ImageButton() {
        File file = fileChooser.showOpenDialog(null);
        Image img2 = new Image(file.toURI().toString());
        img.setImage(img2);

    }

}