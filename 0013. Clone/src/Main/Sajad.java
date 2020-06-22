package Main;

public class Sajad implements Cloneable {

    public String haircolor;

    /*

    public Sajad yeCopyBede() throws CloneNotSupportedException {
        return (Sajad) clone();
    }
    */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
