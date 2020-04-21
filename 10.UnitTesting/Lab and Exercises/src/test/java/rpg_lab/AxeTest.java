package rpg_lab;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AxeTest {

    @Test
    public  void weapon_attacks_loses_durability(){
      // Given
        Axe axe = new Axe(42,3);
        Dummy dummy = new Dummy(1,1);
        // WHEN
        axe.attack(dummy);
        // THEN
        Assert.assertEquals(2,axe.getDurabilityPoints());
    }

    @Test
    public  void weapon_attacks_damages_target(){
        // Given
        Axe axe = new Axe(5,1);
        Dummy dummy = new Dummy(7,1);
        // WHEN
        axe.attack(dummy);
        // THEN
        Assert.assertEquals(2,dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
        public void broken_weapon_cannot_attack(){
        Axe axe = new Axe(42,0);
        Dummy dummy = new Dummy(1,1);
        // WHEN
        axe.attack(dummy);
        // THEN Exception should be thrown.
    }
}