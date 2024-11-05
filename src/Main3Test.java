import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main3Test {

    @Test
    public void testParallelepiped() {
        Parallelepiped p = new Parallelepiped(2, 3, 4);
        assertEquals(52.0, p.surfaceArea(), 1e-9);
        assertEquals(24.0, p.volume(), 1e-9);
        assertEquals("Parallelepiped [Length=2,00, Width=3,00, Height=4,00, Surface Area=52,00, Volume=24,00]", p.toString());
    }

    @Test
    public void testBall() {
        Ball b = new Ball(5);
        assertEquals(314.1592653589793, b.surfaceArea(), 1e-9);
        assertEquals(523.5987755982989, b.volume(), 1e-9);
        assertEquals("Ball [Radius=5,00, Surface Area=314,16, Volume=523,60]", b.toString());
    }

    @Test
    public void testParallelepipedEquality() {
        Parallelepiped p1 = new Parallelepiped(2, 3, 4);
        Parallelepiped p2 = new Parallelepiped(2, 3, 4);
        assertEquals(p1, p2);
    }

    @Test
    public void testBallEquality() {
        Ball b1 = new Ball(5);
        Ball b2 = new Ball(5);
        assertEquals(b1, b2);
    }

    @Test
    public void testParallelepipedInequality() {
        Parallelepiped p1 = new Parallelepiped(2, 3, 4);
        Parallelepiped p2 = new Parallelepiped(3, 4, 5);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testBallInequality() {
        Ball b1 = new Ball(5);
        Ball b2 = new Ball(6);
        assertNotEquals(b1, b2);
    }
}
