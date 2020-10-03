package modules;

public class PhuongTrinhBacHai {
  private final int a;
  private final int b;
  private final int c;

  public PhuongTrinhBacHai(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void GiaiPhuongTrinhBacHai() {
    if (a == 0) {
      PhuongTrinhBacMot pt1 = new PhuongTrinhBacMot(this.b, this.c);
      pt1.GiaiPhuongTrinhBacMot();
    } else {
      final double denta = b * b - a * c;
      if (denta < 0) {
        System.out.println("Phương trình vô nghiệm");
      } else if (denta == 0) {
        System.out.println("Phương trình có nghiệm kép x1 = x2 = " + ((double) - this.b / (this.a *2)));
      } else {
        System.out.println("Phương trình có hai nghiệm phân biệt");
        final double sqrtdenta = Math.sqrt(denta);
        System.out.println("x1 = " + (( - b + sqrtdenta) / (2 * this.a)));
        System.out.println("x2 = " + (( - b - sqrtdenta) / (2 * this.a)));
      }
    }
  }
}
