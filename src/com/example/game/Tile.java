package com.example.game;

import java.util.Random;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Tile extends RectF {
	public static int TILE_WIDTH;
	public static int TILE_HEIGHT;
	
	private Paint tileColor;
	
	private boolean broken = false;
	
	private int lifetime;
	
	public Tile(int lifetime) {
		this.lifetime = lifetime;
		TILE_WIDTH = (int) Game.SCREEN_WIDTH / 10;
		TILE_HEIGHT = (int) Game.SCREEN_HEIGHT / 15;
		
		tileColor = new Paint();
		tileColor.setColor(Color.argb(50, 255, 0, 0));
		placeTile();
	}
	
	private void placeTile() {
		float screenWidth = Game.SCREEN_WIDTH;
		float screenHeight = Game.SCREEN_HEIGHT;
		
		Random random = new Random();
		top = random.nextInt((int) screenHeight - (TILE_HEIGHT * 2)) + 10;
		left = random.nextInt((int) screenWidth - (TILE_WIDTH * 2)) + 10;
		bottom = top + TILE_HEIGHT;
		right = left + TILE_WIDTH;
		
		System.out.println(top + " " + left + " " + bottom + " " + right);		
	}
	
	public int getLifetime() {
		return this.lifetime;
	}
	public Paint getColor() {
		return this.tileColor;
	}
	
	public void moveVertically(float amt) {
		top += amt;
		bottom += amt;
	}
	public void moveHorizontally(float amt) {
		left += amt;
		right += amt;
	}
	public boolean isBroken() {
		return this.broken;
	}
}
