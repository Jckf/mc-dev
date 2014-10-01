
public class zz extends zs {

   private aov a;
   private final aay f;
   private int g;


   public zz(yx var1, aov var2) {
      this.a = var2;
      this.a((aay)(new aab(var1.d, var2, 0, 56, 46)));
      this.a((aay)(new aab(var1.d, var2, 1, 79, 53)));
      this.a((aay)(new aab(var1.d, var2, 2, 102, 46)));
      this.f = this.a((aay)(new aaa(this, var2, 3, 79, 17)));

      int var3;
      for(var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.a(new aay(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.a(new aay(var1, var3, 8 + var3 * 18, 142));
      }

   }

   public void a(aac var1) {
      super.a(var1);
      var1.a(this, 0, this.a.i());
   }

   public void b() {
      super.b();

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         aac var2 = (aac)this.e.get(var1);
         if(this.g != this.a.i()) {
            var2.a(this, 0, this.a.i());
         }
      }

      this.g = this.a.i();
   }

   public boolean a(yz var1) {
      return this.a.a(var1);
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if((var2 < 0 || var2 > 2) && var2 != 3) {
            if(!this.f.e() && this.f.a(var5)) {
               if(!this.a(var5, 3, 4, false)) {
                  return null;
               }
            } else if(aab.b_(var3)) {
               if(!this.a(var5, 0, 3, false)) {
                  return null;
               }
            } else if(var2 >= 4 && var2 < 31) {
               if(!this.a(var5, 31, 40, false)) {
                  return null;
               }
            } else if(var2 >= 31 && var2 < 40) {
               if(!this.a(var5, 4, 31, false)) {
                  return null;
               }
            } else if(!this.a(var5, 4, 40, false)) {
               return null;
            }
         } else {
            if(!this.a(var5, 4, 40, true)) {
               return null;
            }

            var4.a(var5, var3);
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
}
