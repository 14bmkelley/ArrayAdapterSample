/**
 * This Activity displays a single ListView item.
 *
 * @author Brandon M. Kelley
 * @version 1.0.0
 * @since December 1, 2015
 *
 * This file is part of the Array Adapter Sample application.
 *
 * Array Adapter Sample is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Array Adapter Sample is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Array Adapter Sample. If not, see <http://www.gnu.org/licenses/>.
 */
package com.brandonmkelley.arrayadaptersample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.brandonmkelley.arrayadaptersample.R;

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
