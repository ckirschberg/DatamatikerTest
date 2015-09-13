/**
 * Created by christiankirschberg on 26/08/15.
 */
public class Cat {
    private Behavior behavior;
    private String name;
    private int age;

    public Cat(Behavior behavior, String name) {
        this.behavior = behavior;
        setName(name);
    }

    public void act() {
        behavior.act();
    }
    public void eat() {
        behavior.eat();
    }
    public void sleep() {
        behavior.sleep();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void activateCat()
    {
        System.out.println("Miauuu! Hiissssss! *cat charges forward*");
    }
    public void pulltale()   { System.out.println("Hiissssss! *claws displayed*");}
}
