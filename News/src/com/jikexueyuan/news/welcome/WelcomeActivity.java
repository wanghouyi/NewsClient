package com.jikexueyuan.news.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.jikexueyuan.news.R;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_welcome);
		final Intent intent = new Intent(this, WelcomePage.class);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				startActivity(intent);
				//WelcomeActivity.this;(第一处删改）
				finish();

			}
		}, 3000);

	}

}
