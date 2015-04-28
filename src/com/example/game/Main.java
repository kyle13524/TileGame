package com.example.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		View view = new Game(this);
		setContentView(view);
	}

}
