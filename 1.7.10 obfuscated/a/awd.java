import java.util.List;
import java.util.Random;

abstract class awd extends avk {

   protected int k = -1;
   private int a;
   private boolean b;


   public awd() {}

   protected awd(awa var1, int var2) {
      super(var2);
      if(var1 != null) {
         this.b = var1.b;
      }

   }

   protected void a(dh var1) {
      var1.a("HPos", this.k);
      var1.a("VCount", this.a);
      var1.a("Desert", this.b);
   }

   protected void b(dh var1) {
      this.k = var1.f("HPos");
      this.a = var1.f("VCount");
      this.b = var1.n("Desert");
   }

   protected avk a(awa var1, List var2, Random var3, int var4, int var5) {
      switch(this.g) {
      case 0:
         return avp.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d());
      case 1:
         return avp.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d());
      case 2:
         return avp.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d());
      case 3:
         return avp.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d());
      default:
         return null;
      }
   }

   protected avk b(awa var1, List var2, Random var3, int var4, int var5) {
      switch(this.g) {
      case 0:
         return avp.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d());
      case 1:
         return avp.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d());
      case 2:
         return avp.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d());
      case 3:
         return avp.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d());
      default:
         return null;
      }
   }

   protected int b(ahb var1, asv var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = this.f.c; var5 <= this.f.f; ++var5) {
         for(int var6 = this.f.a; var6 <= this.f.d; ++var6) {
            if(var2.b(var6, 64, var5)) {
               var3 += Math.max(var1.i(var6, var5), var1.t.i());
               ++var4;
            }
         }
      }

      if(var4 == 0) {
         return -1;
      } else {
         return var3 / var4;
      }
   }

   protected static boolean a(asv var0) {
      return var0 != null && var0.b > 10;
   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6) {
      if(this.a < var6) {
         for(int var7 = this.a; var7 < var6; ++var7) {
            int var8 = this.a(var3 + var7, var5);
            int var9 = this.a(var4);
            int var10 = this.b(var3 + var7, var5);
            if(!var2.b(var8, var9, var10)) {
               break;
            }

            ++this.a;
            yv var11 = new yv(var1, this.b(var7));
            var11.b((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
            var1.d((sa)var11);
         }

      }
   }

   protected int b(int var1) {
      return 0;
   }

   protected aji b(aji var1, int var2) {
      if(this.b) {
         if(var1 == ajn.r || var1 == ajn.s) {
            return ajn.A;
         }

         if(var1 == ajn.e) {
            return ajn.A;
         }

         if(var1 == ajn.f) {
            return ajn.A;
         }

         if(var1 == ajn.ad) {
            return ajn.bz;
         }

         if(var1 == ajn.ar) {
            return ajn.bz;
         }

         if(var1 == ajn.n) {
            return ajn.A;
         }
      }

      return var1;
   }

   protected int c(aji var1, int var2) {
      if(this.b) {
         if(var1 == ajn.r || var1 == ajn.s) {
            return 0;
         }

         if(var1 == ajn.e) {
            return 0;
         }

         if(var1 == ajn.f) {
            return 2;
         }
      }

      return var2;
   }

   protected void a(ahb var1, aji var2, int var3, int var4, int var5, int var6, asv var7) {
      aji var8 = this.b(var2, var3);
      int var9 = this.c(var2, var3);
      super.a(var1, var8, var9, var4, var5, var6, var7);
   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, aji var10, boolean var11) {
      aji var12 = this.b(var9, 0);
      int var13 = this.c(var9, 0);
      aji var14 = this.b(var10, 0);
      int var15 = this.c(var10, 0);
      super.a(var1, var2, var3, var4, var5, var6, var7, var8, var12, var13, var14, var15, var11);
   }

   protected void b(ahb var1, aji var2, int var3, int var4, int var5, int var6, asv var7) {
      aji var8 = this.b(var2, var3);
      int var9 = this.c(var2, var3);
      super.b(var1, var8, var9, var4, var5, var6, var7);
   }
}
