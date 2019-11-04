package inheritance;

public class Cat extends Canine {

    //Перегрузка метода
    public void run(String name){
        System.out.println(name + " Бежит");
    }

    //Переопределение метода
    public void run(){
        //super.run();
        System.out.println("Бежит кошка");
    }
    //Переопределение метода еда
    public void eat(){
        System.out.println("Кошка ест вискас");
    }
    //Переопределение метода издает звуки
    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }

}
