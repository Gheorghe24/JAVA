import java.lang.Math;
import java.util.Objects;

public class CandyBox {
    private String flavor, origin;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public CandyBox() {

    }

    float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }


}

class Lindt extends CandyBox {
    float lenght, width, height;
@Override
    float getVolume(){
        return lenght * width * height;
    }

    public Lindt(String flavor, String origin, float lenght, float width, float height) {
        super(flavor, origin);
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Lindt(float lenght, float width, float height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public void printLindtDim(){
        System.out.println("lenght " + this.lenght + " height " + this.height + " width " + this.width);
    }

    @Override
    public String toString() {
        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }
}

class Baravelli extends CandyBox {
    float radius, height;

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public Baravelli(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public void printBaravelliDim(){
        System.out.println("radius " + this.radius + " " + "height " + this.height);
    }

    @Override
    public String toString() {
        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }

    @Override
    float getVolume(){
        return (float)3.14 * radius * radius * height;
    }
}

class ChocAmor extends CandyBox {
    float lenght;

    public ChocAmor(String flavor, String origin, float lenght) {
        super(flavor, origin);
        this.lenght = lenght;
    }

    public ChocAmor(float lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "The " + super.getOrigin() + " " + super.getFlavor() + " has volume " + getVolume();
    }

    public void printChocAmorDim(){
        System.out.println("lenght " + this.lenght);
    }

    @Override
    float getVolume(){
        return (float)Math.pow(lenght,3);
    }
}

