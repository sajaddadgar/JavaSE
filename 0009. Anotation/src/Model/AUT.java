package Model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AUT {

    public String developer() default "Dadgar";
    public int creationDate() default 1395;

}
