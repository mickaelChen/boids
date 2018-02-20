

public class TestBoids {
	public static void main(String args[]){
		int n = 100;
		//Regle[] r = {new RegleAleatoire()};
		//Regle[] r = {new RegleAttraction(50), new RegleAleatoire()};
		//Regle[] r = {new RegleAttraction(50)};
		//Regle[] r = {new RegleAttraction(50), new RegleRepulsion(4)};
		Regle[] r = {new RegleAttraction(50),new RegleRepulsion(2), new RegleOrientation(40)};
		Individu[] boids = new Individu[n];
		for (int i = 0; i < n; i++){
			boids[i] = new Individu(r);
		}
		Population pop = new Population(boids);
		int size = 250;
		SimpleInterface ui = new SimpleInterface("Boids",500,500);
		ui.createArea(size,size);
		ui.refresh();
		while (true){
			pop.etatSuivant();
			SimpleInterface.pause(10);
			ui.clear();
			for (int i=0; i<pop.getSize(); i++){
				int x = (int)Math.round(pop.get(i).getPosX());
				int y = (int)Math.round(pop.get(i).getPosY());
				if (x >= -size/2 && y >= -size/2 &&
						x < size/2 && y < size/2)
					ui.setRGB(x+size/2, y+size/2, new int[]{255,255,255});
			}
			ui.refresh();
		}
	}
}
