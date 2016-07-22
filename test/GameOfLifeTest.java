import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonesdc on 6/28/16.
 */
public class GameOfLifeTest
{
    GameOfLife gameOfLife = new GameOfLife();
    TheGrid theGrid = new TheGrid();

    //TheGrid class generateGrid method...
    @Test
    public void theGridClassReturnsAGeneratedGridAndNotANull()
    {
        assertNotNull(theGrid.generateGrid());
    }

    //GameOfLife Class getNeighborCells method
    @Test
    public void gameOfLifeMethodGetNeighborCellsReturnsAnIntegerZeroThroughEight()
    {
        int[][] testGridOne = theGrid.generateGrid();
        assert(gameOfLife.getNeighborCells(1,1,testGridOne) >= 0 &&
                gameOfLife.getNeighborCells(1,1,testGridOne) <= 8);
    }

    //GameOfLife Class liveOrDie method...
    //Any live cell with more than three live neighbors dies, as if by overcrowding
    @Test
    public void returnsZeroIfLiveCellHasMoreThanThreeLiveNeighbors()
    {
        assertEquals(0, gameOfLife.liveOrDie(1, 4));
    }

    //GameOfLife Class liveOrDie method...
    //any live cell with three live neighbors lives on to the next generation
    @Test
    public void returnsOneIfLiveCellHasTwoOrThreeLiveNeighbors()
    {
        assert(gameOfLife.liveOrDie(1, 2) == 1 ||
                gameOfLife.liveOrDie(1, 3) == 1);
    }

    //GameOfLife Class liveOrDie method...
    //any dead cell with exactly three live neighbors becomes a live cell
    @Test
    public void returnsOneIfDeadCellHasExactlyThreeLiveNeighbors()
    {
        assertEquals(1, gameOfLife.liveOrDie(0, 3));
    }

    //Test for GameOfLife class cycleArray
    @Test
    public void TheGameOfLifeAddNeighborsReturnsANewList()
    {
        int[][] testGridTwo = theGrid.generateGrid();
        assertNotNull(gameOfLife.cycleArray(testGridTwo));
    }
}