package org.credil.proxysettings;

import org.credil.proxysettings.R;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;


public class Preferences extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final SharedPreferences sp =
			PreferenceManager.getDefaultSharedPreferences(this);
		//sp.registerOnSharedPreferenceChangeListener(this);

		addPreferencesFromResource(R.xml.prefs);
        }
}
