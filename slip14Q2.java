import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class slip14Q2 extends Application {
    public void start(Stage stage){
        Lable title=new Label("login");

        Label username=new Label("username");
        Label password=new Label("password");

        TextField t1=new TextField();
        PasswordField p1=new PasswordField();

        Button login=new Button("Login");
        Button reset=new Button("reset");

        Label message=new Label();

        GridPane root=new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        root.add(username,0,1);
        root.add(t1,1,1);

         root.add(password,0,2);
        root.add(p1,1,2);

        root.add(login,0,3);
        root.add(reset,1,3);

        root.add(message,0,5);

        login.setOnAction(e->{
            String user=t1.getText();
            String pass=p1.getText();

            if(user.equals("admin")&&pass.equals("admin")){
                message.setText("User login sucecessfuly");
            }
            else{
                message.setText("incorrect credentials");
            }
        });

        reset.setOnAction(e->{
            t1.clear();
            p1.clear();
            message.setText("");
        });

        Scene scene=new Scene(root,500,600);

        stage.setTitle("login ");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
