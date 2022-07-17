package com.example.activityanimator;

import android.app.Activity;

public class AnimateActivity {

    public static void Card(Activity activity) {
        activity.overridePendingTransition(R.anim.animate_card_enter, R.anim.animate_card_exit);
    }

    public static void Diagonal(Activity activity) {
        activity.overridePendingTransition(R.anim.animate_diagonal_right_enter, R.anim.animate_diagonal_right_exit);
    }

    public static void Fade (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_fade_enter, R.anim.animate_fade_exit);
    }

    public static void InAndOut (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_in_out_enter, R.anim.animate_in_out_exit);
    }

    public static void Shrink (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_shrink_enter, R.anim.animate_shrink_exit);
    }

    public static void SlideUp (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_slide_up_enter, R.anim.animate_slide_up_exit);
    }

    public static void SlideDown (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_slide_down_enter, R.anim.animate_slide_down_exit);
    }

    public static void SlideRight (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_slide_right_enter, R.anim.animate_slide_right_exit);
    }

    public static void SlideLeft (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_slide_left_enter, R.anim.animate_slide_left_exit);
    }

    public static void Spin (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_spin_enter, R.anim.animate_spin_exit);
    }

    public static void Split (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_split_enter, R.anim.animate_split_exit);
    }

    public static void SwipeRight (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_swipe_right_enter, R.anim.animate_swipe_right_exit);
    }

    public static void SwipeLeft (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_swipe_left_enter, R.anim.animate_swipe_left_exit);
    }

    public static void WindMill (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_windmill_enter, R.anim.animate_windmill_exit);
    }
	
    public static void Zoom (Activity activity) {
        activity.overridePendingTransition(R.anim.animate_zoom_enter, R.anim.animate_zoom_exit);
    }

}
