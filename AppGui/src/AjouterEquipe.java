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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AjouterEquipe extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int nb = 0;
	private ArrayList<Equipe> listeEquipeLocale;

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
	public AjouterEquipe(int nb, String nomEquipe, ArrayList<Competition> listeCompet, ArrayList<Joueur> listeJoueurSelec, ArrayList<Joueur> listeJoueur, ArrayList<Equipe> listeEquipe, ArrayList<Equipe> listeEquipeSelec, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur, ArrayList<Entrainneur> listeEntrainneurSelec, ArrayList<Match> listeMatch) {
		this.nb = nb;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Parent = new JPanel();
		Parent.setBounds(10, 11, 448, 389);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel CreerEquipe2 = new JPanel();
		
		/*JComboBox<String> choixTactique = new JComboBox<String>(tactique);
		choixTactique.setBounds(202, 288, 124, 22);
		CreerEquipe1.add(choixTactique);*/
		
		
		CreerEquipe2.setLayout(null);
		CreerEquipe2.setBackground(new Color(91, 64, 153));
		Parent.add(CreerEquipe2, "name_149922086670100");
		
		JLabel AjouterEquipe = new JLabel("Ajouter une \u00E9quipe");
		AjouterEquipe.setHorizontalAlignment(SwingConstants.CENTER);
		AjouterEquipe.setForeground(Color.WHITE);
		AjouterEquipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		AjouterEquipe.setBounds(10, 62, 428, 47);
		CreerEquipe2.add(AjouterEquipe);
		
		JButton btnAjouterUnequipe = new JButton("Ajouter une \u00E9quipe d\u00E9j\u00E0 \u00E9xistante");
		btnAjouterUnequipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();								
				Ajouter fenetre = new Ajouter(5, 1, 1, nomEquipe, listeCompet, listeJoueurSelec,listeJoueur,listeEquipe, listeEquipeSelec, listeArbitre,listeEntrainneur,listeEntrainneurSelec, listeMatch);
				fenetre.setVisible(true);								
			}
		});
		btnAjouterUnequipe.setForeground(new Color(91, 64, 153));
		btnAjouterUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAjouterUnequipe.setBackground(Color.WHITE);
		btnAjouterUnequipe.setBounds(103, 164, 249, 23);
		CreerEquipe2.add(btnAjouterUnequipe);
		
		JLabel lblOu = new JLabel("ou");
		lblOu.setForeground(Color.WHITE);
		lblOu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblOu.setBounds(213, 197, 23, 23);
		CreerEquipe2.add(lblOu);
		
		JButton btnCrerUnequipe = new JButton("Cr\u00E9er une \u00E9quipe puis l'ajouter");
		btnCrerUnequipe.setForeground(new Color(91, 64, 153));
		btnCrerUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnCrerUnequipe.setBackground(Color.WHITE);
		btnCrerUnequipe.setBounds(103, 231, 249, 23);
		CreerEquipe2.add(btnCrerUnequipe);
	}
	
	public void setListeEquipeLocale(ArrayList<Equipe> listeEquipeLocale) {
		this.listeEquipeLocale = listeEquipeLocale;
	}
	
	public ArrayList<Equipe> getListeEquipeLocale() {
		return this.listeEquipeLocale;
	}
}
