package modules;

public class PhuongTrinhBacMot {
  private final int a;
  private final int b;
  public PhuongTrinhBacMot(int a, int b) {
    this.a = a;
    this.b = b;
  }
  public void GiaiPhuongTrinhBacMot() {
    if (this.a != 0) {
      final double x = - (double) this.b / this.a;
      System.out.println(" Phương trình có một nghiệm x = " + x);
    } else {
      if ( this.b == 0) {
        System.out.println("Phương trình có vô số nghiệm");
      } else {
        System.out.println("Phương trình vô nghiệm");
      }
    }
  }
}
