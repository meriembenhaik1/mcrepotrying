package mc;

public class Voiture {
private String modele;
private String couleur;
private int matricule;

public Voiture(String modele, String couleur, int matricule) {
	super();
	this.modele = modele;
	this.couleur = couleur;
	this.matricule = matricule;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
@Override
public String toString() {
	return "Voiture [modele=" + modele + ", couleur=" + couleur + ", matricule=" + matricule + "]";
}


}
