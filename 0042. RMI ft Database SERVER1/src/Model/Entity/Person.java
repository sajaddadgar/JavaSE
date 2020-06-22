package Model.Entity;

import java.io.Serializable;

public class Person implements Serializable {

    private String name, family;
    private long id, salary;

    public Person(){}


    public Person(String name, String family, long id, long salary) {
        this.name = name;
        this.family = family;
        this.id = id;
        this.salary = salary;
    }

    public Person(String name, String family, long salary) {
        this.name = name;
        this.family = family;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
