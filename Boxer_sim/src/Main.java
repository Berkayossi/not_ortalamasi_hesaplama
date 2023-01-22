public class Main {
    public static void main(String[] args) {
        Boxer Basri = new Boxer("Basri",85,85,95,50);
        Boxer Nick = new Boxer("Nick", 95,110,5,55);

        Match mac = new Match(Basri,Nick,80,100);

        mac.start();
    }

}