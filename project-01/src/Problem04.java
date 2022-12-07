import processing.core.PApplet;

public class Problem04 extends PApplet {

    final float COLUMN = 13;
    final float ROW = 13;

    float size, x, y, rightBorder, leftBorder, upBorder, downBorder;
    float circleX, circleY;
    float dx, dy;
    float foodX;
    float foodY;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        size = width / 26f;
        x = 7 * size;
        y = 1.9f * size;

        leftBorder = x + size;
        rightBorder = width - leftBorder;
        upBorder = y + size;
        downBorder = height - upBorder;

        circleX = x + size / 2;
        circleY = y + size / 2;
        dx = 0;
        dy = 0;
        frameRate(15);
        background(0);

        foodX = random(leftBorder-size/2, rightBorder-size/2);
        foodY = random(upBorder-size/2, downBorder-size/2);
    }

    public void draw() {
        fill(0, 0, 0, 35); //shadow of snake
        stroke(0, 0, 700); //color of lines
        strokeWeight(1); //weight of the lines

        for (int row = 0; row < COLUMN; row++) {
            for (int col = 0; col < ROW; col++) {
                square(x + col * size, y + row * size, size);
            }
        }
//snake
        noStroke();
        fill(255, 0, 0);
        circle(circleX, circleY, size);
        circleX += dx;
        circleY += dy;

        fill(255, 255, 0);
        circle(foodX, foodY, size);

        if (circleX > rightBorder || circleX < leftBorder) {
            dx = 0;
        }
        if (circleY < upBorder || circleY > downBorder) {
            dy = 0;
        }

    }

    public void keyReleased() {

        if (key == CODED) {
            if (keyCode == RIGHT && circleX < rightBorder) {
                dx = size;
                dy = 0;
            } else if (keyCode == LEFT && circleX > leftBorder) {
                dx = -size;
                dy = 0;
            } else if (keyCode == UP && circleY > upBorder) {
                dy = -size;
                dx = 0;
            } else if (keyCode == DOWN && circleY < downBorder) {
                dy = size;
                dx = 0;
            }
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}