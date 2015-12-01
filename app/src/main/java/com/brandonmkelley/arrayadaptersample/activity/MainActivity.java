package com.brandonmkelley.arrayadaptersample.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.brandonmkelley.arrayadaptersample.R;
import com.brandonmkelley.arrayadaptersample.listener.MyOnItemClickListener;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This Activity populates a ListView with clickable items
 * @author Brandon M. Kelley
 * @version 1.0.0
 * @since December 1, 2015
 */
public class MainActivity extends Activity {

	/**
	 * Called when the Activity is started
	 * @param savedInstanceState: saved application data
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// Finish creating activity and set layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Populate the ListView
		populateList();

	}

	/**
	 * Populate the layout's ListView with an ArrayAdapter
	 */
	private void populateList() {

		// Get a reference to the ListView in the layout
		ListView listView = (ListView) findViewById(R.id.home_list);

		// Create a List of Strings to be "adapted" into the ListView
		String[] rawList = { "An item", "Another item", "A third" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(rawList));

		// Create the adapter to filter the Strings into the ListView
		Context context = getApplicationContext();
		int listItemLayout = R.layout.activity_main_adapter_item;
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, listItemLayout, list);

		// Bind the adapter
		listView.setAdapter(adapter);

		// Set an onItemClickListener for when a list item is pressed
		MyOnItemClickListener listener = new MyOnItemClickListener(context);
		listView.setOnItemClickListener(listener);

	}

}
