import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 20;
    public static  int position = 0;
    int totalBalls =4;
    int divisor =5;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    private void ball(int velocity, int height) {
        ellipse(velocity,height,DIAMETER, DIAMETER);
    }

    @Override
    public void draw() {
        for (int speed = 1; speed <= totalBalls; speed++) {
            ball(speed*position,speed*HEIGHT/divisor);
        }
        position++;
    }


}
