import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  methods for leaf
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class Leaf extends Actor
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Leaf object.
     */
    public Leaf()
    {
        /*# Do any work to initialize your class here. */
    }

    //~ Methods ...............................................................
    /**
     * move method for leaf
     */
    public void move()
    {
        move(0.025);
    }

    /**
     * behavior for leaf
     */
    public void act()
    {
        Bee bee = getOneIntersectingObject(Bee.class);
        if (bee == null && getGridX() != 9) {
            this.move();            
        }
        else if (bee != null) {
            bee.injure(1);
            this.remove();
        }
        else {
            this.remove();
        }
    }
}
