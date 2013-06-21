package uk.co.dazcorp.android.tubelock;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.android.apps.dashclock.api.DashClockExtension;

public class TubeLockService extends DashClockExtension {
	 private static final String TAG = "TUBELOCK";

	    public static final String PREF_NAME = "pref_tubelock";
	
	@Override
	protected void onUpdateData(int arg0) {
        // Get service status preference value.
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String name = sp.getString(PREF_NAME, null);
	}

}
