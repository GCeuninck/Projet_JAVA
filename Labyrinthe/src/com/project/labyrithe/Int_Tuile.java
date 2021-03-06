package com.project.labyrithe;

public interface Int_Tuile {
	
    public void Rotation(int rotation);
    public boolean estAccessible(Plateau plateau_jeu, Integer x, Integer y);
    public boolean[] getAccess();
    public boolean getJoueur(Joueur J);
    public String getTresor();
    public Integer[] getCoord();
    public void copieCoord(Int_Tuile tuile);
    public void setCoord(Integer x_coord, Integer y_coord);
    public int getId();
    public boolean isSpecial();
    public boolean isRotation();
    public boolean isDepart();
    public boolean isEchange();
    public void Action(Jeu jeu);
    public void afficherTuile();
    public int getRotation();
}
