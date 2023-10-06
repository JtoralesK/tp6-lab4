package main;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vistas.EliminarPersonasVistas;
import presentacion.vistas.IngresarPersonasVistas;
import presentacion.vistas.ListarPersonasVista;
import presentacion.vistas.ModificarPersonasVistas;
import presentacion.vistas.VentanaPrincipal;



public class Principal {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaPrincipal vista = new VentanaPrincipal();
		PersonaNegocio negocio = new PersonaNegocioImpl();
		Controlador controlador = new Controlador(vista, negocio);
		controlador.inicializar();
	}
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
		/*
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Persona");
		menuBar.add(mnNewMenu);
		
		JMenuItem Agregar = new JMenuItem("Agregar");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				IngreesarPersonasVistas panel = new IngreesarPersonasVistas();
				//panel.setDefaultListModel();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnNewMenu.add(Agregar);
		
		JMenuItem Modificar = new JMenuItem("Modificar");
		Modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ModificarPersonasVistas panel = new ModificarPersonasVistas();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnNewMenu.add(Modificar);
		
		JMenuItem Eliminar = new JMenuItem("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				EliminarPersonasVistas panel = new EliminarPersonasVistas();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnNewMenu.add(Eliminar);
		
		JMenuItem Listar = new JMenuItem("Listar");
		Listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ListarPersonasVista panel = new ListarPersonasVista();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnNewMenu.add(Listar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}
	*/
}
