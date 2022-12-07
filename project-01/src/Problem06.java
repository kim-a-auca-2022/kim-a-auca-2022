import processing.core.*;

public class Problem06 extends PApplet {
    static final float SUN_DIAM = 250.0f;
    static final int SUN_COLOR = 0xFFFFAA00;

    static final float EARTH_DIAM = SUN_DIAM * 0.3f;
    static final int EARTH_COLOR = 0x0000FF;
    static final float EARTH_ORBIT_RADIUS = SUN_DIAM * 1.5f;
    static final float EARTH_ORBIT_SPEED = 0.03f;

    static final float MOON_DIAM = EARTH_DIAM * 0.3f;
    static final int MOON_COLOR = 0xf5f7f7;
    static final float MOON_ORBIT_RADIUS = EARTH_DIAM * 0.9f;
    static final float MOON_ORBIT_SPEED = 0.12f;

    static final float VENUS_DIAM = SUN_DIAM * 0.5f;
    static final int VENUS_COLOR = 0x288f88;
    static final float VENUS_ORBIT_RADIUS = SUN_DIAM * 0.9f;
    static final float VENUS_ORBIT_SPEED = 0.02f;

    float earthOrbitAngle = 0.0f;
    float moonAngle = 0.0f;
    float venusAngle = 0.0f;

    public void celestialBody(float x, float y, float diam, int color) {
        float radius = diam * 0.5f;
        color &= 0x00FFFFFF;

        noStroke();
        for (int i = (int) radius; i >= 0; i--) {
            float alpha = (1.0f - i / radius) * 255;
            int red = (color & 0x00FF0000) >>> 16;
            int green = (color & 0x0000FF00) >>> 8;
            int blue = (color & 0x00000FF);
            fill(red, green, blue, alpha);
            circle(x, y, i * 2.0f);
        }
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0);


        float sunX = width * 0.5f;
        float sunY = height * 0.5f;
        celestialBody(sunX, sunY, SUN_DIAM, SUN_COLOR);


        float earthX = sunX + cos(earthOrbitAngle) * EARTH_ORBIT_RADIUS;
        float earthY = sunY + sin(earthOrbitAngle) * EARTH_ORBIT_RADIUS;
        celestialBody(earthX, earthY, EARTH_DIAM, EARTH_COLOR);
        earthOrbitAngle -= EARTH_ORBIT_SPEED;


        float moonX = earthX + cos(moonAngle) * MOON_ORBIT_RADIUS;
        float moonY = earthY + sin(moonAngle) * MOON_ORBIT_RADIUS;
        celestialBody(moonX, moonY, MOON_DIAM, MOON_COLOR);
        moonAngle += MOON_ORBIT_SPEED;


        float venusX = sunX + cos(venusAngle) * VENUS_ORBIT_RADIUS;
        float venusY = sunY + sin(venusAngle) * VENUS_ORBIT_RADIUS;
        celestialBody(venusX, venusY, VENUS_DIAM, VENUS_COLOR);
        venusAngle -= VENUS_ORBIT_SPEED;
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }
}