public class VeterinaryReport {
    private int dogs;
    private int cats;

    void setDogs(int dogs) {
        if (dogs > 0) {
            this.dogs = dogs;
        }
    }

    void setCats(int cats) {
        if (cats > 0) {
            this.cats = cats;
        }
    }

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
