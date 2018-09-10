import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  methods for thrower ant
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class ThrowerAnt extends Ant
{
    //~ Fields ................................................................
    private int count = 0;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Thrower object.
     */
    public ThrowerAnt()
    {
        super(1, 4);
    }

    //~ Methods ...............................................................
    /**
     * behavior of ThrowerAnt
     */
    public void act()
    {
        count++;        
        if (count % 120 == 0) {
            Leaf leaf = new Leaf();
            getWorld().add(leaf, this.getGridX(), this.getGridY());
        }        
    }
}
