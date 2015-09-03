/**
 * Created by christiankirschberg on 03/09/15.
 */
public class DementedCatBehavior implements Behavior {
    @Override
    public void act() {
        System.out.println("Cat attacks nearest person");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats nearest person");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps - and then eats nearest person");
    }
}
