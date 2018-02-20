
public class TestVecteur {
	public static void main(String args[]){
		Vecteur v1 = new Vecteur(1.5,2.5);
		Vecteur v2 = new Vecteur(2.5,4.5);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.addition(v2));
		System.out.println(v1.norme());
		System.out.println(v2.division(v2.norme()).norme());
	}
}
