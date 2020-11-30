
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyArrow extends Actor
{
    private boolean movingUp; //true if arrow is moving up
    private boolean movingDown; //true if arrow is moving down
    public static int y; //variable holding y coordinate of arrow
    /**
     * Makes arrow move up and down
     */
    public void act() 
    {
        move(); //calls move method
    }    
    
    /**
     * adjust size of energy arrow when constructed
     */
    public EnergyArrow(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -30, image.getHeight() -30);
        setImage(image);
   }
    
   /**
    * moves arrow up and down
    */
    private void move(){
       y = getY(); //updates location of y-coor
       //System.out.print(x+""+y);
       //290 = bottom of bar, 50 = top
       if (y == 50){ //if reaches bottom, move up
           movingUp = false;
           movingDown = true;
       }
       else if (y == 290){ //if reaches top, move down
           movingUp = true;
           movingDown = false;
        }
       if (movingUp == true){ //move down
           setRotation(270);
           move(2);
       }
       
       else if (movingDown == true){ //move up
           setRotation(90);
           move (2);
       }
    }
    
   /**
    * returns energy that the arrow is pointing to
    */
    public static int getEnergy (){
        double currentEnergy = (290-y) * 16.66; // mathmatical equation to find energy in realtion to location
        return (int) currentEnergy;
    }
}
