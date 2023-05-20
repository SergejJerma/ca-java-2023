package level1.lesson15.number;

import java.util.Random;

public class TeigiamasSkaicius extends Skaicius {

	@Override
	public void generuok() {
		boolean runLoop = true;
		int i = 0;
		while(runLoop) {
			boolean runGenerator = true;
			while(runGenerator) {
				Random rand = new Random();
				int atsitiktinis = rand.nextInt();
				if (atsitiktinis > 0) {
					masyvas[i] = atsitiktinis;
					runGenerator = false;
				}
			}
			i++;
			if (i == masyvas.length) {
				runLoop = false;
			}
		}

	}

}
