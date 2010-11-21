package com.ryanm.droid.config;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * @author ryanm
 */
public class ConfigActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String input = (String) getIntent().getSerializableExtra("conf");

		String[] names = input.split(",");

		setListAdapter(new ArrayAdapter<String>(getApplicationContext(),
				android.R.layout.simple_list_item_1, names));
	}
}