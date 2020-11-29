
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyArrow extends Actor
{
    private boolean movingUp;
    private boolean movingDown;
    public static int y;
    /**
     * Act - do whatever the EnergyArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public EnergyArrow(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -30, image.getHeight() -30);
        setImage(image);
    }
    
    private void move(){
       y = getY();
       //System.out.print(x+""+y);
       //290 = bottom of bar, 50 = top
       if (y == 50){ 
           movingUp = false;
           movingDown = true;
       }
       else if (y == 290){ 
           movingUp = true;
           movingDown = false;
       }
       if (movingUp == true){
           setRotation(270);
           move(2);
       }
       
       else if (movingDown == true){
           setRotation(90);
           move (2);
       }
    }
    
    public static int getEnergy (){
        double currentEnergy = (290-y) * 16.66;
        return (int) currentEnergy;
    }
}
