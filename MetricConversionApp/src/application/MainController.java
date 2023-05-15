package application;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

//*************************************************************************************************
//
//                       Main Controller of the Program.
//                          By: Travis Pearson
//                          Finished on 04/29/2023
//
//*************************************************************************************************

public class MainController implements Initializable {

	// Background
	@FXML
	private AnchorPane anchorPane;

	// Labels
	@FXML
	private Label headerLabel;
	@FXML
	private Label temperatureLabel;
	@FXML
	private Label weightLabel;
	@FXML
	private Label lengthLabel;
	@FXML
	private Label areaLabel;
	@FXML
	private Label volumeLabel;
	@FXML
	private Label convertLabel;
	@FXML
	private Label toLabel;
	@FXML
	private Label convertOutputLabel;
	@FXML
	private Label toOutputLabel;
	@FXML
	private Label outputLabel;
	@FXML
	private Label enterLabel;

	// Input text field
	@FXML
	private TextField inputTextField;
	private double input;
	private double output;

	// Images
	@FXML
	private ImageView icons;
	@FXML
	private Image icon = new Image(getClass().getResourceAsStream("images/weight.png"));
	@FXML
	private ImageView swapImage;

	// Buttons
	@FXML
	private Button submitButton;
	@FXML
	private Button resetButton;

	// Menus with all conversion methods
	@FXML
	private ComboBox<String> tempMenu;
	@FXML
	private ComboBox<String> weightMenu;
	@FXML
	private ComboBox<String> lengthMenu;
	@FXML
	private ComboBox<String> areaMenu;
	@FXML
	private ComboBox<String> volumeMenu;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// ***************************************************************************************************
		//
		// The initialize method is how the program is set up
		// to begin the program. The following show observable
		// Array Lists to set up the menus of the program and
		// give the user the choice of methods on which to
		// convert their inputs.They are followed by calling
		// the menu actions methods.
		//
		// ***************************************************************************************************
		tempMenu.setItems(FXCollections.observableArrayList("Fahrenheit to Celsius", "Fahrenheit to Kelvin",
				"Celsius to Fahrenheit", "Celsius to Kelvin", "Kelvin to Fahrenheit", "Kelvin to Celsius"));

		weightMenu.setItems(FXCollections.observableArrayList("Tons to Kilograms", "Tons to Grams",
				"Tons to Milligrams", "Tons to Pounds", "Tons to Ounces", "Pounds to Kilograms", "Pounds to Grams",
				"Pounds to Milligrams", "Pounds to Tons", "Pounds to Ounces", "Ounces to Kilograms", "Ounces to Grams",
				"Ounces to Milligrams", "Ounces to Tons", "Ounces to Pounds", "Kilograms to Tons",
				"Kilograms to Pounds", "Kilograms to Ounces", "Kilograms to Grams", "Kilograms to Milligrams",
				"Grams to Tons", "Grams to Pounds", "Grams to Ounces", "Grams to Kilograms", "Grams to Milligrams",
				"Milligrams to Tons", "Milligrams to Pounds", "Milligrams to Ounces", "Milligrams to Kilograms",
				"Milligrams to Grams"));

		lengthMenu.setItems(FXCollections.observableArrayList("Miles to Kilometers", "Miles to Meters",
				"Miles to Centimeters", "Miles to Millimeters", "Miles to Yards", "Miles to Feet", "Miles to Inches",
				"Yards to Kilometers", "Yards to Meters", "Yards to Centimeters", "Yards to Millimeters",
				"Yards to Miles", "Yards to Feet", "Yards to Inches", "Feet to Kilometers", "Feet to Meters",
				"Feet to Centimeters", "Feet to Millimeters", "Feet to Miles", "Feet to Yards", "Feet to Inches",
				"Inches to Kilometers", "Inches to Meters", "Inches to Centimeters", "Inches to Millimeters",
				"Inches to Miles", "Inches to Yards", "Inches to Feet", "Kilometers to Miles", "Kilometers to Yards",
				"Kilometers to Feet", "Kilometers to Inches", "Kilometers to Meters", "Kilometers to Centimeters",
				"Kilometers to Millimeters", "Meters to Miles", "Meters to Yards", "Meters to Feet", "Meters to Inches",
				"Meters to Kilometers", "Meters to Centimeters", "Meters to Millimeters", "Centimeters to Miles",
				"Centimeters to Yards", "Centimeters to Feet", "Centimeters to Inches", "Centimeters to Kilometers",
				"Centimeters to Millimeters", "Millimeters to Miles", "Millimeters to Yards", "Millimeters to Feet",
				"Millimeters to Inches", "Millimeters to Kilometers", "Millimeters to Centimeters"));

