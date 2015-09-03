/**
 * Created by christiankirschberg on 03/09/15.
 */
public class SaneCatBehavior implements Behavior {

    @Override
    public void act() {
        System.out.println("purrs when master arrives at home");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats food");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzz");
    }
}
