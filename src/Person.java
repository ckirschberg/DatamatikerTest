/**
 * Created by mariannenielsen on 26/08/15.
 * Get added by jart on 02/09/15.
 */
public class Person {

    private String name;
    private String title;

    public void setName(String name)
    {
        this.name=name;
    }
	
	public String getName()
	{
		return this.name;
	}

    public Person()
    {
        System.out.println("I wonder who I am? I have no name.. Someone, please add a name :-)");

    }
}
