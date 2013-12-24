package com.qustom.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestDialogActivity extends Activity {

	private static final String HALLOWEEN_ORANGE = "#FF7F27";

	public void button1clicked(View view) {
		String[] sa = {
				"Alpha",
				"Bravo",
				"Charlie",
				"Delta",
				"Echo",
				"Foxtrot",
				"Golf",
				"Hotel",
				"India",
				"Juliett",
				"Kilo",
				"Lima",
				"Mike",
				"November",
				"Oscar",
				"Papa",
				"Quebec",
				"Romeo",
				"Sierra",
				"Tango",
				"Uniform",
				"Victor",
				"Whiskey",
				"X-ray",
				"Yankee",
				"Zulu"
				};
		
		QustomDialogBuilder qustomDialogBuilder = (QustomDialogBuilder) new QustomDialogBuilder(this)
				.setTitle("Dialog with Message, custom View and Items")
				.setTitleColor(HALLOWEEN_ORANGE)
				.setDividerColor(HALLOWEEN_ORANGE)
				.setMessage("You are now entering the 10th dimension.")
				.setCustomView(R.layout.example_ip_address_layout, this)
				.setIcon(getResources().getDrawable(R.drawable.ic_launcher))
                .setItems(sa, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(TestDialogActivity.this, "item " + which + " clicked...", Toast.LENGTH_SHORT).show();					}
                });
		
		qustomDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(TestDialogActivity.this, "'OK' clicked...", Toast.LENGTH_SHORT).show();
			}
		});
		
		qustomDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(TestDialogActivity.this, "'Cancel' clicked...", Toast.LENGTH_SHORT).show();
			}
		});
		
		qustomDialogBuilder.show();
	}
	
	public void button2clicked(View view) {
		String[] sa = { "Rome", "London", "New York" };
		QustomDialogBuilder qustomDialogBuilder = (QustomDialogBuilder) new QustomDialogBuilder(this)
				.setTitle("Dialog with Message and Items")
				.setMessage("You are now exiting the 10th dimension.")
				.setTitleColor(HALLOWEEN_ORANGE)
				.setDividerColor(HALLOWEEN_ORANGE)
				.setIcon(getResources().getDrawable(R.drawable.ic_launcher))
		        .setItems(sa, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(TestDialogActivity.this, "item " + which + " clicked...", Toast.LENGTH_SHORT).show();
					}
		        });

		qustomDialogBuilder.show();
	}
	
	public void button3clicked(View view) {
		String[] sa = { "Enabled item 1", "Disabled item 1", "Enabled item 2", "Disabled item 2" };
		
		int[] disabledItems = new int[] {1,3};
		
		QustomDialogBuilder qustomDialogBuilder = (QustomDialogBuilder) new QustomDialogBuilder(this)
				.setTitle("Dialog with disabled Items")
				.setTitleColor(HALLOWEEN_ORANGE)
				.setDividerColor(HALLOWEEN_ORANGE)
				.setIcon(getResources().getDrawable(R.drawable.ic_launcher))
				.setItems(sa, disabledItems, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(TestDialogActivity.this, "item " + which + " clicked...", Toast.LENGTH_SHORT).show();
					}
				});

		qustomDialogBuilder.show();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
