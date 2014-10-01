import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

public class mp implements ahh {

   private MinecraftServer a;
   private mt b;


   public mp(MinecraftServer var1, mt var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {}

   public void a(sa var1) {
      this.b.r().a(var1);
   }

   public void b(sa var1) {
      this.b.r().b(var1);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.a.ah().a(var2, var4, var6, var8 > 1.0F?(double)(16.0F * var8):16.0D, this.b.t.i, new hc(var1, var2, var4, var6, var8, var9));
   }

   public void a(yz var1, String var2, double var3, double var5, double var7, float var9, float var10) {
      this.a.ah().a(var1, var3, var5, var7, var9 > 1.0F?(double)(16.0F * var9):16.0D, this.b.t.i, new hc(var2, var3, var5, var7, var9, var10));
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {}

   public void a(int var1, int var2, int var3) {
      this.b.t().a(var1, var2, var3);
   }

   public void b(int var1, int var2, int var3) {}

   public void a(String var1, int var2, int var3, int var4) {}

   public void a(yz var1, int var2, int var3, int var4, int var5, int var6) {
      this.a.ah().a(var1, (double)var3, (double)var4, (double)var5, 64.0D, this.b.t.i, new ha(var2, var3, var4, var5, var6, false));
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.a.ah().a((ft)(new ha(var1, var2, var3, var4, var5, true)));
   }

   public void b(int var1, int var2, int var3, int var4, int var5) {
      Iterator var6 = this.a.ah().e.iterator();

      while(var6.hasNext()) {
         mw var7 = (mw)var6.next();
         if(var7 != null && var7.o == this.b && var7.y() != var1) {
            double var8 = (double)var2 - var7.s;
            double var10 = (double)var3 - var7.t;
            double var12 = (double)var4 - var7.u;
            if(var8 * var8 + var10 * var10 + var12 * var12 < 1024.0D) {
               var7.a.a((ft)(new ge(var1, var2, var3, var4, var5)));
            }
         }
      }

   }

   public void b() {}
}
