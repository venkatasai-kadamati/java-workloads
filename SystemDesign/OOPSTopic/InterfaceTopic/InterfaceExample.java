package Core.OOPSTopic.InterfaceTopic;

interface ICamera {
    void snap();

    void video();
}

interface IMusicPlayer {
    void play();

    void pause();
}

class Phone {
    void call() {
        System.out.println("Phone Call");
    }

    void sms() {
        System.out.println("Phone Sending SMS");
    }
}

class Smartphone extends Phone implements ICamera, IMusicPlayer {
    public void video() {
        System.out.println("Smart Phone Video calling");
    }

    public void snap() {
        System.out.println("Smart Phone snap feature");
    }

    public void play() {
        System.out.println("Smart Phone play music");
    }

    public void pause() {
        System.out.println("Smart Phone pause music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Smartphone s1pro = new Smartphone();
        s1pro.play();
        s1pro.call();

        ICamera icsystem = s1pro;
        icsystem.snap();

        IMusicPlayer mpsystem = s1pro;
        mpsystem.pause();
    }
}
