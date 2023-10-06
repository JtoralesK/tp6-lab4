package presentacion.vistas;

import javax.swing.JPanel;

import java.util.List;

import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ListarPersonasVista extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTable tablaPersonas;
	private DefaultTableModel dtmPersonas;
	
	public ListarPersonasVista() {
        setLayout(null);

        String[] columnas = {"Nombre", "Apellido", "DNI"};
       
        dtmPersonas = new DefaultTableModel(columnas, 0);
        
        dtmPersonas.addRow(new Object[]{"Nombre", "Apellido","DNI"});
        
        tablaPersonas = new JTable(dtmPersonas);
        tablaPersonas.setBounds(50, 30, 400, 300);
        add(tablaPersonas);
    }

    public void actualizarTabla(List<Persona> personas) {
    	dtmPersonas.setRowCount(1); 
        for (Persona persona : personas) {
        	dtmPersonas.addRow(new Object[]{persona.getNombre(), persona.getApellido(),persona.getDni()});
        }
    }
}
