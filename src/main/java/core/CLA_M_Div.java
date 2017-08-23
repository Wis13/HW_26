package core;
import java.math.*;
public class CLA_M_Div {
	public static void main(String[] args) {
		if (args.length < 2 ) {System.err.println("At least 2 params"); System.exit(0);}
		double result = Double.valueOf(args[0]);
		for (int i = 0; i < args.length; i++) { result /= Double.valueOf(args[i]); }
		System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
	}
}