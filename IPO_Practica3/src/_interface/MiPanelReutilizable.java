package _interface;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MiPanelReutilizable extends JPanel{
	private JLabel lblAutor;
	private JTextField textField;
	private JButton btnDetalles;
	private JButton btnLimpiar;
	public MiPanelReutilizable() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{64, 313, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblAutor = new JLabel("Autor:");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 0;
		gbc_lblAutor.gridy = 0;
		add(lblAutor, gbc_lblAutor);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnDetalles = new JButton("Detalles");
		GridBagConstraints gbc_btnDetalles = new GridBagConstraints();
		gbc_btnDetalles.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDetalles.insets = new Insets(0, 0, 5, 0);
		gbc_btnDetalles.gridx = 2;
		gbc_btnDetalles.gridy = 0;
		add(btnDetalles, gbc_btnDetalles);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 1;
		add(btnLimpiar, gbc_btnLimpiar);
	}

	
}
