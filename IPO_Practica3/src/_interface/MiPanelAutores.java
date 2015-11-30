package _interface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class MiPanelAutores extends JPanel {
	private JScrollPane scrollPane;
	private JPanel pnlListado;
	private JPanel panel;
	private JButton btnAadirAutor;
	private JButton btnBorrarAutor;

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
		panel.add(btnAadirAutor);
		
		btnBorrarAutor = new JButton("Borrar Autor");
		panel.add(btnBorrarAutor);

	}

}
