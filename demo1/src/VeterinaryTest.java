public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.setDogs(3);
        vr.setCats(7);

        VeterinaryReport vr2 = new VeterinaryReport();
        vr2.setDogs(4);
        vr2.setCats(2);

        vr2.displayStatistics();

        System.out.println("mi0000000i");
    }
}
