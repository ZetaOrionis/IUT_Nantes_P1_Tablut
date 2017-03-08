public class Interface{

		//attributs
	private boolean plateau_affiche;
	private boolean pseudo1_affiche;
	private boolean pseudo2_affiche;
	private boolean score1_affiche;
	private boolean score2_affiche;


		//constructeur
	public Interface(){
		plateau_affiche=false;
		pseudo1_affiche=false;
		pseudo2_affiche=false;
		score1_affiche=false;
		score2_affiche=false;
	}


		//methodes
	public String afficherPlateau(){
		String affiche = " --- --- --- --- --- --- --- --- ---\n";
		//remplacer R et tout par plateau.afficherCase(x, y)
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|"+" m "+"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" s "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" s "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+" m "+"|"+" m "+"|"+" s "+"|"+" s "+"|"+" R "+"|"+" s "+"|"+" s "+"|"+" m "+"|"+" m "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" s "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" s "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		affiche = affiche +"|"+"   "+"|"+"   "+"|"+"   "+"|"+" m "+"|"+" m "+"|"+" m "+"|"+"   "+"|"+"   "+"|"+"   "+"|\n";
		affiche = affiche +" --- --- --- --- --- --- --- --- ---\n";
		return affiche;
	}

}
