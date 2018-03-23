package cn.thl.demo.utils;

import android.content.Context;
import android.widget.Toast;


public class ToastUtils {
    private static final String TAG = ToastUtils.class.getSimpleName();

    public static Toast mToast;

    public static void showToast(Context mContext, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
