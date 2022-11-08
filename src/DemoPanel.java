import javax.swing.*;
import java.awt.*;

public class DemoPanel extends JPanel {

    //screen settings
    final int maxCol = 15;
    final int maxRow = 10;
    final int nodeSize = 70;
    final int screenWidth = nodeSize * maxCol;
    final int screenHeight = nodeSize * maxRow;

    //node
    Node[][] node = new Node[maxCol][maxRow];
    Node startNode, goalNode, currentNode;

    public DemoPanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(maxRow,maxCol));

        //placing nodes
        int col = 0;
        int row = 0;

        while(col < maxCol && row < maxRow) {
            node[col][row] = new Node(col,row);
            this.add(node[col][row]);

            col++;
            if(col == maxCol) {
                col = 0;
                row++;
            }
        }

        setStartNode(3, 6);
        setGoalNode(11, 3);

        setSolidNode(10,2);
        setSolidNode(10,3);
        setSolidNode(10,4);
        setSolidNode(10,5);
        setSolidNode(10,6);
        setSolidNode(10,7);
        setSolidNode(6,2);
        setSolidNode(7,2);
        setSolidNode(8,2);
        setSolidNode(9,2);
        setSolidNode(11,7);
        setSolidNode(12,7);
        setSolidNode(6,1);
    }


    private void setStartNode(int col, int row) {
        node[col][row].setAsStart();
        startNode = node[col][row];
        currentNode = startNode;
    }

    private void setGoalNode(int col, int row) {
        node[col][row].setAsGoal();
        goalNode = node[col][row];
    }

    private void setSolidNode(int col, int row) {
        node[col][row].setAsSolid();
    }
}
