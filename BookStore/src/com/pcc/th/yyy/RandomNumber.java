package com.pcc.th.yyy;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		RandomNumber r = new RandomNumber();
//		System.out.println(r.generate());
		System.out.println(6-2+10%4+7);
		int j=1;
		switch (4) {
		case 1:j++;
		case 2:j++;
		case 3:j++;
		case 4:j++;
		case 5:j++;
		default:j++;
			
		}
		System.out.println(j+4);
		int[] javaaaa= new int[10];
	}

	public int generate(Random random) {
		return random.nextInt(10);
	}
}
