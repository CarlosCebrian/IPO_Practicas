package _interface;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MiPanelTeclado extends JPanel {
	private JButton[] botones = new JButton[10];

	public MiPanelTeclado() {
		Font fuente = new Font("Verdana", Font.BOLD, 40);
		setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(3, 3, 0, 0));
		for (int i = 1; i < 10; i++) {
			botones[i] = new JButton(String.valueOf(i));
			this.add(botones[i]);
			botones[i].setFont(fuente);
			botones[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Pulsó el botón " + arg0.getActionCommand());
				}
			});

		}
	}
}
