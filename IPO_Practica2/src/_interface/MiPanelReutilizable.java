package _interface;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MiPanelReutilizable extends JPanel {
	private JLabel lblAutor;
	private JTextField txtAutor;

	/**
	 * Create the panel.
	 */
	public MiPanelReutilizable() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblAutor = new JLabel("Autor:");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.anchor = GridBagConstraints.EAST;
		gbc_lblAutor.insets = new Insets(0, 0, 0, 5);
		gbc_lblAutor.gridx = 0;
		gbc_lblAutor.gridy = 0;
		add(lblAutor, gbc_lblAutor);
		
		txtAutor = new JTextField();
		GridBagConstraints gbc_txtAutor = new GridBagConstraints();
		gbc_txtAutor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAutor.gridx = 1;
		gbc_txtAutor.gridy = 0;
		add(txtAutor, gbc_txtAutor);
		txtAutor.setColumns(10);

	}

}
