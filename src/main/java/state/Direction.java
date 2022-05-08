package state;

public enum Direction {
    UP("top"),
    DOWN("bottom"),
    LEFT("left"),
    RIGHT("right");

    private String targetDirection;
    Direction(String target){
        this.targetDirection=target;
    }



}
