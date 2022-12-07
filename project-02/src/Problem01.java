//import processing.core.*;
//
//public class Problem01 extends PApplet {
//    static final int NUM_OF_SNOWFLAKES = 100;
//    float[] x = new float[NUM_OF_SNOWFLAKES];
//    float[] y = new float[NUM_OF_SNOWFLAKES];
//    float[] r = new float[NUM_OF_SNOWFLAKES];
//    float[] c = new float[NUM_OF_SNOWFLAKES];
//    float[] angle = new float[NUM_OF_SNOWFLAKES];
//    float[] dAngle = new float[NUM_OF_SNOWFLAKES];
//
//    public void settings() {
//        fullScreen();
//    }
//
//    public void setup() {
//        strokeWeight(3);
//        for (int i = 0; i<NUM_OF_SNOWFLAKES; i++) {
//            x[1] = random(width);
//            y[1] = random(height);
//            r[1] = random(height / 40f, height / 30f);
//            angle [1]= random(2 * PI);
//            dAngle[1]=random(-0.02f,0.02f);
//            c[1] = random(20, 255);
//        }
//
////        public void draw() {
////            background(0, 0, 0);
////            for(int i =0; i<NUM_OF_SNOWFLAKES; i++)
////                drawStar(x[i], y[i], r[i], angle[i], 255f);
////            y += r / 4f;
////            angle += dAngle[i];
////            if (y > height)
////        }
//
////        void drawSnowflake(float x, float y, float r, float c) {
////            pushMatrix();
////            translate(x, y);
////            rotate(angle);
////            stroke(redC, greenC, blueC);
////            line(-r, 0, r, 0);
////            line(0, -r, 0, r);
////            popMatrix();
////        }
////
////        public static void main(String[] args) {
////            PApplet.main("Problem01");
////        }
////
////    }}