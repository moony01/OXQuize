package oxq.action.signin;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignIn extends JFrame implements ActionListener, Runnable {

	private JLabel loginL, pwdL;
	private JTextField loginT, pwdT;
	private JButton signIN, signUP, idFindB, pwFindB;
	
	
	public SignIn() {
		setTitle("LOGIN");
		JPanel pn1 = new JPanel();
		loginL = new JLabel("LOGIN : ");
		loginT = new JTextField(15);
		pn1.add(loginL);
		pn1.add(loginT);
		
		JPanel pn2 = new JPanel();
		pwdL = new JLabel("PASSWORD : ");
		pwdT = new JTextField(15);
		pn2.add(pwdL);
		pn2.add(pwdT);
		
		JPanel pn3 = new JPanel();
		signIN = new JButton("SIGN IN");
		signUP = new JButton("SIGN UP");
		pn3.add(signIN);
		pn3.add(signUP);
		
		JPanel pn4 = new JPanel();
		idFindB = new JButton("idFindB");
		pwFindB = new JButton("pwFindB");
		
		JPanel centerP = new JPanel(new GridLayout(3, 1));
		centerP.add(pn1);
		centerP.add(pn2);
		centerP.add(pn3);
		centerP.add(pn4);
		
		JPanel alignP = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 200));
		alignP.add(centerP);
		
		Container contentPane = this.getContentPane();
		contentPane.add("Center", alignP);
		
		setBounds(50, 50, 800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new SignIn();
	}


}