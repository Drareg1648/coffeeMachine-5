package machine;

import java.util.ArrayList;
import java.util.Scanner;

public interface CoffeeMachine {

    ArrayList<CoffeeBrew> modes;

    /*
    static int

    static int coffeeBeansUseEspresso = 16;
    static int costEspresso = 4;

    static int waterUseLatte = 350;
    static int milkUseLatte = 75;
    static int coffeeBeansUseLatte = 20;
    static int costLatte = 7;

    static int waterUseCappuccino = 200;
    static int milkUseCappuccino = 100;
    static int coffeeBeansUseCappuccino = 12;
    static int costCappuccino = 6;

    static int cupUseCoffee = 1;
    */

    public CoffeeMachine() {
        modes = new ArrayList<>();

        CoffeeBrew current;
        current = new CoffeeBrew();
        current.setCoffee("current");
        current.setCurrent(new CoffeeType());

        modes.add(current);

        CoffeeBrew latte;
        CoffeeType coffeeLatte;
        coffeeLatte = new CoffeeType();
        coffeeLatte.setWater(350);
        coffeeLatte.setMilk(75);
        coffeeLatte.setBeans(20);
        coffeeLatte.setCups(1);
        coffeeLatte.setMoney(7);

        latte = new CoffeeBrew("latte", coffeeLatte);
        latte.setCurrent(new CoffeeType());

        modes.add(latte);




        CoffeeBrew espresso;
        CoffeeType coffeeEspresso;
        coffeeEspresso = new CoffeeType();
        coffeeEspresso.setWater(350);
        coffeeEspresso.setMilk(75);
        coffeeEspresso.setBeans(20);
        coffeeEspresso.setCups(1);
        coffeeEspresso.setMoney(7);

        espresso = new CoffeeBrew("espresso", coffeeEspresso);
        espresso.setCurrent(new CoffeeType());

        modes.add(espresso);


        CoffeeBrew cappuccino;
        CoffeeType coffeeCappuccino;
        coffeeCappuccino = new CoffeeType();
        coffeeCappuccino.setWater(350);
        coffeeCappuccino.setMilk(75);
        coffeeCappuccino.setBeans(20);
        coffeeCappuccino.setCups(1);
        coffeeCappuccino.setMoney(7);

        cappuccino = new CoffeeBrew("cappuccino", coffeeCappuccino);
        cappuccino.setCurrent(new CoffeeType());

        modes.add(cappuccino);

    
}
        /*

         Doe hier hetzelfde voor Espresso, Latte, en Cappucino

         implementeer dan een CoffeeBrew.buy( CoffeeType substract ).

        */
    }

    private static void showRemaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(currentAmountOfWater + " ml of water");
        System.out.println(currentAmountOfMilk + " ml of milk");
        System.out.println(currentAmountOfCoffeeBeans + " g of coffee beans");
        System.out.println(currentAmountOfDisposableCups + " disposable cups");
        System.out.println("$" + currentAmountOfMoney + " of money");
    }
    static boolean espressoCheck() {
        if (currentAmountOfWater < waterUseEspresso) {
            System.out.println("Sorry, not enough water!");
            return true;
        }

        else if (currentAmountOfCoffeeBeans < coffeeBeansUseEspresso) {
            System.out.println("Sorry, not enough coffee beans!");
            return true;

        } else if (currentAmountOfDisposableCups < cupUseCoffee) {
            System.out.println("Sorry, not enough disposable cups!");
            return true;

        }
        return false;
    }

        static boolean latteCheck() {
        if (currentAmountOfWater < waterUseLatte) {
            System.out.println("Sorry, not enough water!");
            return true;
        }
        if (currentAmountOfMilk < milkUseLatte) {
            System.out.println("Sorry, not enough milk!");
            return true;
        }
        if (currentAmountOfCoffeeBeans < coffeeBeansUseLatte) {
            System.out.println("Sorry, not enough coffee beans!");
            return true;
        }
        if (currentAmountOfDisposableCups < cupUseCoffee) {
            System.out.println("Sorry, not enough disposable cups!");
            return true;
        }
        return false;
    }

    static boolean cappuccinoCheck() {
        if (currentAmountOfWater < waterUseCappuccino) {
            System.out.println("Sorry, not enough water!");
            return true;
        }
        if (currentAmountOfMilk < milkUseCappuccino) {
            System.out.println("Sorry, not enough milk!");
            return true;
        }
        if (currentAmountOfCoffeeBeans < coffeeBeansUseCappuccino) {
            System.out.println("Sorry, not enough coffee beans!");
            return true;
        }
        if (currentAmountOfDisposableCups < cupUseCoffee) {
            System.out.println("Sorry, not enough disposable cups!");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");


        while (scanner.hasNextLine()) {
            String actionName = scanner.nextLine();

            if ("exit".equals(actionName)) {
                break;
            }

            switch (actionName) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String buyAction = scanner.nextLine();
                    if (buyAction.equals("1")) {
                        if (espressoCheck()) {
                            System.out.println();
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }
                        currentAmountOfWater -= waterUseEspresso;
                        currentAmountOfCoffeeBeans -= coffeeBeansUseEspresso;
                        currentAmountOfDisposableCups -= cupUseCoffee;
                        currentAmountOfMoney += costEspresso;

                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println("");
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    } else if (buyAction.equals("2")) {
                        if (latteCheck()) {
                            System.out.println();
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }
                        currentAmountOfWater -= waterUseLatte;
                        currentAmountOfMilk -= milkUseLatte;
                        currentAmountOfCoffeeBeans -= coffeeBeansUseLatte;
                        currentAmountOfDisposableCups -= cupUseCoffee;
                        currentAmountOfMoney += costLatte;
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println("");
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    } else if (buyAction.equals("3")) {
                        if (cappuccinoCheck()) {
                            System.out.println();
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }
                        currentAmountOfWater -= waterUseCappuccino;
                        currentAmountOfMilk -= milkUseCappuccino;
                        currentAmountOfCoffeeBeans -= coffeeBeansUseCappuccino;
                        currentAmountOfDisposableCups -= cupUseCoffee;
                        currentAmountOfMoney += costCappuccino;
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println("");
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    } else if (buyAction.equals("back")) {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        break;
                    }
                    break;

                case "fill":
                    System.out.println(" ");
                    System.out.println("Write how many ml of water you want to add: ");
                    int waterAdded = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milkAdded = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBeansAdded = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int disposableCupsAdded = scanner.nextInt();
                    System.out.println("The coffee machine has:");
                    currentAmountOfWater += waterAdded;
                    currentAmountOfMilk += milkAdded;
                    currentAmountOfCoffeeBeans += coffeeBeansAdded;
                    currentAmountOfDisposableCups += disposableCupsAdded;

                    System.out.println("");
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    break;

                case "take":
                    System.out.println("");
                    System.out.println("I gave you $" + currentAmountOfMoney);
                    currentAmountOfMoney -= currentAmountOfMoney;
                    System.out.println("");
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    break;

                case "remaining":
                    System.out.println(" ");
                    showRemaining();
                    System.out.println(" ");
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    break;

                default:
                    System.out.println("");
                    break;
            }
        }
    }
}