package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.utad.model.Vistas;

import controlador.Controlador;
import modelo.Modelo;

public class Vista extends JFrame implements Vistas {

	private JPanel contentPane;
	private Controlador miControlador;
	private Modelo miModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	@Override
	public void setControlador(Object controlador) {
		this.miControlador= (Controlador) controlador;
		
	}

	@Override
	public void setModelo(Object modelo) {
		this.miModelo = (Modelo) modelo;
		
	}

	public Controlador getMiControlador() {
		return miControlador;
	}

	public Modelo getMiModelo() {
		return miModelo;
	}


	

}
