
public class TestIndividu {
	public static void main(String args[]){
		Regle[] r = {new RegleAleatoire()};
		Individu i1 = new Individu(r);
		Individu i2 = new Individu(r);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1.distance(i2));
		i2.deplacer(null);
		System.out.println(i2);
	}
}
