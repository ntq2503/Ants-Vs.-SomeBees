import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  method for QueensChamber
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class QueensChamber extends Actor
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new QueensChamber object.
     */
    public QueensChamber()
    {
        //This constructor does not do anything//
    }

    //~ Methods ...............................................................
    /**
     * behavior of QueensChamber
     */
    public void act()
    {
        Bee bee = getOneIntersectingObject(Bee.class);
        if (bee != null) {
            ((Colony) getWorld()).lose();
        }
    }
}
