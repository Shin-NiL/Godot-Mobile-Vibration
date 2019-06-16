package org.godotengine.godot;

import android.app.Activity;
import android.os.Build;
import android.content.Context;
import android.os.Vibrator;
import android.os.VibrationEffect;


public class Vibration extends Godot.SingletonBase {

	private Godot activity;
    private final Vibrator vibrator;

    public void vibrate(int duration)
	{
        if (this.vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.vibrator.vibrate(VibrationEffect.createOneShot(duration, VibrationEffect.DEFAULT_AMPLITUDE));
            } else {
                this.vibrator.vibrate(duration);
            }
        }
	}

	static public Godot.SingletonBase initialize(Activity p_activity) {
		return new Vibration(p_activity);
	}

    public Vibration(Activity p_activity) {
        this.activity = (Godot) p_activity;
        this.vibrator = (Vibrator) this.activity.getSystemService(Context.VIBRATOR_SERVICE);

        registerClass("Vibration", new String[]{"vibrate"});
    }
}