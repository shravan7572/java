import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class slip3Q2 extends Application {
    public void start(Stage stage) {
        PieChart pi = new PieChart();

        pi.getData().add(new PieChart("food", 1000));
        pi.getData().add(new PieChart("rent", 10000));
        pi.getData().add(new PieChart("transport", 3000));
        pi.getData().add(new PieChart("Entertainment", 1000));
        pi.getData().add(new PieChart("other", 11000));

        pi.setTitle("expense");

        Scene scene=new Scene(pi,500,800);

        stage.setTitle("expense");
        stage.setScene(scene);
        stage.setShow();
    }
    public static void main(String[] args){
        launch(args);
    }
}
