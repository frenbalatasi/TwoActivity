package com.course.android.aa.twoactivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_two);
		Button GoBackButton= (Button) findViewById(R.id.btn_GobackActivity1); 
		GoBackButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				// TODO Auto-generated method stub 
				finish();
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_two, menu);
		return true;
	}

}
