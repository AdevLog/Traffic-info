package com.tku.wiseway;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class TRAFFIC extends Activity implements OnClickListener{

	private ImageButton ibttrain;
	private ImageButton ibtmrt;
	private ImageButton ibttaxi;
	private ImageButton ibtbus;
	private ImageButton ibtback;
	private ImageButton ibtmap;
	private TextView tv1,tv2,tv3,tv4,tv5,tv6;
	private TextPaint tp1,tp2,tp3,tp4,tp5,tp6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_traffic);
		setTitle("Traffic交通");
		
		findview();
		textpaint();
		setfakeboldtext();
		setonclicklistener();
	}

	private void textpaint() {
		// TODO Auto-generated method stub
		tp1 = tv1 .getPaint();
		tp2 = tv2 .getPaint();
		tp3 = tv3 .getPaint();
		tp4 = tv4 .getPaint();
		tp5 = tv5 .getPaint();
		tp6 = tv6 .getPaint();
	}

	private void setfakeboldtext() {
		// TODO Auto-generated method stub
		tp1.setFakeBoldText(true);
		tp2.setFakeBoldText(true);
		tp3.setFakeBoldText(true);
		tp4.setFakeBoldText(true);
		tp5.setFakeBoldText(true);
		tp6.setFakeBoldText(true);
	}

	private void findview() {
		// TODO Auto-generated method stub
		ibttrain = (ImageButton)findViewById(R.id.ibt_train);
		ibtmrt = (ImageButton)findViewById(R.id.ibt_mrt);
		ibttaxi = (ImageButton)findViewById(R.id.ibt_taxi);
		ibtbus = (ImageButton)findViewById(R.id.ibt_bus);
		ibtback = (ImageButton)findViewById(R.id.ibt_back);
		ibtmap = (ImageButton)findViewById(R.id.ibt_map);
		tv1 = (TextView)findViewById(R.id.textView1);
		tv2 = (TextView)findViewById(R.id.textView2);
		tv3 = (TextView)findViewById(R.id.textView3);
		tv4 = (TextView)findViewById(R.id.textView4);
		tv5 = (TextView)findViewById(R.id.textView5);
		tv6 = (TextView)findViewById(R.id.textView6);
	}

	private void setonclicklistener() {
		// TODO Auto-generated method stub
		ibttrain.setOnClickListener(this);
		ibtmrt.setOnClickListener(this);
		ibttaxi.setOnClickListener(this);
		ibtbus.setOnClickListener(this);
		ibtback.setOnClickListener(this);
		ibtmap.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.ibt_train:
			startActivity(new Intent(TRAFFIC.this,TRAIN.class));
			break;
		case R.id.ibt_mrt:
			startActivity(new Intent(TRAFFIC.this,MRT.class));
			break;
		case R.id.ibt_taxi:
			startActivity(new Intent(TRAFFIC.this,TAXI.class));
			break;
		case R.id.ibt_bus:
			startActivity(new Intent(TRAFFIC.this,BUS.class));
			break;
		case R.id.ibt_back:
			finish();
			break;
		case R.id.ibt_map:
			startActivity(new Intent(TRAFFIC.this,MAP.class));
			finish();
			break;
		default:
			break;
		}
	}

}
