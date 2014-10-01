import java.util.List;
import java.util.Random;

public class apq extends aji {

   public apq() {
      super(awt.H);
      this.a(i);
      this.c(0.5F);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(var6.bE.d) {
         int var7 = b(var5);
         aji var8 = var1.a(var2 - q.b[var7], var3 - q.c[var7], var4 - q.d[var7]);
         if(var8 == ajn.J || var8 == ajn.F) {
            var1.f(var2 - q.b[var7], var3 - q.c[var7], var4 - q.d[var7]);
         }
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      int var7 = q.a[b(var6)];
      var2 += q.b[var7];
      var3 += q.c[var7];
      var4 += q.d[var7];
      aji var8 = var1.a(var2, var3, var4);
      if(var8 == ajn.J || var8 == ajn.F) {
         var6 = var1.e(var2, var3, var4);
         if(app.c(var6)) {
            var8.b(var1, var2, var3, var4, var6, 0);
            var1.f(var2, var3, var4);
         }
      }

   }

   public int b() {
      return 17;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      int var8 = var1.e(var2, var3, var4);
      float var9 = 0.25F;
      float var10 = 0.375F;
      float var11 = 0.625F;
      float var12 = 0.25F;
      float var13 = 0.75F;
      switch(b(var8)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.25F;
      switch(b(var5)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = b(var1.e(var2, var3, var4));
      aji var7 = var1.a(var2 - q.b[var6], var3 - q.c[var6], var4 - q.d[var6]);
      if(var7 != ajn.J && var7 != ajn.F) {
         var1.f(var2, var3, var4);
      } else {
         var7.a(var1, var2 - q.b[var6], var3 - q.c[var6], var4 - q.d[var6], var5);
      }

   }

   public static int b(int var0) {
      return qh.a(var0 & 7, 0, q.b.length - 1);
   }
}
