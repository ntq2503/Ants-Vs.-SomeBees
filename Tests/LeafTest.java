import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  test for methods in Leaf class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class LeafTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new LeafTest test object.
     */
    public LeafTest()
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
     * test if leaf attacks bee
     */
    public void testLeaf()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(1, 4);
        Bee bee = new Bee();
        colony.add(bee, 3, 4);  
        run(colony, 200);
        assertEquals(2, bee.getHealth());
    }

    /**
     * test if leaf is removed when out of range
     */
    public void testLeaf2()
    {
        colony.setSelectedActor(ThrowerAnt.class);
        colony.onTouchDown(8, 4);
        run(colony, 200);
        assertEquals(0, colony.getObjects(Leaf.class).size());
    }
}
