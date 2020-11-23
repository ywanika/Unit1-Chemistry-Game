import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.isKeyDown("up")) {
           turn(-1);
        }
      if(Greenfoot.isKeyDown("down")) {
           turn(+1);
        }
      if ("space".equals(Greenfoot.getKey()))
       {
           //fire();
       }
    } 
    private void fire() {
        int angle = getRotation() - 36; // adjust angle for image
        //Cannonball ball = new Cannonball(new Vector(angle, 9));
        //getWorld().addObject(ball, getX(), getY());
        //ball.setRotation(angle);
        //ball.move(42); // clear the cannon barrel
    }
}