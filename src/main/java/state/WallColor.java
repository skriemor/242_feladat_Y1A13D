package state;

import java.util.Arrays;
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
    WallColor(String id){
        this.colorID = Integer.parseInt(id);
    }
    public static  WallColor parse(int i){
        for (WallColor e: values()){
            if ( e.colorID == i) return e;
        }
        return Black;
    }

}
