import java.util.ArrayList;


public class RegleRepulsion extends Regle {
	
	public RegleRepulsion(double r) {
		super(r);
	}

	public RegleRepulsion() {
		super(1);
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
		return new Vecteur(source.getPosX() - cX, source.getPosY() - cY);
	}

}
