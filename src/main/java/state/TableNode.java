package state;


public class TableNode {

    private WallColor bottomColor;
    private WallColor topColor;
    private WallColor leftColor;
    private WallColor rightColor;

    private TableNode bottom;
    private TableNode top;
    private TableNode left;
    private TableNode right;


    private Position position;

    public TableNode(/*Position poz,*/ WallColor botcol, WallColor topcol, WallColor leftcol, WallColor rightcol){
        //this.position =poz;
        this.bottomColor=botcol;
        this.topColor=topcol;
        this.leftColor=leftcol;
        this.rightColor=rightcol;
    }

    public Position getNodePosition(){
        return this.position;
    }

    /**
     *
     *{@return the row and column number, the position of the Node}
     */
    public int[] getPositionAsValues(){
        return this.position.getPosition();
    }

    public TableNode getBottom(){
        return bottom;
    }

    public TableNode getLeft() {
        return left;
    }

    public TableNode getRight() {
        return right;
    }

    public TableNode getTop() {
        return top;
    }

    public WallColor getBottomColor() {
        return bottomColor;
    }

    public WallColor getRightColor() {
        return rightColor;
    }

    public WallColor getLeftColor() {
        return leftColor;
    }

    public WallColor getTopColor() {
        return topColor;
    }

    public Position getPosition() {
        return position;
    }

}
