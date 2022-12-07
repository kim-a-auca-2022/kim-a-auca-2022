import processing.core.*;

public class Problem03 extends PApplet {
    float rectangleX;
    float rectangleY;
    float rectangleSize;
    float circleX;
    float circleY;
    float circleSize;
    float ringX1;
    float ringY1;
    float ringSize1;
    float ringX2;
    float ringY2;
    float ringSize2;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        rectangleX = width / 2f;
        rectangleY = height * 0.25f;
        rectangleSize = 200f;
        circleX = rectangleX - 500f;
        circleY = height * 0.25f;
        circleSize = 150;
        ringX1 = rectangleX + 500f;
        ringY1 = height * 0.25f;
        ringSize1 = 150;
        ringX2 = rectangleX + 500f;
        ringY2 = height * 0.25f;
        ringSize2 = 100;

        rectMode(CENTER);
    }

    public void draw() {
        background(0, 0, 0);
        if (mouseX > rectangleX - rectangleSize * 0.5f && mouseX < rectangleX + rectangleSize * 0.5f &&
                mouseY > rectangleY - rectangleSize && mouseY < rectangleY + rectangleSize) {
            strokeWeight(5);
            stroke(255);
            fill(300);
            textSize(30);
            fill(0, 408, 612);
            text("rectangle", (width / 2f) - 60, 700);
        } else if (mouseX > circleX - circleSize * 0.5f && mouseX < circleX + circleSize * 0.5f &&
                mouseY > circleY - circleSize && mouseY < circleY + circleSize) {
            strokeWeight(5);
            stroke(255);
            fill(300);
            textSize(30);
            fill(0, 408, 612);
            text("circle", (width / 7f) - 50, 700);
        } else if (mouseX > ringX1 - ringSize1 * 0.5f && mouseX < ringX1 + ringSize1 * 0.5f &&
                mouseY>ringY1-ringSize1&&mouseY<ringY1+ringSize1) {
            strokeWeight(5);
            stroke(255);
            fill(300);
            textSize(30);
            fill(0, 408, 612);
            text("ring", (ringX2), 700);
        }
        else{
            noStroke();
        }
        fill(255, 204, 0);
        rect(rectangleX, rectangleY, rectangleSize, rectangleSize * 0.5f);

        fill(255, 0, 0);
        circle(circleX, circleY, circleSize);

        fill(0, 0, 255);
        circle(ringX1, ringY1, ringSize1);

        fill(0, 0, 0);
        circle(ringX2, ringY2, ringSize2);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}