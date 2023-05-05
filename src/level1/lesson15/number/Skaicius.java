package level1.lesson15.number;

import java.util.Random;

public abstract class Skaicius {

	protected int[] masyvas;
	
	public Skaicius() {
		Random rand = new Random();
		int min = 20;
		int max = 200;
		int dydis = rand.nextInt((max - min) + 1) + min;
		masyvas = new int[dydis];
	}
	
	abstract public void generuok(); 
	
	public long suma() {		
		long suma = 0;
		
//		for (int i = 0; i < masyvas.length; i++) {
//			suma += masyvas[i];
//		}
		
		for(int x : masyvas) {
			suma += x;
		}
		
		return suma;
	}
	
	public int[] getMasyvas() {
		return masyvas;
	}
	
}