import greenfoot.*;

public class Canon extends Actor
{
    public void act() 
    {
        MyWorld myWorld = (MyWorld) getWorld();
        String newDeckChoice = myWorld.deckChoice;
        //EnergyArrow energyArrow = (EnergyArrow) getObjects().EnergyArrow();
        //int newBarY = energyArrow.barY;
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int rx=mouse.getX()-getX();
            int ry=mouse.getY()-getY();
            int angle=(int)(Math.atan2(ry,rx)*180.0/Math.PI);
            setRotation(angle);
        }
        
        if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Oxygen"){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int rx=mouse.getX()-getX();
            int ry=mouse.getY()-getY()-50;
            double r=Math.sqrt(rx*rx+ry*ry);
            double angle=Math.atan2(ry,rx);
            int w=(int)(0.5*getImage().getWidth());
            int posx=(int)(getX()+w*Math.cos(angle));
            int posy=(int)(getY()+w*Math.sin(angle));
            ElectronBall electronBall = new ElectronBall();
            electronBall.setVeloc(50*rx/r,50*ry/r);
            getWorld().addObject(electronBall,posx,posy);
        }
        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Fluorine"){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int rx=mouse.getX()-getX();
            int ry=mouse.getY()-getY()-50;
            double r=Math.sqrt(rx*rx+ry*ry);
            double angle=Math.atan2(ry,rx);
            int w=(int)(0.5*getImage().getWidth());
            int posx=(int)(getX()+w*Math.cos(angle));
            int posy=(int)(getY()+w*Math.sin(angle));
            ElectronBall electronBall = new ElectronBall();
            electronBall.setVeloc(50*rx/r,50*ry/r);
            getWorld().addObject(electronBall,posx,posy);
        }
        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Nitrogen"){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int rx=mouse.getX()-getX();
            int ry=mouse.getY()-getY()-50;
            double r=Math.sqrt(rx*rx+ry*ry);
            double angle=Math.atan2(ry,rx);
            int w=(int)(0.5*getImage().getWidth());
            int posx=(int)(getX()+w*Math.cos(angle));
            int posy=(int)(getY()+w*Math.sin(angle));
            ElectronBall electronBall = new ElectronBall();
            electronBall.setVeloc(50*rx/r,50*ry/r);
            getWorld().addObject(electronBall,posx,posy);
        }
        //else {
        //    System.out.println("Wrong Electron Energy! Try again.");
        //}    
    }
}
