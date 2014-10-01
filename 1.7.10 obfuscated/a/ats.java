import java.util.Iterator;
import java.util.List;
import java.util.Random;

abstract class ats extends avk {

   protected static final qx[] a = new qx[]{new qx(ade.i, 0, 1, 3, 5), new qx(ade.j, 0, 1, 5, 5), new qx(ade.k, 0, 1, 3, 15), new qx(ade.B, 0, 1, 1, 5), new qx(ade.ah, 0, 1, 1, 5), new qx(ade.d, 0, 1, 1, 5), new qx(ade.bm, 0, 3, 7, 5), new qx(ade.av, 0, 1, 1, 10), new qx(ade.bY, 0, 1, 1, 8), new qx(ade.bX, 0, 1, 1, 5), new qx(ade.bZ, 0, 1, 1, 3)};


   public ats() {}

   protected ats(int var1) {
      super(var1);
   }

   protected void b(dh var1) {}

   protected void a(dh var1) {}

   private int a(List var1) {
      boolean var2 = false;
      int var3 = 0;

      att var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 += var5.b) {
         var5 = (att)var4.next();
         if(var5.d > 0 && var5.c < var5.d) {
            var2 = true;
         }
      }

      return var2?var3:-1;
   }

   private ats a(atw var1, List var2, List var3, Random var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = this.a(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while(var12 < 5 && var11) {
         ++var12;
         int var13 = var4.nextInt(var10);
         Iterator var14 = var2.iterator();

         while(var14.hasNext()) {
            att var15 = (att)var14.next();
            var13 -= var15.b;
            if(var13 < 0) {
               if(!var15.a(var9) || var15 == var1.b && !var15.e) {
                  break;
               }

               ats var16 = atf.a(var15, var3, var4, var5, var6, var7, var8, var9);
               if(var16 != null) {
                  ++var15.c;
                  var1.b = var15;
                  if(!var15.a()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return ath.a(var3, var4, var5, var6, var7, var8, var9);
   }

   private avk a(atw var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if(Math.abs(var4 - var1.c().a) <= 112 && Math.abs(var6 - var1.c().c) <= 112) {
         List var10 = var1.c;
         if(var9) {
            var10 = var1.d;
         }

         ats var11 = this.a(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if(var11 != null) {
            var2.add(var11);
            var1.e.add(var11);
         }

         return var11;
      } else {
         return ath.a(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   protected avk a(atw var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.g) {
      case 0:
         return this.a(var1, var2, var3, this.f.a + var4, this.f.b + var5, this.f.f + 1, this.g, this.d(), var6);
      case 1:
         return this.a(var1, var2, var3, this.f.a - 1, this.f.b + var5, this.f.c + var4, this.g, this.d(), var6);
      case 2:
         return this.a(var1, var2, var3, this.f.a + var4, this.f.b + var5, this.f.c - 1, this.g, this.d(), var6);
      case 3:
         return this.a(var1, var2, var3, this.f.d + 1, this.f.b + var5, this.f.c + var4, this.g, this.d(), var6);
      default:
         return null;
      }
   }

   protected avk b(atw var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.g) {
      case 0:
         return this.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d(), var6);
      case 1:
         return this.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d(), var6);
      case 2:
         return this.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d(), var6);
      case 3:
         return this.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d(), var6);
      default:
         return null;
      }
   }

   protected avk c(atw var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.g) {
      case 0:
         return this.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d(), var6);
      case 1:
         return this.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d(), var6);
      case 2:
         return this.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d(), var6);
      case 3:
         return this.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d(), var6);
      default:
         return null;
      }
   }

   protected static boolean a(asv var0) {
      return var0 != null && var0.b > 10;
   }

}
