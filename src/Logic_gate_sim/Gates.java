package Logic_gate_sim;

public class Gates {

	public static int And(int i1,int i2) {
		return (i1 & i2);
	}
	
	public static int Or(int i1,int i2) {
		return (i1 | i2);	
	}
	
	public static int Not(int i1) {
		if (i1==1) return 0;
		else return 1;	
	}
	
	public static int Nand(int i1,int i2) {
		if ((i1==1) && (i2==1)) return 0;
		else return 1;	
		
	}
	
	public static int Nor(int i1,int i2) {
		if ((i1==1) || (i2==1)) return 0;
		return 1;	
	}
	
	public static int Xor(int i1,int i2) {
		if ((i1==1) && (i2==1)) return 0;
		else if ((i1==1) || (i2==1)) return 1;
		return 0;	
	}
	
	public static int Xnor(int i1,int i2) {
		if ((i1==1) && (i2==1)) return 1;
		else if ((i1==1) || (i2==1)) return 0;
		return 1;	
	}

}
