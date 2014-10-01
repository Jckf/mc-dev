import java.util.List;

public class aov extends aor implements rl {

   private static final int[] a = new int[]{3};
   private static final int[] i = new int[]{0, 1, 2};
   private add[] j = new add[4];
   private int k;
   private int l;
   private adb m;
   private String n;


   public String b() {
      return this.k_()?this.n:"container.brewing";
   }

   public boolean k_() {
      return this.n != null && this.n.length() > 0;
   }

   public void a(String var1) {
      this.n = var1;
   }

   public int a() {
      return this.j.length;
   }

   public void h() {
      if(this.k > 0) {
         --this.k;
         if(this.k == 0) {
            this.l();
            this.e();
         } else if(!this.k()) {
            this.k = 0;
            this.e();
         } else if(this.m != this.j[3].b()) {
            this.k = 0;
            this.e();
         }
      } else if(this.k()) {
         this.k = 400;
         this.m = this.j[3].b();
      }

      int var1 = this.j();
      if(var1 != this.l) {
         this.l = var1;
         this.b.a(this.c, this.d, this.e, var1, 2);
      }

      super.h();
   }

   public int i() {
      return this.k;
   }

   private boolean k() {
      if(this.j[3] != null && this.j[3].b > 0) {
         add var1 = this.j[3];
         if(!var1.b().m(var1)) {
            return false;
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < 3; ++var3) {
               if(this.j[var3] != null && this.j[var3].b() == ade.bn) {
                  int var4 = this.j[var3].k();
                  int var5 = this.c(var4, var1);
                  if(!adp.g(var4) && adp.g(var5)) {
                     var2 = true;
                     break;
                  }

                  List var6 = ade.bn.c(var4);
                  List var7 = ade.bn.c(var5);
                  if((var4 <= 0 || var6 != var7) && (var6 == null || !var6.equals(var7) && var7 != null) && var4 != var5) {
                     var2 = true;
                     break;
                  }
               }
            }

            return var2;
         }
      } else {
         return false;
      }
   }

   private void l() {
      if(this.k()) {
         add var1 = this.j[3];

         for(int var2 = 0; var2 < 3; ++var2) {
            if(this.j[var2] != null && this.j[var2].b() == ade.bn) {
               int var3 = this.j[var2].k();
               int var4 = this.c(var3, var1);
               List var5 = ade.bn.c(var3);
               List var6 = ade.bn.c(var4);
               if((var3 <= 0 || var5 != var6) && (var5 == null || !var5.equals(var6) && var6 != null)) {
                  if(var3 != var4) {
                     this.j[var2].b(var4);
                  }
               } else if(!adp.g(var3) && adp.g(var4)) {
                  this.j[var2].b(var4);
               }
            }
         }

         if(var1.b().u()) {
            this.j[3] = new add(var1.b().t());
         } else {
            --this.j[3].b;
            if(this.j[3].b <= 0) {
               this.j[3] = null;
            }
         }

      }
   }

   private int c(int var1, add var2) {
      return var2 == null?var1:(var2.b().m(var2)?aen.a(var1, var2.b().i(var2)):var1);
   }

   public void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.j = new add[this.a()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         byte var5 = var4.d("Slot");
         if(var5 >= 0 && var5 < this.j.length) {
            this.j[var5] = add.a(var4);
         }
      }

      this.k = var1.e("BrewTime");
      if(var1.b("CustomName", 8)) {
         this.n = var1.j("CustomName");
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("BrewTime", (short)this.k);
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.j.length; ++var3) {
         if(this.j[var3] != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var3);
            this.j[var3].b(var4);
            var2.a((dy)var4);
         }
      }

      var1.a("Items", (dy)var2);
      if(this.k_()) {
         var1.a("CustomName", this.n);
      }

   }

   public add a(int var1) {
      return var1 >= 0 && var1 < this.j.length?this.j[var1]:null;
   }

   public add a(int var1, int var2) {
      if(var1 >= 0 && var1 < this.j.length) {
         add var3 = this.j[var1];
         this.j[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(var1 >= 0 && var1 < this.j.length) {
         add var2 = this.j[var1];
         this.j[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      if(var1 >= 0 && var1 < this.j.length) {
         this.j[var1] = var2;
      }

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
      return var1 == 3?var2.b().m(var2):var2.b() == ade.bn || var2.b() == ade.bo;
   }

   public int j() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         if(this.j[var2] != null) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }

   public int[] c(int var1) {
      return var1 == 1?a:i;
   }

   public boolean a(int var1, add var2, int var3) {
      return this.b(var1, var2);
   }

   public boolean b(int var1, add var2, int var3) {
      return true;
   }

}
