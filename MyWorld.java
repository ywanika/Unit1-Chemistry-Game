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
    public String deckChoice = "Oxygen";
    public int numElec;
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
        
        EnergyBar energyBar = new EnergyBar();
        addObject(energyBar, 20, 170);
        
        EnergyArrow energyArrow = new EnergyArrow();
        addObject(energyArrow, 20, 290);
        
        Canon canon = new Canon();
        addObject(canon, 70, 350);
        
        showText("Energy (kj/mol)", 85,20);
        showText("Click space to move on to the next level!", 370,380);
        
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
        //List<String> gameDeck = new ArrayList<String>(); 
        //gameDeck.add(deckChoice); // add 2 electrons 
        //gameDeck.add("Fluorine-FluorideIon"); // add 1 electron 
        //gameDeck.add("Nitrogen-CyanideIon"); // add 1 electron to N 
        //System.out.println("ArrayList : " + gameDeck.toString()); // debug
        //for (int i=0; i < gameDeck.size(); i++) {
        if (deckChoice == "Oxygen"){
            numElec = 8; 
            showText("Oxygen", 300,20);
            
        }
        else if (deckChoice == "Fluorine"){
            numElec = 9; 
            showText("Fluorine", 300,20);
        }
        else if (deckChoice == "Nitrogen"){
            numElec = 7; 
            showText("Nitrogen", 300,20);
        }
        setUp();
        
    }
    public void setUp()
    {   
        removeObjects(getObjects(Electron.class));
        
        Electron electron = new Electron(); 
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
