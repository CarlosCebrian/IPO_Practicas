package _interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import _domain.Cliente;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MostrarDatos extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	public MostrarDatos(Cliente c) {
		addWindowListener(new ThisWindowListener());
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		contentPane.add(btnAceptar, BorderLayout.SOUTH);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		String contenido = "Datos de "+c.getNombre()+" "+c.getApellidos()+":\n"+"--Nivel de estudios: "+c.getNivelEstudios()+"\n"+"--Estado Civil: ";contenido +=c.getEstadoCivil()?"Casado\n": "Soltero\n";contenido += "--Número de hijos : "+c.getNumHijos()+"\n\n"+"Los datos se han guardado";textArea.setText(contenido);
	}
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			dispose();
		}
	}
}
