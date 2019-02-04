import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottleTest {
    Bottle bottle;
    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(100, bottle.getVolume());
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmpty(){
        assertEquals(100, bottle.getVolume());
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void cantDrinkWhenEmpty(){
        assertEquals(100, bottle.getVolume());
        bottle.empty();
        assertEquals(0, bottle.getVolume());
        bottle.drink();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFill(){
        assertEquals(100, bottle.getVolume());
        bottle.empty();
        assertEquals(0, bottle.getVolume());
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
