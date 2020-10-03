import modules.PhuongTrinhBacHai;
import modules.PhuongTrinhBacMot;

public class Main {

    public static void main(String[] args) {
      int a = 5;
      int b = 9;
      System.out.println(a + "X = " + ", B = " + b);
      PhuongTrinhBacMot giaiPhuongTrinh = new PhuongTrinhBacMot(a, b);
      giaiPhuongTrinh.GiaiPhuongTrinhBacMot();

      PhuongTrinhBacHai giaipt2 = new PhuongTrinhBacHai(1, 2, 3);
      giaipt2.GiaiPhuongTrinhBacHai();
    }
}
