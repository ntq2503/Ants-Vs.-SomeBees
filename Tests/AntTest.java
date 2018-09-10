import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  Test methods in Ant Class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class AntTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new AntTest test object.
     */
    public AntTest()
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
    /*# Insert your own test methods here */
    /**
     * test if ant is removed when health = 0
     */
    public void testInjure1()
    {
        colony.setSelectedActor(HarvesterAnt.class);
        colony.onTouchDown(2, 2);
        HarvesterAnt ant = 
            colony.getOneObjectAt(2, 2, HarvesterAnt.class);
        ant.injure(1);
        assertEquals(0, colony.getObjects(HarvesterAnt.class).size());
    }

    /**
     * test if ant health decreases when injured
     */
    public void testInjure2()
    {
        colony.setSelectedActor(WallAnt.class);
        colony.onTouchDown(2, 2);
        WallAnt ant = 
            colony.getOneObjectAt(2, 2, WallAnt.class);
        ant.injure(1);
        assertEquals(3, ant.getHealth());
    }
}
