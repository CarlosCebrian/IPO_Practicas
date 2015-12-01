package _interface;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MiPanelGridConfigurable extends JPanel {
	private JPanel pnlConfiguracion;
	private JPanel pnlContenido;
	private JPanel pnlFilas;
	private JPanel pnlSeparacion;
	private JLabel lblFilas;
	private JComboBox cbFilas;
	private JLabel lblHorizontal;
	private JComboBox cbHorizontal;
	private JLabel lblVertical;
	private JComboBox cbVertical;
	//private JLabel[] imagenes = new JLabel[10];
	private JComponent[] comp = new JComponent[10];
	/**
	 * Create the panel.
	 */
	public MiPanelGridConfigurable() {
		setLayout(new BorderLayout(0, 0));

		pnlConfiguracion = new JPanel();
		pnlConfiguracion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Panel de Configuracion", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		add(pnlConfiguracion, BorderLayout.NORTH);
		GridBagLayout gbl_pnlConfiguracion = new GridBagLayout();
		gbl_pnlConfiguracion.columnWidths = new int[] { 74, 0, 0 };
		gbl_pnlConfiguracion.rowHeights = new int[] { 45, 0 };
		gbl_pnlConfiguracion.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlConfiguracion.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pnlConfiguracion.setLayout(gbl_pnlConfiguracion);

		pnlFilas = new JPanel();
		pnlFilas.setBorder(new TitledBorder(null, "Filas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_pnlFilas = new GridBagConstraints();
		gbc_pnlFilas.insets = new Insets(0, 0, 0, 5);
		gbc_pnlFilas.fill = GridBagConstraints.BOTH;
		gbc_pnlFilas.gridx = 0;
		gbc_pnlFilas.gridy = 0;
		pnlConfiguracion.add(pnlFilas, gbc_pnlFilas);

		lblFilas = new JLabel("Filas:");
		pnlFilas.add(lblFilas);

		cbFilas = new JComboBox();
		cbFilas.addItemListener(new CbItemListener());
		cbFilas.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		pnlFilas.add(cbFilas);

		pnlSeparacion = new JPanel();
		pnlSeparacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Separacion horizontal y vertical", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_pnlSeparacion = new GridBagConstraints();
		gbc_pnlSeparacion.fill = GridBagConstraints.BOTH;
		gbc_pnlSeparacion.gridx = 1;
		gbc_pnlSeparacion.gridy = 0;
		pnlConfiguracion.add(pnlSeparacion, gbc_pnlSeparacion);

		lblHorizontal = new JLabel("Horizontal:");
		pnlSeparacion.add(lblHorizontal);

		cbHorizontal = new JComboBox();
		cbHorizontal.addItemListener(new CbItemListener());
		cbHorizontal.setModel(new DefaultComboBoxModel(new String[] { "5", "10", "15", "20" }));
		pnlSeparacion.add(cbHorizontal);

		lblVertical = new JLabel("Vertical:");
		pnlSeparacion.add(lblVertical);

		cbVertical = new JComboBox();
		cbVertical.addItemListener(new CbItemListener());
		cbVertical.setModel(new DefaultComboBoxModel(new String[] { "5", "10", "15", "20" }));
		pnlSeparacion.add(cbVertical);

		pnlContenido = new JPanel();
		pnlContenido.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contenido",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new GridLayout(1, 0, 0, 0));

//		for (int i = 0; i < 10; i++) {
//			imagenes[i] = new JLabel(String.valueOf(i));
//			imagenes[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//			imagenes[i].setHorizontalAlignment(SwingConstants.CENTER);
//			imagenes[i].setIcon(new ImageIcon(MiPanelGridConfigurable.class.getResource("imagen"+i+".png")));
//			imagenes[i].setText("Imagen: "+i);
//			imagenes[i].setHorizontalTextPosition(SwingConstants.CENTER);
//			imagenes[i].setVerticalTextPosition(SwingConstants.BOTTOM);
//			
//			
//			pnlContenido.add(imagenes[i]);
//		}
		
		for(int i = 0; i < 10; i++){
			comp[i] = new MiPanelAutores();
			pnlContenido.add(comp[i]);
		}
	}

	private class CbItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			GridLayout layout = (GridLayout) pnlContenido.getLayout();
			layout.setRows(Integer.parseInt((String) cbFilas.getSelectedItem()));
			layout.setHgap(Integer.parseInt((String) cbHorizontal.getSelectedItem()));
			layout.setVgap(Integer.parseInt((String) cbVertical.getSelectedItem()));
			pnlContenido.revalidate();
		}
	}
}
