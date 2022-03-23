package presentacion.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class VentanaPersona extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JButton btnAgregarPersona;
	private JLabel textLocalidad;
	private JComboBox<String> selectPais;
	private static VentanaPersona INSTANCE;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JLabel lblPais;
	private JLabel lblProvincia;
	
	public static VentanaPersona getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new VentanaPersona(); 	
			return new VentanaPersona();
		} 
		else
			return INSTANCE;
	}

	private VentanaPersona() 
	{
		super();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 560, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y apellido");
		lblNombreYApellido.setBounds(10, 11, 96, 14);
		panel.add(lblNombreYApellido);
		
		JLabel lblTelfono = new JLabel("Telefono");
		lblTelfono.setBounds(10, 52, 50, 14);
		panel.add(lblTelfono);
		
		textNombre = new JTextField();
		textNombre.setBounds(112, 8, 173, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(70, 49, 173, 20);
		panel.add(textTelefono);
		textTelefono.setColumns(10);
		
		btnAgregarPersona = new JButton("Agregar");
		btnAgregarPersona.setBounds(352, 229, 89, 23);
		panel.add(btnAgregarPersona);
		
		selectPais = new JComboBox<String>();
		selectPais.setBounds(61, 123, 144, 23);
		panel.add(selectPais);
		
		textLocalidad = new JLabel("Localidad");
		textLocalidad.setBounds(10, 172, 50, 19);
		panel.add(textLocalidad);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(401, 8, 131, 20);
		panel.add(dateChooser);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(295, 11, 103, 14);
		panel.add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(70, 80, 173, 20);
		panel.add(textField);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(10, 83, 41, 14);
		panel.add(lblCalle);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(253, 82, 41, 17);
		panel.add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(289, 80, 52, 20);
		panel.add(textField_1);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(351, 83, 41, 17);
		panel.add(lblPiso);
		
		JLabel lblDepto = new JLabel("Depto");
		lblDepto.setBounds(451, 83, 41, 17);
		panel.add(lblDepto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(389, 80, 52, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(491, 80, 52, 20);
		panel.add(textField_3);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(253, 52, 50, 14);
		panel.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(292, 49, 215, 20);
		panel.add(textField_4);
		
		lblPais = new JLabel("Pa\u00EDs");
		lblPais.setBounds(10, 127, 31, 14);
		panel.add(lblPais);
		
		lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(267, 127, 52, 14);
		panel.add(lblProvincia);
		
		JComboBox<String> selectProvincia = new JComboBox<String>();
		selectProvincia.setBounds(348, 123, 144, 23);
		panel.add(selectProvincia);
		
		JComboBox<String> selectLocalidad_2 = new JComboBox<String>();
		selectLocalidad_2.setBounds(61, 169, 144, 23);
		panel.add(selectLocalidad_2);
		
		JLabel lblTipoContacto = new JLabel("Tipo de contacto:");
		lblTipoContacto.setBounds(270, 173, 96, 16);
		panel.add(lblTipoContacto);
		
		JComboBox<String> selectTipoContacto = new JComboBox();
		selectTipoContacto.setBounds(365, 171, 131, 21);
		panel.add(selectTipoContacto);
		
		this.setVisible(false);
	}
	
	public void mostrarVentana()
	{
		this.setVisible(true);
	}
	
	public JTextField getTextNombre() 
	{
		return textNombre;
	}

	public JTextField getTextTelefono() 
	{
		return textTelefono;
	}

	public JButton getBtnAgregarPersona() 
	{
		return btnAgregarPersona;
	}
	
	
	public JLabel getTextLocalidad()
	{
		return textLocalidad;
	}

	public JComboBox<String> getSelectLocalidad()
	{
		return selectPais;
	}

	public void cerrar()
	{
		this.textNombre.setText(null);
		this.textTelefono.setText(null);
		this.dispose();
	}
}

