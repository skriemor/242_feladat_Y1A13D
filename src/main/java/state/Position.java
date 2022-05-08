package state;

public class Position {
    private int col, row;

    public Position(int row, int col){
        this.row=row;
        this.col=col;
    }

    public int[] getPosition(){
        return new int[]{this.row,this.col};
    }
}
