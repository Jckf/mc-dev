import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class br extends y {

   public String c() {
      return "spreadplayers";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.spreadplayers.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 6) {
         throw new ci("commands.spreadplayers.usage", new Object[0]);
      } else {
         byte var3 = 0;
         int var16 = var3 + 1;
         double var4 = a(var1, Double.NaN, var2[var3]);
         double var6 = a(var1, Double.NaN, var2[var16++]);
         double var8 = a(var1, var2[var16++], 0.0D);
         double var10 = a(var1, var2[var16++], var8 + 1.0D);
         boolean var12 = c(var1, var2[var16++]);
         ArrayList var13 = Lists.newArrayList();

         while(true) {
            while(var16 < var2.length) {
               String var14 = var2[var16++];
               if(ad.b(var14)) {
                  mw[] var17 = ad.c(var1, var14);
                  if(var17 == null || var17.length == 0) {
                     throw new cg();
                  }

                  Collections.addAll(var13, var17);
               } else {
                  mw var15 = MinecraftServer.I().ah().a(var14);
                  if(var15 == null) {
                     throw new cg();
                  }

                  var13.add(var15);
               }
            }

            if(var13.isEmpty()) {
               throw new cg();
            }

            var1.a(new fr("commands.spreadplayers.spreading." + (var12?"teams":"players"), new Object[]{Integer.valueOf(var13.size()), Double.valueOf(var10), Double.valueOf(var4), Double.valueOf(var6), Double.valueOf(var8)}));
            this.a(var1, var13, new bs(var4, var6), var8, var10, ((sv)var13.get(0)).o, var12);
            return;
         }
      }
   }

   private void a(ac var1, List var2, bs var3, double var4, double var6, ahb var8, boolean var9) {
      Random var10 = new Random();
      double var11 = var3.a - var6;
      double var13 = var3.b - var6;
      double var15 = var3.a + var6;
      double var17 = var3.b + var6;
      bs[] var19 = this.a(var10, var9?this.a(var2):var2.size(), var11, var13, var15, var17);
      int var20 = this.a(var3, var4, var8, var10, var11, var13, var15, var17, var19, var9);
      double var21 = this.a(var2, var8, var19, var9);
      a(var1, this, "commands.spreadplayers.success." + (var9?"teams":"players"), new Object[]{Integer.valueOf(var19.length), Double.valueOf(var3.a), Double.valueOf(var3.b)});
      if(var19.length > 1) {
         var1.a(new fr("commands.spreadplayers.info." + (var9?"teams":"players"), new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var21)}), Integer.valueOf(var20)}));
      }

   }

   private int a(List var1) {
      HashSet var2 = Sets.newHashSet();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         sv var4 = (sv)var3.next();
         if(var4 instanceof yz) {
            var2.add(var4.bt());
         } else {
            var2.add((Object)null);
         }
      }

      return var2.size();
   }

   private int a(bs var1, double var2, ahb var4, Random var5, double var6, double var8, double var10, double var12, bs[] var14, boolean var15) {
      boolean var16 = true;
      double var18 = 3.4028234663852886E38D;

      int var17;
      for(var17 = 0; var17 < 10000 && var16; ++var17) {
         var16 = false;
         var18 = 3.4028234663852886E38D;

         int var22;
         bs var23;
         for(int var20 = 0; var20 < var14.length; ++var20) {
            bs var21 = var14[var20];
            var22 = 0;
            var23 = new bs();

            for(int var24 = 0; var24 < var14.length; ++var24) {
               if(var20 != var24) {
                  bs var25 = var14[var24];
                  double var26 = var21.a(var25);
                  var18 = Math.min(var26, var18);
                  if(var26 < var2) {
                     ++var22;
                     var23.a += var25.a - var21.a;
                     var23.b += var25.b - var21.b;
                  }
               }
            }

            if(var22 > 0) {
               var23.a /= (double)var22;
               var23.b /= (double)var22;
               double var30 = (double)var23.b();
               if(var30 > 0.0D) {
                  var23.a();
                  var21.b(var23);
               } else {
                  var21.a(var5, var6, var8, var10, var12);
               }

               var16 = true;
            }

            if(var21.a(var6, var8, var10, var12)) {
               var16 = true;
            }
         }

         if(!var16) {
            bs[] var28 = var14;
            int var29 = var14.length;

            for(var22 = 0; var22 < var29; ++var22) {
               var23 = var28[var22];
               if(!var23.b(var4)) {
                  var23.a(var5, var6, var8, var10, var12);
                  var16 = true;
               }
            }
         }
      }

      if(var17 >= 10000) {
         throw new cd("commands.spreadplayers.failure." + (var15?"teams":"players"), new Object[]{Integer.valueOf(var14.length), Double.valueOf(var1.a), Double.valueOf(var1.b), String.format("%.2f", new Object[]{Double.valueOf(var18)})});
      } else {
         return var17;
      }
   }

   private double a(List var1, ahb var2, bs[] var3, boolean var4) {
      double var5 = 0.0D;
      int var7 = 0;
      HashMap var8 = Maps.newHashMap();

      for(int var9 = 0; var9 < var1.size(); ++var9) {
         sv var10 = (sv)var1.get(var9);
         bs var11;
         if(var4) {
            bae var12 = var10 instanceof yz?var10.bt():null;
            if(!var8.containsKey(var12)) {
               var8.put(var12, var3[var7++]);
            }

            var11 = (bs)var8.get(var12);
         } else {
            var11 = var3[var7++];
         }

         var10.a((double)((float)qh.c(var11.a) + 0.5F), (double)var11.a(var2), (double)qh.c(var11.b) + 0.5D);
         double var17 = Double.MAX_VALUE;

         for(int var14 = 0; var14 < var3.length; ++var14) {
            if(var11 != var3[var14]) {
               double var15 = var11.a(var3[var14]);
               var17 = Math.min(var15, var17);
            }
         }

         var5 += var17;
      }

      var5 /= (double)var1.size();
      return var5;
   }

   private bs[] a(Random var1, int var2, double var3, double var5, double var7, double var9) {
      bs[] var11 = new bs[var2];

      for(int var12 = 0; var12 < var11.length; ++var12) {
         bs var13 = new bs();
         var13.a(var1, var3, var5, var7, var9);
         var11[var12] = var13;
      }

      return var11;
   }
}
