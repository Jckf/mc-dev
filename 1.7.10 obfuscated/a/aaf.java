
public class aaf extends zs {

   public aae a = new aae(this, 3, 3);
   public rb f = new aaw();
   private ahb g;
   private int h;
   private int i;
   private int j;


   public aaf(yx var1, ahb var2, int var3, int var4, int var5) {
      this.g = var2;
      this.h = var3;
      this.i = var4;
      this.j = var5;
      this.a((aay)(new aax(var1.d, this.a, this.f, 0, 124, 35)));

      int var6;
      int var7;
      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 3; ++var7) {
            this.a(new aay(this.a, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.a(new aay(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a(new aay(var1, var6, 8 + var6 * 18, 142));
      }

      this.a((rb)this.a);
   }

   public void a(rb var1) {
      this.f.a(0, afe.a().a(this.a, this.g));
   }

   public void b(yz var1) {
      super.b(var1);
      if(!this.g.E) {
         for(int var2 = 0; var2 < 9; ++var2) {
            add var3 = this.a.a_(var2);
            if(var3 != null) {
               var1.a(var3, false);
            }
         }

      }
   }

   public boolean a(yz var1) {
      return this.g.a(this.h, this.i, this.j) != ajn.ai?false:var1.e((double)this.h + 0.5D, (double)this.i + 0.5D, (double)this.j + 0.5D) <= 64.0D;
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if(var2 == 0) {
            if(!this.a(var5, 10, 46, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(var2 >= 10 && var2 < 37) {
            if(!this.a(var5, 37, 46, false)) {
               return null;
            }
         } else if(var2 >= 37 && var2 < 46) {
            if(!this.a(var5, 10, 37, false)) {
               return null;
            }
         } else if(!this.a(var5, 10, 46, false)) {
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
