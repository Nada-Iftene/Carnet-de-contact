import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quitter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quitter frame = new Quitter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Quitter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(243, 204, 122, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRetour.setBounds(55, 204, 122, 23);
		contentPane.add(btnRetour);
		
		JTextPane txtpnMerciDeNous = new JTextPane();
		txtpnMerciDeNous.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnMerciDeNous.setText("   \"Merci de nous choisir\"   ");
		txtpnMerciDeNous.setBounds(55, 68, 310, 45);
		contentPane.add(txtpnMerciDeNous);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textPane.setText("  ^_^");
		textPane.setBounds(159, 113, 76, 34);
		contentPane.add(textPane);
	}
}
