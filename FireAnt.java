import sofia.micro.*;
import java.util.List;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
/**
 *  methods for Fire Ant
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class FireAnt extends Ant
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Fire object.
     */
    public FireAnt()
    {
        super(1, 4);
    }

    //~ Methods ...............................................................
    /**
     *  behavior of FireAnt
     */
    public void act()
    {        
        List<Bee> bees = getObjectsInRange(1, Bee.class);
        if (this.getOneIntersectingObject(Bee.class) != null) {
            for (Bee bee : bees)
            {
                bee.remove();
            }       
            this.remove();     
        }
    }
}
