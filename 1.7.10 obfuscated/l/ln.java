import java.util.Comparator;

public class ln implements Comparator {

   private final r a;


   public ln(r var1) {
      this.a = var1;
   }

   public int a(mw var1, mw var2) {
      double var3 = var1.e((double)this.a.a, (double)this.a.b, (double)this.a.c);
      double var5 = var2.e((double)this.a.a, (double)this.a.b, (double)this.a.c);
      return var3 < var5?-1:(var3 > var5?1:0);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((mw)var1, (mw)var2);
   }
}
