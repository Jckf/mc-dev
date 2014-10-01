
public class adw extends adb {

   private aji a;
   private aji b;


   public adw(aji var1, aji var2) {
      this.a = var1;
      this.b = var2;
      this.a(abt.l);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else if(var2.a(var4, var5, var6, var7, var1) && var2.a(var4, var5 + 1, var6, var7, var1)) {
         if(var3.a(var4, var5, var6) == this.b && var3.c(var4, var5 + 1, var6)) {
            var3.b(var4, var5 + 1, var6, this.a);
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
