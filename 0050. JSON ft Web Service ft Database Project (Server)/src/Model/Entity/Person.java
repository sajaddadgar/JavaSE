package Model.Entity;

import java.io.Serializable;

public class Person implements Serializable {

    private long id;
    private String name, family ,nationalCode;

    public Person(){}

    public Person(long id, String nationalCode, String name, String family) {
        this.id = id;
        this.nationalCode = nationalCode;
        this.name = name;
        this.family = family;
    }

    public Person(String name, String family, String nationalCode) {
        this.nationalCode = nationalCode;
        this.name = name;
        this.family = family;
    }

    public Person(long id, String name, String family) {
        this.id = id;
        this.name = name;
        this.family = family;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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
}
