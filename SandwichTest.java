public class SandwichTest {
    public static void main(String[] arg) {
        System.out.println("\nTest Mixing Sauce");
        System.out.println("----------------");
        testMixingSauce();
        System.out.println("\nTest Make Sandwich");
        System.out.println("----------------");
        testMakeSandwich();
    }
    public static void testMakeSandwich() {
        Meat sausage = new Meat("Sausage",20);
        Vegeatable cabbage = new Vegeatable("Cabbage",10);
        Food aFood = sausage; // sausage is a food.
        Food anotherFood = cabbage; // cabbage is a food too!
        System.out.println("Print these foods out: " + aFood + ", " + anotherFood); // should print values

        Sandwich sandwich = new Sandwich();
        sandwich.add(sausage);
        System.out.println("1: " + sandwich);
        sausage.cook();
        sandwich.add(sausage);
        System.out.println("2: " + sandwich);
        
        //add cabbage
        sandwich.add(cabbage);
        System.out.println("3: " + sandwich);

        //add one beef
        Meat beef = new Meat("Beef",30);
        beef.cook();
        sandwich.add(beef);

        //try to add the same food into the sandwich
        System.out.println("4: " + sandwich);
        sandwich.add(beef);
        System.out.println("5: " + sandwich);
        //adding another instance of food
        Meat anotherbeef = new Meat("Beef",30);
        anotherbeef.cook();
        sandwich.add(anotherbeef);
        System.out.println("6: " + sandwich);


        Sauce v = new Sauce("vinegar");
        Sauce salt = new Sauce("salt");
        Sauce chili = new Sauce("chili");
        Sauce mix1 = chili.mix(v).mix(salt);
        sandwich.dressing(mix1);
        System.out.println(sandwich + " for $" + sandwich.getPrice());

    }
    public static void testMixingSauce() {
        Sauce v = new Sauce("vinegar");
        Sauce salt = new Sauce("salt");
        Sauce chili = new Sauce("chili");
        System.out.println(chili.mix(v));
        System.out.println(chili.mix(v).mix(salt));
        Sauce mix1 = chili.mix(v);
        Sauce mix2 = salt.mix(chili);
        System.out.println(mix1.mix(mix2));

    }
}



/**
 * This class is given, you cannot change this one.
 */
class Food {
    private final int price;
    private final String name;
    public Food(String name, int price) {
        this.price = price;
        this.name = name;
    }
    public final int getPrice() {
        return price;
    }
    public final String toString() {
        return name;
    }
}