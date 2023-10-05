package presentacion.vistas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModificarPersonasVistas extends JPanel{
	public ModificarPersonasVistas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 281, 0, 23, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 107, 32, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("seleccione la persona que desea modificar");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 2;
		gbc_list.gridy = 4;
		add(list, gbc_list);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		TFNombre = new JTextField();
		GridBagConstraints gbc_TFNombre = new GridBagConstraints();
		gbc_TFNombre.gridwidth = 2;
		gbc_TFNombre.insets = new Insets(0, 0, 0, 5);
		gbc_TFNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_TFNombre.gridx = 0;
		gbc_TFNombre.gridy = 0;
		panel.add(TFNombre, gbc_TFNombre);
		TFNombre.setColumns(10);
		
		TFApellido = new JTextField();
		GridBagConstraints gbc_TFApellido = new GridBagConstraints();
		gbc_TFApellido.gridwidth = 2;
		gbc_TFApellido.insets = new Insets(0, 0, 0, 5);
		gbc_TFApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_TFApellido.gridx = 2;
		gbc_TFApellido.gridy = 0;
		panel.add(TFApellido, gbc_TFApellido);
		TFApellido.setColumns(10);
		
		TFDni = new JTextField();
		GridBagConstraints gbc_TFDni = new GridBagConstraints();
		gbc_TFDni.gridwidth = 2;
		gbc_TFDni.insets = new Insets(0, 0, 0, 5);
		gbc_TFDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_TFDni.gridx = 4;
		gbc_TFDni.gridy = 0;
		panel.add(TFDni, gbc_TFDni);
		TFDni.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridx = 6;
		gbc_btnModificar.gridy = 0;
		panel.add(btnModificar, gbc_btnModificar);
		
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2330170408085485131L;
	private JTextField TFNombre;
	private JTextField TFApellido;
	private JTextField TFDni;

}
