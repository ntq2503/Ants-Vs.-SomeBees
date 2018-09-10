import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 * methods for HungryAnt
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class HungryAnt extends Ant
{
    //~ Fields ................................................................
    private int count = 0;
    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Hungry object.
     */
    public HungryAnt()
    {
        super(1, 5);
    }

    //~ Methods ...............................................................
    /**
     * behavior of hungry ant
     */
    public void act()
    {
        Bee bee = this.getOneIntersectingObject(Bee.class);
        if (bee != null && count == 0) {
            bee.remove();
            count = 240;
        }
        if (count > 0) {
            count--;
        }
    }
}
