import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class agw {

   public boolean a;
   public boolean b = true;
   private int i = 16;
   private Random j = new Random();
   private ahb k;
   public double c;
   public double d;
   public double e;
   public sa f;
   public float g;
   public List h = new ArrayList();
   private Map l = new HashMap();


   public agw(ahb var1, sa var2, double var3, double var5, double var7, float var9) {
      this.k = var1;
      this.f = var2;
      this.g = var9;
      this.c = var3;
      this.d = var5;
      this.e = var7;
   }

   public void a() {
      float var1 = this.g;
      HashSet var2 = new HashSet();

      int var3;
      int var4;
      int var5;
      double var15;
      double var17;
      double var19;
      for(var3 = 0; var3 < this.i; ++var3) {
         for(var4 = 0; var4 < this.i; ++var4) {
            for(var5 = 0; var5 < this.i; ++var5) {
               if(var3 == 0 || var3 == this.i - 1 || var4 == 0 || var4 == this.i - 1 || var5 == 0 || var5 == this.i - 1) {
                  double var6 = (double)((float)var3 / ((float)this.i - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)this.i - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)this.i - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.g * (0.7F + this.k.s.nextFloat() * 0.6F);
                  var15 = this.c;
                  var17 = this.d;
                  var19 = this.e;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = qh.c(var15);
                     int var23 = qh.c(var17);
                     int var24 = qh.c(var19);
                     aji var25 = this.k.a(var22, var23, var24);
                     if(var25.o() != awt.a) {
                        float var26 = this.f != null?this.f.a(this, this.k, var22, var23, var24, var25):var25.a(this.f);
                        var14 -= (var26 + 0.3F) * var21;
                     }

                     if(var14 > 0.0F && (this.f == null || this.f.a(this, this.k, var22, var23, var24, var25, var14))) {
                        var2.add(new agt(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.h.addAll(var2);
      this.g *= 2.0F;
      var3 = qh.c(this.c - (double)this.g - 1.0D);
      var4 = qh.c(this.c + (double)this.g + 1.0D);
      var5 = qh.c(this.d - (double)this.g - 1.0D);
      int var29 = qh.c(this.d + (double)this.g + 1.0D);
      int var7 = qh.c(this.e - (double)this.g - 1.0D);
      int var30 = qh.c(this.e + (double)this.g + 1.0D);
      List var9 = this.k.b(this.f, azt.a((double)var3, (double)var5, (double)var7, (double)var4, (double)var29, (double)var30));
      azw var31 = azw.a(this.c, this.d, this.e);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         sa var32 = (sa)var9.get(var11);
         double var13 = var32.f(this.c, this.d, this.e) / (double)this.g;
         if(var13 <= 1.0D) {
            var15 = var32.s - this.c;
            var17 = var32.t + (double)var32.g() - this.d;
            var19 = var32.u - this.e;
            double var33 = (double)qh.a(var15 * var15 + var17 * var17 + var19 * var19);
            if(var33 != 0.0D) {
               var15 /= var33;
               var17 /= var33;
               var19 /= var33;
               double var34 = (double)this.k.a(var31, var32.C);
               double var35 = (1.0D - var13) * var34;
               var32.a(ro.a(this), (float)((int)((var35 * var35 + var35) / 2.0D * 8.0D * (double)this.g + 1.0D)));
               double var27 = agi.a(var32, var35);
               var32.v += var15 * var27;
               var32.w += var17 * var27;
               var32.x += var19 * var27;
               if(var32 instanceof yz) {
                  this.l.put((yz)var32, azw.a(var15 * var35, var17 * var35, var19 * var35));
               }
            }
         }
      }

      this.g = var1;
   }

   public void a(boolean var1) {
      this.k.a(this.c, this.d, this.e, "random.explode", 4.0F, (1.0F + (this.k.s.nextFloat() - this.k.s.nextFloat()) * 0.2F) * 0.7F);
      if(this.g >= 2.0F && this.b) {
         this.k.a("hugeexplosion", this.c, this.d, this.e, 1.0D, 0.0D, 0.0D);
      } else {
         this.k.a("largeexplode", this.c, this.d, this.e, 1.0D, 0.0D, 0.0D);
      }

      Iterator var2;
      agt var3;
      int var4;
      int var5;
      int var6;
      aji var7;
      if(this.b) {
         var2 = this.h.iterator();

         while(var2.hasNext()) {
            var3 = (agt)var2.next();
            var4 = var3.a;
            var5 = var3.b;
            var6 = var3.c;
            var7 = this.k.a(var4, var5, var6);
            if(var1) {
               double var8 = (double)((float)var4 + this.k.s.nextFloat());
               double var10 = (double)((float)var5 + this.k.s.nextFloat());
               double var12 = (double)((float)var6 + this.k.s.nextFloat());
               double var14 = var8 - this.c;
               double var16 = var10 - this.d;
               double var18 = var12 - this.e;
               double var20 = (double)qh.a(var14 * var14 + var16 * var16 + var18 * var18);
               var14 /= var20;
               var16 /= var20;
               var18 /= var20;
               double var22 = 0.5D / (var20 / (double)this.g + 0.1D);
               var22 *= (double)(this.k.s.nextFloat() * this.k.s.nextFloat() + 0.3F);
               var14 *= var22;
               var16 *= var22;
               var18 *= var22;
               this.k.a("explode", (var8 + this.c * 1.0D) / 2.0D, (var10 + this.d * 1.0D) / 2.0D, (var12 + this.e * 1.0D) / 2.0D, var14, var16, var18);
               this.k.a("smoke", var8, var10, var12, var14, var16, var18);
            }

            if(var7.o() != awt.a) {
               if(var7.a(this)) {
                  var7.a(this.k, var4, var5, var6, this.k.e(var4, var5, var6), 1.0F / this.g, 0);
               }

               this.k.d(var4, var5, var6, ajn.a, 0, 3);
               var7.a(this.k, var4, var5, var6, this);
            }
         }
      }

      if(this.a) {
         var2 = this.h.iterator();

         while(var2.hasNext()) {
            var3 = (agt)var2.next();
            var4 = var3.a;
            var5 = var3.b;
            var6 = var3.c;
            var7 = this.k.a(var4, var5, var6);
            aji var24 = this.k.a(var4, var5 - 1, var6);
            if(var7.o() == awt.a && var24.j() && this.j.nextInt(3) == 0) {
               this.k.b(var4, var5, var6, (aji)ajn.ab);
            }
         }
      }

   }

   public Map b() {
      return this.l;
   }

   public sv c() {
      return this.f == null?null:(this.f instanceof xw?((xw)this.f).e():(this.f instanceof sv?(sv)this.f:null));
   }
}
