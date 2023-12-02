package patterns.command.receivers;

public class CeilingFan{
    String place;
    int speed;

    public CeilingFan(String place){
        this.place = place;
    }

    public void high(){
        this.speed = 3;
        System.out.println("Ceiling fan from "+place+" is high!");
    }

    public void medium(){
        this.speed = 2;
        System.out.println("Ceiling fan from "+place+" is medium!");
    }

    public void low(){
        this.speed = 1;
        System.out.println("Ceiling fan from "+place+" is low!");
    }

    public void off(){
        this.speed = 0;
        System.out.println("Ceiling fan from "+place+" is off");
    }

    public int getSpeed(){
        return this.speed;
    }
}
