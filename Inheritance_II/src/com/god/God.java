package com.god;

import com.live.Animal;

import com.live.Human;
import com.live.LivingThing;

// " closed for modification , open for extension "

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.learn();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing lt) {
		lt.eat();
		lt.sleep();
		if (lt instanceof Human) {
			Human human = (Human) lt;
			human.learn();
		}
		lt.work();
	}

}
