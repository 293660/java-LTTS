import java.util.*;



class HotelRoom  {
    private String hotelname;
    private int numberOfSqFeet;
    private Boolean hasTV,hasWifi;
    HotelRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi ){
        this.hotelname =  hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    public void calculateTariff(int numberOfSqFeet ,int  ratePerSqFeet) {
        //ratePerSqFeet = DeluxeRoom.class(getRatePerSqFeet(););
        System.out.println(numberOfSqFeet * ratePerSqFeet);
    }

    int  getRatePerSqFeet() {
        return 0;
    }
}

class DeluxeRoom extends HotelRoom{
    private Boolean haswifitrue ;
    private int ratePerSqFeet;
    //Constructor
    DeluxeRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi){
        
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        haswifitrue = hasWifi ;
        ratePerSqFeet = 10;
    }

    public int getRatePerSqFeet(){
        if (haswifitrue){
            return ratePerSqFeet+2;
        }else{
            return ratePerSqFeet;
        }
    }

    

}


class DeluxeACRoom extends DeluxeRoom{
    private Boolean haswifitrue ;
    private int ratePerSqFeet;
    DeluxeACRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi){
        
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet = 12;
    }

    public int getRatePerSqFeet(){
        return ratePerSqFeet;
    }
}

class SuiteACRoom extends HotelRoom{
    private Boolean haswifitrue ;
    private int ratePerSqFeet;
    //Constructor
    SuiteACRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi){
        
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        haswifitrue = hasWifi ;
        ratePerSqFeet = 15;
    }

    public int getRatePerSqFeet(){
        if (haswifitrue){
            return ratePerSqFeet+2;
        }else{
            return ratePerSqFeet;
        }
    }
}

public class Hotelmain{ 
    public static void main(String[] args) {
        System.out.println("Afrid");
        String hotelName;
        int numberOfSqFeet;

        System.out.println("Hotel Tariff Calculator\n1. Deluxe Room \n2. Deluxe AC \nRoom3. Suite AC Room\nSelect Room Type:");
        
        Scanner sc = new Scanner(System.in);
        final int chooice = sc.nextInt();
        
        System.out.println("Hotel Name:");
        hotelName = sc.next();
        System.out.println("Room Square Feet Area:");
        numberOfSqFeet = sc.nextInt();
        System.out.println("Room has TV (true/false):");
        Boolean hasTV = sc.nextBoolean();
        System.out.println("Room has Wifi (true/false):");
        Boolean hasWiFi = sc.nextBoolean();


        switch(chooice) {
            case 1:
              DeluxeRoom deluxroom_obj = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi);
              int rate = deluxroom_obj.getRatePerSqFeet();
              deluxroom_obj.calculateTariff(numberOfSqFeet, rate);
              break;
            case 2:
              DeluxeACRoom deluxeACRoom_obj = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi);
              rate = deluxeACRoom_obj.getRatePerSqFeet();
              deluxeACRoom_obj.calculateTariff(numberOfSqFeet, rate);
              break;
            case 3:
            SuiteACRoom suiteACRoom_obj = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi);
            rate = suiteACRoom_obj.getRatePerSqFeet();
            suiteACRoom_obj
            .calculateTariff(numberOfSqFeet, rate);
             break;
          }
          sc.close();

    }  
}
