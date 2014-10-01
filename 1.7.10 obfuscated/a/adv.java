
public class adv extends acx {

   private aji b;
   private aji c;


   public adv(int var1, float var2, aji var3, aji var4) {
      super(var1, var2, false);
      this.b = var3;
      this.c = var4;
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else if(var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
         if(var3.a(var4, var5, var6) == this.c && var3.c(var4, var5 + 1, var6)) {
            var3.b(var4, var5 + 1, var6, this.b);
            --var1.b;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
