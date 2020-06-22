package Entity;

public class Person {

    private long id, salary;
    private String name, family;

    public Person(){}

    public Person(long id, long salary, String name, String family) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.family = family;
    }

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public long getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }
}
