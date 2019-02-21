/**
 * Created by jonesdc on 7/2/16.
 */
public class GameOfLife {

    //This method gets the sum of the surrounding cells in clockwise order
    public int getNeighborCells(int x, int y, int[][] gridArray) {
        int height = gridArray.length;
        int width = gridArray[0].length;
        int count = 0;

        //Check cell on the top right.
        if (x != 0 && y != width-1) {
            if (gridArray[x - 1][y + 1] == 1)
                count++;
        }

        // Check cell on the right.
        if (y != width-1) {
            if (gridArray[x][y+1] == 1)
                count++;
        }

        // Check cell on the bottom right.
        if (x != height-1 && y != width-1) {
            if (gridArray[x + 1][y + 1] == 1)
                count++;
        }

        // Check cell on the bottom.
        if (x != height-1) {
            if (gridArray[x+1][y] == 1)
                count++;
        }

        // Check cell on the bottom left.
        if (x != height-1 && y != 0) {
            if (gridArray[x + 1][y - 1] == 1)
                count++;
        }

        // Check cell on the left.
        if (y != 0) {
            if (gridArray[x][y-1] == 1)
                count++;
        }

        // Check cell on the top left.
        if (x != 0 && y != 0) {
            if (gridArray[x - 1][y - 1] == 1)
                count++;
        }

        // Check cell on the top.
        if (x != 0) {
            if (gridArray[x-1][y] == 1)
                count++;
        }

        return count;
    }

    //This method is the Game Of Life rules algorithm
    public int liveOrDie(int temp, int sum) {
        if (temp == 1 && (sum < 2))
            temp = 0;
        if (temp == 1 && (sum == 2 || sum == 3))
            temp = 1;
        if (temp == 1 && sum > 3)
            temp = 0;
        if (temp == 0 && sum == 3)
            temp = 1;

        return temp;
    }

    //This method cycles through current array and returns new array.
    public int[][] cycleArray(int[][] oListOne) {
        int row = oListOne.length;
        int column = oListOne[0].length;
        int[][] newList = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int tempOne = oListOne[i][j];
                int sumOne = getNeighborCells(i, j, oListOne);
                newList[i][j] = liveOrDie(tempOne, sumOne);
                //System.out.print(newList[i][j] + " ");
            }
            //System.out.print("\n");
        }

        return newList;
    }
}
