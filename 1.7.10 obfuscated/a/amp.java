import java.util.Random;

public class amp extends alk {

   public static final int[][] a = new int[][]{new int[0], {3, 1}, {2, 0}};


   public amp() {
      super("portal", awt.E, false);
      this.a(true);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.t.d() && var1.O().b("doMobSpawning") && var5.nextInt(2000) < var1.r.a()) {
         int var6;
         for(var6 = var3; !ahb.a((ahl)var1, var2, var6, var4) && var6 > 0; --var6) {
            ;
         }

         if(var6 > 0 && !var1.a(var2, var6 + 1, var4).r()) {
            sa var7 = aee.a(var1, 57, (double)var2 + 0.5D, (double)var6 + 1.1D, (double)var4 + 0.5D);
            if(var7 != null) {
               var7.am = var7.ai();
            }
         }
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = b(var1.e(var2, var3, var4));
      if(var5 == 0) {
         if(var1.a(var2 - 1, var3, var4) != this && var1.a(var2 + 1, var3, var4) != this) {
            var5 = 2;
         } else {
            var5 = 1;
         }

         if(var1 instanceof ahb && !((ahb)var1).E) {
            ((ahb)var1).a(var2, var3, var4, var5, 2);
         }
      }

      float var6 = 0.125F;
      float var7 = 0.125F;
      if(var5 == 1) {
         var6 = 0.5F;
      }

      if(var5 == 2) {
         var7 = 0.5F;
      }

      this.a(0.5F - var6, 0.0F, 0.5F - var7, 0.5F + var6, 1.0F, 0.5F + var7);
   }

   public boolean d() {
      return false;
   }

   public boolean e(ahb var1, int var2, int var3, int var4) {
      amq var5 = new amq(var1, var2, var3, var4, 1);
      amq var6 = new amq(var1, var2, var3, var4, 2);
      if(var5.b() && amq.a(var5) == 0) {
         var5.c();
         return true;
      } else if(var6.b() && amq.a(var6) == 0) {
         var6.c();
         return true;
      } else {
         return false;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = b(var1.e(var2, var3, var4));
      amq var7 = new amq(var1, var2, var3, var4, 1);
      amq var8 = new amq(var1, var2, var3, var4, 2);
      if(var6 == 1 && (!var7.b() || amq.a(var7) < amq.b(var7) * amq.c(var7))) {
         var1.b(var2, var3, var4, ajn.a);
      } else if(var6 == 2 && (!var8.b() || amq.a(var8) < amq.b(var8) * amq.c(var8))) {
         var1.b(var2, var3, var4, ajn.a);
      } else if(var6 == 0 && !var7.b() && !var8.b()) {
         var1.b(var2, var3, var4, ajn.a);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(var5.m == null && var5.l == null) {
         var5.ah();
      }

   }

   public static int b(int var0) {
      return var0 & 3;
   }

}
