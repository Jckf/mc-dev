
public class aap extends zs {

   public aae a = new aae(this, 2, 2);
   public rb f = new aaw();
   public boolean g;
   private final yz h;


   public aap(yx var1, boolean var2, yz var3) {
      this.g = var2;
      this.h = var3;
      this.a((aay)(new aax(var1.d, this.a, this.f, 0, 144, 36)));

      int var4;
      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         for(var5 = 0; var5 < 2; ++var5) {
            this.a(new aay(this.a, var5 + var4 * 2, 88 + var5 * 18, 26 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 4; ++var4) {
         this.a((aay)(new aaq(this, var1, var1.a() - 1 - var4, 8, 8 + var4 * 18, var4)));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a(new aay(var1, var5 + (var4 + 1) * 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a(new aay(var1, var4, 8 + var4 * 18, 142));
      }

      this.a((rb)this.a);
   }

   public void a(rb var1) {
      this.f.a(0, afe.a().a(this.a, this.h.o));
   }

   public void b(yz var1) {
      super.b(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         add var3 = this.a.a_(var2);
         if(var3 != null) {
            var1.a(var3, false);
         }
      }

      this.f.a(0, (add)null);
   }

   public boolean a(yz var1) {
      return true;
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if(var2 == 0) {
            if(!this.a(var5, 9, 45, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(var2 >= 1 && var2 < 5) {
            if(!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var2 >= 5 && var2 < 9) {
            if(!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var3.b() instanceof abb && !((aay)this.c.get(5 + ((abb)var3.b()).b)).e()) {
            int var6 = 5 + ((abb)var3.b()).b;
            if(!this.a(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if(var2 >= 9 && var2 < 36) {
            if(!this.a(var5, 36, 45, false)) {
               return null;
            }
         } else if(var2 >= 36 && var2 < 45) {
            if(!this.a(var5, 9, 36, false)) {
               return null;
            }
         } else if(!this.a(var5, 9, 45, false)) {
            return null;
         }

         if(var5.b == 0) {
            var4.c((add)null);
         } else {
            var4.f();
         }

         if(var5.b == var3.b) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }

   public boolean a(add var1, aay var2) {
      return var2.f != this.f && super.a(var1, var2);
   }
}
