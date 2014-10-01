import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class aib {

   private axn c;
   private axn d;
   private ahy e;
   private List f;


   protected aib() {
      this.e = new ahy(this);
      this.f = new ArrayList();
      this.f.add(ahu.s);
      this.f.add(ahu.p);
      this.f.add(ahu.t);
      this.f.add(ahu.H);
      this.f.add(ahu.G);
      this.f.add(ahu.J);
      this.f.add(ahu.K);
   }

   public aib(long var1, ahm var3) {
      this();
      axn[] var4 = axn.a(var1, var3);
      this.c = var4[0];
      this.d = var4[1];
   }

   public aib(ahb var1) {
      this(var1.H(), var1.N().u());
   }

   public List a() {
      return this.f;
   }

   public ahu a(int var1, int var2) {
      return this.e.b(var1, var2);
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      axl.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.d.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         try {
            float var8 = (float)ahu.d(var6[var7]).h() / 65536.0F;
            if(var8 > 1.0F) {
               var8 = 1.0F;
            }

            var1[var7] = var8;
         } catch (Throwable var11) {
            b var9 = b.a(var11, "Invalid Biome id");
            k var10 = var9.a("DownfallBlock");
            var10.a("biome id", (Object)Integer.valueOf(var7));
            var10.a("downfalls[] size", (Object)Integer.valueOf(var1.length));
            var10.a("x", (Object)Integer.valueOf(var2));
            var10.a("z", (Object)Integer.valueOf(var3));
            var10.a("w", (Object)Integer.valueOf(var4));
            var10.a("h", (Object)Integer.valueOf(var5));
            throw new s(var9);
         }
      }

      return var1;
   }

   public ahu[] a(ahu[] var1, int var2, int var3, int var4, int var5) {
      axl.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new ahu[var4 * var5];
      }

      int[] var6 = this.c.a(var2, var3, var4, var5);

      try {
         for(int var7 = 0; var7 < var4 * var5; ++var7) {
            var1[var7] = ahu.d(var6[var7]);
         }

         return var1;
      } catch (Throwable var10) {
         b var8 = b.a(var10, "Invalid Biome id");
         k var9 = var8.a("RawBiomeBlock");
         var9.a("biomes[] size", (Object)Integer.valueOf(var1.length));
         var9.a("x", (Object)Integer.valueOf(var2));
         var9.a("z", (Object)Integer.valueOf(var3));
         var9.a("w", (Object)Integer.valueOf(var4));
         var9.a("h", (Object)Integer.valueOf(var5));
         throw new s(var8);
      }
   }

   public ahu[] b(ahu[] var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5, true);
   }

   public ahu[] a(ahu[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      axl.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new ahu[var4 * var5];
      }

      if(var6 && var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         ahu[] var9 = this.e.d(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.d.a(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = ahu.d(var7[var8]);
         }

         return var1;
      }
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      axl.a();
      int var5 = var1 - var3 >> 2;
      int var6 = var2 - var3 >> 2;
      int var7 = var1 + var3 >> 2;
      int var8 = var2 + var3 >> 2;
      int var9 = var7 - var5 + 1;
      int var10 = var8 - var6 + 1;
      int[] var11 = this.c.a(var5, var6, var9, var10);

      try {
         for(int var12 = 0; var12 < var9 * var10; ++var12) {
            ahu var16 = ahu.d(var11[var12]);
            if(!var4.contains(var16)) {
               return false;
            }
         }

         return true;
      } catch (Throwable var15) {
         b var13 = b.a(var15, "Invalid Biome id");
         k var14 = var13.a("Layer");
         var14.a("Layer", (Object)this.c.toString());
         var14.a("x", (Object)Integer.valueOf(var1));
         var14.a("z", (Object)Integer.valueOf(var2));
         var14.a("radius", (Object)Integer.valueOf(var3));
         var14.a("allowed", (Object)var4);
         throw new s(var13);
      }
   }

   public agt a(int var1, int var2, int var3, List var4, Random var5) {
      axl.a();
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.c.a(var6, var7, var10, var11);
      agt var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var10 * var11; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         ahu var18 = ahu.d(var12[var15]);
         if(var4.contains(var18) && (var13 == null || var5.nextInt(var14 + 1) == 0)) {
            var13 = new agt(var16, 0, var17);
            ++var14;
         }
      }

      return var13;
   }

   public void b() {
      this.e.a();
   }
}
