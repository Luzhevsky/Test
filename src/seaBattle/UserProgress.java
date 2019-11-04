package seaBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserProgress {

    public int getUserProgress(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            return a;

        }catch(IOException e){
            System.out.println("Ошибка");
        }
        return 0;
    }


}
