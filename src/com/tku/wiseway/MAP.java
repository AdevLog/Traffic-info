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
import android.widget.ImageButton;
import android.widget.TextView;

public class MAP extends Activity implements OnClickListener{
	
	private ImageButton ibthighway;
	private ImageButton ibtmainroad;
	private ImageButton ibttraffic;
	private ImageButton ibtback;
	private TextView tv3,tv4,tv5,tv6;
	private TextPaint tp3,tp4,tp5,tp6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		setTitle("Map 地圖");
		
		findview();
		webview();
		textpaint();
		setfakeboldtext();
		setonclicklistener();
	}

	private void findview() {
		// TODO Auto-generated method stub
		ibthighway = (ImageButton)findViewById(R.id.ibt_highway);
		ibtmainroad = (ImageButton)findViewById(R.id.ibt_mainroad);
		ibttraffic = (ImageButton)findViewById(R.id.ibt_traffic);
		ibtback = (ImageButton)findViewById(R.id.ibt_back);
		tv3 = (TextView)findViewById(R.id.textView3);
		tv4 = (TextView)findViewById(R.id.textView4);
		tv5 = (TextView)findViewById(R.id.textView5);
		tv6 = (TextView)findViewById(R.id.textView6);
	}

	private void webview() {
		// TODO Auto-generated method stub
		WebView myBrowser=(WebView)findViewById(R.id.mybrowser);  
		myBrowser.loadUrl("http://pda.freeway.gov.tw/m/");
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
		tp3 = tv3 .getPaint();
		tp4 = tv4 .getPaint();
		tp5 = tv5 .getPaint();
		tp6 = tv6 .getPaint();
	}

	private void setfakeboldtext() {
		// TODO Auto-generated method stub
		tp3.setFakeBoldText(true);
		tp4.setFakeBoldText(true);
		tp5.setFakeBoldText(true);
		tp6.setFakeBoldText(true);
	}

	private void setonclicklistener() {
		// TODO Auto-generated method stub
		ibthighway.setOnClickListener(this);
		ibtmainroad.setOnClickListener(this);
		ibttraffic.setOnClickListener(this);
		ibtback.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.ibt_highway:
				WebView myBrowser1=(WebView)findViewById(R.id.mybrowser);  
				myBrowser1.loadUrl("http://pda.freeway.gov.tw/m/");
		        WebSettings websettings1 = myBrowser1.getSettings();  
		        websettings1.setSupportZoom(true);  
		        websettings1.setBuiltInZoomControls(true);   
		        websettings1.setJavaScriptEnabled(true);  
		        websettings1.setUseWideViewPort(true);
		        websettings1.setLoadWithOverviewMode(true);		         
		        myBrowser1.setWebViewClient(new WebViewClient());	             
				break;
			case R.id.ibt_mainroad:
				WebView myBrowser2=(WebView)findViewById(R.id.mybrowser);  
				myBrowser2.loadUrl("http://1968.freeway.gov.tw/cctv");
		        WebSettings websettings2 = myBrowser2.getSettings();  
		        websettings2.setSupportZoom(true);  
		        websettings2.setBuiltInZoomControls(true);   
		        websettings2.setJavaScriptEnabled(true);  
		        websettings2.setUseWideViewPort(true);
		        websettings2.setLoadWithOverviewMode(true);		         
		        myBrowser2.setWebViewClient(new WebViewClient());  
				break;
			case R.id.ibt_traffic:
				Intent intent3 = new Intent(MAP.this,TRAFFIC.class);
				startActivity(intent3);
				finish();
				break;
			case R.id.ibt_back:
				finish();
				break;
			default:
				break;
		}
	}

}
