package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {


  public Button buttonCompleted;
  public CheckBox request1;
  public Button buttonViewEmloyees;
  public Button buttonCrateAccount;
  public Button buttonRequests;
  public Button buttonFloorChart;
  public Button buttonLogOut;
  public Text welcomeToFgcu;

  public void welcomeToFgcuCliked(MouseEvent mouseEvent) {

    //this would take us to home page



  }

  public void viewRequest1(ActionEvent actionEvent) {


    //I dont know if we can implement window-expand on mouse click
  }

  public void requestCompleted(ActionEvent actionEvent) {
    //completed button for requests
  }
}
