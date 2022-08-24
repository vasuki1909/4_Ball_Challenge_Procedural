import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 20;
    int widthWithSpeedOneUnitPerFrame=0,widthWithSpeedTwoUnitPerFrame=0,
            widthWithSpeedThreeUnitPerFrame=0,widthWithSpeedFourUnitPerFrame=0;

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(widthWithSpeedOneUnitPerFrame,HEIGHT/5,DIAMETER,DIAMETER);
        widthWithSpeedOneUnitPerFrame++;
        ellipse(widthWithSpeedTwoUnitPerFrame,2*HEIGHT/5,DIAMETER,DIAMETER);
        widthWithSpeedTwoUnitPerFrame+=2;
        ellipse(widthWithSpeedThreeUnitPerFrame,3*HEIGHT/5,DIAMETER,DIAMETER);
        widthWithSpeedThreeUnitPerFrame+=3;
        ellipse(widthWithSpeedFourUnitPerFrame,4*HEIGHT/5,DIAMETER,DIAMETER);
        widthWithSpeedFourUnitPerFrame+=4;
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
}
