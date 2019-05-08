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
import javax.swing.ListSelectionModel;
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
	//Liste Joueurs non selec
	private ArrayList<Joueur> listeJ;
	//Liste Joueurs selec
	private ArrayList<Joueur> listeJSelec;
	//Liste Joueurs que je veux dans mon équipe
	private ArrayList<Joueur> listeJoueurPourCetteEquipe;
	private String nomEquipe;
	public ArrayList<Equipe> listeEquipeLocale;
	private ArrayList<Equipe> listEqSelec;
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
	public Ajouter(int choix, int choixSelec, int nb, String nomEquipe, ArrayList<Competition> listeCompet, ArrayList<Joueur> listeJoueurSelec, ArrayList<Joueur> listeJoueur,
			
			ArrayList<Equipe> listeEquipe,ArrayList<Equipe> listeEquipeSelec, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur,
			
			ArrayList<Entrainneur> listeEntrainneurSelec, ArrayList<Match> listeMatch  ) {
		this.nomEquipe = nomEquipe;
		if (choixSelec == 1) {

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String titre = "";
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
				titre = "Ajouter les compétitions :";
			break;
			case 2:
					titre = "Ajouter un joueur :";		
					String nomColonnesJ[] = {"Nom","Prénom","Âge", "Nationnalité","Poste", "Equipe"};
					Object[][] donneJ = new Object[listeJoueur.size()] [6];
					JTable table = new JTable(donneJ, nomColonnesJ);
					
					table.setBounds(64, 128, 361, 174);		
					for(int i = 0;i <listeJoueur.size();i++) {
						donneJ[i][0] = listeJoueur.get(i).getnom();
						
						donneJ[i][1] = listeJoueur.get(i).getprenom();
						
						donneJ[i][2] = listeJoueur.get(i).getage();
						
						donneJ[i][3] = listeJoueur.get(i).getnationnalite();
						
						donneJ[i][4] = listeJoueur.get(i).getposte();
						
						donneJ[i][5] = listeJoueur.get(i).getEq();
						
					}
					
					Menu1.add(table);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mousePressed(MouseEvent e) {
							ArrayList<Joueur> listeJoueurPourCetteEquipe = new ArrayList();
							int ligne = table.getSelectedRow();
							int index = table.convertRowIndexToModel(ligne);
							Joueur joueur = listeJoueur.get(index);
							joueur.setEqJoueur(nomEquipe);
							listeJoueur.remove(index);
							listeJoueurSelec.add(joueur);
							listeJoueurPourCetteEquipe.add(joueur);
							setListeJoueurPourCetteEquipe(listeJoueurPourCetteEquipe);
							setListSelecJ(listeJoueurSelec);
							dispose();
						}
					});
											
			break;
			case 3:
				titre = "Ajouter un arbitre :";
				String nomColonnesA[] = {"Nom","Prénom","Âge", "Nationnalité", "Poste"};
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
				titre = "Ajouter un entraînneur :";
				String nomColonnesE[] = {"Nom","Prénom","Âge", "Nationnalité"};
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
				tableE.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tableE.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						int ligne = tableE.getSelectedRow();
						int index = tableE.convertRowIndexToModel(ligne);
						Entrainneur entrainneur = listeEntrainneur.get(index);
						entrainneur.setEqEntrainneur(nomEquipe);
						listeEntrainneur.remove(index);
						listeEntrainneurSelec.add(entrainneur);
						setListJ(listeJoueurSelec);
						dispose();
					}
				});
			break;
			case 5:
				titre = "Ajouter une équipe :";	
				titre = "Ajouter une équipe :";
				String nomColonnesEq[] = {"Nom équipe","Nb Joueurs","Ville", "Pays", ""};
				Object[][] donneEq = new Object[listeEquipe.size()] [5];
				JTable tableEq = new JTable(donneEq,nomColonnesEq);
				
				tableEq.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeEquipe.size();i++) {
					donneEq[i][0] = listeEquipe.get(i).getNomEquipe();
					
					donneEq[i][1] = listeEquipe.get(i).getNbJoueurs();
					
					donneEq[i][2] = listeEquipe.get(i).getVille();
					
					donneEq[i][3] = listeEquipe.get(i).getPays();	
					
					donneEq[i][4] = listeEquipe.get(i).getTactique();	
				}
				
				Menu1.add(tableEq);
				tableEq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tableEq.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						ArrayList<Equipe> listeEquipeLocale = new ArrayList();
						int ligne = tableEq.getSelectedRow();
						int index = tableEq.convertRowIndexToModel(ligne);
						Equipe equipe = listeEquipe.get(index);
						listeEquipeLocale.add(equipe);
						setListeEquipeLocale(listeEquipeLocale);
						setListSelecEq(listeEquipeSelec);
						dispose();
					}
				});
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
		}		
		else if (choixSelec == 2) {
			if (choix == 2) {
				CreerJoueur fenetreJ = new CreerJoueur(listeJoueurSelec, nomEquipe);
				fenetreJ.setVisible(true);
				dispose();
			}
			else if (choix == 3) {
				CreerArbitre fenetreA = new CreerArbitre(listeArbitre);
				fenetreA.setVisible(true);
				dispose();
			}
			else if (choix == 4) {
				CreerEntrainneur fenetreE = new CreerEntrainneur(listeEntrainneurSelec, nomEquipe);
				fenetreE.setVisible(true);
				dispose();
			}
		}
		
	}
	
	public void setListJ(ArrayList<Joueur> listeJoueur) {
		listeJ = listeJoueur;
	}
	
	public ArrayList<Joueur> getListJ() {
		return listeJ;
	}
	
	public void setListSelecJ(ArrayList<Joueur> listeJoueurSelec) {
		listeJSelec = listeJoueurSelec;
	}
	
	public ArrayList<Joueur> getListSelecJ() {
		return listeJSelec;
	}
	
	public void setListSelecEq(ArrayList<Equipe> listeEquipeSelec) {
		listEqSelec = listeEquipeSelec;
	}
	
	public ArrayList<Equipe> getListEquipeLocale() {
		return listEqSelec;
	}
	
	public void setListeEquipeLocale(ArrayList<Equipe> listeEquipe) {
		this.listeEquipeLocale = listeEquipe;
	}
	
	public ArrayList<Equipe> getListeEquipeLocale() {
		return this.listeEquipeLocale;
	}
	
	public void setListeJoueurPourCetteEquipe(ArrayList<Joueur> listeJoueurPourCetteEquipe) {
		this.listeJoueurPourCetteEquipe = listeJoueurPourCetteEquipe;
		System.out.println("Etape 1 Dans la fonction- "+ this.listeJoueurPourCetteEquipe);
	}
	
	public ArrayList<Joueur> getListeJoueurPourCetteEquipeAjouter() {
		return this.listeJoueurPourCetteEquipe;
	}
}
