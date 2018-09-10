import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 * test for methods in Hive class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class HiveTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new HiveTest test object.
     */
    public HiveTest()
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
     * test if hive generates bee
     */
    public void testHive()
    {
        run(colony, 400);        
        assertEquals(1, colony.getObjects(Bee.class).size());
    }

    /**
     * test setting number of bees
     */
    public void testSetBees()
    {
        Hive hive = new Hive();
        colony.add(hive, 9, 3);
        hive.setBees(1);
        assertEquals(1, hive.getBees());
    }
}