		areaMenu.setItems(FXCollections.observableArrayList("Square Miles to Square Kilometers",
				"Square Miles to Square Meters", "Square Miles to Square Centimeters",
				"Square Miles to Square Millimeters", "Square Miles to Square Yards", "Square Miles to Square Feet",
				"Square Miles to Square Inches", "Square Yards to Square Kilometers", "Square Yards to Square Meters",
				"Square Yards to Square Centimeters", "Square Yards to Square Millimeters",
				"Square Yards to Square Miles", "Square Yards to Square Feet", "Square Yards to Square Inches",
				"Square Feet to Square Kilometers", "Square Feet to Square Meters", "Square Feet to Square Centimeters",
				"Square Feet to Square Millimeters", "Square Feet to Square Miles", "Square Feet to Square Yards",
				"Square Feet to Square Inches", "Square Inches to Square Kilometers", "Square Inches to Square Meters",
				"Square Inches to Square Centimeters", "Square Inches to Square Millimeters",
				"Square Inches to Square Miles", "Square Inches to Square Yards", "Square Inches to Square Feet",
				"Square Kilometers to Square Miles", "Square Kilometers to Square Yards",
				"Square Kilometers to Square Feet", "Square Kilometers to Square Inches",
				"Square Kilometers to Square Meters", "Square Kilometers to Square Centimeters",
				"Square Kilometers to Square Millimeters", "Square Meters to Square Miles",
				"Square Meters to Square Yards", "Square Meters to Square Feet", "Square Meters to Square Inches",
				"Square Meters to Square Kilometers", "Square Meters to Square Centimeters",
				"Square Meters to Square Millimeters", "Square Centimeters to Square Miles",
				"Square Centimeters to Square Yards", "Square Centimeters to Square Feet",
				"Square Centimeters to Square Inches", "Square Centimeters to Square Kilometers",
				"Square Centimeters to Square Millimeters", "Square Millimeters to Square Miles",
				"Square Millimeters to Square Yards", "Square Millimeters to Square Feet",
				"Square Millimeters to Square Inches", "Square Millimeters to Square Kilometers",
				"Square Millimeters to Square Centimeters"));

		volumeMenu.setItems(FXCollections.observableArrayList("Gallons to Liters", "Gallons to Milliliters",
				"Gallons to Cubic Kilometers", "Gallons to Cubic Meters", "Gallons to Cubic Centimeters",
				"Gallons to Cubic Millimeters", "Gallons to Quarts", "Gallons to Pints", "Gallons to Cups",
				"Gallons to Fluid Ounces", "Gallons to Tablespoons", "Gallons to Teaspoons", "Quarts to Liters",
				"Quarts to Milliliters", "Quarts to Cubic Kilometers", "Quarts to Cubic Meters",
				"Quarts to Cubic Centimeters", "Quarts to Cubic Millimeters", "Quarts to Gallons", "Quarts to Pints",
				"Quarts to Cups", "Quarts to Fluid Ounces", "Quarts to Tablespoons", "Quarts to Teaspoons",
				"Pints to Liters", "Pints to Milliliters", "Pints to Cubic Kilometers", "Pints to Cubic Meters",
				"Pints to Cubic Centimeters", "Pints to Cubic Millimeters", "Pints to Gallons", "Pints to Quarts",
				"Pints to Cups", "Pints to Fluid Ounces", "Pints to Tablespoon", "Pints to Teaspoons", "Cups to Liters",
				"Cups to Milliliters", "Cups to Cubic Kilometers", "Cups to Cubic Meters", "Cups to Cubic Centimeters",
				"Cups to Cubic Millimeters", "Cups to Gallons", "Cups to Quarts", "Cups to Pints",
				"Cups to Fluid Ounces", "Cups to Tablespoons", "Cups to Teaspoons", "Fluid Ounces to Liters",
				"Fluid Ounces to Milliliters", "Fluid Ounces to Cubic Kilometers", "Fluid Ounces to Cubic Meters",
				"Fluid Ounces to Cubic Centimeters", "Fluid Ounces to Cubic Millimeters", "Fluid Ounces to Gallons",
				"Fluid Ounces to Quarts", "Fluid Ounces to Pints", "Fluid Ounces to Cups",
				"Fluid Ounces to Tablespoons", "Fluid Ounces to Teaspoons", "Tablespoons to Liters",
				"Tablespoons to Milliliters", "Tablespoons to Cubic Kilometers", "Tablespoons to Cubic Meters",
				"Tablespoons to Cubic Centimeters", "Tablespoons to Cubic Millimeters", "Tablespoons to Gallons",
				"Tablespoons to Quarts", "Tablespoons to Pints", "Tablespoons to Cups", "Tablespoons to Fluid Ounces",
				"Tablespoons to Teaspoons", "Teaspoons to Liters", "Teaspoons to Milliliters",
				"Teaspoons to Cubic Kilometers", "Teaspoons to Cubic Meters", "Teaspoons to Cubic Centimeters",
				"Teaspoons to Cubic Millimeters", "Teaspoons to Gallons", "Teaspoons to Quarts", "Teaspoons to Pints",
				"Teaspoons to Cups", "Teaspoons to Fluid Ounces", "Teaspoons to Tablespoons", "Liters to Milliliters",
				"Liters to Cubic Kilometers", "Liters to Cubic Meters", "Liters to Cubic Centimeters",
				"Liters to Cubic Millimeters", "Liters to Gallons", "Liters to Quarts", "Liters to Pints",
				"Liters to Cups", "Liters to Fluid Ounces", "Liters to Tablespoons", "Liters to Teaspoons",
				"Milliliters to Liters", "Milliliters to Cubic Kilometers", "Milliliters to Cubic Meters",
				"Milliliters to Cubic Centimeters", "Milliliters to Cubic Millimeters", "Milliliters to Gallons",
				"Milliliters to Quarts", "Milliliters to Pints", "Milliliters to Cups", "Milliliters to Fluid Ounces",
				"Milliliters to Tablespoons", "Milliliters to Teaspoons", "Cubic Kilometers to Liters",
				"Cubic Kilometers to Milliliters", "Cubic Kilometers to Cubic Meters",
				"Cubic Kilometers to Cubic Centimeters", "Cubic Kilometers to Cubic Millimeters",
				"Cubic Kilometers to Gallons", "Cubic Kilometers to Quarts", "Cubic Kilometers to Pints",
				"Cubic Kilometers to Cups", "Cubic Kilometers to Fluid Ounces", "Cubic Kilometers to Tablespoons",
				"Cubic Kilometers to Teaspoons", "Cubic Meters to Liters", "Cubic Meters to Milliliters",
				"Cubic Meters to Cubic Kilometers", "Cubic Meters to Cubic Centimeters",
				"Cubic Meters to Cubic Millimeters", "Cubic Meters to Gallons", "Cubic Meters to Quarts",
				"Cubic Meters to Pints", "Cubic Meters to Cups", "Cubic Meters to Fluid Ounces",
				"Cubic Meters to Tablespoons", "Cubic Meters to Teaspoons", "Cubic Centimeters to Liters",
				"Cubic Centimeters to Milliliters", "Cubic Centimeters to Cubic Kilometers",
				"Cubic Centimeters to Cubic Meters", "Cubic Centimeters to Cubic Millimeters",
				"Cubic Centimeters to Gallons", "Cubic Centimeters to Quarts", "Cubic Centimeters to Pints",
				"Cubic Centimeters to Cups", "Cubic Centimeters to Fluid Ounces", "Cubic Centimeters to Tablespoons",
				"Cubic Centimeters to Teaspoons", "Cubic Millimeters to Liters", "Cubic Millimeters to Milliliters",
				"Cubic Millimeters to Cubic Kilometers", "Cubic Millimeters to Cubic Meters",
				"Cubic Millimeters to Cubic Centimeters", "Cubic Millimeters to Gallons", "Cubic Millimeters to Quarts",
				"Cubic Millimeters to Pints", "Cubic Millimeters to Cups", "Cubic Millimeters to Fluid Ounces",
				"Cubic Millimeters to Tablespoons", "Cubic Millimeters to Teaspoons"));

