import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  Test methods for Thrower Ant
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class ThrowerAntTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ThrowerAntTest test object.
     */
    public ThrowerAntTest()
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
     * test if thrower is created
     */
    public void testThrower()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(5, 4);        
        assertEquals(1, colony.getObjects(ThrowerAnt.class).size());        
    }

    /**
     * test if thrower throws leaf
     */
    public void testThrower2()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(5, 4);
        run(colony, 150);
        assertEquals(1, colony.getObjects(Leaf.class).size());
    }
}
