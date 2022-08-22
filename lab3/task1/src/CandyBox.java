import java.lang.Math;
public class CandyBox {
    private String flavor, origin;

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
}

class Lindt extends CandyBox {
    float lenght, width, height;
@Override
    float getVolume(){
        return lenght * width * height;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + '\'' +
                ", origin='" + '\'' +
                '}';
    }
}

class Baravelli extends CandyBox {
    float radius, height;

    @Override
    float getVolume(){
        return radius * height;
    }
}

class ChocAmor extends CandyBox {
    float lenght;
    @Override
    float getVolume(){
        return (float)Math.pow(lenght,3);
    }
}