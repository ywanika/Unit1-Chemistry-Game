import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyBar extends Actor
{
    /**
     * Act - do whatever the EnergyBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public EnergyBar(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight() + 200);
        setImage(image);
    }
}
