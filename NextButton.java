import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextButton extends Actor
{
    /**
     * Act - do whatever the NextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         MyWorld myWorld = (MyWorld) getWorld();
         
        
        if (Greenfoot.mouseClicked(this)) {
             
             myWorld.startGame(); 
             System.out.println("This is a test."); 
        }
    }    
    public NextButton(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 230, image.getHeight() - 250);
        setImage(image);
    }
}
