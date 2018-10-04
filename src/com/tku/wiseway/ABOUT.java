package com.tku.wiseway;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class ABOUT extends Activity implements OnClickListener{
	
	private ImageButton ibtback;
	private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
	private TextPaint tp1,tp2,tp3,tp4,tp5,tp6,tp7,tp8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		setTitle("About 關於");
		
		findview();
		textpaint();
		setfakeboldtext();
		setonclicklistener();
	}

	private void findview() {
		// TODO Auto-generated method stub
		ibtback = (ImageButton)findViewById(R.id.ibt_back);
		tv1 = (TextView)findViewById(R.id.textView1);
		tv2 = (TextView)findViewById(R.id.textView2);
		tv3 = (TextView)findViewById(R.id.textView3);
		tv4 = (TextView)findViewById(R.id.textView4);
		tv5 = (TextView)findViewById(R.id.textView5);
		tv6 = (TextView)findViewById(R.id.textView6);
		tv7 = (TextView)findViewById(R.id.textView7);
		tv8 = (TextView)findViewById(R.id.textView8);
	}

	private void textpaint() {
		// TODO Auto-generated method stub
		tp1 = tv1 .getPaint();
		tp2 = tv2 .getPaint();
		tp3 = tv3 .getPaint();
		tp4 = tv4 .getPaint();
		tp5 = tv5 .getPaint();
		tp6 = tv6 .getPaint();
		tp7 = tv7 .getPaint();
		tp8 = tv8 .getPaint();
	}

	private void setfakeboldtext() {
		// TODO Auto-generated method stub
		tp1.setFakeBoldText(true);
		tp2.setFakeBoldText(true);
		tp3.setFakeBoldText(true);
		tp4.setFakeBoldText(true);
		tp5.setFakeBoldText(true);
		tp6.setFakeBoldText(true);
		tp7.setFakeBoldText(true);
		tp8.setFakeBoldText(true);
	}

	private void setonclicklistener() {
		// TODO Auto-generated method stub
		ibtback.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		finish();
	}

}
