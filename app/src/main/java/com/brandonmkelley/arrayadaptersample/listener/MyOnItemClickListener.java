/**
 * This class creates an OnItemClickListener for use in the main Activity's ArrayAdapter.
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
package com.brandonmkelley.arrayadaptersample.listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.brandonmkelley.arrayadaptersample.activity.AdapterItemActivity;
import com.brandonmkelley.arrayadaptersample.R;

public class MyOnItemClickListener implements AdapterView.OnItemClickListener {

	private Context context;

	public MyOnItemClickListener(Context context) {
		this.context = context;
	}

	/**
	 * Called when an item in the attached AdapterView is pressed
	 * @param parent: The AdapterView that contains the View clicked
	 * @param view: The view that was clicked to trigger this
	 * @param position: the index of this view in the ListView
	 * @param id: the id of this view
	 */
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

		String itemText = ((TextView) view.findViewById(R.id.main_list_item)).getText().toString();

		Intent intent = new Intent(context, AdapterItemActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		intent.putExtra("item", itemText);

		context.startActivity(intent);

	}

}
