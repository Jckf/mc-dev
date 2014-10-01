import java.util.Iterator;
import java.util.List;

public class amu extends ajd {

   private amv a;


   protected amu(String var1, awt var2, amv var3) {
      super(var1, var2);
      this.a = var3;
   }

   protected int d(int var1) {
      return var1 > 0?1:0;
   }

   protected int c(int var1) {
      return var1 == 1?15:0;
   }

   protected int e(ahb var1, int var2, int var3, int var4) {
      List var5 = null;
      if(this.a == amv.a) {
         var5 = var1.b((sa)null, this.a(var2, var3, var4));
      }

      if(this.a == amv.b) {
         var5 = var1.a(sv.class, this.a(var2, var3, var4));
      }

      if(this.a == amv.c) {
         var5 = var1.a(yz.class, this.a(var2, var3, var4));
      }

      if(var5 != null && !var5.isEmpty()) {
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            sa var7 = (sa)var6.next();
            if(!var7.az()) {
               return 15;
            }
         }
      }

      return 0;
   }
}
