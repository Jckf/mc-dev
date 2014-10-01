import java.util.Random;

public class acm extends adb {

   public boolean e_(add var1) {
      return false;
   }

   public adq f(add var1) {
      return this.g(var1).c() > 0?adq.b:super.f(var1);
   }

   public dq g(add var1) {
      return var1.d != null && var1.d.b("StoredEnchantments", 9)?(dq)var1.d.a("StoredEnchantments"):new dq();
   }

   public void a(add var1, agc var2) {
      dq var3 = this.g(var1);
      boolean var4 = true;

      for(int var5 = 0; var5 < var3.c(); ++var5) {
         dh var6 = var3.b(var5);
         if(var6.e("id") == var2.b.B) {
            if(var6.e("lvl") < var2.c) {
               var6.a("lvl", (short)var2.c);
            }

            var4 = false;
            break;
         }
      }

      if(var4) {
         dh var7 = new dh();
         var7.a("id", (short)var2.b.B);
         var7.a("lvl", (short)var2.c);
         var3.a((dy)var7);
      }

      if(!var1.p()) {
         var1.d(new dh());
      }

      var1.q().a("StoredEnchantments", (dy)var3);
   }

   public add a(agc var1) {
      add var2 = new add(this);
      this.a(var2, var1);
      return var2;
   }

   public qx b(Random var1) {
      return this.a(var1, 1, 1, 1);
   }

   public qx a(Random var1, int var2, int var3, int var4) {
      add var5 = new add(ade.aG, 1, 0);
      afv.a(var1, var5, 30);
      return new qx(var5, var2, var3, var4);
   }
}
