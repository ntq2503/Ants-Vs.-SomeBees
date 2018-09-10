import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  Tests for methods in FireAnt class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class FireAntTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FireAntTest test object.
     */
    public FireAntTest()
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
     * test if a fire ant is created
     */
    public void testFireAnt()
    {
        colony.setSelectedActor(FireAnt.class);
        colony.onTouchDown(2, 3);
        run(colony, 20);
        assertEquals(1, colony.getObjects(FireAnt.class).size());
    }

    /**
     * test if a fire ant explode
     */
    public void testFireAnt2()
    {
        colony.setSelectedActor(FireAnt.class);
        colony.onTouchDown(2, 3);
        colony.add(new Bee(), 3, 3);
        run(colony, 100);
        assertEquals(0, colony.getObjects(FireAnt.class).size());
        assertEquals(0, colony.getObjects(Bee.class).size());
    }
}