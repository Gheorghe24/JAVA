import java.util.Arrays;

public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.setDogs(3);
        vr.setCats(7);

        VeterinaryReport vr2 = new VeterinaryReport();
        vr2.setDogs(4);
        vr2.setCats(2);

        VeterinaryReport [] reports = new VeterinaryReport[2];
        reports[0] = vr;
        reports[1] = vr2;
        System.out.println(22);
        System.out.println(Arrays.toString(reports));
    }
}
