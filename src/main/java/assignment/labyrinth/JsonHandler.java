package assignment.labyrinth;

import org.json.JSONArray;
import org.json.JSONObject;
import state.TableNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JsonHandler {
    private static ArrayList<TableNode> panes;
    private String path;
    //"src/main/resources/assignment/labyrinth/nodes.json"

    public JsonHandler(String path){
        this.panes  = new ArrayList<TableNode>();
        this.path = path;
        readPanes();
    }
    private JSONArray constructArray(String path) throws  IOException{
        String jsonString = new String(Files.readAllBytes(Paths.get(path)));
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("nodes");
        return jsonArray;
    }

    public void readPanes() {
        try{
            JSONArray jsonArray = constructArray(path);
            var paneConstructor = new JSONObject();
            for( int i = 0;i < jsonArray.length(); i++){
                paneConstructor = jsonArray.getJSONObject(i);
                panes.add(
                        new TableNode(
                                paneConstructor.getInt("bottomColor"),
                                paneConstructor.getInt("topColor"),
                                paneConstructor.getInt("leftColor"),
                                paneConstructor.getInt("rightColor")
                        )
                );

            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public ArrayList<TableNode> getPanes() {
        return panes;
    }
}
