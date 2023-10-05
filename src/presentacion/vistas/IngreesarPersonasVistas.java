package presentacion.vistas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IngreesarPersonasVistas extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -195983497551792198L;
	private JTextField JTNombre;
	private JTextField JTApellido;
	private JTextField JTdni;
	private JButton btnNewButton;
	public IngreesarPersonasVistas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 85, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		add(lblNombre, gbc_lblNewLabel);
		
		JTNombre = new JTextField();
		GridBagConstraints gbc_JTNombre = new GridBagConstraints();
		gbc_JTNombre.insets = new Insets(0, 0, 5, 5);
		gbc_JTNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTNombre.gridx = 5;
		gbc_JTNombre.gridy = 2;
		add(JTNombre, gbc_JTNombre);
		JTNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 4;
		add(lblApellido, gbc_lblNewLabel_1);
		
		JTApellido = new JTextField();
		GridBagConstraints gbc_JTApellido = new GridBagConstraints();
		gbc_JTApellido.insets = new Insets(0, 0, 5, 5);
		gbc_JTApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTApellido.gridx = 5;
		gbc_JTApellido.gridy = 4;
		add(JTApellido, gbc_JTApellido);
		JTApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("Dni");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblDni, gbc_lblNewLabel_2);
		
		JTdni = new JTextField();
		GridBagConstraints gbc_JTdni = new GridBagConstraints();
		gbc_JTdni.insets = new Insets(0, 0, 5, 5);
		gbc_JTdni.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTdni.gridx = 5;
		gbc_JTdni.gridy = 6;
		add(JTdni, gbc_JTdni);
		JTdni.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 7;
		add(btnNewButton, gbc_btnNewButton);
		
		
	}
	
	public JTextField getJTNombre() {
		return JTNombre;
	}
	public void setJTNombre(JTextField jTNombre) {
		JTNombre = jTNombre;
	}
	public JTextField getJTApellido() {
		return JTApellido;
	}
	public void setJTApellido(JTextField jTApellido) {
		JTApellido = jTApellido;
	}
	public JTextField getJTdni() {
		return JTdni;
	}
	public void setJTdni(JTextField jTdni) {
		JTdni = jTdni;
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

}

