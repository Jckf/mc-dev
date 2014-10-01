import java.util.List;

public class abj extends adb {

   public abj() {
      this.h = 1;
      this.a(abt.e);
   }

   public add a(add var1, ahb var2, yz var3) {
      float var4 = 1.0F;
      float var5 = var3.B + (var3.z - var3.B) * var4;
      float var6 = var3.A + (var3.y - var3.A) * var4;
      double var7 = var3.p + (var3.s - var3.p) * (double)var4;
      double var9 = var3.q + (var3.t - var3.q) * (double)var4 + 1.62D - (double)var3.L;
      double var11 = var3.r + (var3.u - var3.r) * (double)var4;
      azw var13 = azw.a(var7, var9, var11);
      float var14 = qh.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = qh.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -qh.b(-var5 * 0.017453292F);
      float var17 = qh.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      azw var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      azu var24 = var2.a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         azw var25 = var3.j(var4);
         boolean var26 = false;
         float var27 = 1.0F;
         List var28 = var2.b((sa)var3, var3.C.a(var25.a * var21, var25.b * var21, var25.c * var21).b((double)var27, (double)var27, (double)var27));

         int var29;
         for(var29 = 0; var29 < var28.size(); ++var29) {
            sa var30 = (sa)var28.get(var29);
            if(var30.R()) {
               float var31 = var30.af();
               azt var32 = var30.C.b((double)var31, (double)var31, (double)var31);
               if(var32.a(var13)) {
                  var26 = true;
               }
            }
         }

         if(var26) {
            return var1;
         } else {
            if(var24.a == azv.b) {
               var29 = var24.b;
               int var33 = var24.c;
               int var34 = var24.d;
               if(var2.a(var29, var33, var34) == ajn.aC) {
                  --var33;
               }

               xi var35 = new xi(var2, (double)((float)var29 + 0.5F), (double)((float)var33 + 1.0F), (double)((float)var34 + 0.5F));
               var35.y = (float)(((qh.c((double)(var3.y * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
               if(!var2.a((sa)var35, var35.C.b(-0.1D, -0.1D, -0.1D)).isEmpty()) {
                  return var1;
               }

               if(!var2.E) {
                  var2.d((sa)var35);
               }

               if(!var3.bE.d) {
                  --var1.b;
               }
            }

            return var1;
         }
      }
   }
}
