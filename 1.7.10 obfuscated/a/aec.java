
public class aec extends abe {

   public aec(aji var1, aji var2) {
      super(var1, var2);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var1.b == 0) {
         return false;
      } else if(!var2.a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         aji var11 = var3.a(var4, var5, var6);
         if(var11 == ajn.aC) {
            int var12 = var3.e(var4, var5, var6);
            int var13 = var12 & 7;
            if(var13 <= 6 && var3.b(this.a.a(var3, var4, var5, var6)) && var3.a(var4, var5, var6, var13 + 1 | var12 & -8, 2)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
               --var1.b;
               return true;
            }
         }

         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }
}
