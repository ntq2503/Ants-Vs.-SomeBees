import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  Methods for all types of Ant
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class Ant extends Actor
{
    //~ Fields ................................................................
    private int health;
    private int cost;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Ant object.
     * @param health health of ant
     * @param cost food cost of ant
     */
    public Ant(int health, int cost)
    {
        this.health = health;
        this.cost = cost;
    }

    //~ Methods ...............................................................
    /**
     * get health of ant
     * @return ant's health
     */
    public int getHealth()
    {
        return health;
    }
    /**
     * get food cost of ant
     * @return ant's food cost
     */
    public int getFoodCost()
    {
        return cost;
    }
    /**
     * reduce ant's health
     * remove if health = 0
     * @param x amount of health's reduction
     */
    public void injure(int x)
    {
        health -= x;       
        if (health  <= 0)
        {            
            this.remove();
        }        
    }
}
