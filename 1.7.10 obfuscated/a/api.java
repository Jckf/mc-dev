import java.util.List;

public class api extends aor implements aph {

   private add[] a = new add[5];
   private String i;
   private int j = -1;


   public void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.a = new add[this.a()];
      if(var1.b("CustomName", 8)) {
         this.i = var1.j("CustomName");
      }

      this.j = var1.f("TransferCooldown");

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         byte var5 = var4.d("Slot");
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = add.a(var4);
         }
      }

   }

   public void b(dh var1) {
      super.b(var1);
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var3);
            this.a[var3].b(var4);
            var2.a((dy)var4);
         }
      }

      var1.a("Items", (dy)var2);
      var1.a("TransferCooldown", this.j);
      if(this.k_()) {
         var1.a("CustomName", this.i);
      }

   }

   public void e() {
      super.e();
   }

   public int a() {
      return this.a.length;
   }

   public add a(int var1) {
      return this.a[var1];
   }

   public add a(int var1, int var2) {
      if(this.a[var1] != null) {
         add var3;
         if(this.a[var1].b <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].b == 0) {
               this.a[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(this.a[var1] != null) {
         add var2 = this.a[var1];
         this.a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

   }

   public String b() {
      return this.k_()?this.i:"container.hopper";
   }

   public boolean k_() {
      return this.i != null && this.i.length() > 0;
   }

   public void a(String var1) {
      this.i = var1;
   }

   public int d() {
      return 64;
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }

   public void h() {
      if(this.b != null && !this.b.E) {
         --this.j;
         if(!this.j()) {
            this.c(0);
            this.i();
         }

      }
   }

   public boolean i() {
      if(this.b != null && !this.b.E) {
         if(!this.j() && aln.c(this.p())) {
            boolean var1 = false;
            if(!this.k()) {
               var1 = this.y();
            }

            if(!this.l()) {
               var1 = a((aph)this) || var1;
            }

            if(var1) {
               this.c(8);
               this.e();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean k() {
      add[] var1 = this.a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         add var4 = var1[var3];
         if(var4 != null) {
            return false;
         }
      }

      return true;
   }

   private boolean l() {
      add[] var1 = this.a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         add var4 = var1[var3];
         if(var4 == null || var4.b != var4.e()) {
            return false;
         }
      }

      return true;
   }

   private boolean y() {
      rb var1 = this.z();
      if(var1 == null) {
         return false;
      } else {
         int var2 = q.a[aln.b(this.p())];
         if(this.a(var1, var2)) {
            return false;
         } else {
            for(int var3 = 0; var3 < this.a(); ++var3) {
               if(this.a(var3) != null) {
                  add var4 = this.a(var3).m();
                  add var5 = a(var1, this.a(var3, 1), var2);
                  if(var5 == null || var5.b == 0) {
                     var1.e();
                     return true;
                  }

                  this.a(var3, var4);
               }
            }

            return false;
         }
      }
   }

   private boolean a(rb var1, int var2) {
      if(var1 instanceof rl && var2 > -1) {
         rl var7 = (rl)var1;
         int[] var8 = var7.c(var2);

         for(int var9 = 0; var9 < var8.length; ++var9) {
            add var6 = var7.a(var8[var9]);
            if(var6 == null || var6.b != var6.e()) {
               return false;
            }
         }
      } else {
         int var3 = var1.a();

         for(int var4 = 0; var4 < var3; ++var4) {
            add var5 = var1.a(var4);
            if(var5 == null || var5.b != var5.e()) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean b(rb var0, int var1) {
      if(var0 instanceof rl && var1 > -1) {
         rl var5 = (rl)var0;
         int[] var6 = var5.c(var1);

         for(int var4 = 0; var4 < var6.length; ++var4) {
            if(var5.a(var6[var4]) != null) {
               return false;
            }
         }
      } else {
         int var2 = var0.a();

         for(int var3 = 0; var3 < var2; ++var3) {
            if(var0.a(var3) != null) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean a(aph var0) {
      rb var1 = b(var0);
      if(var1 != null) {
         byte var2 = 0;
         if(b(var1, var2)) {
            return false;
         }

         if(var1 instanceof rl && var2 > -1) {
            rl var7 = (rl)var1;
            int[] var8 = var7.c(var2);

            for(int var5 = 0; var5 < var8.length; ++var5) {
               if(a(var0, var1, var8[var5], var2)) {
                  return true;
               }
            }
         } else {
            int var3 = var1.a();

            for(int var4 = 0; var4 < var3; ++var4) {
               if(a(var0, var1, var4, var2)) {
                  return true;
               }
            }
         }
      } else {
         xk var6 = a(var0.w(), var0.x(), var0.aD() + 1.0D, var0.aE());
         if(var6 != null) {
            return a((rb)var0, var6);
         }
      }

      return false;
   }

   private static boolean a(aph var0, rb var1, int var2, int var3) {
      add var4 = var1.a(var2);
      if(var4 != null && b(var1, var4, var2, var3)) {
         add var5 = var4.m();
         add var6 = a(var0, var1.a(var2, 1), -1);
         if(var6 == null || var6.b == 0) {
            var1.e();
            return true;
         }

         var1.a(var2, var5);
      }

      return false;
   }

   public static boolean a(rb var0, xk var1) {
      boolean var2 = false;
      if(var1 == null) {
         return false;
      } else {
         add var3 = var1.f().m();
         add var4 = a(var0, var3, -1);
         if(var4 != null && var4.b != 0) {
            var1.a(var4);
         } else {
            var2 = true;
            var1.B();
         }

         return var2;
      }
   }

   public static add a(rb var0, add var1, int var2) {
      if(var0 instanceof rl && var2 > -1) {
         rl var6 = (rl)var0;
         int[] var7 = var6.c(var2);

         for(int var5 = 0; var5 < var7.length && var1 != null && var1.b > 0; ++var5) {
            var1 = c(var0, var1, var7[var5], var2);
         }
      } else {
         int var3 = var0.a();

         for(int var4 = 0; var4 < var3 && var1 != null && var1.b > 0; ++var4) {
            var1 = c(var0, var1, var4, var2);
         }
      }

      if(var1 != null && var1.b == 0) {
         var1 = null;
      }

      return var1;
   }

   private static boolean a(rb var0, add var1, int var2, int var3) {
      return !var0.b(var2, var1)?false:!(var0 instanceof rl) || ((rl)var0).a(var2, var1, var3);
   }

   private static boolean b(rb var0, add var1, int var2, int var3) {
      return !(var0 instanceof rl) || ((rl)var0).b(var2, var1, var3);
   }

   private static add c(rb var0, add var1, int var2, int var3) {
      add var4 = var0.a(var2);
      if(a(var0, var1, var2, var3)) {
         boolean var5 = false;
         if(var4 == null) {
            var0.a(var2, var1);
            var1 = null;
            var5 = true;
         } else if(a(var4, var1)) {
            int var6 = var1.e() - var4.b;
            int var7 = Math.min(var1.b, var6);
            var1.b -= var7;
            var4.b += var7;
            var5 = var7 > 0;
         }

         if(var5) {
            if(var0 instanceof api) {
               ((api)var0).c(8);
               var0.e();
            }

            var0.e();
         }
      }

      return var1;
   }

   private rb z() {
      int var1 = aln.b(this.p());
      return b(this.w(), (double)(this.c + q.b[var1]), (double)(this.d + q.c[var1]), (double)(this.e + q.d[var1]));
   }

   public static rb b(aph var0) {
      return b(var0.w(), var0.x(), var0.aD() + 1.0D, var0.aE());
   }

   public static xk a(ahb var0, double var1, double var3, double var5) {
      List var7 = var0.a(xk.class, azt.a(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), sj.a);
      return var7.size() > 0?(xk)var7.get(0):null;
   }

   public static rb b(ahb var0, double var1, double var3, double var5) {
      rb var7 = null;
      int var8 = qh.c(var1);
      int var9 = qh.c(var3);
      int var10 = qh.c(var5);
      aor var11 = var0.o(var8, var9, var10);
      if(var11 != null && var11 instanceof rb) {
         var7 = (rb)var11;
         if(var7 instanceof aow) {
            aji var12 = var0.a(var8, var9, var10);
            if(var12 instanceof ajx) {
               var7 = ((ajx)var12).m(var0, var8, var9, var10);
            }
         }
      }

      if(var7 == null) {
         List var13 = var0.a((sa)null, azt.a(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), sj.c);
         if(var13 != null && var13.size() > 0) {
            var7 = (rb)var13.get(var0.s.nextInt(var13.size()));
         }
      }

      return var7;
   }

   private static boolean a(add var0, add var1) {
      return var0.b() != var1.b()?false:(var0.k() != var1.k()?false:(var0.b > var0.e()?false:add.a(var0, var1)));
   }

   public double x() {
      return (double)this.c;
   }

   public double aD() {
      return (double)this.d;
   }

   public double aE() {
      return (double)this.e;
   }

   public void c(int var1) {
      this.j = var1;
   }

   public boolean j() {
      return this.j > 0;
   }
}
