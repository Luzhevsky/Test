package inheritance;

abstract public class Animals {
    public int age;
    public int height;
    public String color;
    public int weight;

    public void eat(){
        System.out.println("Живтное ест");
    }
    public void makeNoise(){
        System.out.println("Животное издает звуки");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
    public void run(){
        System.out.println("Живоетное бежит");
    }

//    public abstract void see();

}
