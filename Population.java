import java.util.ArrayList;


public class Population {
	private Individu[] individus;
	
	public Population(Individu[] boids){
		this.individus = boids;
	}
	
	public Individu get(int i){
		return individus[i];
	}
	
	public int getSize(){
		return individus.length;
	}
	
	public ArrayList<Individu> voisinage(Individu source, double rayon){
		ArrayList<Individu> voisins = new ArrayList<Individu>();
		for (int i = 0; i < individus.length; i++){
			Individu cible = individus[i]; 
			if (cible != source){
				if (source.distance(cible) < rayon)
					voisins.add(individus[i]);
			}
		}
		return voisins;
	}
	
	public void etatSuivant(){
		for (int i = 0; i < individus.length; i++){
			individus[i].deplacer(this);
		}	
	}
}