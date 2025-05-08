package ObjectOriented;
public class AbstractClass{
    public static void main(String[] args) {
        car obj = new car();
        obj.startengine(235);
        obj.closedoors();    

        bike obj1 = new bike();
        obj1.startengine(211);
        obj1.removestand();
        
    }
}
abstract class Engine{
    abstract void startengine(int a);
}
class car extends Engine{

    car()
    {
        System.out.println("Accessing Car");
    }
    void startengine(int key)
    {
        if(key==235)
        System.out.println("Engine Started");
        else
        System.out.println("Wrong key");
    }
void closedoors()
{
    System.out.println("Doors are closed");
}

}
class bike extends Engine{

    bike()
    {
        System.out.println("Accessing Bike");
    }
    void startengine(int key)
    {
        if(key==211)
        System.out.println("Engine Started");
        else
        System.out.println("Wrong key");
    }
    void removestand(){
        System.out.println("Stand is removed");
    }


}