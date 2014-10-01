import java.util.Random;

public class anj extends ajr implements ajo {

   public static final String[] a = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "roofed_oak"};
   private static final rf[] b = new rf[a.length];


   protected anj() {
      float var1 = 0.4F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this.a(abt.c);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         super.a(var1, var2, var3, var4, var5);
         if(var1.k(var2, var3 + 1, var4) >= 9 && var5.nextInt(7) == 0) {
            this.c(var1, var2, var3, var4, var5);
         }

      }
   }

   public void c(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 & 8) == 0) {
         var1.a(var2, var3, var4, var6 | 8, 4);
      } else {
         this.d(var1, var2, var3, var4, var5);
      }

   }

   public void d(ahb var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4) & 7;
      Object var7 = var5.nextInt(10) == 0?new ard(true):new asq(true);
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;
      switch(var6) {
      case 0:
      default:
         break;
      case 1:
         label78:
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if(this.a(var1, var2 + var8, var3, var4 + var9, 1) && this.a(var1, var2 + var8 + 1, var3, var4 + var9, 1) && this.a(var1, var2 + var8, var3, var4 + var9 + 1, 1) && this.a(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 1)) {
                  var7 = new asa(false, var5.nextBoolean());
                  var10 = true;
                  break label78;
               }
            }
         }

         if(!var10) {
            var9 = 0;
            var8 = 0;
            var7 = new asn(true);
         }
         break;
      case 2:
         var7 = new are(true, false);
         break;
      case 3:
         label93:
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if(this.a(var1, var2 + var8, var3, var4 + var9, 3) && this.a(var1, var2 + var8 + 1, var3, var4 + var9, 3) && this.a(var1, var2 + var8, var3, var4 + var9 + 1, 3) && this.a(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 3)) {
                  var7 = new arz(true, 10, 20, 3, 3);
                  var10 = true;
                  break label93;
               }
            }
         }

         if(!var10) {
            var9 = 0;
            var8 = 0;
            var7 = new asq(true, 4 + var5.nextInt(7), 3, 3, false);
         }
         break;
      case 4:
         var7 = new ask(true);
         break;
      case 5:
         label108:
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if(this.a(var1, var2 + var8, var3, var4 + var9, 5) && this.a(var1, var2 + var8 + 1, var3, var4 + var9, 5) && this.a(var1, var2 + var8, var3, var4 + var9 + 1, 5) && this.a(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 5)) {
                  var7 = new asi(true);
                  var10 = true;
                  break label108;
               }
            }
         }

         if(!var10) {
            return;
         }
      }

      aji var11 = ajn.a;
      if(var10) {
         var1.d(var2 + var8, var3, var4 + var9, var11, 0, 4);
         var1.d(var2 + var8 + 1, var3, var4 + var9, var11, 0, 4);
         var1.d(var2 + var8, var3, var4 + var9 + 1, var11, 0, 4);
         var1.d(var2 + var8 + 1, var3, var4 + var9 + 1, var11, 0, 4);
      } else {
         var1.d(var2, var3, var4, var11, 0, 4);
      }

      if(!((arn)var7).a(var1, var5, var2 + var8, var3, var4 + var9)) {
         if(var10) {
            var1.d(var2 + var8, var3, var4 + var9, this, var6, 4);
            var1.d(var2 + var8 + 1, var3, var4 + var9, this, var6, 4);
            var1.d(var2 + var8, var3, var4 + var9 + 1, this, var6, 4);
            var1.d(var2 + var8 + 1, var3, var4 + var9 + 1, this, var6, 4);
         } else {
            var1.d(var2, var3, var4, this, var6, 4);
         }
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, int var5) {
      return var1.a(var2, var3, var4) == this && (var1.e(var2, var3, var4) & 7) == var5;
   }

   public int a(int var1) {
      return qh.a(var1 & 7, 0, 5);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      return (double)var1.s.nextFloat() < 0.45D;
   }

   public void b(ahb var1, Random var2, int var3, int var4, int var5) {
      this.c(var1, var3, var4, var5, var2);
   }

}
