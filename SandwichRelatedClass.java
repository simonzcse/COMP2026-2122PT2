/**
 * Work on this file for the question Let's make some sandwiches
 */
import java.util.List;
import java.util.ArrayList;

class Sandwich {
    /**
     * A list of food
     */
    private List<Food> ingredient = new ArrayList<>();
    /**
     * One sauce in a sandwich only.. and you can mix the sauce before dressing it
     */
    private Sauce sauce = null;

    //TODO add suitable public/private methods and constructors
    //Do not add any field into this class.
}

//Food class is given in SandwichTest.java

class Meat extends Food {
    //TODO add suitable public/private methods and constructors and fields
}

class Vegeatable extends Food{
    //TODO add suitable public/private methods and constructors and fields   
}

class Sauce {
    private final String name;
    //TODO add suitable public/private methods and constructors
    //Do not add any field into this class.
    //Hint: adding a copy constructor may be helpful
}

