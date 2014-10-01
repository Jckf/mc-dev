
public class aeg extends abh {

   private final boolean b;
   private final alj c;
   private final alj d;


   public aeg(aji var1, alj var2, alj var3, boolean var4) {
      super(var1);
      this.c = var2;
      this.d = var3;
      this.b = var4;
      this.f(0);
      this.a(true);
   }

   public int a(int var1) {
      return var1;
   }

   public String a(add var1) {
      return this.c.b(var1.k());
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(this.b) {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } else if(var1.b == 0) {
         return false;
      } else if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         aji var11 = var3.a(var4, var5, var6);
         int var12 = var3.e(var4, var5, var6);
         int var13 = var12 & 7;
         boolean var14 = (var12 & 8) != 0;
         if((var7 == 1 && !var14 || var7 == 0 && var14) && var11 == this.c && var13 == var1.k()) {
            if(var3.b(this.d.a(var3, var4, var5, var6)) && var3.d(var4, var5, var6, this.d, var13, 3)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.d.H.b(), (this.d.H.c() + 1.0F) / 2.0F, this.d.H.d() * 0.8F);
               --var1.b;
            }

            return true;
         } else {
            return this.a(var1, var2, var3, var4, var5, var6, var7)?true:super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }
   }

   private boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         --var5;
      }

      if(var7 == 1) {
         ++var5;
      }

      if(var7 == 2) {
         --var6;
      }

      if(var7 == 3) {
         ++var6;
      }

      if(var7 == 4) {
         --var4;
      }

      if(var7 == 5) {
         ++var4;
      }

      aji var8 = var3.a(var4, var5, var6);
      int var9 = var3.e(var4, var5, var6);
      int var10 = var9 & 7;
      if(var8 == this.c && var10 == var1.k()) {
         if(var3.b(this.d.a(var3, var4, var5, var6)) && var3.d(var4, var5, var6, this.d, var10, 3)) {
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.d.H.b(), (this.d.H.c() + 1.0F) / 2.0F, this.d.H.d() * 0.8F);
            --var1.b;
         }

         return true;
      } else {
         return false;
      }
   }
}
