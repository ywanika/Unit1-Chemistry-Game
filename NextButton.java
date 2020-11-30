import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the next button, which will switch between levels.
 * 
 * @Shreya Chandra, Anika Sharma, Niru Suravarjjala, Jenny Wang
 * @1.0 11/30/20
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
         
        String key = Greenfoot.getKey();
        if ("space".equals(key) && myWorld.deckChoice == "Oxygen") {
             myWorld.deckChoice = "Fluorine";
             myWorld.startGame(); 
             System.out.println(myWorld.deckChoice);
        }
        else if ("space".equals(key) && myWorld.deckChoice == "Fluorine") {
             myWorld.deckChoice = "Nitrogen";
             myWorld.startGame(); 
             System.out.println(myWorld.deckChoice);
        }
        else if ("space".equals(key) && myWorld.deckChoice == "Nitrogen") {
             myWorld.deckChoice = "Oxygen";
             myWorld.startGame(); 
             System.out.println(myWorld.deckChoice);
        }
    }    
    public NextButton(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 230, image.getHeight() - 250);
        setImage(image);
    }
}
