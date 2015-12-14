package advance.callback;


/**
 * Created by lvrh on 15/10/23.
 */
public class Worker {


    public void doSomeWork(Notification notification) {
        INotify notify = null;
        notify.onNotify(notification);
    }

}
