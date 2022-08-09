abstract class Car{
    abstract void Maxspeed();
    abstract void model();

    abstract void feature();
    abstract void price();
}
class BMW extends Car{
    void Maxspeed(){
        System.out.println("Maxspeed of BMW is 180mph");
    }
    void model(){
        System.out.println("latest version of BMW is ix and i4");
    }
    void feature(){
        System.out.println("It is hybrid and have 8 stroke engine with best braking system");
    }
    void price(){
        System.out.println("price ranges between $80k-$100k");
    }
}
class Audi extends Car{
    void Maxspeed(){
        System.out.println("Maxspeed of Audi is 170mph");
    }
    void model(){
        System.out.println("latest version of Audi are Q8 and A8");
    }
    void feature(){
        System.out.println("It is hybrid and have 8 stroke engine with best braking system");
    }
    void price(){
        System.out.println("price ranges between $90k-$110k");
}}

class Carfactory{
    Car getCar(String carName){
        if (carName.equals("BMW"))
            return new BMW();
        else if (carName.equals("Audi"))
            return new Audi();
        else
            return null;
    }
    }


public class Inst {
    public static void main(String[] args){
        Carfactory y = new Carfactory();
        Car n = y.getCar("Audi");
        n.Maxspeed();
        n.model();
        n.feature();
        n.price();
    }
}