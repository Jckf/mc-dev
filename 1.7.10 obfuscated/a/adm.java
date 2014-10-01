
public class adm extends adb {

   public adm() {
      this.a(abt.i);
   }

   public boolean a(add var1, yz var2, sv var3) {
      if(!var1.u()) {
         return false;
      } else if(var3 instanceof sw) {
         sw var4 = (sw)var3;
         var4.a(var1.s());
         var4.bF();
         --var1.b;
         return true;
      } else {
         return super.a(var1, var2, var3);
      }
   }
}
