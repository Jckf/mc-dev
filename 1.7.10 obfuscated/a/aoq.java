import java.util.Iterator;
import java.util.List;

public class aoq extends aor implements rb {

   public static final rv[][] a = new rv[][]{{rv.c, rv.e}, {rv.m, rv.j}, {rv.g}, {rv.l}};
   private boolean k;
   private int l = -1;
   private int m;
   private int n;
   private add o;
   private String p;


   public void h() {
      if(this.b.I() % 80L == 0L) {
         this.y();
         this.x();
      }

   }

   private void x() {
      if(this.k && this.l > 0 && !this.b.E && this.m > 0) {
         double var1 = (double)(this.l * 10 + 10);
         byte var3 = 0;
         if(this.l >= 4 && this.m == this.n) {
            var3 = 1;
         }

         azt var4 = azt.a((double)this.c, (double)this.d, (double)this.e, (double)(this.c + 1), (double)(this.d + 1), (double)(this.e + 1)).b(var1, var1, var1);
         var4.e = (double)this.b.R();
         List var5 = this.b.a(yz.class, var4);
         Iterator var6 = var5.iterator();

         yz var7;
         while(var6.hasNext()) {
            var7 = (yz)var6.next();
            var7.c(new rw(this.m, 180, var3, true));
         }

         if(this.l >= 4 && this.m != this.n && this.n > 0) {
            var6 = var5.iterator();

            while(var6.hasNext()) {
               var7 = (yz)var6.next();
               var7.c(new rw(this.n, 180, 0, true));
            }
         }
      }

   }

   private void y() {
      int var1 = this.l;
      if(!this.b.i(this.c, this.d + 1, this.e)) {
         this.k = false;
         this.l = 0;
      } else {
         this.k = true;
         this.l = 0;

         for(int var2 = 1; var2 <= 4; this.l = var2++) {
            int var3 = this.d - var2;
            if(var3 < 0) {
               break;
            }

            boolean var4 = true;

            for(int var5 = this.c - var2; var5 <= this.c + var2 && var4; ++var5) {
               for(int var6 = this.e - var2; var6 <= this.e + var2; ++var6) {
                  aji var7 = this.b.a(var5, var3, var6);
                  if(var7 != ajn.bE && var7 != ajn.R && var7 != ajn.ah && var7 != ajn.S) {
                     var4 = false;
                     break;
                  }
               }
            }

            if(!var4) {
               break;
            }
         }

         if(this.l == 0) {
            this.k = false;
         }
      }

      if(!this.b.E && this.l == 4 && var1 < this.l) {
         Iterator var8 = this.b.a(yz.class, azt.a((double)this.c, (double)this.d, (double)this.e, (double)this.c, (double)(this.d - 4), (double)this.e).b(10.0D, 5.0D, 10.0D)).iterator();

         while(var8.hasNext()) {
            yz var9 = (yz)var8.next();
            var9.a((ph)pc.K);
         }
      }

   }

   public int j() {
      return this.m;
   }

   public int k() {
      return this.n;
   }

   public int l() {
      return this.l;
   }

   public void d(int var1) {
      this.m = 0;

      for(int var2 = 0; var2 < this.l && var2 < 3; ++var2) {
         rv[] var3 = a[var2];
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            rv var6 = var3[var5];
            if(var6.H == var1) {
               this.m = var1;
               return;
            }
         }
      }

   }

   public void e(int var1) {
      this.n = 0;
      if(this.l >= 4) {
         for(int var2 = 0; var2 < 4; ++var2) {
            rv[] var3 = a[var2];
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               rv var6 = var3[var5];
               if(var6.H == var1) {
                  this.n = var1;
                  return;
               }
            }
         }
      }

   }

   public ft m() {
      dh var1 = new dh();
      this.b(var1);
      return new gf(this.c, this.d, this.e, 3, var1);
   }

   public void a(dh var1) {
      super.a(var1);
      this.m = var1.f("Primary");
      this.n = var1.f("Secondary");
      this.l = var1.f("Levels");
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Primary", this.m);
      var1.a("Secondary", this.n);
      var1.a("Levels", this.l);
   }

   public int a() {
      return 1;
   }

   public add a(int var1) {
      return var1 == 0?this.o:null;
   }

   public add a(int var1, int var2) {
      if(var1 == 0 && this.o != null) {
         if(var2 >= this.o.b) {
            add var3 = this.o;
            this.o = null;
            return var3;
         } else {
            this.o.b -= var2;
            return new add(this.o.b(), var2, this.o.k());
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(var1 == 0 && this.o != null) {
         add var2 = this.o;
         this.o = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      if(var1 == 0) {
         this.o = var2;
      }

   }

   public String b() {
      return this.k_()?this.p:"container.beacon";
   }

   public boolean k_() {
      return this.p != null && this.p.length() > 0;
   }

   public void a(String var1) {
      this.p = var1;
   }

   public int d() {
      return 1;
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return var2.b() == ade.bC || var2.b() == ade.i || var2.b() == ade.k || var2.b() == ade.j;
   }

}
