package state;

import java.util.List;

public enum WallColor {
    Black(0),
    White(1),
    Blue(2),
    Red(3);
    private int colorID;

    WallColor(int id){
        this.colorID=id;
    }

}
