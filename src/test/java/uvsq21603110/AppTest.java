package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void initMetier(){
        UneClasseMetier m = new UneClasseMetier("Bob");
        assertTrue(m != null);
    }

    @Test
    public void testAffichage(){
        UneClasseMetier m = new UneClasseMetier("Bob");
        m.afficher();
    }
}
