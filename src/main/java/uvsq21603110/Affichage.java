package uvsq21603110;

import java.time.LocalDateTime;

public abstract class Affichage {

    public Affichage(){

    }

    public void afficher(){
        System.out.println(LocalDateTime.now() + " : Debut");
        System.out.println(LocalDateTime.now() + " : Fin");
    }
}
