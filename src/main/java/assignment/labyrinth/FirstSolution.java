package assignment.labyrinth;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import state.Table;
import state.TableNode;
import java.io.IOException;
import java.util.ArrayList;


public class FirstSolution extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FirstSolution.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private static String getJsonPath(){
        return FirstSolution.class.getClassLoader().getResource("nodes.json").toString();
    }

    public static void main(String[] args) {
        //var jsonPath = getJsonPath();
        //JsonHandler handler = new JsonHandler("src/main/resources/assignment/labyrinth/nodes.json");
        //JsonHandler handler = new JsonHandler(jsonPath);
        //Table table = new Table(handler.getPanes());
        launch();
    }
}