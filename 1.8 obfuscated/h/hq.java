import java.util.Iterator;
import java.util.List;

public class hq {

   public static ho a(ae var0, ho var1, wv var2) {
      Object var3 = null;
      if(var1 instanceof ht) {
         ht var4 = (ht)var1;
         String var5 = var4.g();
         if(ah.b(var5)) {
            List var6 = ah.b(var0, var5, wv.class);
            if(var6.size() != 1) {
               throw new dj();
            }

            var5 = ((wv)var6.get(0)).d_();
         }

         var3 = var2 != null && var5.equals("*")?new ht(var2.d_(), var4.h()):new ht(var5, var4.h());
         ((ht)var3).b(var4.e());
      } else if(var1 instanceof hu) {
         String var7 = ((hu)var1).g();
         var3 = ah.b(var0, var7);
         if(var3 == null) {
            var3 = new hy("");
         }
      } else if(var1 instanceof hy) {
         var3 = new hy(((hy)var1).g());
      } else {
         if(!(var1 instanceof hz)) {
            return var1;
         }

         Object[] var8 = ((hz)var1).j();

         for(int var10 = 0; var10 < var8.length; ++var10) {
            Object var12 = var8[var10];
            if(var12 instanceof ho) {
               var8[var10] = a(var0, (ho)var12, var2);
            }
         }

         var3 = new hz(((hz)var1).i(), var8);
      }

      hv var9 = var1.b();
      if(var9 != null) {
         ((ho)var3).a(var9.m());
      }

      Iterator var11 = var1.a().iterator();

      while(var11.hasNext()) {
         ho var13 = (ho)var11.next();
         ((ho)var3).a(a(var0, var13, var2));
      }

      return (ho)var3;
   }
}
