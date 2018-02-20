
public abstract class Regle {
	private double rayon;
	
	public Regle(double r){
		rayon = r;
	}

	public double getRayon(){
		return rayon;
	}
	
	public abstract Vecteur direction(Individu source, Population pop);
}
