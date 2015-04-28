package com.example.game;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;

public class Game extends View {
	
	
	private DisplayMetrics metrics;
	public static float SCREEN_WIDTH;
	public static float SCREEN_HEIGHT;
	
	
	private List<Tile> activeTiles = new ArrayList<Tile>();
	
	public Game(Context context) {
		super(context);
		
		metrics = context.getResources().getDisplayMetrics();
		SCREEN_WIDTH = metrics.widthPixels;
		SCREEN_HEIGHT = metrics.heightPixels;
		
		activeTiles.add(new Tile(4));	
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		
		for(Tile tile : activeTiles) {
			System.out.println("Tile Color: " + tile.getColor());
			canvas.drawRect(tile, tile.getColor());
		}
		
		try { Thread.sleep(10); }
		catch (InterruptedException e) {}
		invalidate();
	}
}
