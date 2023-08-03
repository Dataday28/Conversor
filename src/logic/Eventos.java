package logic;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Eventos {
	
	
	
	
	 public static Conversor conversor = new Conversor();
	
	
	public static void ejecutarEventoMoneda(JComboBox<?> box1, JComboBox<?> box2, JTextField text, JLabel labe) {
		
		try {
		
			int index1 = box1.getSelectedIndex();
			int index2 = box2.getSelectedIndex();
			
			switch (index1 * 10 + index2) {
			
			case 0: // boxDivisa1: 0, boxDivisa2: 0
				Conversor.moneda("Peso Mexicano", "Peso Mexicano", text, 1, labe);
				break;
			case 1: // boxDivisa1: 0, boxDivisa2: 1
				Conversor.moneda("Peso Mexicano", "Dolar Estadounidense", text, 16.94, labe);
				break;
			case 2: // boxDivisa1: 0, boxDivisa2: 2
				Conversor.moneda("Peso Mexicano", "Euro", text, 18.71, labe);
				break;
			case 3: // boxDivisa1: 0, boxDivisa2: 3
				Conversor.moneda("Peso Mexicano", "Libra Esterlina", text, 21.83, labe);
				break;
			case 4: // boxDivisa1: 0, boxDivisa2: 4
				Conversor.moneda("Peso Mexicano", "Yen Japones", text, 0.120, labe);
				break;
			case 5: // boxDivisa1: 0, boxDivisa2: 5
				Conversor.moneda("Peso Mexicano", "Won Surcoreano", text, 0.013, labe);
				break;
			case 6: // boxDivisa1: 0, boxDivisa2: 6
				Conversor.moneda("Peso Mexicano", "Real Brasilero", text, 3.56, labe);
				break;
			case 10: // boxDivisa1: 1, boxDivisa2: 0
				Conversor.moneda("Dolar Estadounidense", "Peso Mexicano", text, 0.059007952, labe);
				break;
			case 11: // boxDivisa1: 1, boxDivisa2: 1
				Conversor.moneda("Dolar Estadounidense", "Dolar Estadounidense", text, 1, labe);
				break;
			case 12: // boxDivisa1: 1, boxDivisa2: 2
				Conversor.moneda("Dolar Estadounidense", "Euro", text, 1.1044936, labe);
				break;
			case 13: // boxDivisa1: 1, boxDivisa2: 3
				Conversor.moneda("Dolar Estadounidense", "Libra Esterlina", text, 1.288358, labe);
				break;
			case 14: // boxDivisa1: 1, boxDivisa2: 4
				Conversor.moneda("Dolar Estadounidense", "Yen Japones", text, 0.0070888476, labe);
				break;
			case 15: // boxDivisa1: 1, boxDivisa2: 5
				Conversor.moneda("Dolar Estadounidense", "Won Surcoreano", text, 0.00078160734, labe);
				break;
			case 16: // boxDivisa1: 1, boxDivisa2: 6
				Conversor.moneda("Dolar Estadounidense", "Real Brasilero", text, 0.21051735, labe);
				break;
			case 20: // boxDivisa1: 2, boxDivisa2: 0
				Conversor.moneda("Euro", "Peso Mexicano", text, 0.053430728, labe);
				break;
			case 21: // boxDivisa1: 2, boxDivisa2: 1
				Conversor.moneda("Euro", "Dolar Estadounidense", text, 0.90552659, labe);
				break;
			case 22: // boxDivisa1: 2, boxDivisa2: 2
				Conversor.moneda("Euro", "Euro", text, 1, labe);
				break;
			case 23: // boxDivisa1: 2, boxDivisa2: 3
				Conversor.moneda("Euro", "Libra Esterlina", text, 1.1666301, labe);
				break;
			case 24: // boxDivisa1: 2, boxDivisa2: 4
				Conversor.moneda("Euro", "Yen Japones", text, 0.0064182148, labe);
				break;
			case 25: // boxDivisa1: 2, boxDivisa2: 5
				Conversor.moneda("Euro", "Won Surcoreano", text, 0.00070746065, labe);
				break;
			case 26: // boxDivisa1: 2, boxDivisa2: 6
				Conversor.moneda("Euro", "Real Brasilero", text, 0.1906379, labe);
				break;
			case 30: // boxDivisa1: 3, boxDivisa2: 0
				Conversor.moneda("Libra Esterlina", "Peso Mexicano", text, 0.045794898, labe);
				break;
			case 31: // boxDivisa1: 3, boxDivisa2: 1
				Conversor.moneda("Libra Esterlina", "Dolar Estadounidense", text, 0.7763495, labe);
				break;
			case 32: // boxDivisa1: 3, boxDivisa2: 2
				Conversor.moneda("Libra Esterlina", "Euro", text, 0.85738409, labe);
				break;
			case 33: // boxDivisa1: 3, boxDivisa2: 3
				Conversor.moneda("Libra Esterlina", "Libra Esterlina", text, 1, labe);
				break;
			case 34: // boxDivisa1: 3, boxDivisa2: 4
				Conversor.moneda("Libra Esterlina", "Yen Japones", text, 0.0055019717, labe);
				break;
			case 35: // boxDivisa1: 3, boxDivisa2: 5
				Conversor.moneda("Libra Esterlina", "Won Surcoreano", text, 0.00060608674, labe);
				break;
			case 36: // boxDivisa1: 3, boxDivisa2: 6
				Conversor.moneda("Libra Esterlina", "Real Brasilero", text, 0.16343221, labe);
				break;
			case 40: // boxDivisa1: 4, boxDivisa2: 0
				Conversor.moneda("Yen Japones", "Peso Mexicano", text, 8.3243664, labe);
				break;
			case 41: // boxDivisa1: 4, boxDivisa2: 1
				Conversor.moneda("Yen Japones", "Dolar Estadounidense", text, 141.14391, labe);
				break;
			case 42: // boxDivisa1: 4, boxDivisa2: 2
				Conversor.moneda("Yen Japones", "Euro", text, 155.83785, labe);
				break;
			case 43: // boxDivisa1: 4, boxDivisa2: 3
				Conversor.moneda("Yen Japones", "Libra Esterlina", text, 181.76118, labe);
				break;
			case 44: // boxDivisa1: 4, boxDivisa2: 4
				Conversor.moneda("Yen Japones", "Yen Japones", text, 1, labe);
				break;
			case 45: // boxDivisa1: 4, boxDivisa2: 5
				Conversor.moneda("Yen Japones", "Won Surcoreano", text, 0.11008823, labe);
				break;
			case 46: // boxDivisa1: 4, boxDivisa2: 6
				Conversor.moneda("Yen Japones", "Real Brasilero", text, 29.712148, labe);
				break;
			case 50: // boxDivisa1: 5, boxDivisa2: 0
				Conversor.moneda("Won Surcoreano", "Peso Mexicano", text, 75.611566, labe);
				break;
			case 51: // boxDivisa1: 5, boxDivisa2: 1
				Conversor.moneda("Won Surcoreano", "Dolar Estadounidense", text, 1282.1968, labe);
				break;
			case 52: // boxDivisa1: 5, boxDivisa2: 2
				Conversor.moneda("Won Surcoreano", "Euro", text, 1415.5965, labe);
				break;
			case 53: // boxDivisa1: 5, boxDivisa2: 3
				Conversor.moneda("Won Surcoreano", "Libra Esterlina", text, 1651.0341, labe);
				break;
			case 54: // boxDivisa1: 5, boxDivisa2: 4
				Conversor.moneda("Won Surcoreano", "Yen Japones", text, 9.0804902, labe);
				break;
			case 55: // boxDivisa1: 5, boxDivisa2: 5
				Conversor.moneda("Won Surcoreano", "Won Surcoreano", text, 1, labe);
				break;
			case 56: // boxDivisa1: 5, boxDivisa2: 6
				Conversor.moneda("Won Surcoreano", "Real Brasilero", text, 269.83829, labe);
				break;
			case 60: // boxDivisa1: 6, boxDivisa2: 0
				Conversor.moneda("Real Brasilero", "Peso Mexicano", text, 0.28020282, labe);
				break;
			case 61: // boxDivisa1: 6, boxDivisa2: 1
				Conversor.moneda("Real Brasilero", "Dolar Estadounidense", text, 4.7511792, labe);
				break;
			case 62: // boxDivisa1: 6, boxDivisa2: 2
				Conversor.moneda("Real Brasilero", "Euro", text, 5.2450237, labe);
				break;
			case 63: // boxDivisa1: 6, boxDivisa2: 3
				Conversor.moneda("Real Brasilero", "Libra Esterlina", text, 6.1186281, labe);
				break;
			case 64: // boxDivisa1: 6, boxDivisa2: 4
				Conversor.moneda("Real Brasilero", "Yen Japones", text, 0.033651097, labe);
				break;
			case 65: // boxDivisa1: 6, boxDivisa2: 5
				Conversor.moneda("Real Brasilero", "Won Surcoreano", text, 0.0037084021, labe);
				break;
			case 66: // boxDivisa1: 6, boxDivisa2: 6
				Conversor.moneda("Real Brasilero", "Real Brasilero", text, 1, labe);
				break;
			
			}
		
		}catch (NumberFormatException err) {
			
			labe.setText("Introduzca una cantidad válida");
			
		}catch (IllegalArgumentException err) {
			
			labe.setText("Introduzca una cantidad superior a 0");
			
		}
		
	}
	
	public static void ejecutarEventoTemp(JComboBox<?> box1, JComboBox<?> box2, JTextField text, JLabel labe) {
		
		try {
		
			int index1 = box1.getSelectedIndex();
			int index2 = box2.getSelectedIndex();
			
			switch (index1 * 10 + index2) {
			
			case 0: // boxTemp1: 0, boxTemp2: 0
				Conversor.temperatura("Celsius", "Celsius", text, labe);
				break;
			case 1: // boxTemp1: 0, boxTemp2: 1
				Conversor.temperatura("Celsius", "Kelvin", text, labe);
				break;
			case 2: // boxTemp1: 0, boxTemp2: 2
				Conversor.temperatura("Celsius", "Fahrenheit", text, labe);
				break;
			case 3: // boxTemp1: 0, boxTemp2: 3
				Conversor.temperatura("Celsius", "Rankine", text, labe);
				break;
			case 10: // boxTemp1: 1, boxTemp2: 0
				Conversor.temperatura("Kelvin", "Celsius", text, labe);
				break;
			case 11: // boxTemp1: 1, boxTemp2: 1
				Conversor.temperatura("Kelvin", "Kelvin", text, labe);
				break;
			case 12: // boxTemp1: 1, boxTemp2: 2
				Conversor.temperatura("Kelvin", "Fahrenheit", text, labe);
				break;
			case 13: // boxTemp1: 1, boxTemp2: 3
				Conversor.temperatura("Kelvin", "Rankine", text, labe);
				break;
			case 20: // boxTemp1: 2, boxTemp2: 0
				Conversor.temperatura("Fahrenheit", "Celsius", text, labe);
				break;
			case 21: // boxTemp1: 2, boxTemp2: 1
				Conversor.temperatura("Fahrenheit", "Kelvin", text, labe);
				break;
			case 22: // boxTemp1: 2, boxTemp2: 2
				Conversor.temperatura("Fahrenheit", "Fahrenheit", text, labe);
				break;
			case 23: // boxTemp1: 2, boxTemp2: 3
				Conversor.temperatura("Fahrenheit", "Rankine", text, labe);
				break;
			case 30: // boxTemp1: 3, boxTemp2: 0
				Conversor.temperatura("Rankine", "Celsius", text, labe);
				break;
			case 31: // boxTemp1: 3, boxTemp2: 1
				Conversor.temperatura("Rankine", "Kelvin", text, labe);
				break;
			case 32: // boxTemp1: 3, boxTemp2: 2
				Conversor.temperatura("Rankine", "Fahrenheit", text, labe);
				break;
			case 33: // boxTemp1: 3, boxTemp2: 3
				Conversor.temperatura("Rankine", "Rankine", text, labe);
				break;
			
			}
		
		}catch (NumberFormatException err) {
			
			labe.setText("Introduzca una cantidad válida");
			
		}catch (IllegalArgumentException err) {
			
			labe.setText("Recuerda que la temperatura en Kelvin y Rankine no puede ser negativa.");
			
		}
		
	}
		
	
		
	
	
	public static void salir() {
		
		System.exit(0);
		
	}

}
