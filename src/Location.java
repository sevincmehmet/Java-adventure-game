public abstract class Location {
    public Player player;
    public String name;

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public boolean onLocation() {
        return false;
    }

}
