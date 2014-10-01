import java.util.List;
import java.util.Random;

public class aln extends ajc {

   private final Random a = new Random();


   public aln() {
      super(awt.f);
      this.a(abt.d);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = 0.125F;
      this.a(0.0F, 0.0F, 0.0F, var8, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(1.0F - var8, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 1.0F - var8, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = q.a[var5];
      if(var10 == 1) {
         var10 = 0;
      }

      return var10;
   }

   public aor a(ahb var1, int var2) {
      return new api();
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if(var6.u()) {
         api var7 = e((ahl)var1, var2, var3, var4);
         var7.a(var6.s());
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      this.e(var1, var2, var3, var4);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         api var10 = e((ahl)var1, var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.e(var1, var2, var3, var4);
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = b(var5);
      boolean var7 = !var1.v(var2, var3, var4);
      boolean var8 = c(var5);
      if(var7 != var8) {
         var1.a(var2, var3, var4, var6 | (var7?0:8), 4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      api var7 = (api)var1.o(var2, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.a(); ++var8) {
            add var9 = var7.a(var8);
            if(var9 != null) {
               float var10 = this.a.nextFloat() * 0.8F + 0.1F;
               float var11 = this.a.nextFloat() * 0.8F + 0.1F;
               float var12 = this.a.nextFloat() * 0.8F + 0.1F;

               while(var9.b > 0) {
                  int var13 = this.a.nextInt(21) + 10;
                  if(var13 > var9.b) {
                     var13 = var9.b;
                  }

                  var9.b -= var13;
                  xk var14 = new xk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new add(var9.b(), var13, var9.k()));
                  if(var9.p()) {
                     var14.f().d((dh)var9.q().b());
                  }

                  float var15 = 0.05F;
                  var14.v = (double)((float)this.a.nextGaussian() * var15);
                  var14.w = (double)((float)this.a.nextGaussian() * var15 + 0.2F);
                  var14.x = (double)((float)this.a.nextGaussian() * var15);
                  var1.d((sa)var14);
               }
            }
         }

         var1.f(var2, var3, var4, var5);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int b() {
      return 38;
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public static int b(int var0) {
      return var0 & 7;
   }

   public static boolean c(int var0) {
      return (var0 & 8) != 8;
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return zs.b((rb)e((ahl)var1, var2, var3, var4));
   }

   public static api e(ahl var0, int var1, int var2, int var3) {
      return (api)var0.o(var1, var2, var3);
   }
}
