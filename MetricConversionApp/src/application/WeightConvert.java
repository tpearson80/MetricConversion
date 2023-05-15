package application;
//********************************************************************************
//
//             Weight Conversion class containing all of the
//             methods for converting.
//
//********************************************************************************
public class WeightConvert {

//Kilograms***************************************************************
	public static double kilogramsToGrams(double kilograms) {
		return kilograms * 1000;
	}

	public static double kilogramsToMilligrams(double kilograms) {
		return kilograms * 1_000_000;
	}

	public static double kilogramsToTons(double kilograms) {
		return kilograms / 1000;
	}

	public static double kilogramsToPounds(double kilograms) {
		return kilograms * 2.20462;
	}

	public static double kilogramsToOunces(double kilograms) {
		return kilograms * 35.274;
	}

//Grams*******************************************************************
	public static double gramsToKilograms(double grams) {
		return grams / 1000.0;
	}

	public static double gramsToMilligrams(double grams) {
		return grams * 1000.0;
	}

	public static double gramsToTons(double grams) {
		return grams / 1000000.0;
	}

	public static double gramsToPounds(double grams) {
		return grams / 453.592;
	}

	public static double gramsToOunces(double grams) {
		return grams / 28.35;
	}

//Milligrams**************************************************************
	public static double milligramsToKilograms(double milligrams) {
		return milligrams / 1000000.0;
	}

	public static double milligramsToGrams(double milligrams) {
		return milligrams / 1000.0;
	}

	public static double milligramsToTons(double milligrams) {
		return milligrams / 1000000000.0;
	}

	public static double milligramsToPounds(double milligrams) {
		return milligrams / 453.59237;
	}

	public static double milligramsToOunces(double milligrams) {
		return milligrams / 28.34952;
	}

//Tons********************************************************************
	public double tonsToKilograms(double tons) {
		return tons * 907.185;
	}

	public double tonsToGrams(double tons) {
		return tons * 907185;
	}

	public double tonsToMilligrams(double tons) {
		return tons * 907185000;
	}

	public double tonsToPounds(double tons) {
		return tons * 2000;
	}

	public double tonsToOunces(double tons) {
		return tons * 32000;
	}

//Pounds******************************************************************
	public static double poundsToKilograms(double pounds) {
		return pounds * 0.45359237;
	}

	public static double poundsToGrams(double pounds) {
		return pounds * 453.59237;
	}

	public static double poundsToMilligrams(double pounds) {
		return pounds * 453592.37;
	}

	public static double poundsToTons(double pounds) {
		return pounds * 0.0005;
	}

	public static double poundsToOunces(double pounds) {
		return pounds * 16;
	}

//Ounces******************************************************************
	public static double ouncesToKilograms(double ounces) {
		return ounces * 0.02834952;
	}

	public static double ouncesToGrams(double ounces) {
		return ounces * 28.34952;
	}

	public static double ouncesToMilligrams(double ounces) {
		return ounces * 28349.52;
	}

	public static double ouncesToTons(double ounces) {
		return ounces * 0.00003125;
	}

	public static double ouncesToPounds(double ounces) {
		return ounces * 0.0625;
	}

}
