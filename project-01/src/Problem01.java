import processing.core.*;

public class Problem01 extends PApplet {
    float x1;
    float y1;

    float x2;
    float y2;
    float x3;
    float y3;
    float x4;
    float y4;
    float x5;
    float y5;
    float dx = 3;
    float dy = 3;
    float diameter = 50;
    float radius = diameter / 2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x1 = width * 0.5f;
        y1 = height * 0.5f;
        x2 = width * 0.25f;
        y2 = height * 0.25f;
        x3 = width * 0.75f;
        y3 = height * 0.25f;
        x4 = width * 0.25f;
        y4 = height * 0.75f;
        x5 = width * 0.75f;
        y5 = height * 0.75f;
        frameRate(90);

    }

    public void draw() {
        fill(0, 0, 0, 20);
        rect(0, 0, width, height);

        fill(255, 0, 0);
        circle(x1, y1, diameter);
        fill(0, 167, 0);
        circle(x2, y2, diameter);
        rect(width, height, x2, y2);
        fill(0, 167, 0, 50);
        fill(0, 0, 200);
        circle(x3, y3, diameter);
        rect(width, height, x3, y3);
        fill(0, 0, 100, 50);
        fill(100, 100, 0);
        circle(x4, y4, diameter);
        rect(width, height, x4, y4);
        fill(100, 50, 0, 50);
        fill(200, 200, 0);
        circle(x5, y5, diameter);
        rect(width, height, x5, y5);
        fill(200, 100, 0, 50);


        if (x1 >= width - radius) {
            x1 = width - radius;
            dx = -dx;
        } else if (x1 <= radius) {
            x1 = radius;
            dx = -dx;
        } else if (y1 >= height - radius) {
            y1 = height - radius;
            dy = -dy;
        } else if (y1 <= radius) {
            y1 = radius;
            dy = -dy;
        } else if (x2 >= width - radius) {
            x2 = width - radius;
            dx = -dx;
        } else if (x2 <= radius) {
            x2 = radius;
            dx = -dx;
        } else if (y2 >= height - radius) {
            y2 = height - radius;
            dy = -dy;
        } else if (y2 <= radius) {
            y2 = radius;
            dy = -dy;
        } else if (x3 >= width - radius) {
            x3 = width - radius;
            dx = -dx;
        } else if (x3 <= radius) {
            x3 = radius;
            dx = -dx;
        } else if (y3 >= height - radius) {
            y3 = height - radius;
            dy = -dy;
        } else if (y3 <= radius) {
            y3 = radius;
            dy = -dy;
        } else if (x4 >= width - radius) {
            x4 = width - radius;
            dx = -dx;
        } else if (x4 <= radius) {
            x4 = radius;
            dx = -dx;
        } else if (y4 >= height - radius) {
            y4 = height - radius;
            dy = -dy;
        } else if (y4 <= radius) {
            y4 = radius;
            dy = -dy;
        } else if (x5 >= width - radius) {
            x5 = width - radius;
            dx = -dx;
        } else if (x5 <= radius) {
            x5 = radius;
            dx = -dx;
        } else if (y5 >= height - radius) {
            y5 = height - radius;
            dy = -dy;
        } else if (y5 < radius) {
            y5 = radius;
            dy = -dy;
        }
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
        x3 += dx;
        y3 += dy;
        x4 += dx;
        y4 += dy;
        x5 += dx;
        y5 += dy;
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}