import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Afficher extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerEquipe creerCompet = new CreerEquipe();
					creerCompet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Afficher(int choix/*, ArrayList listeNonSelec, ArrayList listeSelec*/) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String titre = "";
		String contenu = "";
		Image imageQuitter = new ImageIcon(this.getClass().getResource("Quitter.png")).getImage();
		
		switch (choix) {
			case 1:
				titre = "Afficher les compétitions :";
			break;
			case 2:
				titre = "Afficher les joueurs :";
				contenu = "Afficher les joueurs déjà séléctionnés";
			break;
			case 3:
				titre = "Afficher les arbitres :";
			break;
			case 4:
				titre = "Afficher les entraînneurs :";
				contenu = "Afficher les entraînneurs déjà séléctionnés";
			break;
			case 5:
				titre = "Afficher les équipes :";
				contenu = "Afficher les équipes déjà séléctionnés";
			break;
			case 6:
				titre = "Afficher les matchs :";
			break;
		}
			
		
		JPanel Parent = new JPanel();
		Parent.setBounds(0, 0, 468, 411);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel Menu1 = new JPanel();
		Parent.add(Menu1, "name_149768487873600");
		Menu1.setBackground(new Color(91,64,153));
		Menu1.setLayout(null);
		
		JLabel TitreCreerEquipe = new JLabel(titre);
		TitreCreerEquipe.setHorizontalAlignment(SwingConstants.CENTER);
		TitreCreerEquipe.setForeground(Color.WHITE);
		TitreCreerEquipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerEquipe.setBounds(10, 23, 448, 47);
		Menu1.add(TitreCreerEquipe);
		
		
		JLabel quitter1 = new JLabel("");
		quitter1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		quitter1.setIcon(new ImageIcon(imageQuitter));
		quitter1.setBounds(418, 11, 40, 36);
		Menu1.add(quitter1);
		
		String[] nomColonnes = {"Nom","Prénom","Âge", "Nationnalité","Poste"};
		String [][] data = {{"Chaignaud", "Quentin", "19", "Francaise", "Attaquant"}};
		
		table = new JTable(data,nomColonnes);
		table.setBounds(64, 128, 361, 174);
		Menu1.add(table);
		
		
		JPanel Menu2 = new JPanel();
		Menu2.setLayout(null);
		Menu2.setBackground(new Color(91, 64, 153));
		Parent.add(Menu2, "name_242634605874700");
		
		JLabel quitter2 = new JLabel("");
		quitter2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		quitter2.setIcon(new ImageIcon(imageQuitter));
		quitter2.setBounds(418, 11, 40, 36);
		Menu2.add(quitter2);
		
		if (choix == 2 || choix == 4 || choix == 5) {
			JButton btnContinuer = new JButton(contenu);
			btnContinuer.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Parent.removeAll();
					Parent.add(Menu2);
					Parent.repaint();
					Parent.revalidate();
				}
			});
			btnContinuer.setForeground(new Color(91,64,153) );
			btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			
			btnContinuer.setBackground(Color.WHITE);
			btnContinuer.setBounds(106, 343, 269, 23);
			Menu1.add(btnContinuer);
		}
	}
}
