
public class afc extends afh {

   public afc() {
      super(3, 3, new add[]{new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aY, 0, 32767), new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aF)}, new add(ade.bJ, 0, 0));
   }

   public boolean a(aae var1, ahb var2) {
      if(!super.a(var1, var2)) {
         return false;
      } else {
         add var3 = null;

         for(int var4 = 0; var4 < var1.a() && var3 == null; ++var4) {
            add var5 = var1.a(var4);
            if(var5 != null && var5.b() == ade.aY) {
               var3 = var5;
            }
         }

         if(var3 == null) {
            return false;
         } else {
            ayi var6 = ade.aY.a(var3, var2);
            return var6 == null?false:var6.d < 4;
         }
      }
   }

   public add a(aae var1) {
      add var2 = null;

      for(int var3 = 0; var3 < var1.a() && var2 == null; ++var3) {
         add var4 = var1.a(var3);
         if(var4 != null && var4.b() == ade.aY) {
            var2 = var4;
         }
      }

      var2 = var2.m();
      var2.b = 1;
      if(var2.q() == null) {
         var2.d(new dh());
      }

      var2.q().a("map_is_scaling", true);
      return var2;
   }
}
