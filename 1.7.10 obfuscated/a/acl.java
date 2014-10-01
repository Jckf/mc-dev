
public class acl extends abs {

   protected acl() {
      this.a(abt.f);
   }

   public add a(add var1, ahb var2, yz var3) {
      add var4 = new add(ade.aY, 1, var2.b("map"));
      String var5 = "map_" + var4.k();
      ayi var6 = new ayi(var5);
      var2.a(var5, (ayl)var6);
      var6.d = 0;
      int var7 = 128 * (1 << var6.d);
      var6.a = (int)(Math.round(var3.s / (double)var7) * (long)var7);
      var6.b = (int)(Math.round(var3.u / (double)var7) * (long)var7);
      var6.c = (byte)var2.t.i;
      var6.c();
      --var1.b;
      if(var1.b <= 0) {
         return var4;
      } else {
         if(!var3.bm.a(var4.m())) {
            var3.a(var4, false);
         }

         return var1;
      }
   }
}
