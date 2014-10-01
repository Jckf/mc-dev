
public class aaj extends zs {

   private apg a;
   private int f;
   private int g;
   private int h;


   public aaj(yx var1, apg var2) {
      this.a = var2;
      this.a(new aay(var2, 0, 56, 17));
      this.a(new aay(var2, 1, 56, 53));
      this.a((aay)(new aak(var1.d, var2, 2, 116, 35)));

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
      var1.a(this, 0, this.a.j);
      var1.a(this, 1, this.a.a);
      var1.a(this, 2, this.a.i);
   }

   public void b() {
      super.b();

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         aac var2 = (aac)this.e.get(var1);
         if(this.f != this.a.j) {
            var2.a(this, 0, this.a.j);
         }

         if(this.g != this.a.a) {
            var2.a(this, 1, this.a.a);
         }

         if(this.h != this.a.i) {
            var2.a(this, 2, this.a.i);
         }
      }

      this.f = this.a.j;
      this.g = this.a.a;
      this.h = this.a.i;
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
         if(var2 == 2) {
            if(!this.a(var5, 3, 39, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(var2 != 1 && var2 != 0) {
            if(afa.a().a(var5) != null) {
               if(!this.a(var5, 0, 1, false)) {
                  return null;
               }
            } else if(apg.b(var5)) {
               if(!this.a(var5, 1, 2, false)) {
                  return null;
               }
            } else if(var2 >= 3 && var2 < 30) {
               if(!this.a(var5, 30, 39, false)) {
                  return null;
               }
            } else if(var2 >= 30 && var2 < 39 && !this.a(var5, 3, 30, false)) {
               return null;
            }
         } else if(!this.a(var5, 3, 39, false)) {
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
}
