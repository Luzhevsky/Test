package seaBattle;

public class SimpleDotCom{
    private int numOfHits = 0;
    int[] locationCells;


    public void setLocationCells(int[] loc){
        locationCells = loc;
        System.out.println(locationCells[2]);
    }

    public String CheckYouSelf(int a) {
        System.out.println("a from checkyouself = " + this.locationCells[2]);
        System.out.println("a from checkyouself = " + a);
        String result = "Мимо";
        for (int mass : locationCells) {
            System.out.println( "mass = " + mass);
            if (mass == a) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Убил";
        }
        System.out.println(result);
        return result;
    }
}
