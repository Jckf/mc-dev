
public class adt extends adb {

   public adt() {
      this.h = 1;
      this.a(abt.e);
   }

   public boolean a(add var1, yz var2, sv var3) {
      if(var3 instanceof wo) {
         wo var4 = (wo)var3;
         if(!var4.bZ() && !var4.f()) {
            var4.i(true);
            var4.o.a((sa)var4, "mob.horse.leather", 0.5F, 1.0F);
            --var1.b;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean a(add var1, sv var2, sv var3) {
      this.a(var1, (yz)null, var2);
      return true;
   }
}
