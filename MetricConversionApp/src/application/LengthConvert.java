package application;
//********************************************************************************
//
//                 Length Conversion class containing all of the
//                 methods for converting.
//
//********************************************************************************
public class LengthConvert {

//Kilometers******************************************************************
	public static double kilometersToMeters(double kilometers) {
		return kilometers * 1000;
	}

	public static double kilometersToCentimeters(double kilometers) {
		return kilometers * 100000;
	}

	public static double kilometersToMillimeters(double kilometers) {
		return kilometers * 1000000;
	}

	public static double kilometersToMiles(double kilometers) {
		return kilometers * 0.621371;
	}

	public static double kilometersToYards(double kilometers) {
		return kilometers * 1093.61;
	}

	public static double kilometersToFeet(double kilometers) {
		return kilometers * 3280.84;
	}

	public static double kilometersToInches(double kilometers) {
		return kilometers * 39370.1;
	}

//Meters**********************************************************************
	public static double metersToKilometers(double meters) {
		return meters / 1000.0;
	}

	public static double metersToCentimeters(double meters) {
		return meters * 100.0;
	}

	public static double metersToMillimeters(double meters) {
		return meters * 1000.0;
	}

	public static double metersToMiles(double meters) {
		return meters / 1609.344;
	}

	public static double metersToYards(double meters) {
		return meters * 1.09361;
	}

	public static double metersToFeet(double meters) {
		return meters * 3.28084;
	}

	public static double metersToInches(double meters) {
		return meters * 39.3701;
	}

//Centimeters*****************************************************************
	public static double centimetersToKilometers(double centimeters) {
		return centimeters / 100000.0;
	}

	public static double centimetersToMeters(double centimeters) {
		return centimeters / 100.0;
	}

	public static double centimetersToMillimeters(double centimeters) {
		return centimeters * 10.0;
	}

	public static double centimetersToMiles(double centimeters) {
		return centimeters / 160934.0;
	}

	public static double centimetersToYards(double centimeters) {
		return centimeters / 91.44;
	}

	public static double centimetersToFeet(double centimeters) {
		return centimeters / 30.48;
	}

	public static double centimetersToInches(double centimeters) {
		return centimeters / 2.54;
	}

//Millimeters*****************************************************************
	public static double millimetersToKilometers(double millimeters) {
		return millimeters / 1_000_000.0;
	}

	public static double millimetersToMeters(double millimeters) {
		return millimeters / 1000.0;
	}

	public static double millimetersToCentimeters(double millimeters) {
		return millimeters / 10.0;
	}

	public static double millimetersToMiles(double millimeters) {
		return millimeters / 1_609_344.0;
	}

	public static double millimetersToYards(double millimeters) {
		return millimeters / 914.4;
	}

	public static double millimetersToFeet(double millimeters) {
		return millimeters / 304.8;
	}

	public static double millimetersToInches(double millimeters) {
		return millimeters / 25.4;
	}

//Miles***********************************************************************
	public static double milesToKilometers(double miles) {
		return miles * 1.60934;
	}

	public static double milesToMeters(double miles) {
		return miles * 1609.34;
	}

	public static double milesToCentimeters(double miles) {
		return miles * 160934;
	}

	public static double milesToMillimeters(double miles) {
		return miles * 1.609e+6;
	}

	public static double milesToYards(double miles) {
		return miles * 1760;
	}

	public static double milesToFeet(double miles) {
		return miles * 5280;
	}

	public static double milesToInches(double miles) {
		return miles * 63360;
	}

//Yards***********************************************************************
	public static double yardsToKilometers(double yards) {
		return yards * 0.0009144;
	}

	public static double yardsToMeters(double yards) {
		return yards * 0.9144;
	}

	public static double yardsToCentimeters(double yards) {
		return yards * 91.44;
	}

	public static double yardsToMillimeters(double yards) {
		return yards * 914.4;
	}

	public static double yardsToMiles(double yards) {
		return yards * 0.000568182;
	}

	public static double yardsToFeet(double yards) {
		return yards * 3;
	}

	public static double yardsToInches(double yards) {
		return yards * 36;
	}

//Feet************************************************************************
	public static double feetToKilometers(double feet) {
		return feet / 3280.84;
	}

	public static double feetToMeters(double feet) {
		return feet / 3.28084;
	}

	public static double feetToCentimeters(double feet) {
		return feet * 30.48;
	}

	public static double feetToMillimeters(double feet) {
		return feet * 304.8;
	}

	public static double feetToMiles(double feet) {
		return feet / 5280;
	}

	public static double feetToYards(double feet) {
		return feet / 3;
	}

	public static double feetToInches(double feet) {
		return feet * 12;
	}

//Inches**********************************************************************
	public static double inchesToKilometers(double inches) {
		return inches * 0.0000254;
	}

	public static double inchesToMeters(double inches) {
		return inches * 0.0254;
	}

	public static double inchesToCentimeters(double inches) {
		return inches * 2.54;
	}

	public static double inchesToMillimeters(double inches) {
		return inches * 25.4;
	}

	public static double inchesToMiles(double inches) {
		return inches / 63360.0;
	}

	public static double inchesToYards(double inches) {
		return inches / 36.0;
	}

	public static double inchesToFeet(double inches) {
		return inches / 12.0;
	}

}
