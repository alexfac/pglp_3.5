package uvsq21603110;

import java.time.LocalDateTime;

public class UneClasseMetier implements Affichage {

    private String nom;

    public UneClasseMetier(String nom){
        this.nom = nom;
    }

    @Override
    public void afficher() {
        System.out.println(LocalDateTime.now() + " : Debut");
        System.out.println(LocalDateTime.now() + " : Fin");
    }
}
