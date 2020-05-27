package person;

public class Person {

    private String name;
    private Double heigth;
    private Double weigth;

    public Person(String name, Double heigth, Double weigth) {
        this.name = name;
        this.heigth = heigth;
        this.weigth = weigth;
    }


    public String getName() {
        return name;
    }

    public Double getHeigth() {
        return heigth;
    }

    public Double getWeigth() {
        return weigth;
    }
}
