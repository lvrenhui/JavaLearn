package advance.callback;


/**
 * Created by lvrh on 15/10/23.
 */
public class Worker {

    private WorkCallback callback = null;

    public void setCallback(WorkCallback callback) {
        this.callback = callback;
    }


    public void doSomeWork() {
        System.out.println("worker: I am doing ...");
        callback.work();
    }

}
