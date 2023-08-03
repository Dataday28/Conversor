package logic;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Conversor {
	
	
	
	
	public static void moneda(String unidad1, String unidad2, JTextField valor, double proporcion, JLabel text) {
		
		double num1 = Double.parseDouble(valor.getText());
		
		if (num1 < 0) {
			throw new IllegalArgumentException("No se acepta valores negativos");
		}
		
		double result = num1 / proporcion;
		result = (double) Math.round(result * 100)/100;
		
		text.setText(num1 + "  " + unidad1 + "  =   " + result + "  " + unidad2);
		
	}
	
	
	public static void temperatura(String unidad1, String unidad2, JTextField valor, JLabel text) {
		
		double num1 = Double.parseDouble(valor.getText());
		double result;
		
		if (unidad1.equalsIgnoreCase("Celsius") && unidad2.equalsIgnoreCase("Kelvin")) {
			
			result = num1 + 273.15;
			
		}else if (unidad1.equalsIgnoreCase("Celsius") && unidad2.equalsIgnoreCase("Fahrenheit")){
			
			result = (num1 * 9/5) + 32;
			
		}else if (unidad1.equalsIgnoreCase("Celsius") && unidad2.equalsIgnoreCase("Rankine")){
			
			result = (num1 * 9/5) + 491.67;
			
		}else if (unidad1.equalsIgnoreCase("Kelvin") && unidad2.equalsIgnoreCase("Celsius")) {
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa.");
				
			}
			
			result = num1 - 273.15;
			
		}else if (unidad1.equalsIgnoreCase("Kelvin") && unidad2.equalsIgnoreCase("Fahrenheit")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa.");
				
			}
			
			result = (num1 - 273.15) * 9/5 + 32;
			
		}else if (unidad1.equalsIgnoreCase("Kelvin") && unidad2.equalsIgnoreCase("Rankine")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa.");
				
			}
			
			result = num1 * 9/5;
			
		}else if (unidad1.equalsIgnoreCase("Kelvin") && unidad2.equalsIgnoreCase("Kelvin")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Kelvin no puede ser negativa.");
				
			}
			
			result = num1;
			
		}else if (unidad1.equalsIgnoreCase("Fahrenheit") && unidad2.equalsIgnoreCase("Celsius")) {
			
			result = (num1 - 32) * 5/9;
			
		}else if (unidad1.equalsIgnoreCase("Fahrenheit") && unidad2.equalsIgnoreCase("Kelvin")){
			
			result = (num1 - 32) * 5/9 + 273.15;
			
		}else if (unidad1.equalsIgnoreCase("Fahrenheit") && unidad2.equalsIgnoreCase("Rankine")){
			
			result = (num1 - 32) + 491.67;
			
		}else if (unidad1.equalsIgnoreCase("Rankine") && unidad2.equalsIgnoreCase("Celsius")) {
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa.");
				
			}
			
			result = (num1 -  491.67) * 5/9;
			
		}else if (unidad1.equalsIgnoreCase("Rankine") && unidad2.equalsIgnoreCase("Kelvin")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa.");
				
			}
			
			result = 5/9 * num1;
			
		}else if (unidad1.equalsIgnoreCase("Rankine") && unidad2.equalsIgnoreCase("Fahrenheit")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa.");
				
			}
			
			result = (num1 - 491.67) + 32;
			
		}else if (unidad1.equalsIgnoreCase("Rankine") && unidad2.equalsIgnoreCase("Rankine")){
			
			if (num1 < 0) {
				
				throw new IllegalArgumentException("La temperatura en Rankine no puede ser negativa.");
				
			}
			
			result = num1;
			
		}else {
			
			result = num1;
			
		}
		
		result = (double) Math.round(result * 100)/100;
		
		text.setText(num1 + "  " + unidad1 + "  =   " + result + "  " + unidad2);
		
	}
	

}
