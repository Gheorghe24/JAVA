public class Complex {
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
        System.out.println("Numar: " + real + " " + imaginary + "i");
    }


}
