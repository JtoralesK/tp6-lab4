package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.vistas.EliminarPersonasVistas;
import presentacion.vistas.IngresarPersonasVistas;
import presentacion.vistas.ListarPersonasVista;
import presentacion.vistas.ModificarPersonasVistas;
import presentacion.vistas.VentanaPrincipal;

public class Controlador implements ActionListener{
	private IngresarPersonasVistas pnlIngresar;
	private EliminarPersonasVistas pnlEliminar;
	private ListarPersonasVista pnlListar;
	private ModificarPersonasVistas pnlModificar;
	private ArrayList<Persona> tblPersona;
	private VentanaPrincipal ventanaPrincipal;
	private PersonaNegocio pNeg;
	
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg) {
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		this.pnlIngresar = new IngresarPersonasVistas();
		this.pnlEliminar = new EliminarPersonasVistas();
		this.pnlListar = new ListarPersonasVista();
		this.pnlModificar = new ModificarPersonasVistas();
		
		this.ventanaPrincipal.getMenuAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		this.pnlIngresar.getBtnAceptar().addActionListener(a -> EventoClickBtnAceptar(a));
		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
		this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
		this.ventanaPrincipal.getMenuListar().addActionListener(a->EventoClickMenu_AbrirPanel_Listar(a));
		
	}
	
	public void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlEliminar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
		
	}
	
	public void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlModificar);
		pnlModificar.actualizarLista(pNeg.readAll());
		pnlModificar.getList().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int selectedIndex = pnlModificar.getList().getSelectedIndex();
                    if (selectedIndex != -1) {
                    	Persona persona = pnlModificar.getListModel().elementAt(selectedIndex);
                    	pnlModificar.getTFNombre().setText(persona.getNombre());
                    	pnlModificar.getTFApellido().setText(persona.getApellido());
                    	pnlModificar.getTFDni().setText(persona.getDni());
                    }
                }
            }
        });
		pnlModificar.getBtnModificar().addActionListener(b -> EventoModificarPersona(b));
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
		
	}
	
	public void EventoClickMenu_AbrirPanel_Listar(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlListar);
		pnlListar.actualizarTabla(pNeg.readAll());
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
		
	}
	
	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlIngresar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void EventoClickBtnAceptar(ActionEvent a) {
		boolean res = pNeg.insert(new Persona(pnlIngresar.getJTdni().getText(),pnlIngresar.getJTNombre().getText(),pnlIngresar.getJTApellido().getText()));
		
		if (res)
		{
			pnlIngresar.getjOptionPane().showMessageDialog(null, pnlIngresar.getJTNombre().getText() + " fue agregado/a con exito");
		}
		else
		{
			pnlIngresar.getjOptionPane().showMessageDialog(null, "Es necesario completar todos los campos");
		}
		
	}
	
	public void EventoModificarPersona(ActionEvent a) {
        int selectedIndex = pnlModificar.getList().getSelectedIndex();
        if (selectedIndex != -1) {
        	Persona personaOld = pnlModificar.getListModel().elementAt(selectedIndex);
        	Persona personaNew = new Persona(pnlModificar.getTFDni().getText(), pnlModificar.getTFNombre().getText(),pnlModificar.getTFApellido().getText());
        	boolean res = pNeg.update(personaNew, personaOld.getDni());
        	if (res)
        	{
        		pnlModificar.getjOptionPane().showMessageDialog(null, personaNew.getNombre() + " fue modificado/a con exito");
        		pnlModificar.getListModel().setElementAt(personaNew, selectedIndex);
        	}
        	else
        	{
        		pnlModificar.getjOptionPane().showMessageDialog(null, "Todos los campos deben estar completos y no se puede alterar el Dni");
        	}
        }
	}
	
	public void inicializar() {
		this.ventanaPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
