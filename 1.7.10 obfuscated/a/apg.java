
public class apg extends aor implements rl {

   private static final int[] k = new int[]{0};
   private static final int[] l = new int[]{2, 1};
   private static final int[] m = new int[]{1};
   private add[] n = new add[3];
   public int a;
   public int i;
   public int j;
   private String o;


   public int a() {
      return this.n.length;
   }

   public add a(int var1) {
      return this.n[var1];
   }

   public add a(int var1, int var2) {
      if(this.n[var1] != null) {
         add var3;
         if(this.n[var1].b <= var2) {
            var3 = this.n[var1];
            this.n[var1] = null;
            return var3;
         } else {
            var3 = this.n[var1].a(var2);
            if(this.n[var1].b == 0) {
               this.n[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(this.n[var1] != null) {
         add var2 = this.n[var1];
         this.n[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.n[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

   }

   public String b() {
      return this.k_()?this.o:"container.furnace";
   }

   public boolean k_() {
      return this.o != null && this.o.length() > 0;
   }

   public void a(String var1) {
      this.o = var1;
   }

   public void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.n = new add[this.a()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         byte var5 = var4.d("Slot");
         if(var5 >= 0 && var5 < this.n.length) {
            this.n[var5] = add.a(var4);
         }
      }

      this.a = var1.e("BurnTime");
      this.j = var1.e("CookTime");
      this.i = a(this.n[1]);
      if(var1.b("CustomName", 8)) {
         this.o = var1.j("CustomName");
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("BurnTime", (short)this.a);
      var1.a("CookTime", (short)this.j);
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.n.length; ++var3) {
         if(this.n[var3] != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var3);
            this.n[var3].b(var4);
            var2.a((dy)var4);
         }
      }

      var1.a("Items", (dy)var2);
      if(this.k_()) {
         var1.a("CustomName", this.o);
      }

   }

   public int d() {
      return 64;
   }

   public boolean i() {
      return this.a > 0;
   }

   public void h() {
      boolean var1 = this.a > 0;
      boolean var2 = false;
      if(this.a > 0) {
         --this.a;
      }

      if(!this.b.E) {
         if(this.a != 0 || this.n[1] != null && this.n[0] != null) {
            if(this.a == 0 && this.k()) {
               this.i = this.a = a(this.n[1]);
               if(this.a > 0) {
                  var2 = true;
                  if(this.n[1] != null) {
                     --this.n[1].b;
                     if(this.n[1].b == 0) {
                        adb var3 = this.n[1].b().t();
                        this.n[1] = var3 != null?new add(var3):null;
                     }
                  }
               }
            }

            if(this.i() && this.k()) {
               ++this.j;
               if(this.j == 200) {
                  this.j = 0;
                  this.j();
                  var2 = true;
               }
            } else {
               this.j = 0;
            }
         }

         if(var1 != this.a > 0) {
            var2 = true;
            ale.a(this.a > 0, this.b, this.c, this.d, this.e);
         }
      }

      if(var2) {
         this.e();
      }

   }

   private boolean k() {
      if(this.n[0] == null) {
         return false;
      } else {
         add var1 = afa.a().a(this.n[0]);
         return var1 == null?false:(this.n[2] == null?true:(!this.n[2].a(var1)?false:(this.n[2].b < this.d() && this.n[2].b < this.n[2].e()?true:this.n[2].b < var1.e())));
      }
   }

   public void j() {
      if(this.k()) {
         add var1 = afa.a().a(this.n[0]);
         if(this.n[2] == null) {
            this.n[2] = var1.m();
         } else if(this.n[2].b() == var1.b()) {
            ++this.n[2].b;
         }

         --this.n[0].b;
         if(this.n[0].b <= 0) {
            this.n[0] = null;
         }

      }
   }

   public static int a(add var0) {
      if(var0 == null) {
         return 0;
      } else {
         adb var1 = var0.b();
         if(var1 instanceof abh && aji.a(var1) != ajn.a) {
            aji var2 = aji.a(var1);
            if(var2 == ajn.bx) {
               return 150;
            }

            if(var2.o() == awt.d) {
               return 300;
            }

            if(var2 == ajn.ci) {
               return 16000;
            }
         }

         return var1 instanceof acg && ((acg)var1).j().equals("WOOD")?200:(var1 instanceof aeh && ((aeh)var1).j().equals("WOOD")?200:(var1 instanceof ada && ((ada)var1).i().equals("WOOD")?200:(var1 == ade.y?100:(var1 == ade.h?1600:(var1 == ade.at?20000:(var1 == adb.a(ajn.g)?100:(var1 == ade.bj?2400:0)))))));
      }
   }

   public static boolean b(add var0) {
      return a(var0) > 0;
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return var1 == 2?false:(var1 == 1?b(var2):true);
   }

   public int[] c(int var1) {
      return var1 == 0?l:(var1 == 1?k:m);
   }

   public boolean a(int var1, add var2, int var3) {
      return this.b(var1, var2);
   }

   public boolean b(int var1, add var2, int var3) {
      return var3 != 0 || var1 != 1 || var2.b() == ade.ar;
   }

}
