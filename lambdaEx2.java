interface Drawable {
    public void draw();
}

public class lambdaEx2 {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = () -> {
            System.out.println("Drawing with d1 : " + width);
        };
        d.draw();

        Drawable d2 = new Drawable()  {

            public void draw() {System.out.println("Drawing with d2 : " + (width+10));}

        };
        
        d2.draw();
    }
}
