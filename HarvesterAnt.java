import sofia.micro.*;

//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
/**
 *  methods for HarvesterAnt
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class HarvesterAnt extends Ant
{
    //~ Fields ................................................................
    private int count = 0;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Harvester object.
     */
    public HarvesterAnt()
    {
        super(1, 2);
    }

    //~ Methods ...............................................................
    /**
     * behavior of harvester ant
     */
    public void act()
    {
        count++;        
        if (count % 40 == 0) {
            ((Colony) getWorld()).addFood(1);
        }
    }
}
