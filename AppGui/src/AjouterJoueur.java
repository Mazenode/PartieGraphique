import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class AjouterJoueur extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AjouterJoueur dialog = new AjouterJoueur();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AjouterJoueur(ArrayList<Joueur> listeJoueurNonSelec, ArrayList<Joueur> listeJoueurSelec) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);		
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 434, 341);
			panel.setBackground(new Color(91, 64, 153));
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("Cr\u00E9er une \u00E9quipe :");
				label.setBounds(10, 62, 448, 47);
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Segoe UI", Font.PLAIN, 23));
				panel.add(label);
			}
			{
				JButton button = new JButton("Ajouter un joueur d\u00E9j\u00E0 \u00E9xistant");
				button.setBounds(112, 186, 249, 23);
				button.setForeground(new Color(91, 64, 153));
				button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				button.setBackground(Color.WHITE);
				panel.add(button);
			}
			{
				JLabel label = new JLabel("ou");
				label.setBounds(222, 219, 23, 23);
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				panel.add(label);
			}
			{
				JButton button = new JButton("Cr\u00E9er un joueur puis l'ajouter");
				button.setBounds(112, 253, 249, 23);
				button.setForeground(new Color(91, 64, 153));
				button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
				button.setBackground(Color.WHITE);
				panel.add(button);
			}
		}
	}

}
