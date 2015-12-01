package _interface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiPanelAutores extends JPanel {
	private JScrollPane scrollPane;
	private JPanel pnlListado;
	private JPanel panel;
	private JButton btnAadirAutor;
	private JButton btnBorrarAutor;
	private Color color;

	/**
	 * Create the panel.
	 */
	public MiPanelAutores() {
		setBorder(new TitledBorder(null, "Autores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		pnlListado = new JPanel();
		scrollPane.setViewportView(pnlListado);
		pnlListado.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		btnAadirAutor = new JButton("A\u00F1adir Autor");
		btnAadirAutor.addActionListener(new BtnAadirAutorActionListener());
		panel.add(btnAadirAutor);
		
		btnBorrarAutor = new JButton("Borrar Autor");
		btnBorrarAutor.addActionListener(new BtnBorrarAutorActionListener());
		panel.add(btnBorrarAutor);

	}

	private class BtnAadirAutorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlListado.add(new MiPanelReutilizable());
			pnlListado.repaint();
			pnlListado.revalidate();
		}
	}
	private class BtnBorrarAutorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(pnlListado.getComponents().length >= 1){
				pnlListado.remove(pnlListado.getComponents().length-1);
				pnlListado.repaint();
				pnlListado.revalidate();
			}
		}
	}
}
