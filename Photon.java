import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Photon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Photon extends  SmoothMover
{
    /**
     * Act - do whatever the Photon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private double posx,posy,vx=0,vy=0,gx=0,gy=5.3,dt=0.25;
    public void addedToWorld(World MyWorld)
    {
        posx=getX();
        posy=getY();
    }
    
    public void setVeloc(double vxo,double vyo)
    {
        vx=vxo;
        vy=vyo;
    }
    
    public void act() 
    {
        posx+=vx*dt+0.1*gx*dt*dt;
        posy+=vy*dt+0.1*gy*dt*dt;
        
        vx+=gx*dt;
        vy+=gy*dt;
        setLocation((int)posx,(int)posy);
        if(posy>getWorld().getHeight()+100)getWorld().removeObject(this);
//>>>>>>> Stashed changes
    }    
}