		tempMenuActions();
		weightMenuActions();
		lengthMenuActions();
		areaMenuActions();
		volumeMenuActions();

	}

	// This method takes the text from the convert and to labels and strings them
	// together for calling the methods to be run.
	public String stringTogetherMethodName() {
		String convert = convertOutputLabel.getText().trim().replaceAll("\\s+", "");
		String to = toOutputLabel.getText().trim().replaceAll("\\s+", "");
		String methodName = convert.substring(0, 1).toLowerCase() + convert.substring(1) + "To"
				+ to.substring(0, 1).toUpperCase() + to.substring(1);

		return methodName;
	}

	// This method calls whatever method the user wanted to convert.
	// It takes the stringTogetherMethodName input and loops through
	// the classes to find the proper method and invokes the method
	// on the user input.
	public String callMethod(double input) throws Exception {
		String methodName = stringTogetherMethodName();
		double result = 0.0;
		Class<?>[] classes = { TemperatureConvert.class, WeightConvert.class, LengthConvert.class, AreaConvert.class,
				VolumeConvert.class };
		boolean methodFound = false;

		for (Class<?> clazz : classes) {
			Method method = null;

			try {
				method = clazz.getDeclaredMethod(methodName, double.class);
			} catch (NoSuchMethodException e) {
				continue;
			}

			Object instance = clazz.getDeclaredConstructor().newInstance();
			result = (double) method.invoke(instance, input);
			methodFound = true;
			break;
		}

		try {
			if (!methodFound) {
				throw new NoSuchMethodException("Method " + methodName + " not found in any class.");
			}
		} catch (NoSuchMethodException e) {
			JOptionPane.showMessageDialog(null, "You must make a conversion selection from one of the menus before submitting!",
					"You have made no selection!", JOptionPane.ERROR_MESSAGE);
		}

		return Double.toString(result);
	}

	// This method is an Action Event that is done when the user hits the Submit Button.
	// It will take the user input and call the callMethod to invoke the proper method.
	// It then takes that method, parses the output from it and outputs it to the
	// Output label for the user to view the conversion.

	@FXML
	public void onSubmit(ActionEvent event) {

		try {
			DecimalFormat df = new DecimalFormat("#,###.########");
			String formattedOutput;
			input = Double.parseDouble(inputTextField.getText());
			output = Double.parseDouble(callMethod(input));
			formattedOutput = df.format(output);
			outputLabel.setText("OUTPUT: " + formattedOutput);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "You must enter a number!", "Number Format Exception",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// This method is used for switching the convert and to labels.
	// It gives the user additional options

	@FXML
	public void swap() {
		String convert = convertOutputLabel.getText().toString();
		String to = toOutputLabel.getText().toString();
		toOutputLabel.setText(convert);
		;
		convertOutputLabel.setText(to);
	}

	// This method is for resetting the application to its original state.
	public void reset() {
		inputTextField.setText("");
		outputLabel.setText("OUTPUT: ");
		convertOutputLabel.setText("ex: Kilograms");
		toOutputLabel.setText("ex: Pounds");
		icon = new Image(getClass().getResourceAsStream("images/weight.png"));
		icons.setImage(icon);

	}

	// This method is the Action Event when the user clicks the reset button. It resets the
	//menu values back to their original state and calls the reset method to reset everything else

	@FXML
	public void resetButtonClicked(ActionEvent event) {
		tempMenu.setValue("");
		weightMenu.setValue("");
		lengthMenu.setValue("");
		areaMenu.setValue("");
		volumeMenu.setValue("");
		reset();
	}

	// This method contains the actions for the Temperature menu. It will change the image
	// icon to a thermometer icon and change the text of the convert and to output 
	//labels to whatever the user wants to convert.

	@FXML
	public void tempMenuActions() {

		tempMenu.setOnAction(e -> {
			String selectedConversion = tempMenu.getValue();
			icon = new Image(getClass().getResourceAsStream("images/thermometer.png"));
			icons.setImage(icon);

			switch (selectedConversion) {
			case "Celsius to Fahrenheit":
				convertOutputLabel.setText("Celsius");
				toOutputLabel.setText("Fahrenheit");
				break;
			case "Fahrenheit to Celsius":
				convertOutputLabel.setText("Fahrenheit");
				toOutputLabel.setText("Celsius");
				break;
			case "Celsius to Kelvin":
				convertOutputLabel.setText("Celsius");
				toOutputLabel.setText("Kelvin");
				break;
			case "Kelvin to Celsius":
				convertOutputLabel.setText("Kelvin");
				toOutputLabel.setText("Celsius");
				break;
			case "Fahrenheit to Kelvin":
				convertOutputLabel.setText("Fahrenheit");
				toOutputLabel.setText("Kelvin");
				break;
			case "Kelvin to Fahrenheit":
				convertOutputLabel.setText("Kelvin");
				toOutputLabel.setText("Fahrenheit");
				break;
			default:
				convertOutputLabel.setText("");
				toOutputLabel.setText("");
			}
		});

	}

	// This method contains the actions for the Weight menu. It will change the image icon
	// to a scale icon and change the text of the convert and to output labels to
	// whatever the user wants to convert.

	@FXML
	public void weightMenuActions() {

		weightMenu.setOnAction(e -> {
			String selectedConversion = weightMenu.getValue();
			icon = new Image(getClass().getResourceAsStream("images/weight.png"));
			icons.setImage(icon);

			switch (selectedConversion) {
			case "Tons to Kilograms":
				convertOutputLabel.setText("Tons");
				toOutputLabel.setText("Kilograms");
				break;
			case "Tons to Grams":
				convertOutputLabel.setText("Tons");
				toOutputLabel.setText("Grams");
				break;
			case "Tons to Milligrams":
				convertOutputLabel.setText("Tons");
				toOutputLabel.setText("Milligrams");
				break;
			case "Tons to Pounds":
				convertOutputLabel.setText("Tons");
				toOutputLabel.setText("Pounds");
				break;
			case "Tons to Ounces":
				convertOutputLabel.setText("Tons");
				toOutputLabel.setText("Ounces");
				break;
			case "Pounds to Kilograms":
				convertOutputLabel.setText("Pounds");
				toOutputLabel.setText("Kilograms");
				break;
			case "Pounds to Grams":
				convertOutputLabel.setText("Pounds");
				toOutputLabel.setText("Grams");
				break;
			case "Pounds to Milligrams":
				convertOutputLabel.setText("Pounds");
				toOutputLabel.setText("Milligrams");
				break;
			case "Pounds to Tons":
				convertOutputLabel.setText("Pounds");
				toOutputLabel.setText("Tons");
				break;
			case "Pounds to Ounces":
				convertOutputLabel.setText("Pounds");
				toOutputLabel.setText("Ounces");
				break;
			case "Ounces to Kilograms":
				convertOutputLabel.setText("Ounces");
				toOutputLabel.setText("Kilograms");
				break;
			case "Ounces to Grams":
				convertOutputLabel.setText("Ounces");
				toOutputLabel.setText("Grams");
				break;
			case "Ounces to Milligrams":
				convertOutputLabel.setText("Ounces");
				toOutputLabel.setText("Milligrams");
				break;
			case "Ounces to Tons":
				convertOutputLabel.setText("Ounces");
				toOutputLabel.setText("Tons");
				break;
			case "Ounces to Pounds":
				convertOutputLabel.setText("Ounces");
				toOutputLabel.setText("Pounds");
				break;
			case "Kilograms to Tons":
				convertOutputLabel.setText("Kilograms");
				toOutputLabel.setText("Tons");
				break;
			case "Kilograms to Pounds":
				convertOutputLabel.setText("Kilograms");
				toOutputLabel.setText("Pounds");
				break;
			case "Kilograms to Ounces":
				convertOutputLabel.setText("Kilograms");
				toOutputLabel.setText("Ounces");
				break;
			case "Kilograms to Grams":
				convertOutputLabel.setText("Kilograms");
				toOutputLabel.setText("Grams");
				break;
			case "Kilograms to Milligrams":
				convertOutputLabel.setText("Kilograms");
				toOutputLabel.setText("Milligrams");
				break;
			case "Grams to Tons":
				convertOutputLabel.setText("Grams");
				toOutputLabel.setText("Tons");
				break;
			case "Grams to Pounds":
				convertOutputLabel.setText("Grams");
				toOutputLabel.setText("Pounds");
				break;
			case "Grams to Ounces":
				convertOutputLabel.setText("Grams");
				toOutputLabel.setText("Ounces");
				break;
			case "Grams to Kilograms":
				convertOutputLabel.setText("Grams");
				toOutputLabel.setText("Kilograms");
				break;
			case "Grams to Milligrams":
				convertOutputLabel.setText("Grams");
				toOutputLabel.setText("Milligrams");
				break;
			case "Milligrams to Tons":
				convertOutputLabel.setText("Milligrams");
				toOutputLabel.setText("Tons");
				break;
			case "Milligrams to Pounds":
				convertOutputLabel.setText("Milligrams");
				toOutputLabel.setText("Pounds");
				break;
			case "Milligrams to Ounces":
				convertOutputLabel.setText("Milligrams");
				toOutputLabel.setText("Ounces");
				break;
			case "Milligrams to Kilograms":
				convertOutputLabel.setText("Milligrams");
				toOutputLabel.setText("Kilograms");
				break;
			case "Milligrams to Grams":
				convertOutputLabel.setText("Milligrams");
				toOutputLabel.setText("Grams");
				break;
			default:
				convertOutputLabel.setText("");
				toOutputLabel.setText("");
			}
		});
	}

	// This method contains the actions for the Length menu. It will change the image icon
	// to a ruler icon and change the text of the convert and to output labels to
	// whatever the user wants to convert.

	@FXML
	public void lengthMenuActions() {

		lengthMenu.setOnAction(e -> {
			String selectedConversion = lengthMenu.getValue();
			icon = new Image(getClass().getResourceAsStream("images/length.png"));
			icons.setImage(icon);

			switch (selectedConversion) {
			case "Miles to Kilometers":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Kilometers");
				break;
			case "Miles to Meters":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Meters");
				break;
			case "Miles to Centimeters":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Centimeters");
				break;
			case "Miles to Millimeters":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Millimeters");
				break;
			case "Miles to Yards":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Yards");
				break;
			case "Miles to Feet":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Feet");
				break;
			case "Miles to Inches":
				convertOutputLabel.setText("Miles");
				toOutputLabel.setText("Inches");
				break;
			case "Yards to Kilometers":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Kilometers");
				break;
			case "Yards to Meters":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Meters");
				break;
			case "Yards to Centimeters":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Centimeters");
				break;
			case "Yards to Millimeters":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Millimeters");
				break;
			case "Yards to Miles":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Miles");
				break;
			case "Yards to Feet":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Feet");
				break;
			case "Yards to Inches":
				convertOutputLabel.setText("Yards");
				toOutputLabel.setText("Inches");
				break;
			case "Feet to Kilometers":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Kilometers");
				break;
			case "Feet to Meters":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Meters");
				break;
			case "Feet to Centimeters":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Centimeters");
				break;
			case "Feet to Millimeters":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Millimeters");
				break;
			case "Feet to Miles":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Miles");
				break;
			case "Feet to Yards":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Yards");
				break;
			case "Feet to Inches":
				convertOutputLabel.setText("Feet");
				toOutputLabel.setText("Inches");
				break;
			case "Inches to Kilometers":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Kilometers");
				break;
			case "Inches to Meters":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Meters");
				break;
			case "Inches to Centimeters":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Centimeters");
				break;
			case "Inches to Millimeters":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Millimeters");
				break;
			case "Inches to Miles":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Miles");
				break;
			case "Inches to Yards":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Yards");
				break;
			case "Inches to Feet":
				convertOutputLabel.setText("Inches");
				toOutputLabel.setText("Feet");
				break;
			case "Kilometers to Miles":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Miles");
				break;
			case "Kilometers to Yards":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Yards");
				break;
			case "Kilometers to Feet":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Feet");
				break;
			case "Kilometers to Inches":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Inches");
				break;
			case "Kilometers to Meters":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Meters");
				break;
			case "Kilometers to Centimeters":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Centimeters");
				break;
			case "Kilometers to Millimeters":
				convertOutputLabel.setText("Kilometers");
				toOutputLabel.setText("Millimeters");
				break;
			case "Meters to Miles":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Miles");
				break;
			case "Meters to Yards":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Yards");
				break;
			case "Meters to Feet":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Feet");
				break;
			case "Meters to Inches":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Inches");
				break;
			case "Meters to Kilometers":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Kilometers");
				break;
			case "Meters to Centimeters":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Centimeters");
				break;
			case "Meters to Millimeters":
				convertOutputLabel.setText("Meters");
				toOutputLabel.setText("Millimeters");
				break;
			case "Centimeters to Miles":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Miles");
				break;
			case "Centimeters to Yards":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Yards");
				break;
			case "Centimeters to Feet":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Feet");
				break;
			case "Centimeters to Inches":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Inches");
				break;
			case "Centimeters to Kilometers":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Kilometers");
				break;
			case "Centimeters to Millimeters":
				convertOutputLabel.setText("Centimeters");
				toOutputLabel.setText("Millimeters");
				break;
			case "Millimeters to Miles":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Miles");
				break;
			case "Millimeters to Yards":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Yards");
				break;
			case "Millimeters to Feet":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Feet");
				break;
			case "Millimeters to Inches":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Inches");
				break;
			case "Millimeters to Kilometers":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Kilometers");
				break;
			case "Millimeters to Centimeters":
				convertOutputLabel.setText("Millimeters");
				toOutputLabel.setText("Centimeters");
				break;
			default:
				convertOutputLabel.setText("");
				toOutputLabel.setText("");
			}
		});
	}

	// This method contains the actions for the Area menu. It will change the image icon
	// to a square icon and change the text of the convert and to output labels to
	// whatever the user wants to convert.

	@FXML
	public void areaMenuActions() {

		areaMenu.setOnAction(e -> {
			String selectedConversion = areaMenu.getValue();
			icon = new Image(getClass().getResourceAsStream("images/area.png"));
			icons.setImage(icon);

			switch (selectedConversion) {
			case "Square Miles to Square Kilometers":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Miles to Square Meters":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Meters");
				break;
			case "Square Miles to Square Centimeters":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Miles to Square Millimeters":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Miles to Square Yards":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Miles to Square Feet":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Miles to Square Inches":
				convertOutputLabel.setText("Square Miles");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Yards to Square Kilometers":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Yards to Square Meters":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Meters");
				break;
			case "Square Yards to Square Centimeters":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Yards to Square Millimeters":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Yards to Square Miles":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Yards to Square Feet":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Yards to Square Inches":
				convertOutputLabel.setText("Square Yards");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Feet to Square Kilometers":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Feet to Square Meters":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Meters");
				break;
			case "Square Feet to Square Centimeters":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Feet to Square Millimeters":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Feet to Square Miles":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Feet to Square Yards":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Feet to Square Inches":
				convertOutputLabel.setText("Square Feet");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Inches to Square Kilometers":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Inches to Square Meters":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Meters");
				break;
			case "Square Inches to Square Centimeters":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Inches to Square Millimeters":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Inches to Square Miles":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Inches to Square Yards":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Inches to Square Feet":
				convertOutputLabel.setText("Square Inches");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Kilometers to Square Miles":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Kilometers to Square Yards":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Kilometers to Square Feet":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Kilometers to Square Inches":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Kilometers to Square Meters":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Meters");
				break;
			case "Square Kilometers to Square Centimeters":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Kilometers to Square Millimeters":
				convertOutputLabel.setText("Square Kilometers");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Meters to Square Miles":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Meters to Square Yards":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Meters to Square Feet":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Meters to Square Inches":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Meters to Square Kilometers":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Meters to Square Centimeters":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Centimeters");
				break;
			case "Square Meters to Square Millimeters":
				convertOutputLabel.setText("Square Meters");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Centimeters to Square Miles":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Centimeters to Square Yards":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Centimeters to Square Feet":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Centimeters to Square Inches":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Centimeters to Square Kilometers":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Centimeters to Square Millimeters":
				convertOutputLabel.setText("Square Centimeters");
				toOutputLabel.setText("Square Millimeters");
				break;
			case "Square Millimeters to Square Miles":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Miles");
				break;
			case "Square Millimeters to Square Yards":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Yards");
				break;
			case "Square Millimeters to Square Feet":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Feet");
				break;
			case "Square Millimeters to Square Inches":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Inches");
				break;
			case "Square Millimeters to Square Kilometers":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Kilometers");
				break;
			case "Square Millimeters to Square Centimeters":
				convertOutputLabel.setText("Square Millimeters");
				toOutputLabel.setText("Square Centimeters");
				break;
			default:
				convertOutputLabel.setText("");
				toOutputLabel.setText("");
			}

		});
	}

	// This method contains the actions for the Volume menu. It will change the image icon
	// to a cube icon and change the text of the convert and to output labels to
	// whatever the user wants to convert.

	@FXML
	public void volumeMenuActions() {

		volumeMenu.setOnAction(e -> {
			String selectedConversion = volumeMenu.getValue();
			icon = new Image(getClass().getResourceAsStream("images/volume.png"));
			icons.setImage(icon);

			switch (selectedConversion) {
			case "Gallons to Liters":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Liters");
				break;
			case "Gallons to Milliliters":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Milliliters");
				break;
			case "Gallons to Cubic Kilometers":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Gallons to Cubic Meters":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Gallons to Cubic Centimeters":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Gallons to Cubic Millimeters":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Gallons to Quarts":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Quarts");
				break;
			case "Gallons to Pints":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Pints");
				break;
			case "Gallons to Cups":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Cups");
				break;
			case "Gallons to Fluid Ounces":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Gallons to Tablespoons":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Gallons to Teaspoons":
				convertOutputLabel.setText("Gallons");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Quarts to Liters":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Liters");
				break;
			case "Quarts to Milliliters":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Milliliters");
				break;
			case "Quarts to Cubic Kilometers":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Quarts to Cubic Meters":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Quarts to Cubic Centimeters":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Quarts to Cubic Millimeters":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Quarts to Gallons":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Gallons");
				break;
			case "Quarts to Pints":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Pints");
				break;
			case "Quarts to Cups":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Cups");
				break;
			case "Quarts to Fluid Ounces":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Quarts to Tablespoons":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Quarts to Teaspoons":
				convertOutputLabel.setText("Quarts");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Pints to Liters":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Liters");
				break;
			case "Pints to Milliliters":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Milliliters");
				break;
			case "Pints to Cubic Kilometers":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Pints to Cubic Meters":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Pints to Cubic Centimeters":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Pints to Cubic Millimeters":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Pints to Gallons":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Gallons");
				break;
			case "Pints to Quarts":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Quarts");
				break;
			case "Pints to Cups":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Cups");
				break;
			case "Pints to Fluid Ounces":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Pints to Tablespoon":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Tablespoon");
				break;
			case "Pints to Teaspoons":
				convertOutputLabel.setText("Pints");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Cups to Liters":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Liters");
				break;
			case "Cups to Milliliters":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Milliliters");
				break;
			case "Cups to Cubic Kilometers":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Cups to Cubic Meters":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Cups to Cubic Centimeters":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Cups to Cubic Millimeters":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Cups to Gallons":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Gallons");
				break;
			case "Cups to Quarts":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Quarts");
				break;
			case "Cups to Pints":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Pints");
				break;
			case "Cups to Fluid Ounces":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Cups to Tablespoons":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Cups to Teaspoons":
				convertOutputLabel.setText("Cups");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Fluid Ounces to Liters":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Liters");
				break;
			case "Fluid Ounces to Milliliters":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Milliliters");
				break;
			case "Fluid Ounces to Cubic Kilometers":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Fluid Ounces to Cubic Meters":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Fluid Ounces to Cubic Centimeters":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Fluid Ounces to Cubic Millimeters":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Fluid Ounces to Gallons":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Gallons");
				break;
			case "Fluid Ounces to Quarts":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Quarts");
				break;
			case "Fluid Ounces to Pints":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Pints");
				break;
			case "Fluid Ounces to Cups":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Cups");
				break;
			case "Fluid Ounces to Tablespoons":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Fluid Ounces to Teaspoons":
				convertOutputLabel.setText("Fluid Ounces");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Tablespoons to Liters":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Liters");
				break;
			case "Tablespoons to Milliliters":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Milliliters");
				break;
			case "Tablespoons to Cubic Kilometers":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Tablespoons to Cubic Meters":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Tablespoons to Cubic Centimeters":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Tablespoons to Cubic Millimeters":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Tablespoons to Gallons":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Gallons");
				break;
			case "Tablespoons to Quarts":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Quarts");
				break;
			case "Tablespoons to Pints":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Pints");
				break;
			case "Tablespoons to Cups":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Cups");
				break;
			case "Tablespoons to Fluid Ounces":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Tablespoons to Teaspoons":
				convertOutputLabel.setText("Tablespoons");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Teaspoons to Liters":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Liters");
				break;
			case "Teaspoons to Milliliters":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Milliliters");
				break;
			case "Teaspoons to Cubic Kilometers":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Teaspoons to Cubic Meters":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Teaspoons to Cubic Centimeters":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Teaspoons to Cubic Millimeters":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Teaspoons to Gallons":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Gallons");
				break;
			case "Teaspoons to Quarts":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Quarts");
				break;
			case "Teaspoons to Pints":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Pints");
				break;
			case "Teaspoons to Cups":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Cups");
				break;
			case "Teaspoons to Fluid Ounces":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Teaspoons to Tablespoons":
				convertOutputLabel.setText("Teaspoons");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Liters to Milliliters":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Milliliters");
				break;
			case "Liters to Cubic Kilometers":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Liters to Cubic Meters":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Liters to Cubic Centimeters":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Liters to Cubic Millimeters":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Liters to Gallons":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Gallons");
				break;
			case "Liters to Quarts":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Quarts");
				break;
			case "Liters to Pints":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Pints");
				break;
			case "Liters to Cups":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Cups");
				break;
			case "Liters to Fluid Ounces":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Liters to Tablespoons":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Liters to Teaspoons":
				convertOutputLabel.setText("Liters");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Milliliters to Liters":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Liters");
				break;
			case "Milliliters to Cubic Kilometers":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Milliliters to Cubic Meters":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Milliliters to Cubic Centimeters":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Milliliters to Cubic Millimeters":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Milliliters to Gallons":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Gallons");
				break;
			case "Milliliters to Quarts":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Quarts");
				break;
			case "Milliliters to Pints":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Pints");
				break;
			case "Milliliters to Cups":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Cups");
				break;
			case "Milliliters to Fluid Ounces":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Milliliters to Tablespoons":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Milliliters to Teaspoons":
				convertOutputLabel.setText("Milliliters");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Cubic Kilometers to Liters":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Liters");
				break;
			case "Cubic Kilometers to Milliliters":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Milliliters");
				break;
			case "Cubic Kilometers to Cubic Meters":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Cubic Kilometers to Cubic Centimeters":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Cubic Kilometers to Cubic Millimeters":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Cubic Kilometers to Gallons":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Gallons");
				break;
			case "Cubic Kilometers to Quarts":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Quarts");
				break;
			case "Cubic Kilometers to Pints":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Pints");
				break;
			case "Cubic Kilometers to Cups":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Cups");
				break;
			case "Cubic Kilometers to Fluid Ounces":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Cubic Kilometers to Tablespoons":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Cubic Kilometers to Teaspoons":
				convertOutputLabel.setText("Cubic Kilometers");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Cubic Meters to Liters":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Liters");
				break;
			case "Cubic Meters to Milliliters":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Milliliters");
				break;
			case "Cubic Meters to Cubic Kilometers":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Cubic Meters to Cubic Centimeters":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Cubic Meters to Cubic Millimeters":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Cubic Meters to Gallons":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Gallons");
				break;
			case "Cubic Meters to Quarts":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Quarts");
				break;
			case "Cubic Meters to Pints":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Pints");
				break;
			case "Cubic Meters to Cups":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Cups");
				break;
			case "Cubic Meters to Fluid Ounces":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Cubic Meters to Tablespoons":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Cubic Meters to Teaspoons":
				convertOutputLabel.setText("Cubic Meters");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Cubic Centimeters to Liters":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Liters");
				break;
			case "Cubic Centimeters to Milliliters":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Milliliters");
				break;
			case "Cubic Centimeters to Cubic Kilometers":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Cubic Centimeters to Cubic Meters":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Cubic Centimeters to Cubic Millimeters":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Cubic Millimeters");
				break;
			case "Cubic Centimeters to Gallons":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Gallons");
				break;
			case "Cubic Centimeters to Quarts":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Quarts");
				break;
			case "Cubic Centimeters to Pints":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Pints");
				break;
			case "Cubic Centimeters to Cups":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Cups");
				break;
			case "Cubic Centimeters to Fluid Ounces":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Cubic Centimeters to Tablespoons":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Cubic Centimeters to Teaspoons":
				convertOutputLabel.setText("Cubic Centimeters");
				toOutputLabel.setText("Teaspoons");
				break;
			case "Cubic Millimeters to Liters":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Liters");
				break;
			case "Cubic Millimeters to Milliliters":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Milliliters");
				break;
			case "Cubic Millimeters to Cubic Kilometers":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Cubic Kilometers");
				break;
			case "Cubic Millimeters to Cubic Meters":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Cubic Meters");
				break;
			case "Cubic Millimeters to Cubic Centimeters":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Cubic Centimeters");
				break;
			case "Cubic Millimeters to Gallons":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Gallons");
				break;
			case "Cubic Millimeters to Quarts":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Quarts");
				break;
			case "Cubic Millimeters to Pints":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Pints");
				break;
			case "Cubic Millimeters to Cups":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Cups");
				break;
			case "Cubic Millimeters to Fluid Ounces":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Fluid Ounces");
				break;
			case "Cubic Millimeters to Tablespoons":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Tablespoons");
				break;
			case "Cubic Millimeters to Teaspoons":
				convertOutputLabel.setText("Cubic Millimeters");
				toOutputLabel.setText("Teaspoons");
				break;
			default:
				convertOutputLabel.setText("");
				toOutputLabel.setText("");
			}

		});
	}
}
