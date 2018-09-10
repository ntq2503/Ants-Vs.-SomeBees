import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  Tests for methods in HungryAnt Class
 *  
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class HungryAntTest extends TestCase
{
    //~ Fields ................................................................
    private Colony colony;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HungryAntTest test object.
     */
    public HungryAntTest()
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
     * test if hungry ant is created
     */
    public void testHungryAnt()
    {
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(2, 1);        
        assertEquals(1, colony.getObjects(HungryAnt.class).size());
    }

    /**
     * test if Hungry Ant eats bee
     */
    public void testHungryAnt2()
    {
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(2, 1);
        colony.add(new Bee(), 3, 1);
        run(colony, 300);
        assertEquals(0, colony.getObjects(Bee.class).size());
        assertEquals(1, colony.getObjects(HungryAnt.class).size());
    }

    /**
     * test if hungry ant does not digest a bee in time
     * to eat another bee
     */
    public void testHungryAnt3()
    {
        colony.setSelectedActor(HungryAnt.class);
        colony.onTouchDown(2, 1);
        colony.add(new Bee(), 2, 1);
        colony.add(new Bee(), 3, 1);
        run(colony, 300);
        assertEquals(1, colony.getObjects(Bee.class).size());
        assertEquals(0, colony.getObjects(HungryAnt.class).size());
    }
}
