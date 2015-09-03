/**
 * Created by christiankirschberg on 03/09/15.
 */
public class TestCat {
    public static void main(String[] args)
    {
        //Guess a pattern? :-)

        Cat cat1 = new Cat(new SaneCatBehavior(), "Nice kitty");
        cat1.act();
        cat1.eat();
        cat1.sleep();

        System.out.println("---------------------");

        Cat cat2 = new Cat(new DementedCatBehavior(), "Mad kitty");
        cat2.act();
        cat2.eat();
        cat2.sleep();
    }
}
