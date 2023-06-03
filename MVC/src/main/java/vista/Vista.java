package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.utad.model.Vistas;

import controlador.Controlador;
import modelo.Modelo;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class Vista extends JFrame implements Vistas {

	private JPanel contentPane;
	private Controlador miControlador;
	private Modelo miModelo;
	private JTable tabla;
	private JScrollPane scrollPane;
	private JButton btnMostrarTabla;
	private JButton btnGuardar;

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
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 20, 369, 165);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setColumnHeaderView(tabla);
		
		btnMostrarTabla = new JButton("Mostrar Tabla");
		btnMostrarTabla.setBounds(40, 226, 117, 29);
		contentPane.add(btnMostrarTabla);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(292, 226, 117, 29);
		contentPane.add(btnGuardar);
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
