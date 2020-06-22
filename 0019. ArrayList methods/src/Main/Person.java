package Main;

public class Person {
    public Person() {
    }

    public Person(String name, String family) {

        this.name = name;
        this.family = family;
    }

    private String name, family;

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }
}

