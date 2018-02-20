import java.util.ArrayList;


public class RegleOrientation extends Regle {
	
	public RegleOrientation(double r) {
		super(r);
	}
	
	@Override
	public Vecteur direction(Individu source, Population pop) {
		ArrayList<Individu> voisins = pop.voisinage(source, getRayon());
		if (voisins.size() == 0)
			return source.getVitesse();
		double cX = 0;
		double cY = 0;
		for (Individu v: voisins){
			cX += v.getVitesse().getX();
			cY += v.getVitesse().getY();
		}
		cX /= voisins.size();
		cY /= voisins.size();
		return new Vecteur(cX, cY);
	}

}
