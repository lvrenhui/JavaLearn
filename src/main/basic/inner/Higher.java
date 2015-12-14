package basic.inner;

/**
 * Created by lvrh on 15/12/14.
 */
public class Higher {
    void test(I i) {
        i.i_m();
    }

    public static void main(String[] args) {
        new Higher().test(new I() {
            @Override
            public void i_m() {
                System.out.println("haha is niubi");
            }
        });
    }
}

interface I {
    void i_m();
}