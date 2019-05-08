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

public class Ajouter extends JDialog {

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
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ajouter(int choix, ArrayList<Competition> listeCompet, ArrayList<Joueur> listeJoueur, ArrayList<Equipe> listeEquipe, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur, ArrayList<Match> listeMatch ) {

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
		

		JPanel Parent = new JPanel();
		Parent.setBounds(10, 11, 448, 389);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
				
		JPanel Menu1 = new JPanel();
		Parent.add(Menu1, "name_149768487873600");
		Menu1.setBackground(new Color(91,64,153));
		Menu1.setLayout(null);
		
		switch (choix) {
			case 1:
				titre = "Ajouter les comp�titions :";
			break;
			case 2:
				titre = "Ajouter un joueur :";
				contenu = "Ajouter un joueur d�j� s�l�ctionn�";
				String nomColonnesJ[] = {"Nom","Pr�nom","�ge", "Nationnalit�","Poste"};
				Object[][] donneJ = new Object[listeJoueur.size()] [5];
				JTable table = new JTable(donneJ, nomColonnesJ);
				
				table.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeJoueur.size();i++) {
					donneJ[i][0] = listeJoueur.get(i).getnom();
					
					donneJ[i][1] = listeJoueur.get(i).getprenom();
					
					donneJ[i][2] = listeJoueur.get(i).getage();
					
					donneJ[i][3] = listeJoueur.get(i).getnationnalite();
					
					donneJ[i][4] = listeJoueur.get(i).getposte();
					
				}
				
				Menu1.add(table);
				/**int ligne = table.getSelectedRow();
				Joueur joueur = listeJoueur.get(table.convertRowIndexToModel(ligne));
				System.out.println(joueur);*/
			break;
			case 3:
				titre = "Ajouter un arbitre :";
				String nomColonnesA[] = {"Nom","Pr�nom","�ge", "Nationnalit�", "Poste"};
				Object[][] donneA = new Object[listeArbitre.size()] [5];
				JTable tableA = new JTable(donneA,nomColonnesA);
				
				tableA.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeArbitre.size();i++) {
					donneA[i][0] = listeArbitre.get(i).getnom();
					
					donneA[i][1] = listeArbitre.get(i).getprenom();
					
					donneA[i][2] = listeArbitre.get(i).getage();
					
					donneA[i][3] = listeArbitre.get(i).getnationnalite();	
					
					donneA[i][4] = listeArbitre.get(i).getposte();	
				}
				
				Menu1.add(tableA);
			break;
			case 4:
				titre = "Ajouter un entra�nneur :";
				contenu = "Ajouter un entra�nneur d�j� s�l�ctionn�";
				String nomColonnesE[] = {"Nom","Pr�nom","�ge", "Nationnalit�"};
				Object[][] donneE = new Object[listeEntrainneur.size()] [4];
				JTable tableE = new JTable(donneE,nomColonnesE);
				
				tableE.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeEntrainneur.size();i++) {
					donneE[i][0] = listeEntrainneur.get(i).getnom();
					
					donneE[i][1] = listeEntrainneur.get(i).getprenom();
					
					donneE[i][2] = listeEntrainneur.get(i).getage();
					
					donneE[i][3] = listeEntrainneur.get(i).getnationnalite();					
				}
				
				Menu1.add(tableE);
			break;
			case 5:
				titre = "Ajouter une �quipe :";
				contenu = "Ajouter les �quipes d�j� s�l�ctionn�s";
			break;
			case 6:
				titre = "Ajouter un match :";
			break;
		}
		
		
		JLabel quitter1 = new JLabel("");
		quitter1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel TitreCreerEquipe = new JLabel(titre);
		TitreCreerEquipe.setHorizontalAlignment(SwingConstants.CENTER);
		TitreCreerEquipe.setForeground(Color.WHITE);
		TitreCreerEquipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerEquipe.setBounds(0, 26, 448, 47);
		Menu1.add(TitreCreerEquipe);
		quitter1.setIcon(new ImageIcon(imageQuitter));
		quitter1.setBounds(408, 11, 30, 36);
		Menu1.add(quitter1);

		
	
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