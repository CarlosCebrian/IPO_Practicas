package _interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;

import _domain.Cliente;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSpinner spinNumHijos;
	private JComboBox cbNivelEstudios;
	private JRadioButton rdbtnCasado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 358, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnLimpiar = new JButton("Limpar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		panel.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		panel.add(btnGuardar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cliente", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{108, 81, 52, 27, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 31, 19, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panel_1.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 0;
		panel_1.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 1;
		panel_1.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridwidth = 3;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 1;
		panel_1.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblNivelDeEstudios = new JLabel("Nivel de estudios");
		GridBagConstraints gbc_lblNivelDeEstudios = new GridBagConstraints();
		gbc_lblNivelDeEstudios.anchor = GridBagConstraints.EAST;
		gbc_lblNivelDeEstudios.insets = new Insets(0, 0, 5, 5);
		gbc_lblNivelDeEstudios.gridx = 0;
		gbc_lblNivelDeEstudios.gridy = 2;
		panel_1.add(lblNivelDeEstudios, gbc_lblNivelDeEstudios);
		
		cbNivelEstudios = new JComboBox();
		cbNivelEstudios.setModel(new DefaultComboBoxModel(new String[] {"Sin estudios", "ESO", "Universitarios", "Master"}));
		GridBagConstraints gbc_cbNivelEstudios = new GridBagConstraints();
		gbc_cbNivelEstudios.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbNivelEstudios.insets = new Insets(0, 0, 5, 5);
		gbc_cbNivelEstudios.gridx = 1;
		gbc_cbNivelEstudios.gridy = 2;
		panel_1.add(cbNivelEstudios, gbc_cbNivelEstudios);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
		gbc_lblEstadoCivil.anchor = GridBagConstraints.EAST;
		gbc_lblEstadoCivil.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstadoCivil.gridx = 0;
		gbc_lblEstadoCivil.gridy = 3;
		panel_1.add(lblEstadoCivil, gbc_lblEstadoCivil);
		
		JRadioButton rdbtnSoltero = new JRadioButton("Soltero");
		buttonGroup.add(rdbtnSoltero);
		GridBagConstraints gbc_rdbtnSoltero = new GridBagConstraints();
		gbc_rdbtnSoltero.fill = GridBagConstraints.BOTH;
		gbc_rdbtnSoltero.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSoltero.gridx = 1;
		gbc_rdbtnSoltero.gridy = 3;
		panel_1.add(rdbtnSoltero, gbc_rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		buttonGroup.add(rdbtnCasado);
		GridBagConstraints gbc_rdbtnCasado = new GridBagConstraints();
		gbc_rdbtnCasado.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCasado.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCasado.gridx = 2;
		gbc_rdbtnCasado.gridy = 3;
		panel_1.add(rdbtnCasado, gbc_rdbtnCasado);
		
		JLabel lblNumeroDeHijos = new JLabel("Numero de hijos:");
		GridBagConstraints gbc_lblNumeroDeHijos = new GridBagConstraints();
		gbc_lblNumeroDeHijos.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNumeroDeHijos.insets = new Insets(0, 0, 0, 5);
		gbc_lblNumeroDeHijos.gridx = 0;
		gbc_lblNumeroDeHijos.gridy = 4;
		panel_1.add(lblNumeroDeHijos, gbc_lblNumeroDeHijos);
		
		spinNumHijos = new JSpinner();
		spinNumHijos.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		GridBagConstraints gbc_spinNumHijos = new GridBagConstraints();
		gbc_spinNumHijos.anchor = GridBagConstraints.NORTHWEST;
		gbc_spinNumHijos.insets = new Insets(0, 0, 0, 5);
		gbc_spinNumHijos.gridx = 1;
		gbc_spinNumHijos.gridy = 4;
		panel_1.add(spinNumHijos, gbc_spinNumHijos);
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtNombre.setText("");
			txtApellidos.setText("");
			cbNivelEstudios.setSelectedIndex(0);
			buttonGroup.clearSelection();
			spinNumHijos.setValue(0);
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Cliente cliente	= new Cliente(txtNombre.getText(), txtApellidos.getText(),(String)cbNivelEstudios.getSelectedItem(),rdbtnCasado.isSelected(),(Integer)spinNumHijos.getValue());
			MostrarDatos segundaVentana	= new MostrarDatos(cliente);
			segundaVentana.setVisible(true);
		}
	}
}
