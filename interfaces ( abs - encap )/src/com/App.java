package com;

import com.car.Car;
import com.wheel.JKWheel;
import com.wheel.MRFWheel;

public class App {

	public static void main(String[] args) {

		MRFWheel mrfWheel = new MRFWheel();
		JKWheel jkWheel = new JKWheel();

		Car car = new Car();
		// car.setWheel(mrfWheel);
		car.setWheel(jkWheel);

		// on drive
		car.move();

	}

}
