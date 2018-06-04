package Elliptical_curve.Compute;

import java.math.BigInteger;
import java.util.Random;

public class Class_EC {

	public static void main(String [] args) {
		TY_test ty = new TY_test();
		ty.a_b_test();
		System.out.println(" a = " + TY_test.a);
		System.out.println(" b = " + TY_test.b);
		ty.EC_Compute();
	}

}
