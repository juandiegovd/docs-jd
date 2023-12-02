package patterns.command.receivers;

public class Stereo{
    public Stereo(){

    }

    public void on(){
        System.out.println("Stereo is on!");
    }

    public void off(){
        System.out.println("Stereo is off!");
    }

    public void setCd(){
        System.out.println("Stereo has the cd");
    }

    public void setVolume(int volume){
        System.out.println("Volume is set to "+volume);
    }
}
