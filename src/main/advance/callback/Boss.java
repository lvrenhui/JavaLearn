package advance.callback;

/**
 * Created by lvrh on 15/10/23.
 */
public class Boss implements INotify {

    @Override
    public void onNotify(Notification notification) {
        System.out.println("boss: oh, the worker has done!");

    }
}
