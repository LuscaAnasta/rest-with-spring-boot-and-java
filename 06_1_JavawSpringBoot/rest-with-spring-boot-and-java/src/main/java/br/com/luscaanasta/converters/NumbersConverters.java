package br.com.luscaanasta.converters;

public class NumbersConverters {
	public static Double convertToDouble(String strN) {
		if(strN == null) return 0D;
		String number = strN.replaceAll(",",".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strN) {
		if(strN == null) return false;
		String number = strN.replaceAll(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
