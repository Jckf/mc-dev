import com.google.common.collect.Lists;
import java.util.ArrayList;

public class aoa implements aoo {

   public boolean a(ain var1, aqu var2) {
      amj var3 = null;
      ArrayList var4 = Lists.newArrayList();

      for(int var5 = 0; var5 < var1.n_(); ++var5) {
         amj var6 = var1.a(var5);
         if(var6 != null) {
            if(var6.b() instanceof ajn) {
               ajn var7 = (ajn)var6.b();
               if(var7.w_() != ajp.a || var3 != null) {
                  return false;
               }

               var3 = var6;
            } else {
               if(var6.b() != amk.aW) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return var3 != null && !var4.isEmpty();
   }

   public amj a(ain var1) {
      amj var2 = null;
      int[] var3 = new int[3];
      int var4 = 0;
      int var5 = 0;
      ajn var6 = null;

      int var7;
      int var9;
      float var10;
      float var11;
      int var17;
      for(var7 = 0; var7 < var1.n_(); ++var7) {
         amj var8 = var1.a(var7);
         if(var8 != null) {
            if(var8.b() instanceof ajn) {
               var6 = (ajn)var8.b();
               if(var6.w_() != ajp.a || var2 != null) {
                  return null;
               }

               var2 = var8.k();
               var2.b = 1;
               if(var6.d_(var8)) {
                  var9 = var6.b(var2);
                  var10 = (float)(var9 >> 16 & 255) / 255.0F;
                  var11 = (float)(var9 >> 8 & 255) / 255.0F;
                  float var12 = (float)(var9 & 255) / 255.0F;
                  var4 = (int)((float)var4 + Math.max(var10, Math.max(var11, var12)) * 255.0F);
                  var3[0] = (int)((float)var3[0] + var10 * 255.0F);
                  var3[1] = (int)((float)var3[1] + var11 * 255.0F);
                  var3[2] = (int)((float)var3[2] + var12 * 255.0F);
                  ++var5;
               }
            } else {
               if(var8.b() != amk.aW) {
                  return null;
               }

               float[] var14 = acl.a(akv.a(var8.i()));
               int var15 = (int)(var14[0] * 255.0F);
               int var16 = (int)(var14[1] * 255.0F);
               var17 = (int)(var14[2] * 255.0F);
               var4 += Math.max(var15, Math.max(var16, var17));
               var3[0] += var15;
               var3[1] += var16;
               var3[2] += var17;
               ++var5;
            }
         }
      }

      if(var6 == null) {
         return null;
      } else {
         var7 = var3[0] / var5;
         int var13 = var3[1] / var5;
         var9 = var3[2] / var5;
         var10 = (float)var4 / (float)var5;
         var11 = (float)Math.max(var7, Math.max(var13, var9));
         var7 = (int)((float)var7 * var10 / var11);
         var13 = (int)((float)var13 * var10 / var11);
         var9 = (int)((float)var9 * var10 / var11);
         var17 = (var7 << 8) + var13;
         var17 = (var17 << 8) + var9;
         var6.b(var2, var17);
         return var2;
      }
   }

   public int a() {
      return 10;
   }

   public amj b() {
      return null;
   }

   public amj[] b(ain var1) {
      amj[] var2 = new amj[var1.n_()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         amj var4 = var1.a(var3);
         if(var4 != null && var4.b().r()) {
            var2[var3] = new amj(var4.b().q());
         }
      }

      return var2;
   }
}
