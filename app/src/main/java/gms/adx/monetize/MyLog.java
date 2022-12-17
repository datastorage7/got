package gms.adx.monetize;

import android.util.Log;

public class MyLog {

    public static Boolean showLogff = false;

    public static void e(String ss1, String ss2) {

        if (showLogff) {
            Log.e(ss1, ss2);
        }

    }

}
