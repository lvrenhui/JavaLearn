package basic.thestatic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lvrh on 15/11/5.
 */
public class NotificationTest {

    @Test
    public void testObtain() throws Exception {
        Notification n1 = Notification.obtain("a");
        Notification n2 = Notification.obtain("a");
        assertTrue(n1 != n2);

    }

    @Test
    public void testObtain1() throws Exception {

    }
}