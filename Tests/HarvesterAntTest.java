import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  Tests for methods in HarvesterAnt class
 *
 *  @author Quan Nguyen
 *  @version 2018.04.23
 */
public class HarvesterAntTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HarvesterAntTest test object.
     */
    public HarvesterAntTest()
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
     * test if HarvesterAnt is created
     */
    public void testHarvester()
    {
        colony.setSelectedActor(HarvesterAnt.class);
        colony.onTouchDown(1, 3);
        HarvesterAnt harvester = 
            colony.getOneObjectAt(1, 3, HarvesterAnt.class);
        assertEquals(3, harvester.getGridY());
        assertEquals(1, harvester.getGridX());
    }

    /**
     * test if HarvesterAnt add food
     */
    public void testHarvester2()
    {
        colony.setSelectedActor(HarvesterAnt.class);
        colony.onTouchDown(1, 3);
        assertEquals(8, colony.getFood());
        run(colony, 50);
        assertEquals(9, colony.getFood());
    }
}
