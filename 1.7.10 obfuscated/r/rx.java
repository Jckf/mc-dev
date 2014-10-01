
public abstract class rx extends td {

   private float bp = -1.0F;
   private float bq;


   public rx(ahb var1) {
      super(var1);
   }

   public abstract rx a(rx var1);

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.bx) {
         if(!this.o.E) {
            Class var3 = sg.a(var2.k());
            if(var3 != null && var3.isAssignableFrom(this.getClass())) {
               rx var4 = this.a(this);
               if(var4 != null) {
                  var4.c(-24000);
                  var4.b(this.s, this.t, this.u, 0.0F, 0.0F);
                  this.o.d((sa)var4);
                  if(var2.u()) {
                     var4.a(var2.s());
                  }

                  if(!var1.bE.d) {
                     --var2.b;
                     if(var2.b <= 0) {
                        var1.bm.a(var1.bm.c, (add)null);
                     }
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected void c() {
      super.c();
      this.af.a(12, new Integer(0));
   }

   public int d() {
      return this.af.c(12);
   }

   public void a(int var1) {
      int var2 = this.d();
      var2 += var1 * 20;
      if(var2 > 0) {
         var2 = 0;
      }

      this.c(var2);
   }

   public void c(int var1) {
      this.af.b(12, Integer.valueOf(var1));
      this.a(this.f());
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Age", this.d());
   }

   public void a(dh var1) {
      super.a(var1);
      this.c(var1.f("Age"));
   }

   public void e() {
      super.e();
      if(this.o.E) {
         this.a(this.f());
      } else {
         int var1 = this.d();
         if(var1 < 0) {
            ++var1;
            this.c(var1);
         } else if(var1 > 0) {
            --var1;
            this.c(var1);
         }
      }

   }

   public boolean f() {
      return this.d() < 0;
   }

   public void a(boolean var1) {
      this.a(var1?0.5F:1.0F);
   }

   protected final void a(float var1, float var2) {
      boolean var3 = this.bp > 0.0F;
      this.bp = var1;
      this.bq = var2;
      if(!var3) {
         this.a(1.0F);
      }

   }

   protected final void a(float var1) {
      super.a(this.bp * var1, this.bq * var1);
   }
}
