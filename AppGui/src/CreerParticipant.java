import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CreerParticipant extends JDialog implements WindowListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntreeNomCompet;
	private JTextField EntreeLieuCompet;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerParticipant creerParticipant = new CreerParticipant();
					creerParticipant.setModal(true);
					creerParticipant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreerParticipant() {

		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image imagePersonneBlanc = new ImageIcon(this.getClass().getResource("PersonnePetitBlanc.png")).getImage();
		Image imagePersonneViolet = new ImageIcon(this.getClass().getResource("PersonnePetitViolet.png")).getImage();
		Image imageSiffletBlanc = new ImageIcon(this.getClass().getResource("SiffletPetitBlanc.png")).getImage();
		Image imageSiffletViolet = new ImageIcon(this.getClass().getResource("SiffletPetitViolet.png")).getImage();
		Image imageEntrainneurBlanc = new ImageIcon(this.getClass().getResource("EntrainneurPetitBlanc.png")).getImage();
		Image imageEntrainneurViolet = new ImageIcon(this.getClass().getResource("EntrainneurPetitViolet.png")).getImage();
		
		String[] nationnalites = { "Allemand", "Argentin", "Belge", "Bresilien", "Sud Coréen", "Espagnol", "Français","Islandais", "Italien", "Portugais","Russe" };
		String[] posteJoueur = { "Attaquant", "Défenseur", "Gardien"};
		String[] posteArbitre = { "Arbitre central", "Arbitre de touche", "Arbitre assistant"};
		
		JPanel Parent = new JPanel();
		JPanel ChoisirPoste = new JPanel();		
		
		Parent.setBounds(0, 0, 468, 411);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel CreerParticipant = new JPanel();
		Parent.add(CreerParticipant, "name_156511462096000");
		CreerParticipant.setBackground(new Color(91,64,153));
		CreerParticipant.setLayout(null);
		
		JLabel TitreCreerCompet1 = new JLabel("Cr\u00E9er un participant :");
		TitreCreerCompet1.setForeground(Color.WHITE);
		TitreCreerCompet1.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerCompet1.setBounds(124, 61, 249, 47);
		CreerParticipant.add(TitreCreerCompet1);
		
		JLabel lblNomDeLa = new JLabel("Nom :");
		lblNomDeLa.setForeground(Color.WHITE);
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNomDeLa.setBounds(92, 136, 59, 47);
		CreerParticipant.add(lblNomDeLa);
		
		EntreeNomCompet = new JTextField();
		EntreeNomCompet.setBounds(150, 152, 159, 20);
		CreerParticipant.add(EntreeNomCompet);
		EntreeNomCompet.setColumns(10);
		
		JLabel lblNombreDquipesParticipantes = new JLabel("Pr\u00E9nom :");
		lblNombreDquipesParticipantes.setForeground(Color.WHITE);
		lblNombreDquipesParticipantes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombreDquipesParticipantes.setBounds(92, 170, 76, 44);
		CreerParticipant.add(lblNombreDquipesParticipantes);
		
		JLabel lblLieuDeDroulement = new JLabel("\u00C2ge :");
		lblLieuDeDroulement.setForeground(Color.WHITE);
		lblLieuDeDroulement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLieuDeDroulement.setBounds(92, 206, 42, 36);
		CreerParticipant.add(lblLieuDeDroulement);
		
		EntreeLieuCompet = new JTextField();
		EntreeLieuCompet.setBounds(143, 217, 36, 20);
		CreerParticipant.add(EntreeLieuCompet);
		EntreeLieuCompet.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(160, 183, 159, 20);
		CreerParticipant.add(textField);
		
		JLabel lblNationnalit = new JLabel("Nationnalit\u00E9 :");
		lblNationnalit.setForeground(Color.WHITE);
		lblNationnalit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNationnalit.setBounds(92, 240, 107, 36);
		CreerParticipant.add(lblNationnalit);
		JComboBox<String> comboBox = new JComboBox<String>(nationnalites);
		comboBox.setBounds(196, 250, 141, 22);
		CreerParticipant.add(comboBox);
		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.setForeground(new Color(91,64,153) );
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parent.removeAll();
				Parent.add(ChoisirPoste);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		btnContinuer.setBackground(Color.WHITE);
		btnContinuer.setBounds(140, 344, 186, 23);
		CreerParticipant.add(btnContinuer);
		
			ChoisirPoste.setLayout(null);
			ChoisirPoste.setBackground(new Color(91, 64, 153));
			Parent.add(ChoisirPoste, "name_149922086670100");
			
			JLabel lblJeVeuxCrer = new JLabel("Je veux cr\u00E9er :");
			lblJeVeuxCrer.setForeground(Color.WHITE);
			lblJeVeuxCrer.setFont(new Font("Segoe UI", Font.PLAIN, 23));
			lblJeVeuxCrer.setBounds(160, 69, 157, 47);
			ChoisirPoste.add(lblJeVeuxCrer);
			
			JPanel BoutonCreerJoueur = new JPanel();			
			BoutonCreerJoueur.setBackground(new Color(100, 84, 163));
			BoutonCreerJoueur.setBounds(33, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerJoueur);
			BoutonCreerJoueur.setLayout(null);
			
			JLabel lblJoueur = new JLabel("Joueur");
			lblJoueur.setForeground(Color.WHITE);
			lblJoueur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblJoueur.setBounds(36, 11, 52, 25);
			BoutonCreerJoueur.add(lblJoueur);	
			
			JLabel ImagePersonne = new JLabel("");
			ImagePersonne.setIcon(new ImageIcon(imagePersonneBlanc));
			ImagePersonne.setBounds(36, 48, 52, 47);
			BoutonCreerJoueur.add(ImagePersonne);						
			
			
			JPanel BoutonCreerArbitre = new JPanel();			
			BoutonCreerArbitre.setBackground(new Color(100, 84, 163));
			BoutonCreerArbitre.setBounds(172, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerArbitre);
			BoutonCreerArbitre.setLayout(null);
			
			JLabel lblArbitre = new JLabel("Arbitre");
			lblArbitre.setBounds(37, 11, 53, 20);
			lblArbitre.setForeground(Color.WHITE);
			lblArbitre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			BoutonCreerArbitre.add(lblArbitre);
			
			JLabel ImageSifflet = new JLabel("");
			ImageSifflet.setIcon(new ImageIcon(imageSiffletBlanc));
			ImageSifflet.setBounds(38, 42, 52, 47);
			BoutonCreerArbitre.add(ImageSifflet);			
			
			JPanel BoutonCreerEntrainneur = new JPanel();			
			BoutonCreerEntrainneur.setBackground(new Color(100, 84, 163));
			BoutonCreerEntrainneur.setBounds(313, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerEntrainneur);
			BoutonCreerEntrainneur.setLayout(null);
			
			JLabel lblEntrainneur = new JLabel("Entrainneur");
			lblEntrainneur.setBounds(26, 11, 82, 20);
			lblEntrainneur.setForeground(Color.WHITE);
			lblEntrainneur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			BoutonCreerEntrainneur.add(lblEntrainneur);
			
			JLabel ImageEntrainneur = new JLabel("");
			ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurBlanc));
			ImageEntrainneur.setBounds(36, 42, 52, 47);
			BoutonCreerEntrainneur.add(ImageEntrainneur);
			
			JPanel CreerJoueur = new JPanel();
			Parent.add(CreerJoueur, "name_161913746734100");
			CreerJoueur.setBackground(new Color(91,64,153));
			CreerJoueur.setLayout(null);
			
			JLabel lblSlctionnezLePoste = new JLabel("S\u00E9l\u00E9ctionnez le poste du joueur :");
			lblSlctionnezLePoste.setForeground(Color.WHITE);
			lblSlctionnezLePoste.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblSlctionnezLePoste.setBounds(124, 134, 246, 36);
			CreerJoueur.add(lblSlctionnezLePoste);
			
			JComboBox<String> comboBox_1 = new JComboBox<String>(posteJoueur);
			comboBox_1.setBounds(175, 183, 131, 22);
			CreerJoueur.add(comboBox_1);
			
			JButton button = new JButton("Continuer");
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dispose();
				}
			});
			button.setForeground(new Color(91, 64, 153));
			button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			button.setBackground(Color.WHITE);
			button.setBounds(144, 317, 186, 23);
			CreerJoueur.add(button);
			
			JPanel CreerArbitre = new JPanel();
			Parent.add(CreerArbitre, "name_161969759070600");
			CreerArbitre.setBackground(new Color(91,64,153));
			CreerArbitre.setLayout(null);
			
			JLabel lblSlctionnezLePoste_1 = new JLabel("S\u00E9l\u00E9ctionnez le poste de l'arbitre:");
			lblSlctionnezLePoste_1.setBounds(120, 149, 246, 22);
			lblSlctionnezLePoste_1.setForeground(Color.WHITE);
			lblSlctionnezLePoste_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			CreerArbitre.add(lblSlctionnezLePoste_1);
			
			JComboBox<String> comboBox_2 = new JComboBox<String>(posteArbitre);
			comboBox_2.setBounds(172, 192, 137, 22);
			CreerArbitre.add(comboBox_2);
			
			JButton button_1 = new JButton("Continuer");
			button_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dispose();
				}
			});
			button_1.setForeground(new Color(91, 64, 153));
			button_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			button_1.setBackground(Color.WHITE);
			button_1.setBounds(141, 313, 186, 23);
			CreerArbitre.add(button_1);

			
			BoutonCreerEntrainneur.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					BoutonCreerEntrainneur.setBackground(Color.white);
					lblEntrainneur.setForeground(new Color(91,64,153));
					ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurViolet));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					dispose();
				}
			});
			
			ChoisirPoste.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					BoutonCreerJoueur.setBackground(new Color(100, 84, 163));
					lblJoueur.setForeground(Color.white);					
					ImagePersonne.setIcon(new ImageIcon(imagePersonneBlanc));
					BoutonCreerArbitre.setBackground(new Color(100, 84, 163));
					lblArbitre.setForeground(Color.white);
					ImageSifflet.setIcon(new ImageIcon(imageSiffletBlanc));
					BoutonCreerEntrainneur.setBackground(new Color(100, 84, 163));
					lblEntrainneur.setForeground(Color.white);
					ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurBlanc));
				}
			});
			
			BoutonCreerJoueur.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					BoutonCreerJoueur.setBackground(Color.white);
					lblJoueur.setForeground(new Color(91,64,153));
					ImagePersonne.setIcon(new ImageIcon(imagePersonneViolet));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Parent.removeAll();
					Parent.add(CreerJoueur);
					Parent.repaint();
					Parent.revalidate();
				}
			});
			
			BoutonCreerArbitre.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					BoutonCreerArbitre.setBackground(Color.white);
					lblArbitre.setForeground(new Color(91,64,153));
					ImageSifflet.setIcon(new ImageIcon(imageSiffletViolet));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Parent.removeAll();
					Parent.add(CreerArbitre);
					Parent.repaint();
					Parent.revalidate();
				}
			});
			
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
