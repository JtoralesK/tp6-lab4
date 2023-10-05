package presentacion.vistas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu mnPersonas;
	private JMenuItem menuEliminar;
	private JMenuItem menuAgregar;
	private JMenuItem menuModificar;
	private JMenuItem menuListar;

	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		menuAgregar = new JMenuItem("Agregar");
		mnPersonas.add(menuAgregar);
		
		menuEliminar = new JMenuItem("Eliminar");
		mnPersonas.add(menuEliminar);
		
		menuListar = new JMenuItem("Listar");
		mnPersonas.add(menuListar);
		
		menuModificar = new JMenuItem("Modificar");
		mnPersonas.add(menuModificar);
	}

	public JMenu getMnPersonas() {
		return mnPersonas;
	}

	public void setMnPersonas(JMenu mnPersonas) {
		this.mnPersonas = mnPersonas;
	}

	public JMenuItem getMenuEliminar() {
		return menuEliminar;
	}

	public void setMenuEliminar(JMenuItem menuEliminar) {
		this.menuEliminar = menuEliminar;
	}

	public JMenuItem getMenuAgregar() {
		return menuAgregar;
	}

	public void setMenuAgregar(JMenuItem menuAgregar) {
		this.menuAgregar = menuAgregar;
	}
	
	public void setMenuListar(JMenuItem menuListar) {
		this.menuListar = menuListar;
	}
	
	public void setMenuModificar(JMenuItem menuModificar) {
		this.menuModificar = menuModificar;
	}

	public JMenuItem getMenuModificar() {
		return menuModificar;
	}

	public JMenuItem getMenuListar() {
		return menuListar;
	}
	
}
