import java.util.ArrayList;

public class ago extends ArrayList {

   public ago() {}

   public ago(dh var1) {
      this.a(var1);
   }

   public agn a(add var1, add var2, int var3) {
      if(var3 > 0 && var3 < this.size()) {
         agn var6 = (agn)this.get(var3);
         return var1.b() == var6.a().b() && (var2 == null && !var6.c() || var6.c() && var2 != null && var6.b().b() == var2.b()) && var1.b >= var6.a().b && (!var6.c() || var2.b >= var6.b().b)?var6:null;
      } else {
         for(int var4 = 0; var4 < this.size(); ++var4) {
            agn var5 = (agn)this.get(var4);
            if(var1.b() == var5.a().b() && var1.b >= var5.a().b && (!var5.c() && var2 == null || var5.c() && var2 != null && var5.b().b() == var2.b() && var2.b >= var5.b().b)) {
               return var5;
            }
         }

         return null;
      }
   }

   public void a(agn var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         agn var3 = (agn)this.get(var2);
         if(var1.a(var3)) {
            if(var1.b(var3)) {
               this.set(var2, var1);
            }

            return;
         }
      }

      this.add(var1);
   }

   public void a(et var1) {
      var1.writeByte((byte)(this.size() & 255));

      for(int var2 = 0; var2 < this.size(); ++var2) {
         agn var3 = (agn)this.get(var2);
         var1.a(var3.a());
         var1.a(var3.d());
         add var4 = var3.b();
         var1.writeBoolean(var4 != null);
         if(var4 != null) {
            var1.a(var4);
         }

         var1.writeBoolean(var3.g());
      }

   }

   public void a(dh var1) {
      dq var2 = var1.c("Recipes", 10);

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         this.add(new agn(var4));
      }

   }

   public dh a() {
      dh var1 = new dh();
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.size(); ++var3) {
         agn var4 = (agn)this.get(var3);
         var2.a((dy)var4.i());
      }

      var1.a("Recipes", (dy)var2);
      return var1;
   }
}
