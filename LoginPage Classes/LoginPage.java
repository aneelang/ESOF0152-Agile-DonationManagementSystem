import java.awt.EventQueue;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage {

	//Load the images used. Images must be stored in project folder
	ImageIcon handImage = new ImageIcon("handHeart.png");
	ImageIcon donationImage = new ImageIcon("Donation.png");
	ImageIcon eyeClose = new ImageIcon("EyeClosed.png");
	ImageIcon eyeOpen =  new ImageIcon("EyeOpen.png");
	
	//Variables used
	private JFrame loginFrame; 
	private JTextField titleText;
	private JTextField emailTextField;
	private JLabel emailAddressJLabel;
	private JLabel passwordJLabel;
	private Button createAccountButton;
	private JPasswordField passwordTextField;
	private JLabel password_label_off;
	private JLabel password_label_on;	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginPage() {
		initialize();
	}
	private void initialize() {	
		//Initialize the frame
		loginFrame = new JFrame();
		loginFrame.setBackground(Color.WHITE);
		loginFrame.setForeground(Color.WHITE);
		loginFrame.setBounds(100, 100, 768, 590);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setShape(new RoundRectangle2D.Double(10, 10, 100, 100, 50, 50));
		loginFrame.getContentPane().setLayout(null);
		
		//Password picture label default (Do not show password)
		password_label_off = new JLabel("");
		password_label_off.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				password_label_on.setVisible(true);
				password_label_off.setVisible(false);
				passwordTextField.setEchoChar((char)0);
			}
		});
		password_label_off.setBounds(298, 281, 42, 39);
		password_label_off.setIcon(eyeClose);
		loginFrame.getContentPane().add(password_label_off);
		
		//Password picture label on (Show password)
		password_label_on = new JLabel("");
		password_label_on.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				password_label_on.setVisible(false);
				password_label_off.setVisible(true);
				passwordTextField.setEchoChar('*');
			}
		});
		password_label_on.setBounds(298, 281, 42, 39);
		password_label_on.setIcon(eyeOpen);
		password_label_on.setVisible(false);
		loginFrame.getContentPane().add(password_label_on);
		
		//Create Text field for page title
		titleText = new JTextField();
		titleText.setFont(new Font("Rockwell Condensed", Font.BOLD, 32));
		titleText.setBackground(Color.WHITE);
		titleText.setEditable(false);
		titleText.setText("Make a difference");
		titleText.setBounds(65, 11, 293, 67);
		titleText.setColumns(10);
		titleText.setBorder(null);
		loginFrame.getContentPane().add(titleText); //Add to frame
		
		//Create JLabel to store picture 1
		JLabel handPictureLabel = new JLabel("");//fix
		handPictureLabel.setBounds(0, 0, 70, 67);
		handPictureLabel.setIcon(handImage);
		loginFrame.getContentPane().add(handPictureLabel);
		
		//Create JLabel to store picture 2
		JLabel donationPictureLabel = new JLabel("");//fix
		donationPictureLabel.setBounds(358, 11, 386, 529);
		donationPictureLabel.setIcon(donationImage);
		loginFrame.getContentPane().add(donationPictureLabel);
		
		//Create text field for email address (and make it rounded)
		emailTextField = new JTextField();
		emailTextField.setBounds(48, 199, 293, 39);
		emailTextField.setBorder(new RoundedLineBorder(Color.BLACK, 1, 10, true)); //Pass rounded line border class to make text field rounded
		emailTextField.setColumns(10);
		loginFrame.getContentPane().add(emailTextField);
		
		
		//Create email address text label
		emailAddressJLabel = new JLabel("Email Address");
		emailAddressJLabel.setForeground(Color.LIGHT_GRAY);
		emailAddressJLabel.setBackground(Color.LIGHT_GRAY);
		emailAddressJLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
		emailAddressJLabel.setBounds(48, 167, 107, 21);
		loginFrame.getContentPane().add(emailAddressJLabel);
		
		//Create password text label
		passwordJLabel = new JLabel("Password");
		passwordJLabel.setForeground(Color.LIGHT_GRAY);
		passwordJLabel.setBackground(Color.LIGHT_GRAY);
		passwordJLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
		passwordJLabel.setBounds(48, 249, 107, 21);
		loginFrame.getContentPane().add(passwordJLabel);
		
		//Create password text field
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(48, 281, 247, 39);
		passwordTextField.setBorder(new RoundedLineBorder(Color.BLACK, 1, 10, true));
		loginFrame.getContentPane().add(passwordTextField);
		
		//Create Login button
		Button loginButton = new Button("Login");
		loginButton.setFont(new Font("Dialog", Font.BOLD, 12));
		loginButton.setBackground(new Color(255, 204, 153));
		loginButton.setBounds(77, 359, 218, 37);
		loginFrame.getContentPane().add(loginButton);

		//Make Create Account button
		createAccountButton = new Button("Create Account");
		createAccountButton.setFont(new Font("Dialog", Font.BOLD, 12));
		createAccountButton.setBackground(new Color(255, 204, 153));
		createAccountButton.setBounds(77, 418, 218, 37);
		loginFrame.getContentPane().add(createAccountButton);		
		
		loginFrame.setResizable(false);
	}
}
