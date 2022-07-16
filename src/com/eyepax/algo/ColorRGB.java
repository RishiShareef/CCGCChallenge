package com.eyepax.algo;

import java.util.Random;

public class ColorRGB {
	
	  public static Random random = new Random();
	  
	  public  int getRandomIntColor() {
	        int[] rgb = getRandomRgb();
	        int color = 0;
	        for (int c : rgb) {
	            color = color << 8;/* ww  w  .j a  va  2  s  .  c o  m*/
	            color = color | c;
	        }
	        return color;
	    }

	    public int[] getRandomRgb() {
	        int[] rgb = new int[3];
	        for (int i = 0; i < 3; i++) {
	            rgb[i] = random.nextInt(255);
	        }
	        return rgb;
	    }

}
