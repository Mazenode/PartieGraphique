import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class CreerMatch extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField LieuMatch;
	private JTextField DureeMatch;
	private JTextField ScoreEq1;
	private JTextField ScoreEq2;
	public String nomEquipe = "null";
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
	public CreerMatch(ArrayList<Competition> listeCompet, ArrayList<Joueur> listeJoueur, ArrayList<Joueur> listeJoueurSelec, ArrayList<Equipe> listeEquipe,ArrayList<Equipe> listeEquipeSelec, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur, ArrayList<Entrainneur> listeEntrainneurSelec, ArrayList<Match> listeMatch) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 573, 498);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Parent = new JPanel();
		Parent.setBounds(0, 0, 573, 498);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel CreerMatch = new JPanel();
		Parent.add(CreerMatch, "name_149768487873600");
		CreerMatch.setBackground(new Color(91,64,153));
		CreerMatch.setLayout(null);
		
		JLabel TitreCreerEquipe = new JLabel("Cr\u00E9er un Match :");
		TitreCreerEquipe.setForeground(Color.WHITE);
		TitreCreerEquipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerEquipe.setBounds(211, 11, 209, 47);
		CreerMatch.add(TitreCreerEquipe);
		
		JLabel lblLieuDuMatch = new JLabel("Lieu du match :");
		lblLieuDuMatch.setForeground(Color.WHITE);
		lblLieuDuMatch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLieuDuMatch.setBounds(110, 69, 174, 47);
		CreerMatch.add(lblLieuDuMatch);
		
		LieuMatch = new JTextField();
		LieuMatch.setBounds(246, 85, 187, 20);
		CreerMatch.add(LieuMatch);
		LieuMatch.setColumns(10);
		
		JLabel lblDurreDuMatch = new JLabel("Duree du match :");
		lblDurreDuMatch.setForeground(Color.WHITE);
		lblDurreDuMatch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDurreDuMatch.setBounds(110, 116, 142, 47);
		CreerMatch.add(lblDurreDuMatch);
		
		DureeMatch = new JTextField();
		DureeMatch.setBounds(246, 132, 48, 20);
		CreerMatch.add(DureeMatch);
		DureeMatch.setColumns(10);
		
		JButton btnContinuer = new JButton("Continuer et ajouter les 2 equipes");
		btnContinuer.setForeground(new Color(91,64,153) );
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnContinuer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Lieu = LieuMatch.getText();
				int temps = Integer.parseInt(DureeMatch.getText());
				int nbEquipe = 2;
				dispose();				
				for (int i = 0; i < nbEquipe; i++) {
					AjouterEquipe fenetreAe = new AjouterEquipe(nbEquipe, nomEquipe, listeCompet, listeJoueurSelec, listeJoueur,  listeEquipe, listeEquipeSelec, listeArbitre, listeEntrainneur, listeEntrainneurSelec,listeMatch);
					fenetreAe.setVisible(true);
				}
				
			}
		});
		btnContinuer.setBackground(Color.WHITE);
		btnContinuer.setBounds(148, 375, 272, 47);
		CreerMatch.add(btnContinuer);
		
		JLabel lblScoreEq1 = new JLabel("Score Equipe 1 :");
		lblScoreEq1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblScoreEq1.setForeground(Color.WHITE);
		lblScoreEq1.setBounds(110, 174, 142, 38);
		CreerMatch.add(lblScoreEq1);
		
		JLabel lblScoreEq2 = new JLabel("Score Equipe 2 :");
	
		lblScoreEq2.setForeground(Color.WHITE);
		lblScoreEq2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblScoreEq2.setBounds(110, 223, 142, 38);
		CreerMatch.add(lblScoreEq2);
		
		ScoreEq1 = new JTextField();
		ScoreEq1.setColumns(10);
		ScoreEq1.setBounds(246, 186, 187, 20);
		CreerMatch.add(ScoreEq1);
		
		ScoreEq2 = new JTextField();
		ScoreEq2.setColumns(10);
		ScoreEq2.setBounds(246, 235, 187, 20);
		CreerMatch.add(ScoreEq2);
		
		JButton btnChoisirArbitre = new JButton("Choisir Arbitre");
		btnChoisirArbitre.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				Ajouter fenetre = new Ajouter(3, 1, 2, nomEquipe, listeCompet, listeJoueurSelec,listeJoueur,listeEquipe,listeEquipeSelec, listeArbitre,listeEntrainneur,listeEntrainneurSelec, listeMatch);
				fenetre.setVisible(true);		
			}
		});
		btnChoisirArbitre.setForeground(new Color(91, 64, 153));
		btnChoisirArbitre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnChoisirArbitre.setBackground(Color.WHITE);
		btnChoisirArbitre.setBounds(110, 293, 127, 23);
		CreerMatch.add(btnChoisirArbitre);
		
		JButton btnCreeArbitre = new JButton("Creer Arbitre");
		btnCreeArbitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Ajouter fenetre = new Ajouter(3, 2, 2, nomEquipe, listeCompet, listeJoueurSelec,listeJoueur,listeEquipe,listeEquipeSelec, listeArbitre,listeEntrainneur,listeEntrainneurSelec, listeMatch);
					fenetre.setVisible(true);		
				}
			});
		btnCreeArbitre.setForeground(new Color(91, 64, 153));
		btnCreeArbitre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnCreeArbitre.setBackground(Color.WHITE);
		btnCreeArbitre.setBounds(319, 293, 127, 23);
		CreerMatch.add(btnCreeArbitre);
	}
}
