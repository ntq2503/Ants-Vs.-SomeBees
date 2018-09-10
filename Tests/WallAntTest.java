import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  test for methods in WallAnt class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class WallAntTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new WallAntTest test object.
     */
    public WallAntTest()
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
        /*# Insert your own setup code here */
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * test if wall ant is created
     */
    public void testWallAnt()
    {
        Colony colony = new Colony();
        colony.setSelectedActor(WallAnt.class);
        colony.onTouchDown(7, 1);
        assertEquals(1, colony.getObjects(WallAnt.class).size());
    }
}
