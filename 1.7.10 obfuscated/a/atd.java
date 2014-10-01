import java.util.ArrayList;
import java.util.List;

public class atd extends ave {

   private List e = new ArrayList();


   public atd() {
      this.e.add(new ahx(xx.class, 10, 2, 3));
      this.e.add(new ahx(yh.class, 5, 4, 4));
      this.e.add(new ahx(yl.class, 10, 4, 4));
      this.e.add(new ahx(yf.class, 3, 4, 4));
   }

   public String a() {
      return "Fortress";
   }

   public List b() {
      return this.e;
   }

   protected boolean a(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.b.setSeed((long)(var3 ^ var4 << 4) ^ this.c.H());
      this.b.nextInt();
      return this.b.nextInt(3) != 0?false:(var1 != (var3 << 4) + 4 + this.b.nextInt(8)?false:var2 == (var4 << 4) + 4 + this.b.nextInt(8));
   }

   protected avm b(int var1, int var2) {
      return new ate(this.c, this.b, var1, var2);
   }
}
