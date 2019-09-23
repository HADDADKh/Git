public class TestLamda {

  public static void main(String[] args) {
    afficher("Bonjour",5);
  }

  public static void afficher(String message, int repetition) {
    Runnable r = () -> {
      for (int i = 0; i < repetition; i++) {
        System.out.println(message);
      }
    };
    new Thread(r).start();
  }
}