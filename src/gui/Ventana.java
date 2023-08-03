package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logic.Eventos;
import javax.swing.JTextPane;
import java.awt.Color;

public class Ventana extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1344311484763158305L;
	private JPanel contentPane;
	private JTextField textFieldCantidad, textFieldCantidad2;
	private JLabel lbCantidad1, lbDivisa1, lbDivisa2, lbResultado, lbCantidad2, lbTitulo1, lbTemp1, lbTemp2, lbTitulo2, lbResultado2;
	private JTextPane txtInfo;
	private JComboBox<Object> boxDivisa1, boxDivisa2, boxTemp1, boxTemp2;
	private JButton btnConvertir, btnSalir, btnConvertir2;
	private String divisas[] = new String[] {"MXN - Peso Mexicano", "USD - Dolar Estadounidense", "EUR - Euro", "GBP - Libra Esterlina", "JPY - Yen Japones", "KRW - Won Surcoreano", "BRL - Real Brasilero"};
	private String temperatura[] = new String[] {"Celsius(C)", "Kelvin(K)", "Fahrenheit(F)", "Rankine(R)"};
	
	public static Eventos accion = new Eventos();


	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("Convertidor");
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
	}
	
	public void iniciarComponentes() {
		
		setBounds(100, 100, 978, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setText("1.0");
		textFieldCantidad.setBounds(23, 96, 292, 31);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		textFieldCantidad2 = new JTextField();
		textFieldCantidad2.setText("1.0");
		textFieldCantidad2.setColumns(10);
		textFieldCantidad2.setBounds(23, 337, 292, 31);
		contentPane.add(textFieldCantidad2);
		
		txtInfo = new JTextPane();
		txtInfo.setText("Los tipos de cambio que se presentan\r\nhacen referencia a los valores \r\ndel 25 de julio del 2023.\r\nPuede que cuando este utilizando \r\nla herramienta el tipo de cambio sea diferente");
		txtInfo.setBackground(new Color(240, 240, 240));
		txtInfo.setBounds(23, 137, 219, 109);
		contentPane.add(txtInfo);
		
		lbCantidad1 = new JLabel("Cantidad");
		lbCantidad1.setBounds(23, 66, 124, 20);
		contentPane.add(lbCantidad1);
		
		lbDivisa1 = new JLabel("Desde la Divisa");
		lbDivisa1.setBounds(363, 66, 124, 20);
		contentPane.add(lbDivisa1);
		
		lbDivisa2 = new JLabel("A la Divisa");
		lbDivisa2.setBounds(664, 66, 124, 20);
		contentPane.add(lbDivisa2);
		
		lbResultado = new JLabel("");
		lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lbResultado.setHorizontalTextPosition(SwingConstants.CENTER);
		lbResultado.setBounds(279, 170, 438, 48);
		contentPane.add(lbResultado);
		
		lbCantidad2 = new JLabel("Cantidad");
		lbCantidad2.setBounds(23, 307, 124, 20);
		contentPane.add(lbCantidad2);
		
		lbTitulo1 = new JLabel("Convertidor de Divisas");
		lbTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo1.setHorizontalTextPosition(SwingConstants.CENTER);
		lbTitulo1.setBounds(267, 10, 326, 46);
		contentPane.add(lbTitulo1);
		
		lbTemp1 = new JLabel("De");
		lbTemp1.setBounds(363, 307, 124, 20);
		contentPane.add(lbTemp1);
		
		lbTemp2 = new JLabel("A ");
		lbTemp2.setBounds(664, 307, 124, 20);
		contentPane.add(lbTemp2);
		
		lbTitulo2 = new JLabel("Convertidor de Temperatura");
		lbTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo2.setHorizontalTextPosition(SwingConstants.CENTER);
		lbTitulo2.setBounds(279, 271, 326, 40);
		contentPane.add(lbTitulo2);
		
		lbResultado2 = new JLabel("");
		lbResultado2.setHorizontalTextPosition(SwingConstants.CENTER);
		lbResultado2.setHorizontalAlignment(SwingConstants.CENTER);
		lbResultado2.setBounds(230, 396, 438, 48);
		contentPane.add(lbResultado2);
		
		boxDivisa1 = new JComboBox<Object>();
		boxDivisa1.setBounds(363, 96, 277, 31);
		boxDivisa1.setModel(new DefaultComboBoxModel<Object>(divisas));
		boxDivisa1.setSelectedIndex(1);
		contentPane.add(boxDivisa1);
		
		boxDivisa2 = new JComboBox<Object>();
		boxDivisa2.setBounds(664, 96, 279, 31);
		boxDivisa2.setModel(new DefaultComboBoxModel<Object>(divisas));
		contentPane.add(boxDivisa2);
		
		boxTemp1 = new JComboBox<Object>();
		boxTemp1.setBounds(363, 337, 277, 31);
		boxTemp1.setModel(new DefaultComboBoxModel<Object>(temperatura));
		contentPane.add(boxTemp1);
		
		boxTemp2 = new JComboBox<Object>();
		boxTemp2.setBounds(664, 337, 279, 31);
		boxTemp2.setModel(new DefaultComboBoxModel<Object>(temperatura));
		boxTemp2.setSelectedIndex(1);
		contentPane.add(boxTemp2);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(819, 206, 124, 40);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		btnConvertir2 = new JButton("Convertir");
		btnConvertir2.setBounds(819, 481, 124, 40);
		btnConvertir2.addActionListener(this);
		contentPane.add(btnConvertir2);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(23, 481, 124, 40);
		btnSalir.addActionListener(this);
		contentPane.add(btnSalir);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnConvertir == e.getSource()) {
			
			Eventos.ejecutarEventoMoneda(boxDivisa1, boxDivisa2, textFieldCantidad, lbResultado);
			
		} else if (btnConvertir2 == e.getSource()) {
			
			Eventos.ejecutarEventoTemp(boxTemp1, boxTemp2, textFieldCantidad2, lbResultado2);
			
		} else if (btnSalir == e.getSource()) {
			
			Eventos.salir();
			
		}
		
	}
}
