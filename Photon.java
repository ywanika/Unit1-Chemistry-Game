import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A photon is a light particle with fixed energy and movement. This photon class allows the photon to shhot from the canon and remove electrons.
 * 
 * Shreya Chandra, Anika Sharma , Niru Suravarjjala, Jenny Wang 
 * Version 1.0
 */
public class Photon extends Actor
    /**
     * Act - do whatever the Photon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
{
    private double posx,posy,vx=0,vy=0,gx=0,gy=5.3,dt=0.25; // initialize variables
    public void addedToWorld(World MyWorld)
    {
        posx=getX(); // x position
        posy=getY(); // y position
    }
    
    public void setVeloc(double vxo,double vyo) // set velocity of x and y coordinates
    {
        vx=vxo; // x velocity
        vy=vyo; // y velocity 
    }
    
    public void act() // act method
    {
        posx+=vx*dt+0.1*gx*dt*dt+2; // x coordinate position movement considernig gravity and time
        posy+=vy*dt+0.1*gy*dt*dt-3; // y coordinate position movement considernig gravity and time
        
        vx+=gx*dt; // x velocity 
        vy+=gy*dt; // y velocity 
        setLocation((int)posx,(int)posy - 10); // sets location of photon
        
        if(getOneIntersectingObject(Electron.class) != null) // if the photon intersects with an electron from the outer ring...
        {
            getWorld().removeObject(getOneIntersectingObject(Electron.class)); // remove electron
            getWorld().removeObject(this); // remove photon
        }
        
    }
}
