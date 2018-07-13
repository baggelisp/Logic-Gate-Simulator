package Logic_gate_sim;

import javax.swing.JFrame;

public class Run_Handler {
	
	  public void operate(){
		 
	  }
	
	public Run_Handler(JFrame frame){
		int i, j,i1,i2,a;
		
		//check

		for(i = 0; i < 3; i++) {
		    for(j = 0; j < 6; j++) {
		    	
		    	if (Main.GateArr[j][i]!=null)  {
		    		
		    		i1=Main.GatesInput[j][i][0];

	    			i2=Main.GatesInput[j][i][1];	
	    			
	    			//ama prin apo tin eisodo tis pulis den uparxei allh puli proxwra
	    			
	    			if (i>0){
	    				if ((Main.GateArr[j][i]=="NOT") && (Main.GateArr[i1][i-1]==null)) continue; //ama einai not tsekare mono tin mia eisodo
	    				
	    				else if ((Main.GateArr[j][i]!="NOT") & ((Main.GateArr[i1][i-1]==null) | (Main.GateArr[i2][i-1]==null))) continue;
	    			} // return an den uparxei puli prin
		    	
	    			
	    			
		    		switch (Main.GateArr[j][i]){
		    	
		    		case "AND":		    		
		    			a=Gates.And(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "OR":	    		
		    			a=Gates.Or(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "NOT":
		    			a=Gates.Not(Main.BinArr[i1][i]);
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "NAND":
		    			a=Gates.Nand(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "NOR":
		    			a=Gates.Nor(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "XOR":
		    			a=Gates.Xor(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		case "XNOR":
		    			a=Gates.Xnor(Main.BinArr[i1][i],Main.BinArr[i2][i]);	
		    			Main.BinArr[j][i+1]=a;
		    			break;
		    		}
		    	}//telos if !=null
		    }
		    
		    
		    
		    
		    
		    
		    
		}
		
	
		
		for (i=0;i<6;i++) {
			for (j=1;j<4;j++) {
		
				if (Main.BinArr[i][j]==1) {
					new DrawRec(frame,313 + ((j-1)*157), 141 + (i*60),"on");
				}
				else
					new DrawRec(frame,313 + ((j-1)*157), 141 + (i*60),"off");
			}
			
		}
		
		
		/*
		//print
		for (i=0;i<6;i++) {
			for (j=0;j<4;j++) {
				System.out.print(Main.BinArr[i][j]);
			}
			System.out.println("");
		}
		for (i=0;i<6;i++) {
			for (j=0;j<3;j++) {
				System.out.print(Main.GateArr[i][j]);
			}
			System.out.println("");
		}
		*/
		
		
		
	}

}
