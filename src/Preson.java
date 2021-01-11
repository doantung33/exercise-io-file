import java.io.Serializable;

public class Preson implements Serializable {
    private String name;
    private int yearOld;

    public Preson() {
    }

    public Preson(String name, int yearOld) {
        this.name = name;
        this.yearOld = yearOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOld +
                '}';
    }
}
