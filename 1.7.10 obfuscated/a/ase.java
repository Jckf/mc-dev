import java.util.Random;

public class ase extends arn {

   private aji a;
   private int b;
   private aji c;


   public ase(aji var1, int var2) {
      this(var1, var2, ajn.b);
   }

   public ase(aji var1, int var2, aji var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean a(ahb var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * 3.1415927F;
      double var7 = (double)((float)(var3 + 8) + qh.a(var6) * (float)this.b / 8.0F);
      double var9 = (double)((float)(var3 + 8) - qh.a(var6) * (float)this.b / 8.0F);
      double var11 = (double)((float)(var5 + 8) + qh.b(var6) * (float)this.b / 8.0F);
      double var13 = (double)((float)(var5 + 8) - qh.b(var6) * (float)this.b / 8.0F);
      double var15 = (double)(var4 + var2.nextInt(3) - 2);
      double var17 = (double)(var4 + var2.nextInt(3) - 2);

      for(int var19 = 0; var19 <= this.b; ++var19) {
         double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.b;
         double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.b;
         double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.b;
         double var26 = var2.nextDouble() * (double)this.b / 16.0D;
         double var28 = (double)(qh.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;
         double var30 = (double)(qh.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;
         int var32 = qh.c(var20 - var28 / 2.0D);
         int var33 = qh.c(var22 - var30 / 2.0D);
         int var34 = qh.c(var24 - var28 / 2.0D);
         int var35 = qh.c(var20 + var28 / 2.0D);
         int var36 = qh.c(var22 + var30 / 2.0D);
         int var37 = qh.c(var24 + var28 / 2.0D);

         for(int var38 = var32; var38 <= var35; ++var38) {
            double var39 = ((double)var38 + 0.5D - var20) / (var28 / 2.0D);
            if(var39 * var39 < 1.0D) {
               for(int var41 = var33; var41 <= var36; ++var41) {
                  double var42 = ((double)var41 + 0.5D - var22) / (var30 / 2.0D);
                  if(var39 * var39 + var42 * var42 < 1.0D) {
                     for(int var44 = var34; var44 <= var37; ++var44) {
                        double var45 = ((double)var44 + 0.5D - var24) / (var28 / 2.0D);
                        if(var39 * var39 + var42 * var42 + var45 * var45 < 1.0D && var1.a(var38, var41, var44) == this.c) {
                           var1.d(var38, var41, var44, this.a, 0, 2);
                        }
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
