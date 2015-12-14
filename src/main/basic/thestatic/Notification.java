package basic.thestatic;

public class Notification {
    public String mId;
    public String mBundleData;

    public Notification(String var1, String var2) {
        this.mId = var1;
        this.mBundleData = var2;
    }

    public Notification(String var1) {
        this(var1, (String) null);
    }

    public static Notification obtain(String var0, String var1) {
        return new Notification(var0, var1);
    }

    public static Notification obtain(String var0) {
        return new Notification(var0);
    }
}