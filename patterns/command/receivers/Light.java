package patterns.command.receivers;

public class Light{
    String place;

    public Light(String place){
        this.place = place;
    }

    public void on(){
        System.out.println("Light from "+place+ " is on");
    }

    public void off(){
        System.out.println("Light from "+place+" is off");
    }
}
