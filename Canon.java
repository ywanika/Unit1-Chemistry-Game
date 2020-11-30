import greenfoot.*;

public class Canon extends Actor
{
    /**
       * Creates the cannon and allows it to move/shoot photons.
       * 
       * @Shreya Chandra, Anika Sharma, Niru Suravarjjala, Jenny Wang 
       * @1.0 11/30/20
    */
    public void act() 
    {
        MyWorld myWorld = (MyWorld) getWorld();
        
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int rx=mouse.getX()-getX();
            int ry=mouse.getY()-getY();
            int angle=(int)(Math.atan2(ry,rx)*180.0/Math.PI);
            setRotation(angle);
        }
        
        if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Oxygen"){
            if (ionizationNum(myWorld) == 0){
                System.out.println("The 1st ionization energy of Oxygen is 1313 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 1313){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else if (ionizationNum(myWorld) == 1){
                System.out.println("The 2nd ionization energy of Oxygen is 3388 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 3388){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron.\n");
                }
            }
            else{
                System.out.println("The 3rd ionization of Oxygen takes 5300 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }
        
        
        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Fluorine"){
            if (ionizationNum(myWorld) == 0){
                System.out.println("The 1st ionization energy of Fluorine is 1681 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 1681){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else if (ionizationNum(myWorld) == 1){
                System.out.println("The 2nd ionization energy of Fluorine is 3374 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 3374){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else{
                System.out.println("The 3rd ionization of Fluorine takes 6050 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }
        
        
        else if(Greenfoot.mouseClicked(null) && myWorld.deckChoice == "Nitrogen"){
            if (ionizationNum(myWorld) == 0){
                System.out.println("The 1st ionization energy of Nitrogen is 1402 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 1402){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else if (ionizationNum(myWorld) == 1){
                System.out.println("The 2nd ionization energy of Nitrogen is 2856 kJ/mol.");
                if (EnergyArrow.getEnergy() >= 2856){
                    shoot();
                    System.out.println("");
                }
                else{
                    System.out.println("You need at least this much energy to remove an electron. \n");
                }
            }
            else{
                System.out.println("The 3rd ionization of Nitrogen takes 4578 kJ/mol. \n Please click space to move on to the next atom.");
            }
        }
        //else {
        //    System.out.println("Wrong Electron Energy! Try again.");
        //}    
    }
    private void shoot(){
        MouseInfo mouse=Greenfoot.getMouseInfo();
        int rx=mouse.getX()-getX();
        int ry=mouse.getY()-getY()-50;
        double r=Math.sqrt(rx*rx+ry*ry);
        double angle=Math.atan2(ry,rx);
        int w=(int)(0.5*getImage().getWidth());
        int posx=(int)(getX()+w*Math.cos(angle));
        int posy=(int)(getY()+w*Math.sin(angle));
        Photon photon = new Photon();
        photon.setVeloc(50*rx/r,50*ry/r);
        getWorld().addObject(photon,posx,posy);
    }
    private int ionizationNum(MyWorld myWorld){
        int ogNum = myWorld.numElec;
        int currentNum = getWorld().getObjects(Electron.class).size();
        //System.out.println(ogNum - currentNum);
        return ogNum - currentNum;
    }
}
