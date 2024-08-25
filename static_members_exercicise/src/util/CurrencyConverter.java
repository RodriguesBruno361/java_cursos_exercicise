package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter (double dolar, double cotation) {
		return (cotation * dolar * IOF) + cotation * dolar;
	}
}
