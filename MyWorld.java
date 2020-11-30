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
        
        
        System.out.println("||INSTRUCTIONS||"); 
        System.out.println("1. The objective of the game is to remove electrons at the correct ionization energy"); 
        System.out.println("2. Click anywhere on the screen to shoot a photon out of the cannon"); 
        System.out.println("3. The energy bar will indicate where how much energy the photon has at any given moment"); 
        System.out.println("4. Click the space bar to proceed to the next atom/molecule"); 
        
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
            numElec = 6; 
            showText("Oxygen", 300,20);
        }
        else if (deckChoice == "Fluorine"){
            numElec = 7; 
            showText("Fluorine", 300,20);
        }
        else if (deckChoice == "Nitrogen"){
            numElec = 5; 
            showText("Nitrogen", 300,20);
        }
        setUp();//sets up the chosen number of electrons
        
    }
    public void setUp()
    {   
        removeObjects(getObjects(Electron.class));//refreshes the electrons (instantiates new ones)
        
        Electron electron = new Electron(); //creates a brand new electron
        //Places electrons in specific positions based on total number of electrons
        for (int i=0; i<numElec; i++) {
            
            if (i==0) {
                addObject(new Electron(), 500, 80);
            }
            if (i==1) {
                addObject(new Electron(), 500, 302);
            }
            if (i==2) {
                addObject(new Electron(), 275, 302);
            }
            if (i==3) {
                addObject(new Electron(), 275, 80);
            }
            if (i==4) {
                addObject(new Electron(), 385, 30);
            }
            if (i==5) {
                addObject(new Electron(), 385, 350);
            }
            if (i==6) {
                addObject(new Electron(), 550, 190);
            }
            if (i==7) {
                addObject(new Electron(), 225, 190);
            }
        }
        
        //creates inner electrons in different class
        Core coreElectron = new Core();
        for(int i=0;i<2;i++){
            if (i==0) {
                addObject(new Core(), 385, 85);
            }
            if (i==1) {
                addObject(new Core(), 385, 290);
            }
        }
    }
}
