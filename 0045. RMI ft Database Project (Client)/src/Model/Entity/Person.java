package Model.Entity;

import java.io.Serializable;

public class Person implements Serializable {

    private String name, family;
    private long id, code;

    public Person() {}

    public Person(String name, String family, long id, long code) {
        this.name = name;
        this.family = family;
        this.id = id;
        this.code = code;
    }

    public Person(String name, String family, long code) {
        this.name = name;
        this.family = family;
        this.code = code;
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

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

}
