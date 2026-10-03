import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class slip4Q2 extends Application{
    public void start(Stage stage){
        Label title=new Label("select programming language.");

        ComboBox<String>combobox=new ComboBox<>();

        combobox.getItems().addAll("c","c++","java","php");

        combobox.setValue("java");

        Button  show= new Button("Show");

        Label message=new Label();

        show.setOnAction(e->{
            String lang=combobox.getValue();

            message.setText("Programming language selected: "+lang);
        });

        GridPane root =new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        root.add(title,0,0);
        root.add(combobox,1,0);

        root.add(show,1,1);

        root.add(message,0,2,2,1);

        Scene scene=new Scene(root,500,600);

        stage.setTitle("Combo box example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
