public class Student {
    private String name;
    private Integer year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n\nStudent{\n" +
                "name='" + name + "\'\n" +
                "year=" + year +
                '}';
    }
}
