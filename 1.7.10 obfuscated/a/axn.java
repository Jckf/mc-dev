import java.util.concurrent.Callable;

public abstract class axn {

   private long c;
   protected axn a;
   private long d;
   protected long b;


   public static axn[] a(long var0, ahm var2) {
      boolean var3 = false;
      axm var4 = new axm(1L);
      axj var11 = new axj(2000L, var4);
      axb var12 = new axb(1L, var11);
      ayc var13 = new ayc(2001L, var12);
      var12 = new axb(2L, var13);
      var12 = new axb(50L, var12);
      var12 = new axb(70L, var12);
      axs var14 = new axs(2L, var12);
      axd var15 = new axd(2L, var14);
      var12 = new axb(3L, var15);
      awy var16 = new awy(2L, var12, axa.a);
      var16 = new awy(2L, var16, axa.b);
      var16 = new awy(3L, var16, axa.c);
      var13 = new ayc(2002L, var16);
      var13 = new ayc(2003L, var13);
      var12 = new axb(4L, var13);
      axc var17 = new axc(5L, var12);
      awx var18 = new awx(4L, var17);
      axn var19 = ayc.b(1000L, var18, 0);
      byte var5 = 4;
      if(var2 == ahm.d) {
         var5 = 6;
      }

      if(var3) {
         var5 = 4;
      }

      axn var6 = ayc.b(1000L, var19, 0);
      axt var20 = new axt(100L, var6);
      Object var7 = new axf(200L, var19, var2);
      if(!var3) {
         axn var23 = ayc.b(1000L, (axn)var7, 2);
         var7 = new axe(1000L, var23);
      }

      axn var8 = ayc.b(1000L, var20, 2);
      axr var24 = new axr(1000L, (axn)var7, var8);
      var6 = ayc.b(1000L, var20, 2);
      var6 = ayc.b(1000L, var6, var5);
      axu var21 = new axu(1L, var6);
      axx var22 = new axx(1000L, var21);
      var7 = new axq(1001L, var24);

      for(int var9 = 0; var9 < var5; ++var9) {
         var7 = new ayc((long)(1000 + var9), (axn)var7);
         if(var9 == 0) {
            var7 = new axb(3L, (axn)var7);
         }

         if(var9 == 1) {
            var7 = new axw(1000L, (axn)var7);
         }
      }

      axx var25 = new axx(1000L, (axn)var7);
      axv var26 = new axv(100L, var25, var22);
      ayb var10 = new ayb(10L, var26);
      var26.a(var0);
      var10.a(var0);
      return new axn[]{var26, var10, var26};
   }

   public axn(long var1) {
      this.b = var1;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += var1;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += var1;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += var1;
   }

   public void a(long var1) {
      this.c = var1;
      if(this.a != null) {
         this.a.a(var1);
      }

      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += this.b;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += this.b;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += this.b;
   }

   public void a(long var1, long var3) {
      this.d = this.c;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var3;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var3;
   }

   protected int a(int var1) {
      int var2 = (int)((this.d >> 24) % (long)var1);
      if(var2 < 0) {
         var2 += var1;
      }

      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += this.c;
      return var2;
   }

   public abstract int[] a(int var1, int var2, int var3, int var4);

   protected static boolean a(int var0, int var1) {
      if(var0 == var1) {
         return true;
      } else if(var0 != ahu.aa.ay && var0 != ahu.ab.ay) {
         try {
            return ahu.d(var0) != null && ahu.d(var1) != null?ahu.d(var0).a(ahu.d(var1)):false;
         } catch (Throwable var5) {
            b var3 = b.a(var5, "Comparing biomes");
            k var4 = var3.a("Biomes being compared");
            var4.a("Biome A ID", (Object)Integer.valueOf(var0));
            var4.a("Biome B ID", (Object)Integer.valueOf(var1));
            var4.a("Biome A", (Callable)(new axo(var0)));
            var4.a("Biome B", (Callable)(new axp(var1)));
            throw new s(var3);
         }
      } else {
         return var1 == ahu.aa.ay || var1 == ahu.ab.ay;
      }
   }

   protected static boolean b(int var0) {
      return var0 == ahu.o.ay || var0 == ahu.M.ay || var0 == ahu.y.ay;
   }

   protected int a(int ... var1) {
      return var1[this.a(var1.length)];
   }

   protected int b(int var1, int var2, int var3, int var4) {
      return var2 == var3 && var3 == var4?var2:(var1 == var2 && var1 == var3?var1:(var1 == var2 && var1 == var4?var1:(var1 == var3 && var1 == var4?var1:(var1 == var2 && var3 != var4?var1:(var1 == var3 && var2 != var4?var1:(var1 == var4 && var2 != var3?var1:(var2 == var3 && var1 != var4?var2:(var2 == var4 && var1 != var3?var2:(var3 == var4 && var1 != var2?var3:this.a(new int[]{var1, var2, var3, var4}))))))))));
   }
}
