import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  methods for bees
 *  
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class Bee extends Actor
{
    //~ Fields ................................................................
    private int health;
    private int count = 0;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Bee object.
     */
    public Bee()
    {
        this.turn(180);
        this.health = 3;
    }

    //~ Methods ...............................................................
    /**
     * bee's health
     * @return health of bee
     */
    public int getHealth()
    {       
        return health;
    }

    /**
     * reduce bee's health
     * remove if health = 0
     * @param x amount of health reduction
     */
    public void injure(int x)
    {
        health -= x;       
        if (health  <= 0)
        {            
            this.remove();
        }      
    }

    /**
     * how fast bee moves
     */
    public void move()
    {
        super.move(0.0125);
    }

    /**
     * behavior of bees
     */
    public void act()
    {
        Ant ant = getOneIntersectingObject(Ant.class);
        if (ant != null) { 
            count++;            
            if (count % 40 == 0) {
                ant.injure(1);
            }
        }
        else {
            move();
        }
    }
}
