import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class avo extends avm {

   private boolean c;


   public avo() {}

   public avo(ahb var1, Random var2, int var3, int var4, int var5) {
      super(var3, var4);
      List var6 = avp.a(var2, var5);
      awa var7 = new awa(var1.v(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var6, var5);
      this.a.add(var7);
      var7.a(var7, this.a, var2);
      List var8 = var7.j;
      List var9 = var7.i;

      int var10;
      while(!var8.isEmpty() || !var9.isEmpty()) {
         avk var11;
         if(var8.isEmpty()) {
            var10 = var2.nextInt(var9.size());
            var11 = (avk)var9.remove(var10);
            var11.a((avk)var7, (List)this.a, var2);
         } else {
            var10 = var2.nextInt(var8.size());
            var11 = (avk)var8.remove(var10);
            var11.a((avk)var7, (List)this.a, var2);
         }
      }

      this.c();
      var10 = 0;
      Iterator var13 = this.a.iterator();

      while(var13.hasNext()) {
         avk var12 = (avk)var13.next();
         if(!(var12 instanceof awe)) {
            ++var10;
         }
      }

      this.c = var10 > 2;
   }

   public boolean d() {
      return this.c;
   }

   public void a(dh var1) {
      super.a(var1);
      var1.a("Valid", this.c);
   }

   public void b(dh var1) {
      super.b(var1);
      this.c = var1.n("Valid");
   }
}
