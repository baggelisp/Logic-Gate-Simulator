package Logic_gate_sim;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel; 

public class Place_gate extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static JLabel l1;


	public Place_gate(String g,int c,int i1,int i2,int out,JFrame frame) throws IOException {

		java.awt.Graphics gr = frame.getGraphics(); 
		super.paint(gr);
		
		int red = (int) (Math.random() * (150- 0)) + 0;
		int green = (int) (Math.random() * (150- 0)) + 0;
		int blue = (int) (Math.random() * (150- 0)) + 0;
		Color color=new Color(red,green,blue);
		gr.setColor(color);
		
		if (!(Main.GateArr[out-1][c-1]==null)) {new Error_Message("Try another place"); return;}
		
		Main.GateArr[out-1][c-1]=g;
		Main.GatesInput[out-1][c-1][0]=i1-1;
		
		if (g=="NOT") i2=-1;
		else Main.GatesInput[out-1][c-1][1]=i2-1; //an einai not min bale -1 sto i2
		
		
		switch (g) {

		case "AND":	
			Image img1;
			img1 = ImageIO.read(new File("images\\ANDGate.jpg"));
	 
			place(c,out,img1,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "OR":
			Image img2 = ImageIO.read(new File("images\\ORGate.jpg"));	   
			place(c,out,img2,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "NOT":
			Image img3 = ImageIO.read(new File("images\\NOTGate.jpg"));	   	   
			place(c,out,img3,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "NAND":
			Image img4 = ImageIO.read(new File("images\\NANDGate.jpg"));	      
			place(c,out,img4,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "NOR":
			Image img5 = ImageIO.read(new File("images\\NORGate.jpg"));	   	   
			place(c,out,img5,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "XOR":
			Image img6 = ImageIO.read(new File("images\\XORGate.jpg"));	   	   
			place(c,out,img6,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		case "XNOR":
			Image img7 = ImageIO.read(new File("images\\XNORGate.jpg"));	   	   
			place(c,out,img7,gr);	
			make_lines(gr,c,i1,i2,out,frame);
			break;	
		}
		

	
	}//telos constractor
	
	
	void place(int col,int output,Image img,Graphics g){
		int x,y;
		x=0;y=0;
		if (col==1) x=215;
		else if (col==2) x=375;
		else if (col==3) x=540;
		y=72 + (60*output);
		g.drawImage(img, x, y, null);
		
		
	}


	void make_lines(Graphics g,int col,int input1,int input2,int out,JFrame frame) {
		
		
		g.drawLine(100+col*168, 96+60*out, 153+col*159, 96+60*out); //grammi eksodou
		
		if (input2==-1) {g.drawLine(21+col*160,96+60*input1,60+col*160,96+60*out);return;} //grammi gia to NOT
		
		g.drawLine(20+col*160,97+60*input1,56+col*162,79+out*60); //proti grammi
		
		g.drawLine(20+col*160,97+60*input2,56+col*162,110+out*60); //deuteri grammi
		

	} //telos methodou
	
	
	public static void remove_label(JFrame frame) {
		l1.setIcon(null);
		frame.remove(l1);
	}
	
}
