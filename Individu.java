public class Individu{
	private static int compteur = 0;
	private int identifiant;
	private double posX, posY;
	private Vecteur vitesse;
	private Regle[] regles;
	
	public Individu(Regle[] regles){
		compteur++;
		identifiant = compteur;
		posX = Math.random()*200 - 100;
		posY = Math.random()*200 - 100;
		vitesse = new Vecteur();
		this.regles = regles;
	}
	
	public double getPosX(){
		return posX;
	}
	
	public double getPosY(){
		return posY;
	}
	
	public Vecteur getVitesse(){
		return vitesse;
	}
	
	public String toString(){
		return identifiant + " p:" + "(" + posX + ";" + posY + ") v:" + vitesse;  
	}
	
	public double distance(Individu b){
		return Math.sqrt( Math.pow((b.getPosX() - posX),2) + Math.pow((b.getPosY() - posY),2));
	}
	
	public void deplacer(Population pop){
		for (int i = 0; i < regles.length; i++){
			vitesse = vitesse.addition(regles[i].direction(this, pop));
		}
		if (vitesse.norme() > 1){
			vitesse = new Vecteur(vitesse.getX()/vitesse.norme(), vitesse.getY()/vitesse.norme());
		}
		posX += vitesse.getX();
		posY += vitesse.getY();
	}
}
