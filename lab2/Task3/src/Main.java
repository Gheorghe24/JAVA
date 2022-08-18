public class Main {
    public static void main(String[] args) {

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
        System.out.println("(" + x + "," + y + ")");
    }
}

class Poligon {
    Point[] arr;
    public Poligon(int n) {
        arr = new Point[n];
    }

    public Poligon(int [] array) {
        Poligon p1 = new Poligon(array.length/2);
        for(int i = 0; i< array.length/2; i++) {
            arr[i].changeCoords(array[2*i],array[2*i+1]);
        }
    }



}
