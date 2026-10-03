import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class slip7Q2 extends Application {
    public void start(Stage stage) {
        Label title = new Label("customer form");

        Label l1 = new Label("name of customer");
        Label l2 = new Label("name of bank");
        Label l3 = new Label("acc no");
        Label l4 = new Label("pay number");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button submit = new Button("submit");
Label message = new Label();
        GridPane root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        root.add(l1, 0, 1);
        root.add(t1, 1, 1);

        root.add(l2, 0, 2);
        root.add(t2, 1, 2);

        root.add(l3, 0, 3);
        root.add(t3, 1, 3);

        root.add(l4, 0, 4);
        root.add(t4, 1, 4);

        root.add(submit,0,5);
        root.add(message,0,7);

        
        
        submit.setOnAction(e -> {
            if (t1.getText().isEmpty()) {
                message.setText("please enter customer name>");
            }

            if (t2.getText().isEmpty()) {
                message.setText("please enter bank name>");
            }

            if (t3.getText().isEmpty()) {
                message.setText("please enter account number>");
            }

            if (t4.getText().isEmpty()) {
                message.setText("please enter pay number>");
            }
        });

        Scene scene = new Scene(root, 600, 700);

        stage.setTitle("bank detail");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args)
    }
}