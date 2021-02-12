package lesson7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	int min = 5;
    	int max = 10;
    	int diff = max - min;
		Random rnd = new Random();

		Cat[] manyCats = new Cat[4];
	    manyCats[0] = new Cat("Pushok", rnd.nextInt(diff + 1) + min);
		System.out.println(manyCats[0].getAppetite());
		manyCats[1] = new Cat("Pol", rnd.nextInt(diff + 1) + min);
		System.out.println(manyCats[1].getAppetite());
		manyCats[2] = new Cat("Lola", rnd.nextInt(diff + 1) + min);
		System.out.println(manyCats[2].getAppetite());
		manyCats[3] = new Cat("Nik", rnd.nextInt(diff + 1) + min);
		System.out.println(manyCats[3].getAppetite());

		Plate plate = new Plate(10);

		for(int i = 0; i < manyCats.length; i++) {
			manyCats[i].eat(plate);

			plate.info(manyCats[i]);
			System.out.println();
		}
    }
}
