import processing.core.*;

public class Problem03 extends PApplet {
    float angle;
    float angleOfBigStar;
    float angleOfSmallStar;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        strokeWeight(6);
    }

    public void draw() {
        background(0, 0, 0);
        drawStar(width/2f,height/2f,height/10f, angleOfBigStar, 255, 0, 0);
        drawStar(width/2f,0,0, height/2f, height/10f, angle, 255);
        angleOfBigStar += 0.05f;
        angleOfSmallStar += 0.025f;
        float r = min(width, height) / 10f;
        translate(width / 2f, height / 2f);
        rotate(angle);
        stroke(255, 0, 0);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        angle += 0.68f;
    }
    void drawStar (float xCenter, float yCenter, float r, float angle, float redC, float greenC, float blueC) {
        pushMatrix();
        translate(xCenter, yCenter);
        rotate(angle);
        stroke(redC, greenC, blueC);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}