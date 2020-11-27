import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextButton extends Actor
{
    String key = Greenfoot.getKey();
    /**
     * Act - do whatever the NextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myWorld = (MyWorld) getWorld();
        String newDeckChoice = myWorld.deckChoice;
         
        
        if (Greenfoot.isKeyDown("space") && myWorld.deckChoice == "Oxygen") {
             myWorld.startGame(); 
             myWorld.deckChoice = "Fluorine";
        }
        if (Greenfoot.isKeyDown("space") && myWorld.deckChoice == "Fluorine") {
             myWorld.startGame(); 
             myWorld.deckChoice = "Nitrogen";
        }
        if (Greenfoot.isKeyDown("space") && myWorld.deckChoice == "Nitrogen") {
             myWorld.startGame(); 
             myWorld.deckChoice = "Oxygen";
        }
    }    
    public NextButton(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 230, image.getHeight() - 250);
        setImage(image);
    }
}
