import processing.core.*;

public class Problem05 extends PApplet {
    static final int nCircles = 20;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(1);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
        float x = width / 2f;
        float y = height / 2f;
        float r = min(width, height) / 2f;
        float dr = r / nCircles;
        float redComp = 5;
        float dRedComp = (255-redComp)/nCircles;
        for (int i = 0; i < nCircles; i++) {
            fill(redComp, 0, 0);
            circle(x, y, 2 * r);
            r -= dr;
            redComp += dRedComp;

        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}