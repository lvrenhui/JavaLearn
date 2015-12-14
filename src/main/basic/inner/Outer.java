package basic.inner;

/**
 * Created by lvrh on 15/12/13.
 */
public class Outer {
    private int a = 1;

    static class Inner {
        void test() {
        }
    }

    void test() {
        new Outer.Inner().test();
    }

    public static void main(String[] args) {
        Object o = new B().con(22);
        System.out.println(o);
    }
}

class B {
    void test() {
        Outer o = new Outer();
        Outer.Inner i = new Outer.Inner();

    }

    public Object con(final int a) {
        return new Object() {
            {
                System.out.println("init");
            }

            public void test() {
                int b = a;
            }
        };
    }
}
