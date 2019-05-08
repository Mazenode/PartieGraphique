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

public class AjouterJoueur extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int nb = 0;
	private ArrayList<Joueur> listeJoueur;

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
	public AjouterJoueur(int nb, ArrayList<Competition> listeCompet, ArrayList<Joueur> listeJoueur, ArrayList<Equipe> listeEquipe, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur, ArrayList<Match> listeMatch) {
		this.nb = nb;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<String> listeTemp = new ArrayList();
		String [] tactique = {"4-4-2 à plat", "4-4-2 en losange", "4-2-3-1", "4-3-3", "3-5-2", "3-4-3"};
		
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
		
		JLabel lblCrerUnequipe = new JLabel("Cr\u00E9er une \u00E9quipe :");
		lblCrerUnequipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrerUnequipe.setForeground(Color.WHITE);
		lblCrerUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblCrerUnequipe.setBounds(10, 62, 448, 47);
		CreerEquipe2.add(lblCrerUnequipe);
		
		JButton btnAjouterUnequipe = new JButton("Ajouter un joueur d\u00E9j\u00E0 \u00E9xistant");
		btnAjouterUnequipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();				
				Ajouter fenetre = new Ajouter(2, nb, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch);
				fenetre.setVisible(true);								
			}
		});
		btnAjouterUnequipe.setForeground(new Color(91, 64, 153));
		btnAjouterUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAjouterUnequipe.setBackground(Color.WHITE);
		btnAjouterUnequipe.setBounds(112, 186, 249, 23);
		CreerEquipe2.add(btnAjouterUnequipe);
		
		JLabel lblOu = new JLabel("ou");
		lblOu.setForeground(Color.WHITE);
		lblOu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblOu.setBounds(222, 219, 23, 23);
		CreerEquipe2.add(lblOu);
		
		JButton btnCrerUnequipe = new JButton("Cr\u00E9er un joueur puis l'ajouter");
		btnCrerUnequipe.setForeground(new Color(91, 64, 153));
		btnCrerUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnCrerUnequipe.setBackground(Color.WHITE);
		btnCrerUnequipe.setBounds(112, 253, 249, 23);
		CreerEquipe2.add(btnCrerUnequipe);
		
		JLabel lblNombreDeJoueurs = new JLabel("Nombre de Joueurs \u00E0 ajouter :");
		lblNombreDeJoueurs.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNombreDeJoueurs.setForeground(Color.WHITE);
		lblNombreDeJoueurs.setBounds(118, 134, 197, 14);
		CreerEquipe2.add(lblNombreDeJoueurs);
		
		JLabel nbJoueurs = new JLabel(String.valueOf(this.nb));
		nbJoueurs.setFont(new Font("Segoe UI", Font.BOLD, 13));
		nbJoueurs.setForeground(Color.WHITE);
		nbJoueurs.setBounds(313, 135, 48, 14);
		CreerEquipe2.add(nbJoueurs);
	}
}
