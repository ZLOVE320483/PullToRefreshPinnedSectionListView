package com.zlove.library.pulltorefresh;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/**
 * Created by ZLOVE on 2016/7/11.
 */
public class ViewCompat {

    public static void postOnAnimation(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            SDK16.postOnAnimation(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    public static void setBackground(View view, Drawable background) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            SDK16.setBackground(view, background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

    public static void setLayerType(View view, int layerType) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            SDK11.setLayerType(view, layerType);
        }
    }

    @TargetApi(11)
    static class SDK11 {

        public static void setLayerType(View view, int layerType) {
            view.setLayerType(layerType, null);
        }
    }

    @TargetApi(16)
    static class SDK16 {

        public static void postOnAnimation(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void setBackground(View view, Drawable background) {
            view.setBackground(background);
        }

    }

}
