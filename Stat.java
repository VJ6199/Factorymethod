abstract class Mobile{
    abstract void RAM();
    abstract void memory();
    abstract void battery();
    abstract void cost();
    abstract void size();
    abstract void model();
}
class Apple extends Mobile{
    void model(){
        System.out.println("Apple model iphone 13pro");
    }
    void RAM(){
        System.out.println("iphone 13pro RAM is 6GB");
    }
    void memory(){
        System.out.println("memory of 13pro ranges from 128gb,256gb and 512gb");
    }
    void battery(){
        System.out.println("battery capacity is 3095mAh");
    }
    void cost(){
        System.out.println("price of iphone 13 pro is $999");
    }
    void size(){
        System.out.println("size is 6.1-inch");
    }
}
class OnePlus extends Mobile{
    void model(){
        System.out.println("OnePlus model is 10pro");
    }
    void RAM(){
        System.out.println("OnePlus 10pro RAM is 12GB");
    }
    void memory(){
        System.out.println("memory of Oneplus 10pro 128gb, 256gb and 512gb");
    }
    void battery(){
        System.out.println("battery capacity is 5000mAh");
    }
    void cost(){
        System.out.println("price of Oneplus 10pro phone 13 pro is $849.99");
    }
    void size(){
        System.out.println("size is 6.7-inch");
    }
}

class Mobilefactory{
     static Mobile getMobile(String mobileName){
        if (mobileName.equals("Apple"))
            return new Apple();
        else if (mobileName.equals("Oneplus"))
            return new OnePlus();
        else
            return null;
    }
}


public class Stat {
    public static void main(String[] args) {
         Mobile x = Mobilefactory.getMobile("Apple");
        x.model();
        x.RAM();
        x.memory();
        x.cost();
        x.size();
        x.battery();
    }
    }