import sofia.micro.*;
// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
/**
 * Tests for methods in Colony class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class ColonyTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ColonyTest test object.
     */
    public ColonyTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        colony = new Colony();
    }

    // ----------------------------------------------------------

    /**
     * test if colony calls win() method
     */
    public void testWin()
    {
        colony.addFood(50);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 1);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 2);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 3);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 4);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 5);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(2, 1);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(2, 2);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(2, 3);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(2, 4);
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(2, 5);
        run(colony, 10000);
        assertEquals(0, colony.getObjects(Bee.class).size());
    }

    /**
     * test onTouchDown out of range
     */
    public void testOnTouchDown1()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(0, 1);   
        assertEquals(0, colony.getObjects(ThrowerAnt.class).size());
    }

    /**
     * test onTouchDown out of range
     */
    public void testOnTouchDown2()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(9, 1);   
        assertEquals(0, colony.getObjects(ThrowerAnt.class).size());
    }

    /**
     * test onTouchDown out of range
     */
    public void testOnTouchDown3()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(4, 0);   
        assertEquals(0, colony.getObjects(ThrowerAnt.class).size());
    }

    /**
     * test onTouchDown out of range
     */
    public void testOnTouchDown4()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(4, 6);   
        assertEquals(0, colony.getObjects(ThrowerAnt.class).size());
    }

    /**
     * test onTouchDown with not enough food
     */
    public void testOnTouchDown5()
    {
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(3, 1);  
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(2, 1); 
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(1, 1);  
        assertEquals(2, colony.getObjects(HungryAnt.class).size());
    }
}
