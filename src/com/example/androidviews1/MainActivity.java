package com.example.androidviews1;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
	private  final Map<String, String> LANGUGAE_INFO = new HashMap<String, String>();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		populateLangInfo();
		
		
		//get all references of the views to work on
		final Button  viewLangBtn  =  (Button) findViewById(R.id.viewLangBtn);
		final TextView  v_title = (TextView) findViewById(R.id.langTitle);
		final TextView  v_text = (TextView) findViewById(R.id.langDescrption);
		final Spinner  langSpinner  =  (Spinner) findViewById(R.id.langSpinner);
		
		//make sure no text is displayed for these views 
		v_title.setText("");
		v_text.setText("");
		
		
		//declare a clickLister to determine what to display
		OnClickListener  clickListener  =  new OnClickListener() {
			@Override
			public void onClick(View view){
			String title   =  langSpinner.getSelectedItem().toString();	
			v_title.setText(title);
			v_text.setText(LANGUGAE_INFO.get(title));
			}//end method 
		};	
		
		viewLangBtn.setOnClickListener(clickListener);
	}//end method 
	
	
	
	//these method populates the language info 
	private void populateLangInfo() {
		String text  =  "HTML5 is a morkup language designed to structure "+
				" an html document by giving meaning to its content that a "
				+ "web browser displays  on screen.";
		LANGUGAE_INFO.put("HTML5", text);
		
		 text  =  "CSS3 is a powerful stylesheet language designed to work with an html document"
					+ " in order to layout its content and give it its presentation on screen. ";
		 LANGUGAE_INFO.put("CSS3", text);
		 
		 text  =  	" JavaScript is a scripting language designed to manipulate the structure of "
					+ " an HTML document in order to change its content and appearence dynamically. ";
		 LANGUGAE_INFO.put("JavaScript", text);
		 
		 text  =" PHP which stands for Hypertext Preproccessor is a scripting language designed "
					+ " to work within a server software in  order to process incoming and outgoing data"
					+ " between a server and a web browser.";
		 LANGUGAE_INFO.put("PHP", text);
	}//end method 


}
