import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * Anika Sharma 
 * 11/17/20
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        EnergyBar energyBar = new EnergyBar();
        addObject(energyBar, 20, 170);
        
        EnergyArrow energyArrow = new EnergyArrow();
        addObject(energyArrow, 20, 290);
        
        showText("Energy (kj/mol)", 85,20);
        
        showText("4000", 50,50);
        showText("3000", 50,110);
        showText("2000", 50,170);
        showText("1000", 50,230);
        showText("0", 50,290);
        
    }
}
