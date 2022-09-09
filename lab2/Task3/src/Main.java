import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        Poligon myPoli = new Poligon(intArray);
        myPoli.poligonShow();
        Point uu = new Point(1,2);

    }
}

class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void Show() {
        System.out.println("(" + x + "," + y + ")\n");
    }
}

class Poligon {
    private Point[] arr;
    public Poligon(int n) {
        Point[] arr = new Point[n];
        this.arr = arr;
    }

    public Poligon(int [] array) {
        this(array.length/2);
        for(int i = 0; i< array.length/2; i++) {
            this.arr[i] = new Point(array[2*i],array[2*i+1]);
        }
    }

    public void poligonShow() {
        for(int i = 0; i< arr.length; i++) {
                arr[i].Show();
        }
    }


}
