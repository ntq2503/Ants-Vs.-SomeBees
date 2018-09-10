import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
//-------------------------------------------------------------------------
/**
 *  methods for colony class
 *
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class Colony extends HomeBase
{
    //~ Fields ................................................................
    private int food;
    private Hive hive;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Colony object.
     */
    public Colony()
    {
        super();

        // Add the queen's chamber and hive to the world here

        // Lay out the ant choices the player can click on in the
        // method call commented out below.  As you add ants, you
        // can add them to this list, so you have a playable
        // version of your game to try out, no matter how much
        // you have left to finish.

        hive = new Hive();
        this.add(hive, 9, 3);

        QueensChamber qc = new QueensChamber();
        this.add(qc, 0, 3);
        food = 10;

        setActorChoices(
            HarvesterAnt.class,
            ThrowerAnt.class,
            WallAnt.class,
            FireAnt.class,
            HungryAnt.class);                    
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Add an ant to the screen when a specific location is clicked.
     * This method is automatically called while the simulation is
     * running, whenever the user clicks on (or taps on) a location
     * in the colony (one that isn't covered by an actor already).
     * 
     * @param x The x-coordinate of the click
     * @param y The y-coordinate of the click
     */
    public void onTouchDown(int x, int y)
    {
        // Complete this method yourself.

        // Only allow ants to be added between (1, 1) - (8, 5),
        // which makes up the playable area of the colony.   You
        // should ignore clicks/taps in locations outside of that
        // range.

        // call newActorOfSelectedType() to create a new ant of the
        // type that the user selected from the choices shown at
        // the top of the screen, then add it at the location of
        // the screen "touch".

        // Don't forget that adding an ant costs food!

        if ((x >= 1) && (x <= 8) && (y >= 1) && (y <= 5)) {
            this.newActorOfSelectedType();        
            Ant selectedAnt = ((Ant) newActorOfSelectedType());
            if (selectedAnt.getFoodCost() <= food)
            {             
                add(selectedAnt, x, y);
                consumeFood(selectedAnt.getFoodCost());
            }
        }
    }

    /**
     * amount of food colony has
     * @return amount of food
     */
    public int getFood()
    {
        return food;
    }

    /**
     * add food to colony
     * @param x amount of food to add
     */
    public void addFood(int x)
    {
        food += x;
    }

    /**
     * consume food from colony
     * @param x amount of food to consume
     */
    public void consumeFood(int x)
    {
        food -= x;
    }      

    /**
     * behavior of colony
     */
    public void act()
    {
        super.act();
        if (hive.getBees() == 0 
            && this.getObjects(Bee.class).size() == 0)
        {
            this.win();
        }
    }
}
