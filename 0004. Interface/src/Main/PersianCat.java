package Main;

public class PersianCat extends Animal implements Cat, Persian {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void c() {
        System.out.println("c");
    }

    @Override
    public void d() {
        System.out.println("d");
    }
}
