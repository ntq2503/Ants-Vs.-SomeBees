import sofia.micro.*;
import sofia.util.Random;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
/**
 *  Methods for Hive
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class Hive extends Actor
{
    //~ Fields ................................................................
    private int count = 400;
    private int bee;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Hive object.
     */
    public Hive()
    {        
        bee = 30;
    }

    //~ Methods ...............................................................
    /**
     * @return number of bees in hive
     */
    public int getBees()
    {
        return bee;
    }

    /**
     * set number of bees
     * @param x number of bees
     */
    public void setBees(int x)
    {
        bee = x;
    }

    /**
     * behavior of hive
     */
    public void act()
    {       
        count--;
        if (count == 0) {            
            int y = Random.generator().nextInt(5);
            getWorld().add(new Bee(), 9, y + 1);
            count = Random.generator().nextInt(321) + 80;
            bee = bee - 1;
        }        
    }        
}

