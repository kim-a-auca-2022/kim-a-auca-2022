import processing.core.*;

public class Problem05 extends PApplet {
    float widthBlock;
    float heightBlock;
    float cellSize;
    float boardSize;
    float n = 0;
    float numberOfCells = 8 + n;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        boardSize = width / 2f;
    }

    public void draw() {
        numberOfCells = 8 + n;
        cellSize = boardSize / numberOfCells;
        widthBlock = (width / 2f) - (cellSize * numberOfCells / 2f);
        heightBlock = (height / 2f) - (cellSize * numberOfCells / 2f);
        background(0);
        for (int i = 0; i < numberOfCells; i++) {
            for (int j = 0; j < numberOfCells; j++) {
                if ((i + j + 1) % 2 == 0) fill(255, 255, 255);
                else {
                    fill(0, 0, 100);
                }
//
                square(widthBlock + i * cellSize, heightBlock + j * cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

    public void keyPressed() {
        if (key == '=' && numberOfCells < 12) {
            n++;
        }
        if (key == '-' && numberOfCells > 4) {
            n--;
        }
    }
}