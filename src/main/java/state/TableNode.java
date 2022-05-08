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

    public TableNode(/*Position poz,*/ int botcol, int topcol, int leftcol, int rightcol){
        //this.position =poz;
        this.bottomColor=WallColor.parse(botcol);
        this.topColor= WallColor.parse(topcol);
        this.leftColor=WallColor.parse(leftcol);
        this.rightColor=WallColor.parse(rightcol);
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

    public WallColor getTopColor() {return topColor;}

    public Position getPosition() {
        return position;
    }

    public void setBottom(TableNode bottom) {
        this.bottom = bottom;
    }

    public void setLeft(TableNode left) {
        this.left = left;
    }

    public void setRight(TableNode right) {
        this.right = right;
    }

    public void setTop(TableNode top) {
        this.top = top;
    }
}
