package Logic_gate_sim;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;
public class DrawRec extends JFrame {

	private static final long serialVersionUID = 1L;

	public DrawRec(JFrame frame,int x,int y,String c) {
		java.awt.Graphics gr = frame.getGraphics(); 
		Graphics2D g2 = (Graphics2D) gr;
	    super.paint(g2);

	    
	    Color col=new Color(0,0,0);
	    
	    if (c.equals("on")) {col=new Color(255,255,0);}
	    else if(c.equals("off")) {g2.setColor(col);}

		g2.setColor(col);
		g2.fillRect(x, y, 30, 30);	
		
		
		
	  }
	
}
