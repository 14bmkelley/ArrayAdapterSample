package com.brandonmkelley.arrayadaptersample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.brandonmkelley.arrayadaptersample.R;

/**
 * This Activity displays a single ListView item
 * @author Brandon M. Kelley
 * @version 1.0.0
 * @since December 1, 2015
 */
public class AdapterItemActivity extends Activity {

	/**
	 * Called when the Activity is started
	 * @param savedInstanceState: saved application data
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// Finish creating Activity and set layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_adapter_item_full);

		// Set content
		setContent();

	}

	/**
	 * Set the layout content to Intent data
	 */
	private void setContent() {

		// Get String from the passed Intent
		String content = getIntent().getStringExtra("item");

		// Set text of layout to the received String
		((TextView) findViewById(R.id.main_list_item_full)).setText(content);

	}

}
