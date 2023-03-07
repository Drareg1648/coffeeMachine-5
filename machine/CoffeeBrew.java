package machine;

public class CoffeeBrew {
    String coffee;
    CoffeeType vars;

    public CoffeeBrew() {
        coffee = "current";
        vars = new CoffeeType();
    }

    public CoffeeBrew( String coffee, CoffeeType arg ) {
        this.coffee = coffee;
        setCurrent( arg );
    }

    public void setCoffee( String arg ) {
        this.coffee = arg;
    }

    public void setCurrent( CoffeeType arg ) {
        vars.water = arg.getWater();
        vars.milk = arg.getMilk();
        vars.beans = arg.getBeans();
        vars.cups = arg.getCups();
        vars.money = arg.getMoney();
    }
    public void buy( CoffeeType arg ) {

        vars.setWater( vars.getWater() - arg.getWater() );
        vars.setMilk( vars.getMilk() - arg.getMilk() );
        vars.setBeans( vars.getBeans() - arg.getBeans() );
        vars.setCups( vars.getCups() - arg.getCups());
        vars.setMoney( vars.getMoney() + arg.getMoney() );

    }
}
