import java.util.concurrent.Callable;

public class yx implements rb {

   public add[] a = new add[36];
   public add[] b = new add[4];
   public int c;
   public yz d;
   private add g;
   public boolean e;


   public yx(yz var1) {
      this.d = var1;
   }

   public add h() {
      return this.c < 9 && this.c >= 0?this.a[this.c]:null;
   }

   public static int i() {
      return 9;
   }

   private int c(adb var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].b() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int d(add var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].b() == var1.b() && this.a[var2].f() && this.a[var2].b < this.a[var2].e() && this.a[var2].b < this.d() && (!this.a[var2].h() || this.a[var2].k() == var1.k()) && add.a(this.a[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public int j() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public int a(adb var1, int var2) {
      int var3 = 0;

      int var4;
      add var5;
      for(var4 = 0; var4 < this.a.length; ++var4) {
         var5 = this.a[var4];
         if(var5 != null && (var1 == null || var5.b() == var1) && (var2 <= -1 || var5.k() == var2)) {
            var3 += var5.b;
            this.a[var4] = null;
         }
      }

      for(var4 = 0; var4 < this.b.length; ++var4) {
         var5 = this.b[var4];
         if(var5 != null && (var1 == null || var5.b() == var1) && (var2 <= -1 || var5.k() == var2)) {
            var3 += var5.b;
            this.b[var4] = null;
         }
      }

      if(this.g != null) {
         if(var1 != null && this.g.b() != var1) {
            return var3;
         }

         if(var2 > -1 && this.g.k() != var2) {
            return var3;
         }

         var3 += this.g.b;
         this.b((add)null);
      }

      return var3;
   }

   private int e(add var1) {
      adb var2 = var1.b();
      int var3 = var1.b;
      int var4;
      if(var1.e() == 1) {
         var4 = this.j();
         if(var4 < 0) {
            return var3;
         } else {
            if(this.a[var4] == null) {
               this.a[var4] = add.b(var1);
            }

            return 0;
         }
      } else {
         var4 = this.d(var1);
         if(var4 < 0) {
            var4 = this.j();
         }

         if(var4 < 0) {
            return var3;
         } else {
            if(this.a[var4] == null) {
               this.a[var4] = new add(var2, 0, var1.k());
               if(var1.p()) {
                  this.a[var4].d((dh)var1.q().b());
               }
            }

            int var5 = var3;
            if(var3 > this.a[var4].e() - this.a[var4].b) {
               var5 = this.a[var4].e() - this.a[var4].b;
            }

            if(var5 > this.d() - this.a[var4].b) {
               var5 = this.d() - this.a[var4].b;
            }

            if(var5 == 0) {
               return var3;
            } else {
               var3 -= var5;
               this.a[var4].b += var5;
               this.a[var4].c = 5;
               return var3;
            }
         }
      }
   }

   public void k() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.a[var1].a(this.d.o, this.d, var1, this.c == var1);
         }
      }

   }

   public boolean a(adb var1) {
      int var2 = this.c(var1);
      if(var2 < 0) {
         return false;
      } else {
         if(--this.a[var2].b <= 0) {
            this.a[var2] = null;
         }

         return true;
      }
   }

   public boolean b(adb var1) {
      int var2 = this.c(var1);
      return var2 >= 0;
   }

   public boolean a(add var1) {
      if(var1 != null && var1.b != 0 && var1.b() != null) {
         try {
            int var2;
            if(var1.i()) {
               var2 = this.j();
               if(var2 >= 0) {
                  this.a[var2] = add.b(var1);
                  this.a[var2].c = 5;
                  var1.b = 0;
                  return true;
               } else if(this.d.bE.d) {
                  var1.b = 0;
                  return true;
               } else {
                  return false;
               }
            } else {
               do {
                  var2 = var1.b;
                  var1.b = this.e(var1);
               } while(var1.b > 0 && var1.b < var2);

               if(var1.b == var2 && this.d.bE.d) {
                  var1.b = 0;
                  return true;
               } else {
                  return var1.b < var2;
               }
            }
         } catch (Throwable var5) {
            b var3 = b.a(var5, "Adding item to inventory");
            k var4 = var3.a("Item being added");
            var4.a("Item ID", (Object)Integer.valueOf(adb.b(var1.b())));
            var4.a("Item data", (Object)Integer.valueOf(var1.k()));
            var4.a("Item name", (Callable)(new yy(this, var1)));
            throw new s(var3);
         }
      } else {
         return false;
      }
   }

   public add a(int var1, int var2) {
      add[] var3 = this.a;
      if(var1 >= this.a.length) {
         var3 = this.b;
         var1 -= this.a.length;
      }

      if(var3[var1] != null) {
         add var4;
         if(var3[var1].b <= var2) {
            var4 = var3[var1];
            var3[var1] = null;
            return var4;
         } else {
            var4 = var3[var1].a(var2);
            if(var3[var1].b == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      add[] var2 = this.a;
      if(var1 >= this.a.length) {
         var2 = this.b;
         var1 -= this.a.length;
      }

      if(var2[var1] != null) {
         add var3 = var2[var1];
         var2[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      add[] var3 = this.a;
      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      var3[var1] = var2;
   }

   public float a(aji var1) {
      float var2 = 1.0F;
      if(this.a[this.c] != null) {
         var2 *= this.a[this.c].a(var1);
      }

      return var2;
   }

   public dq a(dq var1) {
      int var2;
      dh var3;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null) {
            var3 = new dh();
            var3.a("Slot", (byte)var2);
            this.a[var2].b(var3);
            var1.a((dy)var3);
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null) {
            var3 = new dh();
            var3.a("Slot", (byte)(var2 + 100));
            this.b[var2].b(var3);
            var1.a((dy)var3);
         }
      }

      return var1;
   }

   public void b(dq var1) {
      this.a = new add[36];
      this.b = new add[4];

      for(int var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         int var4 = var3.d("Slot") & 255;
         add var5 = add.a(var3);
         if(var5 != null) {
            if(var4 >= 0 && var4 < this.a.length) {
               this.a[var4] = var5;
            }

            if(var4 >= 100 && var4 < this.b.length + 100) {
               this.b[var4 - 100] = var5;
            }
         }
      }

   }

   public int a() {
      return this.a.length + 4;
   }

   public add a(int var1) {
      add[] var2 = this.a;
      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      return var2[var1];
   }

   public String b() {
      return "container.inventory";
   }

   public boolean k_() {
      return false;
   }

   public int d() {
      return 64;
   }

   public boolean b(aji var1) {
      if(var1.o().l()) {
         return true;
      } else {
         add var2 = this.a(this.c);
         return var2 != null?var2.b(var1):false;
      }
   }

   public add d(int var1) {
      return this.b[var1];
   }

   public int l() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].b() instanceof abb) {
            int var3 = ((abb)this.b[var2].b()).c;
            var1 += var3;
         }
      }

      return var1;
   }

   public void a(float var1) {
      var1 /= 4.0F;
      if(var1 < 1.0F) {
         var1 = 1.0F;
      }

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].b() instanceof abb) {
            this.b[var2].a((int)var1, (sv)this.d);
            if(this.b[var2].b == 0) {
               this.b[var2] = null;
            }
         }
      }

   }

   public void m() {
      int var1;
      for(var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.d.a(this.a[var1], true, false);
            this.a[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.b.length; ++var1) {
         if(this.b[var1] != null) {
            this.d.a(this.b[var1], true, false);
            this.b[var1] = null;
         }
      }

   }

   public void e() {
      this.e = true;
   }

   public void b(add var1) {
      this.g = var1;
   }

   public add o() {
      return this.g;
   }

   public boolean a(yz var1) {
      return this.d.K?false:var1.f(this.d) <= 64.0D;
   }

   public boolean c(add var1) {
      int var2;
      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].a(var1)) {
            return true;
         }
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].a(var1)) {
            return true;
         }
      }

      return false;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }

   public void b(yx var1) {
      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = add.b(var1.a[var2]);
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = add.b(var1.b[var2]);
      }

      this.c = var1.c;
   }
}
