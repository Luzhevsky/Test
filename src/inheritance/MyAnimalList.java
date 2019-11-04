package inheritance;

public class MyAnimalList {

    private Animals[] dogs = new Animals[5];
    private int nextIndex = 0;


    public void add(Animals d){
        if(nextIndex < dogs.length){
            dogs[nextIndex] = d;
            System.out.println("dog add to cell " + nextIndex );
            nextIndex++;
        }
    }
}
