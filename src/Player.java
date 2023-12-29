import java.util.Scanner;

public class Player {
    public Inventory inventory;
    public int damage, health, money;
    public String name, charName;

    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Archer() ,new Knight()};

        System.out.println("____________________________________");
        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId() +
                    "\t\tKarakter: " + gameChar.getName() +
                    "\t\t Hasar: " + gameChar.getDamage() +
                    "\t\t Sağlık: " + gameChar.getHealth() +
                    "\t\t Para: " + gameChar.getMoney());
        }
        System.out.println("____________________________________");
        System.out.println("Lütfen bir karakter seçiniz: ");

        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
        }
        System.out.println("Karakter: " + this.getName() +
                "\t\t Hasar: " + this.getDamage() +
                "\t\t Sağlık: " + this.getHealth() +
                "\t\t Para: " + this.getMoney());
    }

    public void initPlayer(GameChar gameChar) {

        this.name = gameChar.getName();
        this.damage = gameChar.getDamage();
        this.money = gameChar.getMoney();
        this.health = gameChar.getHealth();
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
