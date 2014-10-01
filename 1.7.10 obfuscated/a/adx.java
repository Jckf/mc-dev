
public class adx extends adb {

   public adx() {
      this.e(1);
      this.f(238);
      this.a(abt.i);
   }

   public boolean a(add var1, ahb var2, aji var3, int var4, int var5, int var6, sv var7) {
      if(var3.o() != awt.j && var3 != ajn.G && var3 != ajn.H && var3 != ajn.bd && var3 != ajn.bD) {
         return super.a(var1, var2, var3, var4, var5, var6, var7);
      } else {
         var1.a(1, var7);
         return true;
      }
   }

   public boolean b(aji var1) {
      return var1 == ajn.G || var1 == ajn.af || var1 == ajn.bD;
   }

   public float a(add var1, aji var2) {
      return var2 != ajn.G && var2.o() != awt.j?(var2 == ajn.L?5.0F:super.a(var1, var2)):15.0F;
   }
}
