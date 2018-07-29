import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MesContacts extends JFrame {

	private JPanel contentPane;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField nmrField;
	private JTextField emailField;
	private JTextField groupeField;
	private JTextField deleteField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MesContacts frame = new MesContacts();
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
	public MesContacts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 516);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		JMenu mnOuvrir = new JMenu("Ouvrir");
		mnOption.add(mnOuvrir);
		
		JMenuItem mntmApropos = new JMenuItem("Apropos");
		mnOuvrir.add(mntmApropos);
		
		JMenuItem mntmHelp_1 = new JMenuItem("Help");
		mnOuvrir.add(mntmHelp_1);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Quitter qut = new Quitter();
				qut.setVisible(true);
			}
		});
		menuBar.add(mntmQuitter);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 52, 359, 350);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nom:", "Prenom:", "Nmr Tel:", "Email:", "Groupes:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(73);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(122);
		table.getColumnModel().getColumn(4).setPreferredWidth(92);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		scrollPane.setViewportView(table);
		
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 52, 77, 14);
		contentPane.add(lblNewLabel);
		
		nomField = new JTextField();
		nomField.setHorizontalAlignment(SwingConstants.CENTER);
		nomField.setBounds(97, 49, 147, 20);
		contentPane.add(nomField);
		nomField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setBounds(10, 87, 77, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblNmrTel = new JLabel("Nmr Tel :");
		lblNmrTel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNmrTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmrTel.setBounds(10, 126, 77, 14);
		contentPane.add(lblNmrTel);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(10, 164, 77, 14);
		contentPane.add(lblEmail);
		
		groupeField = new JTextField();
		groupeField.setHorizontalAlignment(SwingConstants.CENTER);
		groupeField.setColumns(10);
		groupeField.setBounds(97, 297, 147, 20);
		contentPane.add(groupeField);
		
		prenomField = new JTextField();
		prenomField.setHorizontalAlignment(SwingConstants.CENTER);
		prenomField.setColumns(10);
		prenomField.setBounds(97, 84, 147, 20);
		contentPane.add(prenomField);
		
		nmrField = new JTextField();
		nmrField.setHorizontalAlignment(SwingConstants.CENTER);
		nmrField.setColumns(10);
		nmrField.setBounds(97, 123, 147, 20);
		contentPane.add(nmrField);
		
		emailField = new JTextField();
		emailField.setHorizontalAlignment(SwingConstants.CENTER);
		emailField.setColumns(10);
		emailField.setBounds(97, 161, 147, 20);
		contentPane.add(emailField);
		
		JLabel lblGroupes = new JLabel("Groupes :");
		lblGroupes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGroupes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupes.setBounds(87, 202, 77, 14);
		contentPane.add(lblGroupes);
		
		JButton btnNewButton = new JButton("Famille");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				groupeField.setText(btnNewButton.getText());
			}
		});
		btnNewButton.setBounds(10, 227, 105, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAmis = new JButton("Amis");
		btnAmis.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAmis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groupeField.setText(btnAmis.getText());
			}
		});
		btnAmis.setBounds(139, 227, 105, 23);
		contentPane.add(btnAmis);
		
		JButton btnCollaborateurs = new JButton("Collaborateur");
		btnCollaborateurs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCollaborateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groupeField.setText(btnCollaborateurs.getText());
				
			}
		});
		btnCollaborateurs.setBounds(75, 253, 105, 23);
		contentPane.add(btnCollaborateurs);
		
		
		
		JButton btnNewButton_1 = new JButton("Ajouter au contacts");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tel = Integer.valueOf(nmrField.getText());
				Contacts cnt = new Contacts(nomField.getText(),
						prenomField.getText(),
						tel,
						emailField.getText(),
						groupeField.getText());
				Object[] a = {cnt.getNom(),cnt.getPrenom(),cnt.getNmrTel(),cnt.getEmail(),cnt.getGroupe()};
				model.addRow(a);
				
				nomField.setText("");
				prenomField.setText("");
				nmrField.setText("");
				groupeField.setText("");
				emailField.setText("");
				
			}
		});
		btnNewButton_1.setBounds(75, 338, 169, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnSupprimerLeContact = new JButton("Supprimer le contact");
		btnSupprimerLeContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSupprimerLeContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 0;
				boolean found = false;
				for (int i =0;i<model.getRowCount();i++){
				if(deleteField.getText().matches(model.getValueAt(i,2).toString())){
					index = i;
					found = true;
				}
				}
				if (found == true){
					model.removeRow(index);
				}
				deleteField.setText("");
			}
		});
		btnSupprimerLeContact.setBounds(75, 424, 169, 23);
		contentPane.add(btnSupprimerLeContact);
		
		deleteField = new JTextField();
		deleteField.setHorizontalAlignment(SwingConstants.CENTER);
		deleteField.setColumns(10);
		deleteField.setBounds(97, 382, 147, 20);
		contentPane.add(deleteField);+
		
		JButton btnModifierLeContact = new JButton("Modifier le contact");
		btnModifierLeContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModifierLeContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f = model.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
				MyFrame mfr = new MyFrame(f,
						                  model,
						                  table.getSelectedRow(),
						                  table.getSelectedColumn());
				mfr.setVisible(true);
				
				
			}
		});
		btnModifierLeContact.setBounds(338, 424, 169, 23);
		contentPane.add(btnModifierLeContact);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Nmr Tel :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 385, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\"Mes Contacts\"");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(98, 11, 436, 27);
		contentPane.add(lblNewLabel_2);
	}
}
