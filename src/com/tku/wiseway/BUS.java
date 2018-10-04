package com.tku.wiseway;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BUS extends Activity implements OnClickListener{
	
	private Button btroad;
	private Button btticket;
	private ImageButton ibttaxi;
	private ImageButton ibtmrt;
	private ImageButton ibttrain;
	private ImageButton ibtback;
	private TextView tv1,tv2,tv3,tv4;
	private TextPaint tp1,tp2,tp3,tp4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus);
		setTitle("Bus 公車");
		
		findview();
		webview();
		textpaint();
		setfakeboldtext();
		setonclicklistener();
	}

	private void findview() {
		// TODO Auto-generated method stub
		btroad = (Button)findViewById(R.id.bt_road);
		btticket = (Button)findViewById(R.id.bt_ticket);
		ibttaxi = (ImageButton)findViewById(R.id.ibt_taxi);
		ibtmrt = (ImageButton)findViewById(R.id.ibt_mrt);
		ibttrain = (ImageButton)findViewById(R.id.ibt_train);
		ibtback = (ImageButton)findViewById(R.id.ibt_back);
		tv1 = (TextView)findViewById(R.id.textView1);
		tv2 = (TextView)findViewById(R.id.textView2);
		tv3 = (TextView)findViewById(R.id.textView3);
		tv4 = (TextView)findViewById(R.id.textView4);
	}

	private void webview() {
		// TODO Auto-generated method stub
		WebView myBrowser=(WebView)findViewById(R.id.mybrowser);  
		myBrowser.loadUrl("http://www.5284.com.tw/AccessibleBus/Default.aspx");
        WebSettings websettings = myBrowser.getSettings();  
        websettings.setSupportZoom(true);  
        websettings.setBuiltInZoomControls(true);   
        websettings.setJavaScriptEnabled(true);  
        websettings.setUseWideViewPort(true);
        websettings.setLoadWithOverviewMode(true);
         
        myBrowser.setWebViewClient(new WebViewClient());
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
		btroad.setOnClickListener(this);
		btticket.setOnClickListener(this);
		ibttaxi.setOnClickListener(this);
		ibtmrt.setOnClickListener(this);
		ibttrain.setOnClickListener(this);
		ibtback.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.ibt_mrt:
			startActivity(new Intent(BUS.this,MRT.class));
			finish();
			break;
		case R.id.ibt_taxi:
			startActivity(new Intent(BUS.this,TAXI.class));
			finish();
			break;
		case R.id.ibt_train:
			startActivity(new Intent(BUS.this,TRAIN.class));
			finish();
			break;
		case R.id.ibt_back:
			finish();
			break;
		case R.id.bt_road:
			WebView myBrowser1=(WebView)findViewById(R.id.mybrowser);  
			myBrowser1.loadUrl("http://www.5284.com.tw/AccessibleBus/Default.aspx");
	        WebSettings websettings1 = myBrowser1.getSettings();  
	        websettings1.setSupportZoom(true);  
	        websettings1.setBuiltInZoomControls(true);   
	        websettings1.setJavaScriptEnabled(true);  
	        websettings1.setUseWideViewPort(true);
	        websettings1.setLoadWithOverviewMode(true);		         
	        myBrowser1.setWebViewClient(new WebViewClient());
			break;
		case R.id.bt_ticket:
			WebView myBrowser2=(WebView)findViewById(R.id.mybrowser);  
			myBrowser2.loadUrl("http://www.5284.com.tw/1.html");
	        WebSettings websettings2 = myBrowser2.getSettings();  
	        websettings2.setSupportZoom(true);  
	        websettings2.setBuiltInZoomControls(true);   
	        websettings2.setJavaScriptEnabled(true);  
	        websettings2.setUseWideViewPort(true);
	        websettings2.setLoadWithOverviewMode(true);		         
	        myBrowser2.setWebViewClient(new WebViewClient());
			break;
		default:
			break;
		}
	}

}
