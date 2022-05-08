package state;

import java.util.ArrayList;

public class Table {
    private TableNode initialNode;

    public Table(ArrayList<TableNode> listOfPanes){
        this.initialNode = listOfPanes.get(0);
        ConstructTable(listOfPanes);
    }

    private void ConstructBottom(ArrayList<TableNode> nodes){
        for(int i = 0; i < nodes.size() -4; i++){
            nodes.get(i).setBottom(nodes.get(i+4));
        }
    }
    private void ConstructTop(ArrayList<TableNode> nodes){
        for(int i = 4; i < nodes.size(); i++){
            nodes.get(i).setBottom(nodes.get(i-4));
        }
    }
    private void ConstructRight(ArrayList<TableNode> nodes){
        for(int i = 0; i < nodes.size(); i++){
            if(i == 0 || i % 4 != 3) nodes.get(i).setRight(nodes.get(i+1));
        }
    }
    private void ConstructLeft(ArrayList<TableNode> nodes){
        for(int i = 0; i < nodes.size(); i++){
            if(i % 4 != 0) nodes.get(i).setLeft(nodes.get(i-1));
        }
    }
    private void ConstructTable(ArrayList<TableNode> nodes){
        ConstructBottom(nodes);
        ConstructTop(nodes);
        ConstructRight(nodes);
        ConstructLeft(nodes);
    }

    public TableNode getInitialNode() {
        return initialNode;
    }
}
