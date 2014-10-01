import java.util.List;
import java.util.Random;

public class ajq extends ajc {

   private Random a = new Random();


   public ajq() {
      super(awt.f);
   }

   public boolean c() {
      return false;
   }

   public int b() {
      return 25;
   }

   public aor a(ahb var1, int var2) {
      return new aov();
   }

   public boolean d() {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.g();
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         aov var10 = (aov)var1.o(var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      if(var6.u()) {
         ((aov)var1.o(var2, var3, var4)).a(var6.s());
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      aor var7 = var1.o(var2, var3, var4);
      if(var7 instanceof aov) {
         aov var8 = (aov)var7;

         for(int var9 = 0; var9 < var8.a(); ++var9) {
            add var10 = var8.a(var9);
            if(var10 != null) {
               float var11 = this.a.nextFloat() * 0.8F + 0.1F;
               float var12 = this.a.nextFloat() * 0.8F + 0.1F;
               float var13 = this.a.nextFloat() * 0.8F + 0.1F;

               while(var10.b > 0) {
                  int var14 = this.a.nextInt(21) + 10;
                  if(var14 > var10.b) {
                     var14 = var10.b;
                  }

                  var10.b -= var14;
                  xk var15 = new xk(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new add(var10.b(), var14, var10.k()));
                  float var16 = 0.05F;
                  var15.v = (double)((float)this.a.nextGaussian() * var16);
                  var15.w = (double)((float)this.a.nextGaussian() * var16 + 0.2F);
                  var15.x = (double)((float)this.a.nextGaussian() * var16);
                  var1.d((sa)var15);
               }
            }
         }
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.bt;
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return zs.b((rb)var1.o(var2, var3, var4));
   }
}
