import java.util.Iterator;
import java.util.List;

public class azf extends ath {

   public static final bet a = bet.a("powered");
   private final azh b;


   protected azf(bof var1, azh var2) {
      super(var1);
      this.j(this.L.b().a(a, Boolean.valueOf(false)));
      this.b = var2;
   }

   protected int e(bec var1) {
      return ((Boolean)var1.b(a)).booleanValue()?15:0;
   }

   protected bec a(bec var1, int var2) {
      return var1.a(a, Boolean.valueOf(var2 > 0));
   }

   protected int e(aqu var1, dt var2) {
      brt var3 = this.a(var2);
      List var4;
      switch(azg.a[this.b.ordinal()]) {
      case 1:
         var4 = var1.b((wv)null, var3);
         break;
      case 2:
         var4 = var1.a(xm.class, var3);
         break;
      default:
         return 0;
      }

      if(!var4.isEmpty()) {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            wv var6 = (wv)var5.next();
            if(!var6.aH()) {
               return 15;
            }
         }
      }

      return 0;
   }

   public bec a(int var1) {
      return this.P().a(a, Boolean.valueOf(var1 == 1));
   }

   public int c(bec var1) {
      return ((Boolean)var1.b(a)).booleanValue()?1:0;
   }

   protected bed e() {
      return new bed(this, new bex[]{a});
   }

}
