package Logic_gate_sim;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LGSim_gui extends JFrame  {

	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	
	public static JToggleButton toggleButton,toggleButton_1,toggleButton_2,toggleButton_3,
	toggleButton_4,toggleButton_5;
	

	
	public LGSim_gui() 
	{
		try {
			 UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			 UIManager.put("ToggleButton.background", Color.RED);
	         UIManager.put("ToggleButton.select", Color.GREEN);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		

		JFrame frame=new JFrame("Logic Gate Simulator  @  Evangelos Spathonis® ");
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setSize(725, 500);
		frame.setResizable(false);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
		frame.setLayout(null);
	    frame.setVisible(true);

		JButton btnAnd = new JButton("AND");
		btnAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Gate_genn("AND",frame);
			}
		});
		JButton btnOr = new JButton("OR");
		btnOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Gate_genn("OR",frame);
			}
		});
		
		JButton btnNot = new JButton("NOT");
		btnNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gate_genn("NOT",frame);
			}
		});
		
		JButton btnNand = new JButton("NAND");
		btnNand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gate_genn("NAND",frame);
			}
		});
		
		JButton btnNor = new JButton("NOR");
		btnNor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gate_genn("NOR",frame);
			}
		});
		
		JButton btnXand = new JButton("XOR");
		btnXand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gate_genn("XOR",frame);
			}
		});
		
		JButton btnXor = new JButton("XNOR");
		btnXor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gate_genn("XNOR",frame);
			}
		});
		
		//toggleButtons
		
		JToggleButton toggleButton = new JToggleButton("ON");
		toggleButton.setSelected(true);
		toggleButton.setBorder(null);
		toggleButton.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton.isSelected()){
	                toggleButton.setText("ON");
	            } else {
	                toggleButton.setText("OFF");
	            }
	        }
	    });
		
		JToggleButton toggleButton_1 = new JToggleButton("ON");
		toggleButton_1.setSelected(true);
		toggleButton_1.setBorder(null);
		toggleButton_1.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton_1.isSelected()){
	                toggleButton_1.setText("ON");
	            } else {
	                toggleButton_1.setText("OFF");
	            }
	        }
	    });
		
		JToggleButton toggleButton_2 = new JToggleButton("ON");
		toggleButton_2.setSelected(true);
		toggleButton_2.setBorder(null);
		toggleButton_2.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton_2.isSelected()){
	                toggleButton_2.setText("ON");
	            } else {
	                toggleButton_2.setText("OFF");
	            }
	        }
	    });
		
		JToggleButton toggleButton_3 = new JToggleButton("ON");
		toggleButton_3.setSelected(true);
		toggleButton_3.setBorder(null);
		toggleButton_3.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton_3.isSelected()){
	                toggleButton_3.setText("ON");
	            } else {
	                toggleButton_3.setText("OFF");
	            }
	        }
	    });
		
		JToggleButton toggleButton_4 = new JToggleButton("ON");
		toggleButton_4.setSelected(true);
		toggleButton_4.setBorder(null);
		toggleButton_4.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton_4.isSelected()){
	                toggleButton_4.setText("ON");
	            } else {
	                toggleButton_4.setText("OFF");
	            }
	        }
	    });
		
		JToggleButton toggleButton_5 = new JToggleButton("ON");
		toggleButton_5.setSelected(true);
		toggleButton_5.setBorder(null);
		toggleButton_5.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (toggleButton_5.isSelected()){
	                toggleButton_5.setText("ON");
	            } else {
	                toggleButton_5.setText("OFF");
	            }
	        }
	    });
		

		frame.add(btnAnd);
		btnAnd.setBounds(140, 40, 80, 30);
		
		frame.add(btnOr);
		btnOr.setBounds(220, 40, 80, 30);
		
		frame.add(btnNot);
		btnNot.setBounds(300, 40, 80, 30);
		
		frame.add(btnNand);
		btnNand.setBounds(380, 40, 80, 30);
		
		frame.add(btnNor);
		btnNor.setBounds(460, 40, 80, 30);
		
		frame.add(btnXand);
		btnXand.setBounds(540, 40, 80, 30);
		
		frame.add(btnXor);
		btnXor.setBounds(620, 40, 80, 30);

		frame.add(toggleButton);
		toggleButton.setBounds(150, 115, 30, 30);
	
		frame.add(toggleButton_1);
		toggleButton_1.setBounds(150, 175, 30, 30);
		
		frame.add(toggleButton_2);
		toggleButton_2.setBounds(150, 235, 30, 30);
		
		frame.add(toggleButton_3);
		toggleButton_3.setBounds(150, 295, 30, 30);
		
		frame.add(toggleButton_4);
		toggleButton_4.setBounds(150, 355, 30, 30);
		
		frame.add(toggleButton_5);
		toggleButton_5.setBounds(150, 415, 30, 30);
		
		
		//draw rec
		for (int i=0;i<6;i++) {
			for (int j=1;j<4;j++) {

					new DrawRec(frame,313 + ((j-1)*157), 141 + (i*60),"off");
			}
		}
		
		
		JButton btnRun = new JButton("RUN");
		btnRun.setBackground(new Color(255, 51, 51));
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (toggleButton.isSelected()) Main.BinArr[0][0]=1;
				else Main.BinArr[0][0]=0;
				if (toggleButton_1.isSelected()) Main.BinArr[1][0]=1;
				else Main.BinArr[1][0]=0;
				if (toggleButton_2.isSelected()) Main.BinArr[2][0]=1;
				else Main.BinArr[2][0]=0;
				if (toggleButton_3.isSelected()) Main.BinArr[3][0]=1;
				else Main.BinArr[3][0]=0;
				if (toggleButton_4.isSelected()) Main.BinArr[4][0]=1;
				else Main.BinArr[4][0]=0;
				if (toggleButton_5.isSelected()) Main.BinArr[5][0]=1;
				else Main.BinArr[5][0]=0;

				new Run_Handler(frame);
			}
		});
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(255, 255, 51));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				java.awt.Graphics gr = frame.getGraphics(); 
				
				gr.clearRect(183, 130, 130, 350);
				gr.clearRect(343, 130, 127, 350);
				gr.clearRect(500, 130, 127, 350);
			
				Main.BinArr=new int[6][4];
				Main.GateArr = new String [6][3];
				Main.GatesInput = new int[6][3][2];
				
				
				for (int i=0;i<6;i++) {
					for (int j=1;j<4;j++) {
							new DrawRec(frame,313 + ((j-1)*157), 141 + (i*60),"off");
							
					}
				}
				
				

			}
		});
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(62, 85, 198));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		
		
		frame.add(btnRun);
		btnRun.setBounds(20, 100, 80, 30);
		
		frame.add(btnReset);
		btnReset.setBounds(20, 150, 80, 30);
		
		frame.add(btnClose);
		btnClose.setBounds(20, 200, 80, 30);
		
		

		}
	
	
	
	
	
	
	
	
}



//////////////////////////////////////////////////////////////





