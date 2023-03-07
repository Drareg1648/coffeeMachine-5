package machine;

public class CoffeeType {

    static int water;
    static int milk;
    static int beans;
    static int cups;
    static int money;

    public CoffeeType() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public int getWater() {
        return this.water;
    }
    public int getMilk() {
        return this.milk;
    }
    public int getBeans() {
        return this.beans;
    }
    public int getCups() {
        return this.cups;
    }
    public int getMoney() {
        return this.money;
    }
    public void setWater( int arg ) {
        this.water = arg;
    }
    public void setMilk( int arg ) {
        this.milk = arg;
    }
    public void setBeans( int arg ) {
        this.beans = arg;
    }
    public void setCups( int arg ) {
        this.cups = arg;
    }
    public void setMoney( int arg ) {
        this.money = arg;
    }
}
