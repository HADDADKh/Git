
public class arbre {
	private arbre droit, gauche;
	private int value;
	
 public arbre(arbre droit, arbre gauche, int value) {
		super();
		this.droit = droit;
		this.gauche = gauche;
		this.value = value;
	}

private arbre find (int numbre)
 {
	 
	arbre nodecur = this;
	while ((nodecur!=null) && (nodecur.value!= numbre))
	{
	nodecur = numbre>nodecur.value ?nodecur.droit : nodecur.gauche;
	}
	 
	 return nodecur;
 }
	

}
