package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enc; //bt

    @FXML
    private Button dec; //bt

    @FXML
    private TextArea newtext;

    @FXML
    private  TextField text;    // first

    @FXML
    private TextField key; // second

    @FXML
    void initialize() {
        enc.setOnAction(event -> {
            String t1 = text.getText();
            String k = key.getText();
            int kk = Integer.parseInt(k);





            char[] chars = t1.toCharArray();
            StringBuilder test2 = new StringBuilder();
            for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]-kk);
                test2.append(chars[b]);}
            newtext.setText(String.valueOf(test2));






        });
        dec.setOnAction(event -> {
            String t1 = text.getText();
            String k = key.getText();
            int kk = Integer.parseInt(k);




            char[] chars = t1.toCharArray();
            StringBuilder test2 = new StringBuilder();
            for(byte b=0; chars.length>b;b++){  chars[b]=(char) (chars[b]+kk);
                test2.append(chars[b]);}
            newtext.setText(String.valueOf(test2));






        });










    }}
    /*public class events implements ActionListener{



        public void actionPerformed(ActionEvent e) {
            if( e.getSource()==enc  ){

                newtext.setText("О");




        }
    }
}}
*/