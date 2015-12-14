package basic.override;


/**
 * Created by lvrh on 15/12/6.
 */
public class P {
    public static void t() {
        System.out.println("P - t");
    }

    public static void main(String[] args) {
        P p = new T();
        p.t();
    }
}


class T extends P {

    public static void t() {
        System.out.println("T - t");
    }
}