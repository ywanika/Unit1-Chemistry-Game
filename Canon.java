import greenfoot.*;

public class Canon extends Actor
{
    /**
       * Creates the cannon and allows it to move/shoot photons.
       * 
       * @Shreya Chandra, Anika Sharma, Niru Suravarjjala, Jenny Wang 
       * @1.0 11/30/20
    */

    public void act() // act method
    {
        MyWorld myWorld = (MyWorld) getWorld();
        
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo(); // get position of mouse
            int rx=mouse.getX()-getX(); // set integer x position
            int ry=mouse.getY()-getY(); // set integer y position
            int angle=(int)(Math.atan2(ry,rx)*180.0/Math.PI); // formula for equation of angle tha photon shoots out at 
            setRotation(angle); // sets the angle
        }
        
        if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Oxygen"){ // code for oxygen
            if (ionizationNum(myWorld) == 0){ // 1st ionization energy level
                System.out.println("The 1st ionization energy of Oxygen is 1313 kJ/mol."); // gives user a clue
                if (EnergyArrow.getEnergy() >= 1313){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{ // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }

            else if (ionizationNum(myWorld) == 1){ // 2st ionization energy level
                System.out.println("The 2nd ionization energy of Oxygen is 3388 kJ/mol."); // gives user a clue
                if (EnergyArrow.getEnergy() >= 3388){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{ // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron.\n");
                }
            }
            else{ // moving on to the next element
                System.out.println("The 3rd ionization of Oxygen takes 5300 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }
        
        

        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Fluorine"){ // code for fluorine
            if (ionizationNum(myWorld) == 0){ // 1st ionization energy level
                System.out.println("The 1st ionization energy of Fluorine is 1681 kJ/mol."); // gives user a clue
                if (EnergyArrow.getEnergy() >= 1681){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{ // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }

            else if (ionizationNum(myWorld) == 1){ // 2nd ionization energy level
                System.out.println("The 2nd ionization energy of Fluorine is 3374 kJ/mol."); // gives user a clue 
                if (EnergyArrow.getEnergy() >= 3374){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{ // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else{ // moving on to the next element
                System.out.println("The 3rd ionization of Fluorine takes 6050 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }

        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Nitrogen"){ // code for nitrogen
            if (ionizationNum(myWorld) == 0){ // 1st ionization energy level
                System.out.println("The 1st ionization energy of Nitrogen is 1402 kJ/mol."); // gives user a clue 
                if (EnergyArrow.getEnergy() >= 1402){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{ // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else if (ionizationNum(myWorld) == 1){ // 2ns ionization energy level
                System.out.println("The 2nd ionization energy of Nitrogen is 2856 kJ/mol."); // gives user a clue
                if (EnergyArrow.getEnergy() >= 2856){ // actual value or above
                    shoot(); // they have to shoot only at this value
                    System.out.println("");
                }
                else{  // if they shot under the ionization level, another clue to help them
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else{ // moving on to the next element
                System.out.println("The 3rd ionization of Nitrogen takes 4578 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }   
    }
    private void shoot(){ // shooting the photon out of canon
        MouseInfo mouse=Greenfoot.getMouseInfo(); // gets mouse info
        int rx=mouse.getX()-getX(); // x position
        int ry=mouse.getY()-getY()-50; // y position
        double r=Math.sqrt(rx*rx+ry*ry); // math formulas found online
        double angle=Math.atan2(ry,rx); // angle that the canon shoots
        int w=(int)(0.5*getImage().getWidth()); // sets image to image of a canon and scales it down
        int posx=(int)(getX()+w*Math.cos(angle)); // x position angle
        int posy=(int)(getY()+w*Math.sin(angle)); // y position angle
        Photon photon = new Photon(); // creates a new photon object
        photon.setVeloc(50*rx/r,50*ry/r); // sets x and y velocity of photon object
        getWorld().addObject(photon,posx,posy); // add object to the world
    }
    private int ionizationNum(MyWorld myWorld){
        int ogNum = myWorld.numElec; // findnumber of electrons originally displayed
        int currentNum = getWorld().getObjects(Electron.class).size(); // finds number of electrons currently displayed
        //System.out.println(ogNum - currentNum);
        return ogNum - currentNum; // returns number of electrons that were removed
    }
}
