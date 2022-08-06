package Exercise1;

/*
1) Create an object Basket that holds the fruits.

- find(String): boolean                  - finds if received fruit is in the list and returns true/false

- remove(String): boolean               - removes the received string returns true/false if found

- position(String): int                  - returns the position on which the received fruit is in the basket

- distinct(): Collection<String>        - returns a unique collection containing all fruits once

- add(String)                           - adds a fruit to the basket

- count():int                           - count the fruits

- customCount(): int                     - count the fruits without using size method (use a loop control statement + counter)
 */

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("banana");
        basket.add("apple");
        basket.add("pear");
        basket.add("strawberry");
        System.out.println(basket.distinct());
        System.out.println(basket.find("banana"));
        System.out.println(basket.find("straberry"));
        basket.position("apple");
        basket.count();
        System.out.println(basket.customCount());
        basket.remove("pear");
        System.out.println(basket.distinct());
    }
}
