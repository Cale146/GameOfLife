import javax.swing.*;
import java.awt.*;

/**
 * Created by jonesdc on 7/2/16.
 */
public class GameOfLifeMain extends Frame {

    private boolean inAnApplet = true;

    static TheGrid generateGrid = new TheGrid();
    static int[][] gridArray = generateGrid.generateGrid();
    int height = gridArray.length;
    int width = gridArray[0].length;

    public static void main(String args[]) {
        GameOfLife sortArray = new GameOfLife();
        GameOfLifeMain window = new GameOfLifeMain();
        window.inAnApplet = false;
        int size = gridArray.length*gridArray[0].length;
        int[][] dynamicArray = gridArray.clone();
        JButton[] buttons = new JButton[size];

        do {
            for (int i = 0; i < dynamicArray.length; i++) {
                for (int j = 0; j < dynamicArray[0].length; j++) {
                    buttons[i] = new JButton();
                    if (dynamicArray[i][j] == 1) {
                        buttons[i].setBackground(Color.white);
                        buttons[i].setText("Alive");
                    }
                    else
                    {
                        buttons[i].setBackground(Color.DARK_GRAY);
                        buttons[i].setText("Dead");
                    }
                    window.add(buttons[i]);
                }
            }
            window.setPreferredSize(new Dimension(600,600));
            window.setTitle("The Game Of Life");
            window.pack();
            window.show();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            window.removeAll();
            window.revalidate();
            window.repaint();
            dynamicArray = sortArray.cycleArray(dynamicArray);
        }while(1==1);

    }

    //This method sets layout and font.
    public GameOfLifeMain() {
        setLayout(new GridLayout(height,width));
        setFont(new Font("Helvetica", Font.PLAIN, 14));
    }


    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            if (inAnApplet) {
                dispose();
                return true;
            } else {
                System.exit(0);
            }
        }
        return super.handleEvent(e);
    }
}