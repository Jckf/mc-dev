import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class awa extends awf {

   public aib a;
   public boolean b;
   public int c;
   public avu d;
   public List e;
   public List i = new ArrayList();
   public List j = new ArrayList();


   public awa() {}

   public awa(aib var1, int var2, Random var3, int var4, int var5, List var6, int var7) {
      super((awa)null, 0, var3, var4, var5);
      this.a = var1;
      this.e = var6;
      this.c = var7;
      ahu var8 = var1.a(var4, var5);
      this.b = var8 == ahu.q || var8 == ahu.F;
   }

   public aib e() {
      return this.a;
   }
}
