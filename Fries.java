import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for elephant.
 * 
 * @author Michael Chen
 * @version May 2025
 */
public class Fries extends Actor
{
    int speed = 1;
    public void act()
    {
        // The action of the fries
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        // Remove fries and draw game over when fries gets to the bottom of the world
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    public void setSpeed(int spd)
    {
        // Set the speed of the fries
        speed = spd;
    }
}
