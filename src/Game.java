import java.util.Scanner;

public class Game {
    public Player player;
    public Location location;

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.print("Lütfen kullancı adınızı giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Macera oyunumuza hoşgeldin " + player.getName());

        System.out.println("Lütfen bir karakter seçiniz: ");
        player.selectChar();

    }
}
