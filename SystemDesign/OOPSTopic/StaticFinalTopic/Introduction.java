package Core.OOPSTopic.StaticFinalTopic;


class HondaCity {
    // static member - shared b/w all objects
    static long price = 10;

    // non - static members
    static double onRoadPrice(String city) {
        switch (city) {
            case "Delhi":
                return price + price * 0.1;
            case "Pune":
                return price + price * 0.2;
        }
        return 0;
    }
}

public class Introduction {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        HondaCity.price = 1010;
        System.out.println("printing h1 ka price : " + HondaCity.price);
        System.out.println("printing h2 ka price : " + HondaCity.price);
    }
}
