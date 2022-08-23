import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 20;
    int x1=0,x2=0,x3=0,x4=0;

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
        ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER);
        x1++;
        ellipse(x2,2*HEIGHT/5,DIAMETER,DIAMETER);
        x2+=2;
        ellipse(x3,3*HEIGHT/5,DIAMETER,DIAMETER);
        x3+=3;
        ellipse(x4,4*HEIGHT/5,DIAMETER,DIAMETER);
        x4+=4;
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
}
