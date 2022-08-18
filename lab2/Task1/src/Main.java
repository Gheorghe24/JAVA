class Complex {
    private int real, imaginary;

    public Complex(int r, int im) {
        real = r;
        imaginary = im;
    }

    public Complex() {
        this(0,0);
    }

    public Complex(Complex comp) {
        this.real = comp.real;
        this.imaginary = comp.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex comp) {
        this.real += comp.real;
        this.imaginary += comp.imaginary;
    }

    public void showNumber() {
        System.out.println("Numarul : " + real + " + " + imaginary + "i\n");
    }

}

public class Main {
    public static void main (String[] args) {
        Complex nr1 = new Complex();
        Complex nr2 = new Complex(10, 2);
        Complex nr3 = new Complex(nr2);
        nr3.setReal(22);

        nr1.showNumber();
        nr2.showNumber();
        nr3.showNumber();
    }
}