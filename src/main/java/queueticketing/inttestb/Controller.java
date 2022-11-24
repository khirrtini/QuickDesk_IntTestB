package queueticketing.inttestb;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.layout.VBox;

public class Controller {

    //Creates a waiting queue
    Queue q = new Queue();


    //Creates an alert for when the waiting queue is empty (i.e. no customers waiting)
    Alert alert = new Alert(Alert.AlertType.ERROR);

    public void checkIfEmpty(){
        alert.setHeaderText("No customers in queue.");
        alert.setContentText("Please wait for more customers to arrive.");
        if (q.getIndex() == 0){
            alert.showAndWait();
        }
    }


    //Customer Section

    @FXML
    private Text latest_serving_number;
    @FXML
    private Text last_issued_number;

    @FXML
    private VBox c1;
    @FXML
    private Circle c1_status;
    @FXML
    private Text c1_cur_num;

    @FXML
    private VBox c2;
    @FXML
    private Circle c2_status;
    @FXML
    private Text c2_cur_num;

    @FXML
    private VBox c3;
    @FXML
    private Circle c3_status;
    @FXML
    private Text c3_cur_num;

    @FXML
    private VBox c4;
    @FXML
    private Circle c4_status;
    @FXML
    private Text c4_cur_num;

    /*
        Action for 'Take a Number' button.
        Issues a ticket and displays the last issued number.
     */
    @FXML
    void takeNumberClicked() {
        q.issueTicket();
        last_issued_number.setText(Integer.toString(q.getIssued()));
    }


    //Counter Section

    /*
        Actions for 'Call Next' buttons.

        First checks if queue is empty.
        Enables the counter on the Customer section
        Removes customer from the waiting queue (for 'serving')
        Displays / Updates the current serving number for the particular counter.
        Displays / Updates the latest serving number
        Sets counter colour to red - indicating online but busy
     */

    @FXML
    void c1_NextClicked() {
        checkIfEmpty();
        c1.setDisable(false);
        q.serveTicket();
        c1_cur_num.setText(Integer.toString(q.getServing()));
        latest_serving_number.setText(Integer.toString(q.getServing()));
        c1_status.setFill(Color.RED);
    }

    @FXML
    void c2_NextClicked() {
        checkIfEmpty();
        c2.setDisable(false);
        q.serveTicket();
        c2_cur_num.setText(Integer.toString(q.getServing()));
        latest_serving_number.setText(Integer.toString(q.getServing()));
        c2_status.setFill(Color.RED);
    }

    @FXML
    void c3_NextClicked() {
        checkIfEmpty();
        c3.setDisable(false);
        q.serveTicket();
        c3_cur_num.setText(Integer.toString(q.getServing()));
        latest_serving_number.setText(Integer.toString(q.getServing()));
        c3_status.setFill(Color.RED);
    }

    @FXML
    void c4_NextClicked() {
        checkIfEmpty();
        c4.setDisable(false);
        q.serveTicket();
        c4_cur_num.setText(Integer.toString(q.getServing()));
        latest_serving_number.setText(Integer.toString(q.getServing()));
        c4_status.setFill(Color.RED);
    }


    /*
        Actions for 'Complete' buttons.

        Enables the counter on the Customer section.
        Sets counter colour to green - indicating online and available.
        Removes the current serving number for the particular counter.
     */

    @FXML
    void c1_CompleteClicked() {
        c1.setDisable(false);
        c1_status.setFill(Color.GREEN);
        c1_cur_num.setText("----");
    }

    @FXML
    void c2_CompleteClicked() {
        c2.setDisable(false);
        c2_status.setFill(Color.GREEN);
        c2_cur_num.setText("----");
    }

    @FXML
    void c3_CompleteClicked() {
        c3.setDisable(false);
        c3_status.setFill(Color.GREEN);
        c3_cur_num.setText("----");
    }

    @FXML
    void c4_CompleteClicked() {
        c4.setDisable(false);
        c4_status.setFill(Color.GREEN);
        c4_cur_num.setText("----");
    }


    /*
        Actions for 'Go Offline' buttons.

        Disables the counter on the Customer section
        Sets counter colour to gray - indicating offline
        Removes the current serving number for the particular counter.
     */

    @FXML
    void c1_goOfflineClicked() {
        c1.setDisable(true);
        c1_status.setFill(Color.GRAY);
        c1_cur_num.setText("----");
    }

    @FXML
    void c2_goOfflineClicked() {
        c2.setDisable(true);
        c2_status.setFill(Color.GRAY);
        c2_cur_num.setText("----");
    }

    @FXML
    void c3_goOfflineClicked() {
        c3.setDisable(true);
        c3_status.setFill(Color.GRAY);
        c3_cur_num.setText("----");
    }

    @FXML
    void c4_goOfflineClicked() {
        c4.setDisable(true);
        c4_status.setFill(Color.GRAY);
        c4_cur_num.setText("----");
    }

}





