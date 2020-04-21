package rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class DummyTests {

    @Test
    public void dummy_loses_health_if_attacked(){
        //GIVEN
        Dummy dummy = new Dummy(10,1);
        //WHEN
        dummy.takeAttack(3);
        //THEN
        Assert.assertEquals(7,dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void dead_dummy_throws_exception_when_attacked(){
        //GIVEN
        Dummy aDeadDummy = new Dummy(0,1);
        //WHEN
        aDeadDummy.takeAttack(3);
        //THEN expect exception
    }

    @Test
    public void dead_dummy_can_give_xp(){
        //GIVEN
        Dummy aDeadDummy = new Dummy(0,1);
        //WHEN
        int xp = aDeadDummy.giveExperience();
        //THEN
        Assert.assertEquals(1,xp);
    }

    @Test(expected = IllegalStateException.class)
    public void alive_dummy_cant_give_xp(){
        //GIVEN
        Dummy aDeadDummy = new Dummy(1,1);
        //WHEN
        aDeadDummy.giveExperience();
        //THEN exception should be thrown.
    }
}