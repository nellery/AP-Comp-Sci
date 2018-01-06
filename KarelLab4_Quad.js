package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Quad extends Robot
{
    //This array should track 
    int[][]columns = new int[4][5];
    final int columnHeight = 5;
    int columnsFixed=0;
    public Quad(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixQuad() {
        for (int i=0; i<13;i++) {
            if (isColumn()) {
                goDown();
                fixColumn(columnsFixed);
                goDown();
            }
            else {
                goDown();
            }
            while(!facingEast()) {
                turnLeft();
            }
            move();
        }
    }
    
    //function for chechking if a given avenue requires a column
    //parameter is the height of your columlns, for any 
    public boolean isColumn() {
        while(!facingNorth()) {
            turnLeft();
        }
        for (int i=1; i<columnHeight;i++) {
            move();
        }
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public void fixColumn(int i) {
        while(!facingNorth()) {
            turnLeft();
        }
        for (int j=0; j<columnHeight; j++) {
            if (!nextToABeeper()) {
                putBeeper();
                columns[i][j] = 1;
            }
            else {
                columns[i][j]=0;
            }
            if (frontIsClear()) {
                move();
            }
        }
        columnsFixed++;
    }
    public void goDown() {
        turnLeft();
        turnLeft();
        while (frontIsClear()) {
            move();
        }
    }
    public void printFixes() {
        //This method should print the beepers placed in each column of the quad
        //If a beeper was already present, then the entry should be zero
        //If a beeper was placed, the entry should be 1
        //The first column should be {1, 1, 1, 0, 0}
        for (int i=0; i<4;i++) {
            for (int j=0; j<5; j++) {
                System.out.print(columns[i][j] + "\t");
            }
            System.out.println();
        }
    }
   
}

