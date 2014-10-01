
public class ahr implements ahl {

   private int a;
   private int b;
   private apx[][] c;
   private boolean d;
   private ahb e;


   public ahr(ahb var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.e = var1;
      this.a = var2 - var8 >> 4;
      this.b = var4 - var8 >> 4;
      int var9 = var5 + var8 >> 4;
      int var10 = var7 + var8 >> 4;
      this.c = new apx[var9 - this.a + 1][var10 - this.b + 1];
      this.d = true;

      int var11;
      int var12;
      apx var13;
      for(var11 = this.a; var11 <= var9; ++var11) {
         for(var12 = this.b; var12 <= var10; ++var12) {
            var13 = var1.e(var11, var12);
            if(var13 != null) {
               this.c[var11 - this.a][var12 - this.b] = var13;
            }
         }
      }

      for(var11 = var2 >> 4; var11 <= var5 >> 4; ++var11) {
         for(var12 = var4 >> 4; var12 <= var7 >> 4; ++var12) {
            var13 = this.c[var11 - this.a][var12 - this.b];
            if(var13 != null && !var13.c(var3, var6)) {
               this.d = false;
            }
         }
      }

   }

   public aji a(int var1, int var2, int var3) {
      aji var4 = ajn.a;
      if(var2 >= 0 && var2 < 256) {
         int var5 = (var1 >> 4) - this.a;
         int var6 = (var3 >> 4) - this.b;
         if(var5 >= 0 && var5 < this.c.length && var6 >= 0 && var6 < this.c[var5].length) {
            apx var7 = this.c[var5][var6];
            if(var7 != null) {
               var4 = var7.a(var1 & 15, var2, var3 & 15);
            }
         }
      }

      return var4;
   }

   public aor o(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.a;
      int var5 = (var3 >> 4) - this.b;
      return this.c[var4][var5].e(var1 & 15, var2, var3 & 15);
   }

   public int e(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].c(var1 & 15, var2, var3 & 15);
      }
   }

   public int e(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3).c((ahl)this, var1, var2, var3, var4);
   }
}
