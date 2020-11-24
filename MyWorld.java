import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; // allows us to make lists 

/**
 * Write a description of class MyWorld here.
 * 
 * Shreya Chandra, Anika Sharma , Niru Suravarjjala, Jenny Wang 
 * 11/23/20
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
        
        Cannon cannon = new Cannon();
        addObject(cannon, 70, 350);
        
        showText("Energy (kj/mol)", 85,20);
        
        showText("4000", 50,50);
        showText("3000", 50,110);
        showText("2000", 50,170);
        showText("1000", 50,230);
        showText("0", 50,290);
        
        // adding Bohr model's rings and 
        BohrRing1 ring1 = new BohrRing1();
        addObject(ring1, 400, 200); 
        
        BohrRing2 ring2 = new BohrRing2();
        addObject(ring2, 400, 200); 
        
        Nucleus nucleus = new Nucleus(); 
        addObject(nucleus, 390,190); 
        
        NextButton next = new NextButton();
        addObject(next, 560, 30); 
        
       
        startGame();
    }
    public void startGame(){
        List<String> gameDeck = new ArrayList<String>(); 
        gameDeck.add("Oxygen-OxideIon"); // add 2 electrons 
        gameDeck.add("Fluorine-FluorideIon"); // add 1 electron 
        gameDeck.add("Nitrogen-CyanideIon"); // add 1 electron to N 
        //System.out.println("ArrayList : " + gameDeck.toString()); // debug
        for (int i=0; i < gameDeck.size(); i++) {
            if (gameDeck.get(i) == "Oxygen-OxideIon"){
                setUp(10); 
            }
        }
    }
    public void setUp(int numElec)
    {   
        removeObjects(getObjects(Electron.class));
        
        Electron electron = new Electron(); 
        for (int i=0; i<numElec; i++) {
            if (i==0) {
                addObject(new Electron(), 385, 85);
            }
            if (i==1) {
                addObject(new Electron(), 385, 290);
            }
            if (i==2) {
                addObject(new Electron(), 500, 80);
            }
            if (i==3) {
                addObject(new Electron(), 500, 302);
            }
            if (i==4) {
                addObject(new Electron(), 275, 302);
            }
            if (i==5) {
                addObject(new Electron(), 275, 80);
            }
            if (i==6) {
                addObject(new Electron(), 385, 30);
            }
            if (i==7) {
                addObject(new Electron(), 385, 350);
            }
            if (i==8) {
                addObject(new Electron(), 550, 190);
            }
            if (i==9) {
                addObject(new Electron(), 225, 190);
            }
        }
    }
}
