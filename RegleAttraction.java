import java.util.ArrayList;


public class RegleAttraction extends Regle {
	
	public RegleAttraction(double r) {
		super(r);
	}

	public RegleAttraction() {
		super(Double.MAX_VALUE);
	}
	
	@Override
	public Vecteur direction(Individu source, Population pop) {
		ArrayList<Individu> voisins = pop.voisinage(source, getRayon());
		if (voisins.size() == 0)
			return source.getVitesse();
		double cX = 0;
		double cY = 0;
		for (Individu v: voisins){
			cX += v.getPosX();
			cY += v.getPosY();
		}
		cX /= voisins.size();
		cY /= voisins.size();
		return new Vecteur((cX - source.getPosX())/100, (cY - source.getPosY())/100);
	}

}
