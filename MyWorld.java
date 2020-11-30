import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList; // allows us to make lists 

/**
 * Develops the world for the electron game, and places the necessary actors into it.
 * 
 * Shreya Chandra, Anika Sharma , Niru Suravarjjala, Jenny Wang 
 * 11/23/20
 */
public class MyWorld extends World
{
    public String deckChoice = "Oxygen"; //develops a variable that can be modified based on level
    public int numElec; //will be used to instantiate number of electrons
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Creates the energy bar on the left side of the world
        EnergyBar energyBar = new EnergyBar(); 
        addObject(energyBar, 20, 170);
        
        //Create the arrow within the energy bar
        EnergyArrow energyArrow = new EnergyArrow();
        addObject(energyArrow, 20, 290);
        
        //Creates the cannon and places it in the bottom left corner of the screen
        Canon canon = new Canon();
        addObject(canon, 70, 350);
        
        //Shows the current energy
        showText("Energy (kj/mol)", 85,20);
        
        //Shows the value markers for the energy bar
        showText("4000", 50,50);
        showText("3000", 50,110);
        showText("2000", 50,170);
        showText("1000", 50,230);
        showText("0", 50,290);
        
        // Adds Bohr model's rings 
        BohrRing1 ring1 = new BohrRing1();
        addObject(ring1, 400, 200); 
        
        BohrRing2 ring2 = new BohrRing2();
        addObject(ring2, 400, 200); 
        
        //Places the nucleus in the middle of the Bohr rings
        Nucleus nucleus = new Nucleus(); 
        addObject(nucleus, 390,190); 
        
        //Creates the next button in order for levels to change
        NextButton next = new NextButton();
        addObject(next, 560, 30); 
        
        //Starts the game
        startGame();
    }
    public void startGame(){
        //Changes the number of electrons based on what level the game is on
        if (deckChoice == "Oxygen"){
            numElec = 8; 
        }
        else if (deckChoice == "Fluorine"){
            numElec = 9; 
        }
        else if (deckChoice == "Nitrogen"){
            numElec = 7; 
        }
        setUp(); //sets up the chosen number of electrons
    }
    public void setUp()
    {   
        removeObjects(getObjects(Electron.class)); //refreshes the electrons 
                                                  //(instantiates new ones)
        
        Electron electron = new Electron(); //creates a brand new electron
        //Places electrons in specific positions based on total number of electrons
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
