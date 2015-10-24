package advance.callback;

/**
 * Created by lvrh on 15/10/23.
 */
public class Boss implements WorkCallback {

    public void order() {
        System.out.println("boss: worker,do sth!");
        Worker worker = new Worker();
        worker.setCallback(this);
        worker.doSomeWork();
    }

    @Override
    public void work() {
        System.out.println("boss: oh, the worker has done!");

    }
}
