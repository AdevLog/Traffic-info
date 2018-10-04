package com.tku.wiseway;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends Activity implements OnClickListener{
	
	ImageButton ibttra;
	ImageButton ibtmap;
	ImageButton ibtabout;
	ImageButton ibtexit;
	TextView tv1,tv2,tv3,tv4;
	TextPaint tp1,tp2,tp3,tp4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		setTitle("Home 首頁");
		
		findview();
		textpaint();
		setfakeboldtext();
		setonclicklistener();
	}

	private void findview() {
		// TODO Auto-generated method stub
		ibttra = (ImageButton)findViewById(R.id.ibt_traffic);
		ibtmap = (ImageButton)findViewById(R.id.ibt_map);
		ibtabout = (ImageButton)findViewById(R.id.ibt_about);
		ibtexit = (ImageButton)findViewById(R.id.ibt_exit);
		tv1 = (TextView)findViewById(R.id.textView1);
		tv2 = (TextView)findViewById(R.id.textView2);
		tv3 = (TextView)findViewById(R.id.textView3);
		tv4 = (TextView)findViewById(R.id.textView4);
	}

	private void textpaint() {
		// TODO Auto-generated method stub
		tp1 = tv1 .getPaint();
		tp2 = tv2 .getPaint();
		tp3 = tv3 .getPaint();
		tp4 = tv4 .getPaint();
	}

	private void setfakeboldtext() {
		// TODO Auto-generated method stub
		tp1.setFakeBoldText(true);
		tp2.setFakeBoldText(true);
		tp3.setFakeBoldText(true);
		tp4.setFakeBoldText(true);
	}

	private void setonclicklistener() {
		// TODO Auto-generated method stub
		ibttra.setOnClickListener(this);
		ibtmap.setOnClickListener(this);
		ibtabout.setOnClickListener(this);
		ibtexit.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.ibt_traffic:
			Intent intent1 = new Intent(Home.this,TRAFFIC.class);
			startActivity(intent1);
			break;
		case R.id.ibt_map:
			Intent intent2 = new Intent(Home.this,MAP.class);
			startActivity(intent2);
			break;
		case R.id.ibt_exit:
			DialogInterface.OnClickListener dialogClickListener = 
								new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					switch(arg1){
						case DialogInterface.BUTTON_POSITIVE:
							finish();
							break;
						case DialogInterface.BUTTON_NEUTRAL:
							arg0.cancel();
							break;
					}
				}
			};
			AlertDialog.Builder ad=new AlertDialog.Builder(Home.this);  
	        ad.setTitle("退出");  
	        ad.setMessage("是否退出應用程式?").setPositiveButton("是", 
	        		dialogClickListener).setNegativeButton("否", 
	        				dialogClickListener).show();
	        
			break;
		case R.id.ibt_about:
//			Intent intent4 = new Intent(Home.this,ABOUT.class);
//			startActivity(intent4);
			startActivity(new Intent(Home.this,ABOUT.class));
			break;
		default:
			break;
	}
	}

}
