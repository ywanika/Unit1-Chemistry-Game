import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the energy bar.
 * 
 * @Shreya Chandra, Anika Sharma, Niru Suravarjjala, Jenny Wang
 * @1.0 11/30/20
 */
public class EnergyBar extends Actor
{
    /**
     * No specific code is required here.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * Creates the image and sets it to a smaller scale.
     */
    public EnergyBar(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 13, image.getHeight() - 160);
        setImage(image);
    }
}
