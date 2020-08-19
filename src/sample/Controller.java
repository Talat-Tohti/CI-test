package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.PerspectiveCamera;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML
    RadioButton large ;
    @FXML
    RadioButton small;
    @FXML
    RadioButton medium;
    @FXML
    RadioButton StuffedCrust;
    @FXML
    RadioButton thin;
    @FXML
    CheckBox Ham;
    @FXML
    CheckBox Peperoni;
    @FXML
    CheckBox Olives;
    @FXML
    CheckBox Greenpeppers;
    @FXML
    Label display;
    @FXML
    Button check;

    private int price=0;

    public void checkbox (ActionEvent event){
        if((Ham.isSelected() && Olives.isSelected()) && Peperoni.isSelected()) {
            Greenpeppers.setDisable(true);
        }
        else if((Ham.isSelected() && Olives.isSelected()) && Greenpeppers.isSelected()) {
            Peperoni.setDisable(true);
        }
        else if((Peperoni.isSelected() && Olives.isSelected()) && Greenpeppers.isSelected()) {
            Ham.setDisable(true);
        }
        else if((Ham.isSelected() && Peperoni.isSelected()) && Greenpeppers.isSelected()) {
            Olives.setDisable(true);
        }

    }

    public void printmsg (ActionEvent event){

        String msg="You ordered: " ;

        //radiobuttons
        if(large.isSelected()){
            msg+=" large";
            price=10;
        }

        if(medium.isSelected()){
            msg+=" medium";
            price=8;
        }

        if(small.isSelected()){
            msg+=" small";
            price=6;
        }

        // checkboxes

        if(Ham.isSelected()){
            msg+=" Ham";
        }

        if(Peperoni.isSelected()){
            msg+=" Peperoni";
        }

        if(Greenpeppers.isSelected()){
            msg+="  Green peppers";
        }


        if(Olives.isSelected()){
            msg+=" Olives";
        }

        if(StuffedCrust.isSelected()){
            msg+=" Stuffed Crust";
        }

        if(thin.isSelected()){
            msg+=" thin";
        }
        msg+="\n Your total is : "+"$"+price;
        display.setText(msg);

    }



}
