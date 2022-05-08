package state;

public class Agent {
    private Position agentPosition;
    private WallColor previousColor;
    private TableNode agentPositionTableNode;

    /**
     *
     * @param color the color which the agent previously passed through.
     * @return The color which the agent can pass through next.
     */
    public WallColor colorRule(WallColor color){
        return switch (color) {
            case Red -> WallColor.White;
            case Blue -> WallColor.Red;
            case White -> WallColor.Blue;
            default -> WallColor.Black;
        };

    }


    public boolean canMove(Direction direction){
        return switch (direction) {
            case UP -> agentPositionTableNode.getTopColor() == colorRule(previousColor);
            case DOWN -> agentPositionTableNode.getBottomColor() == colorRule(previousColor);
            case LEFT -> agentPositionTableNode.getLeftColor() == colorRule(previousColor);
            case RIGHT -> agentPositionTableNode.getRightColor() == colorRule(previousColor);
            default -> false;
        };
    }

    public void move(Direction dir){
        if (canMove(dir)){
            switch (dir) {
                case UP -> {
                    previousColor = agentPositionTableNode.getTopColor();
                    agentPositionTableNode = agentPositionTableNode.getTop();
                    agentPosition = agentPositionTableNode.getNodePosition();
                }
                case DOWN -> {
                    previousColor = agentPositionTableNode.getBottomColor();
                    agentPositionTableNode = agentPositionTableNode.getBottom();
                    agentPosition = agentPositionTableNode.getNodePosition();
                }
                case LEFT -> {
                    previousColor = agentPositionTableNode.getLeftColor();
                    agentPositionTableNode = agentPositionTableNode.getLeft();
                    agentPosition = agentPositionTableNode.getNodePosition();
                }
                case RIGHT -> {
                    previousColor = agentPositionTableNode.getRightColor();
                    agentPositionTableNode = agentPositionTableNode.getRight();
                    agentPosition = agentPositionTableNode.getNodePosition();
                }
            }
        }

    }

    public Position getAgentPosition() {
        return agentPosition;
    }

    public TableNode getAgentPositionNode() {
        return agentPositionTableNode;
    }

}
