package basic.privilege;

/**
 * Created by lvrh on 15/12/6.
 */
public class T {
    int a;
    private int b;
    protected int c;

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.test();
    }

    void a(){

    }
    int a(int a){
        return 0;
    }
}

class T1 {
    public void test() {
        T t = new T();
        t.a = 1;
        t.c = 2;
        System.out.println(t.a + t.c);
    }
}