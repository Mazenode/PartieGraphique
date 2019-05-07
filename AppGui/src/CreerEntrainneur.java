import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CreerEntrainneur extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerEntrainneur frame = new CreerEntrainneur();
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
	public CreerEntrainneur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 468, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] nationnalites = { "Allemand", "Argentin", "Belge", "Bresilien", "Sud Coréen", "Espagnol", "Français","Islandais", "Italien", "Portugais","Russe" };
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 447, 376);
		panel.setLayout(null);
		panel.setBackground(new Color(91, 64, 153));
		contentPane.add(panel);
		
		JLabel lblCrerUnJoueur = new JLabel("Cr\u00E9er un Entrainneur:");
		lblCrerUnJoueur.setForeground(Color.WHITE);
		lblCrerUnJoueur.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblCrerUnJoueur.setBounds(111, 38, 249, 47);
		panel.add(lblCrerUnJoueur);
		
		JLabel label_1 = new JLabel("Nom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_1.setBounds(91, 111, 59, 47);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(149, 127, 159, 20);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_2.setBounds(91, 145, 76, 44);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u00C2ge :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_3.setBounds(91, 181, 42, 36);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 192, 36, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 158, 159, 20);
		panel.add(textField_2);
		
		JLabel label_4 = new JLabel("Nationnalit\u00E9 :");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_4.setBounds(91, 215, 107, 36);
		panel.add(label_4);
		
		JComboBox<String> comboBox = new JComboBox<String>(nationnalites);
		comboBox.setBounds(195, 225, 141, 22);
		panel.add(comboBox);
		
		JButton button = new JButton("Continuer");
		button.setForeground(new Color(91, 64, 153));
		button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(139, 326, 186, 23);
		panel.add(button);
	}

}
