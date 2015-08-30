/**
 * Created by christiankirschberg on 26/08/15.
 */
public class Cat {
    private String name;

    public Cat(String name) {
        setName(name);
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
