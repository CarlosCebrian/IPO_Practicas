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
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblGato;
	private JLabel lblHombreDeNegro;
	private JLabel imgGato;
	private JPanel panel_1;
	private JLabel imgHombre;
	private JLabel lblAlien;
	private JLabel imgAlien;
	private JButton btnPanel4;

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
		
		btnPanel1 = new JButton("Panel 1");
		btnPanel1.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel1);
		
		btnPanel2 = new JButton("Panel 2");
		btnPanel2.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel2);
		
		btnPanel3 = new JButton("Panel 3");
		btnPanel3.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel3);
		
		btnPanel4 = new JButton("Panel 4");
		btnPanel4.addActionListener(new BtnPanelActionListener());
		panel.add(btnPanel4);
		
		pnlContenido = new JPanel();
		frame.getContentPane().add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		panel_1 = new JPanel();
		pnlContenido.add(panel_1, "Panel 1");
		panel_1.setLayout(null);
		
		lblAlien = new JLabel("Alien");
		lblAlien.setBounds(198, 11, 33, 14);
		panel_1.add(lblAlien);
		
		imgAlien = new JLabel("");
		imgAlien.setIcon(new ImageIcon(CardLayoutExample.class.getResource("/_interface/019.png")));
		imgAlien.setBounds(162, 36, 100, 107);
		panel_1.add(imgAlien);
		
		panel_2 = new JPanel();
		pnlContenido.add(panel_2, "Panel 2");
		panel_2.setLayout(null);
		
		lblGato = new JLabel("Gato");
		lblGato.setBounds(205, 5, 41, 14);
		panel_2.add(lblGato);
		
		imgGato = new JLabel("");
		imgGato.setIcon(new ImageIcon(CardLayoutExample.class.getResource("/_interface/022.png")));
		imgGato.setBounds(169, 30, 100, 91);
		panel_2.add(imgGato);
		
		panel_3 = new JPanel();
		pnlContenido.add(panel_3, "Panel 3");
		panel_3.setLayout(null);
		
		lblHombreDeNegro = new JLabel("Hombre de negro");
		lblHombreDeNegro.setBounds(175, 5, 106, 14);
		panel_3.add(lblHombreDeNegro);
		
		imgHombre = new JLabel("");
		imgHombre.setIcon(new ImageIcon(CardLayoutExample.class.getResource("/_interface/431.png")));
		imgHombre.setBounds(168, 30, 100, 115);
		panel_3.add(imgHombre);
		
		MiPanelReutilizable panel_4 = new MiPanelReutilizable();
		pnlContenido.add(panel_4, "Panel 4");
	}
	
	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, e.getActionCommand());
		}
	}
}
