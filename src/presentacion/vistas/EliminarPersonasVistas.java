package presentacion.vistas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;

public class EliminarPersonasVistas extends JPanel{

	JList<?> list = new JList();
    PersonaNegocioImpl pesonaNeg = new PersonaNegocioImpl();

	public EliminarPersonasVistas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Eliminar usuario");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		

        DefaultListModel<String> listModel = new DefaultListModel<>();
		List<Persona> personas = pesonaNeg.readAll(); 
		
		for (Persona persona : personas) {
		    String datosPersona = persona.getNombre() + ", " + persona.getApellido() + ", " + persona.getDni();
		    listModel.addElement(datosPersona);
		}
        list = new JList<>(listModel);
        GridBagConstraints gbc_list1 = new GridBagConstraints();
        gbc_list1.insets = new Insets(0, 0, 5, 5);
        gbc_list1.fill = GridBagConstraints.BOTH;
        gbc_list1.gridx = 3;
        gbc_list1.gridy = 2;

        // Agrega el JList al panel usando el GridBagConstraints
        add(list, gbc_list1);
		
        
        JButton BTNEliminar = new JButton("Eliminar");
        BTNEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String itemSeleccionado = (String) list.getSelectedValue();
        		String[] partes = itemSeleccionado.split(",");

            	if (partes.length >= 3) {
				    try {
				        Persona p = new Persona(partes[2].trim(),partes[0].trim(),partes[1].trim());
				        if (pesonaNeg.delete(p)) {
				            JOptionPane.showMessageDialog(null, "La persona ha sido eliminada correctamente.");
				            int selectedIndex = list.getSelectedIndex();
			                    listModel.remove(selectedIndex); 
				        } else {
				            JOptionPane.showMessageDialog(null, "Error al eliminar la persona.", "Error", JOptionPane.ERROR_MESSAGE);
				        }
				    } catch (Exception e1) {
				        System.out.println("No se pudo convertir la cadena en un número.");
				    }
				}
            	
            }
        });
		GridBagConstraints gbc_BTNEliminar = new GridBagConstraints();
		gbc_BTNEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_BTNEliminar.gridx = 3;
		gbc_BTNEliminar.gridy = 3;
		add(BTNEliminar, gbc_BTNEliminar);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8729126677357040417L;

}
