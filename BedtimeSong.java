public class BedtimeSong {

  public static final int MAX = 10;

  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      if (1 < i && i <= 10) {
        System.out.println("There were " + i + " in the bed, and the little one said,");
        System.out.println("Roll over! Roll over!");
        System.out.println("So they all rolled over, and one fell out.\n");
      } else {
        System.out.println("There was only 1 in the bed, and the little one said,\n Roll over! Roll Over! \n  and Good Night!");
      }
    }
  }
}
