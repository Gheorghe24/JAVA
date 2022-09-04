public class Area {
    CandyBag bag = new CandyBag();
    int number;
    String street;

    Area() {

    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard(){
        System.out.println(street + " " + number);
        System.out.println("La multi ani!");
    }

    @Override
    public String toString() {
        return "Area{" +
                "bag=" + bag +
                '}';
    }
}
