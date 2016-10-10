This is a Game Of Life Implementation in Java.  It contains a test class for Test Driven Development and a main class for executing the Game Of Life in a UI.  To build, import the project into your favorite Java IDE.  This was exported via command line/git from IntelliJ IDEA 15.0.5.

The game of life rules are as follows:
1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by over-population.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

Classes are as follows:

**GameOfLife.java -- This class contains three methods:
    1. getNeighborCells - Counts surrounding cells, returns count.
    2. liveOrDie - Makes decision based of Game Of Life rules, returns 1 or 0 for new grid.
    3. cycleArray - Cycles through current array, placing 1 or 0 in new array, then returns new
    array.

**GameOfLifeMain.java -- This class creates the UI and visually executes the Game Of Life:

**TheGrid.java -- This class contains one method:
    1. generateGrid - Generates the original grid used in the game.

**GameOfLifeTest.java -- This class contains six test methods:
    1. theGridClassReturnsAGeneratedGridAndNotANull
    2. gameOfLifeMethodGetNeighborCellsReturnsAnIntegerZeroThroughEight
    3. returnsZeroIfLiveCellHasMoreThanThreeLiveNeighbors
    4. returnsOneIfLiveCellHasTwoOrThreeLiveNeighbors
    5. returnsOneIfDeadCellHasExactlyThreeLiveNeighbors
    6. TheGameOfLifeAddNeighborsReturnsANewList


**To Run the Tests for this project**
    - Run GameOfLifeTest.java

**To Run the Game Of Life UI Simulation**
    - Run GameOfLifeMain.java.  It is currently configured to simulate the 10 Cell Row pattern in a
    25x25 grid.

**To Tweak the Grid Size or pattern**
    Size -- In TheGrid.java, change height/width of grid by adjusting the corresponding integers.
    Pattern -- In TheGrid.java, enable "Random grid logic" and disable "10 Cell Row" code.
