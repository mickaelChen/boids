
public class Vecteur {
	private double x;
	private double y;
	
	public Vecteur(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Vecteur(){
		this(Math.random()*2-1, Math.random()*2-1);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public Vecteur addition(Vecteur v){
		return new Vecteur(x + v.x, y+v.y);
	}
	
	public double norme(){
		return Math.sqrt(x*x + y*y);
	}
	
	public Vecteur division(double d){
		return new Vecteur(x/d, y/d);
	}
		
	public String toString(){
		return "("+x+";"+y+")";
	}
}
