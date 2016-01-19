package com;

import java.io.Closeable;
import java.io.FileInputStream;

class Resource implements Closeable {

	public void init() {
		System.out.println("init()");
	}

	public void use() {
		System.out.println("use()");
		int v = 10;
		if (v < 100) {
			throw new RuntimeException();
		}
	}

	public void close() {
		System.out.println("close()");
	}
}

public class Try_Catch_Finally_Syntax {

	public static void main(String[] args) {

		// Resource resource = new Resource();
		// try {
		// resource.init();
		// resource.use();
		// return;
		// // resource.close();
		// } catch (Exception e) {
		// System.out.println("Ex- handled...");
		// } finally {
		// resource.close();
		// }

		// JDK 1.7 --> try with 'Closable Resource'

		
		try (Resource resource = new Resource();FileInputStream fis=new FileInputStream("file")) {
			resource.init();
			resource.use();
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}

		System.out.println("Happy end..");
	}

}
