package Exercise2;
/*
2) Create an objects that model bouquet of flowers. Each flower has to be unique. We don't care how the flowers are ordered.

- getAll(): Collection<String>  - returns all the flowers

- add(String)    - adds a flower (remember to keep them unique)

- remove(String) - removes a flower
 */
public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.add("random flower 1");
        bouquet.add("the good stuff");
        bouquet.add("last one in stock");

        bouquet.remove("the good stuff");

        System.out.println(bouquet.getAll());
    }
}
