
package ass3.mygame2;
/**
 * 
 *
 * @author Karamjeet Kaur
 * @version 2021.09.20
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
    
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }
    
    public Item(String name, String description, double healingPower)
    {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }
    
    //write accessors and mutators
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    /**
     * 
     *  
     */
    public int getPower(){
        return destructivePower;
    }
}
