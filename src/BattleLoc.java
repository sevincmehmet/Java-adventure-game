public class BattleLoc extends Location{
    public Obstacle obstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle) {

        super(player, name);
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {
        return super.onLocation();
    }

    public void combat() {
    } 
}
