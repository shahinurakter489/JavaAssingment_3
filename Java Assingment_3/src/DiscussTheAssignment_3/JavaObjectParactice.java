package DiscussTheAssignment_3;

import javax.swing.Spring;

/*Date 04/17/21
 * Problem: Object Practice
 * */
public class JavaObjectParactice {

	int carwheel = 4;
	int bikewheel = 2;
	Spring vehicalecolor;
	int vehicleSideMirror = 2;

	public static void main(String[] args) {
		JavaObjectParactice v = new JavaObjectParactice();
		System.out.println("Reference:"+v);

	}

	void brakeSystem() {
		System.out.println("Brake!");
	}

	void accearateSystem() {
		System.out.println("accearte");
	}

	void navigateSystem() {
		System.out.println("gps system");
	}
}
