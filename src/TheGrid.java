import java.util.Random;

/**
 * Created by jonesdc on 7/2/16.
 */
public class TheGrid {

    public int[][] generateGrid() {

        //Pick size here...
        int height = 25;
        int width = 25;

        int[][] initialArray = new int[height][width];
        Random rand = new Random();

        //logic to generate original ArrayList
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Random grid logic
                /*
                int n = rand.nextInt(Integer.MAX_VALUE); //positive numbers only
                if ((n & 1) == 0) //bitwise operator to set n to 1 or 0
                {
                    n = 1;
                } else {
                    n = 0;
                }
                */

                //10 Cell Row
                int n = 0;
                if(i == 12 && j > 7 && j <= 17) {
                    n =1;
                }
                //System.out.print(n + " ");

                initialArray[i][j] = n;
            }
            //System.out.print("\n");
        }
        //System.out.print("\n");
        return initialArray;
    }
}
