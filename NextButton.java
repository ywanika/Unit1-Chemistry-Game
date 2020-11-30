import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the next button, which will switch between levels.
 * 
 * @Shreya Chandra, Anika Sharma, Niru Suravarjjala, Jenny Wang
 * @1.0 11/30/20
 */
public class NextButton extends Actor
{
    /**
     * Changes the currents atom to a nex one when the space bar is pressed
     */
    public void act() 
    {
        MyWorld myWorld = (MyWorld) getWorld(); //get refrence to world class
         
        String key = Greenfoot.getKey(); //obtains name of key pressed
        if ("space".equals(key) && myWorld.deckChoice == "Oxygen") { // if the space key pressed and the current atom Oxygen
             myWorld.deckChoice = "Fluorine"; //change atom to fluorine
             myWorld.startGame(); //reset world
             //System.out.println(myWorld.deckChoice);
        }
        else if ("space".equals(key) && myWorld.deckChoice == "Fluorine") {// if the space key pressed and the current atom Fluorine
             myWorld.deckChoice = "Nitrogen"; // change atom to nitrogen
             myWorld.startGame(); //reset world
             //System.out.println(myWorld.deckChoice);
        }
        else if ("space".equals(key) && myWorld.deckChoice == "Nitrogen") {// if the space key pressed and the current atom Nitrogen
             myWorld.deckChoice = "Oxygen"; // change atom to oxygen
             myWorld.startGame(); //reset world
             //System.out.println(myWorld.deckChoice);
        }
    }    
    /**
     * adjust size of next button when constructed
     */
    public NextButton(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 230, image.getHeight() - 250);
        setImage(image);
    }
}
