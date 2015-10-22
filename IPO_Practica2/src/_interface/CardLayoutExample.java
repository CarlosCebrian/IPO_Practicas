package _interface;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExample {

	private JFrame frame;
	private JPanel panel;
	private JButton btnPanel1;
	private JButton btnPanel2;
	private JButton btnPanel3;
	private JPanel pnlContenido;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblAlien;
	private JLabel lblGato;
	private JLabel lblHombreDeNegro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutExample window = new CardLayoutExample();
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
	public CardLayoutExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnPanel1 = new JButton("Panel1");
		btnPanel1.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel1);
		
		btnPanel2 = new JButton("Panel 2");
		btnPanel2.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel2);
		
		btnPanel3 = new JButton("Panel 3");
		btnPanel3.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel3);
		
		pnlContenido = new JPanel();
		frame.getContentPane().add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		panel_1 = new JPanel();
		pnlContenido.add(panel_1, "Panel_1");
		
		lblAlien = new JLabel("Alien");
		lblAlien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAlien.setBounds(204, 122, 46, 14);
		panel_1.add(lblAlien);
		
		panel_2 = new JPanel();
		pnlContenido.add(panel_2, "Panel_2");
		
		lblGato = new JLabel("Gato");
		lblGato.setBounds(206, 116, 46, 14);
		panel_2.add(lblGato);
		
		panel_3 = new JPanel();
		pnlContenido.add(panel_3, "Panel_3");
		
		lblHombreDeNegro = new JLabel("Hombre de negro");
		lblHombreDeNegro.setBounds(172, 139, 111, 14);
		panel_3.add(lblHombreDeNegro);
	}
	
	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, e.getActionCommand());
		}
	}
}
