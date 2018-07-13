package Logic_gate_sim;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Error_Message extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Error_Message(String txt){
		super("Error");
		setResizable(false);
		setBackground(SystemColor.controlShadow);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 240, 240);

		setResizable(false);
		setLayout(null);
		setVisible(true);

		
		JLabel L1 = new JLabel(txt, SwingConstants.CENTER);
		add(L1);
		L1.setBounds(0, 50, 240, 40);
		
		
		JButton btnClose = new JButton("Close");
		
		btnClose.setBounds(70, 120, 100, 15);
		add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();	
			}
		});

		
	}

}
