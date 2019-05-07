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
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;

public class CreerEquipe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntreeNomCompet;
	private JTextField EntreeNbEquipes;
	private JTextField EntreeLieuCompet;

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
	public CreerEquipe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Parent = new JPanel();
		Parent.setBounds(0, 0, 468, 411);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel CreerEquipe1 = new JPanel();
		Parent.add(CreerEquipe1, "name_149768487873600");
		CreerEquipe1.setBackground(new Color(91,64,153));
		CreerEquipe1.setLayout(null);
		
		JLabel TitreCreerEquipe = new JLabel("Cr\u00E9er une \u00E9quipe :");
		TitreCreerEquipe.setForeground(Color.WHITE);
		TitreCreerEquipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerEquipe.setBounds(140, 57, 209, 47);
		CreerEquipe1.add(TitreCreerEquipe);
		
		JLabel lblNomDeLa = new JLabel("Nom de l'\u00E9quipe :");
		lblNomDeLa.setForeground(Color.WHITE);
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNomDeLa.setBounds(48, 136, 174, 47);
		CreerEquipe1.add(lblNomDeLa);
		
		EntreeNomCompet = new JTextField();
		EntreeNomCompet.setBounds(190, 152, 187, 20);
		CreerEquipe1.add(EntreeNomCompet);
		EntreeNomCompet.setColumns(10);
		
		JLabel lblNombreDquipesParticipantes = new JLabel("Nom de la ville :");
		lblNombreDquipesParticipantes.setForeground(Color.WHITE);
		lblNombreDquipesParticipantes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombreDquipesParticipantes.setBounds(48, 171, 243, 47);
		CreerEquipe1.add(lblNombreDquipesParticipantes);
		
		EntreeNbEquipes = new JTextField();
		EntreeNbEquipes.setBounds(190, 187, 187, 20);
		CreerEquipe1.add(EntreeNbEquipes);
		EntreeNbEquipes.setColumns(10);
		
		JLabel lblLieuDeDroulement = new JLabel("Nom du pays :");
		lblLieuDeDroulement.setForeground(Color.WHITE);
		lblLieuDeDroulement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLieuDeDroulement.setBounds(48, 205, 167, 47);
		CreerEquipe1.add(lblLieuDeDroulement);
		
		EntreeLieuCompet = new JTextField();
		EntreeLieuCompet.setBounds(169, 221, 158, 20);
		CreerEquipe1.add(EntreeLieuCompet);
		EntreeLieuCompet.setColumns(10);
		
		JPanel CreerEquipe2 = new JPanel();
		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.setForeground(new Color(91,64,153) );
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parent.removeAll();
				Parent.add(CreerEquipe2);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		btnContinuer.setBackground(Color.WHITE);
		btnContinuer.setBounds(140, 344, 186, 23);
		CreerEquipe1.add(btnContinuer);
		
		JLabel lblTactiqueParDfaut = new JLabel("Tactique par d\u00E9faut :");
		lblTactiqueParDfaut.setForeground(Color.WHITE);
		lblTactiqueParDfaut.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblTactiqueParDfaut.setBounds(48, 242, 167, 34);
		CreerEquipe1.add(lblTactiqueParDfaut);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(203, 252, 124, 22);
		CreerEquipe1.add(comboBox);
		
		
		CreerEquipe2.setLayout(null);
		CreerEquipe2.setBackground(new Color(91, 64, 153));
		Parent.add(CreerEquipe2, "name_149922086670100");
		
		JLabel lblCrerUnequipe = new JLabel("Cr\u00E9er une \u00E9quipe :");
		lblCrerUnequipe.setForeground(Color.WHITE);
		lblCrerUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblCrerUnequipe.setBounds(137, 62, 207, 47);
		CreerEquipe2.add(lblCrerUnequipe);
		
		JButton btnAjouterUnequipe = new JButton("Ajouter un joueur d\u00E9j\u00E0 \u00E9xistant");
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
	}
}
