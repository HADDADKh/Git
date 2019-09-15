
public class firstexp {
private int N1, N2;

public firstexp(int n1, int n2) {
	super();
	N1 = n1;
	N2 = n2;
}

public int somme()
{
	return this.N1+this.N2;
}

public static void main(String args[]) {
	firstexp f1=new firstexp(5, 5);
	System.out.println(f1.somme());
	
}
}
