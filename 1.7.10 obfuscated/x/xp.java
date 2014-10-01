
public abstract class xp extends xl implements rb {

   private add[] a = new add[36];
   private boolean b = true;


   public xp(ahb var1) {
      super(var1);
   }

   public xp(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public void a(ro var1) {
      super.a(var1);

      for(int var2 = 0; var2 < this.a(); ++var2) {
         add var3 = this.a(var2);
         if(var3 != null) {
            float var4 = this.Z.nextFloat() * 0.8F + 0.1F;
            float var5 = this.Z.nextFloat() * 0.8F + 0.1F;
            float var6 = this.Z.nextFloat() * 0.8F + 0.1F;

            while(var3.b > 0) {
               int var7 = this.Z.nextInt(21) + 10;
               if(var7 > var3.b) {
                  var7 = var3.b;
               }

               var3.b -= var7;
               xk var8 = new xk(this.o, this.s + (double)var4, this.t + (double)var5, this.u + (double)var6, new add(var3.b(), var7, var3.k()));
               float var9 = 0.05F;
               var8.v = (double)((float)this.Z.nextGaussian() * var9);
               var8.w = (double)((float)this.Z.nextGaussian() * var9 + 0.2F);
               var8.x = (double)((float)this.Z.nextGaussian() * var9);
               this.o.d((sa)var8);
            }
         }
      }

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

   public void e() {}

   public boolean a(yz var1) {
      return this.K?false:var1.f(this) <= 64.0D;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }

   public String b() {
      return this.k_()?this.u():"container.minecart";
   }

   public int d() {
      return 64;
   }

   public void b(int var1) {
      this.b = false;
      super.b(var1);
   }

   public void B() {
      if(this.b) {
         for(int var1 = 0; var1 < this.a(); ++var1) {
            add var2 = this.a(var1);
            if(var2 != null) {
               float var3 = this.Z.nextFloat() * 0.8F + 0.1F;
               float var4 = this.Z.nextFloat() * 0.8F + 0.1F;
               float var5 = this.Z.nextFloat() * 0.8F + 0.1F;

               while(var2.b > 0) {
                  int var6 = this.Z.nextInt(21) + 10;
                  if(var6 > var2.b) {
                     var6 = var2.b;
                  }

                  var2.b -= var6;
                  xk var7 = new xk(this.o, this.s + (double)var3, this.t + (double)var4, this.u + (double)var5, new add(var2.b(), var6, var2.k()));
                  if(var2.p()) {
                     var7.f().d((dh)var2.q().b());
                  }

                  float var8 = 0.05F;
                  var7.v = (double)((float)this.Z.nextGaussian() * var8);
                  var7.w = (double)((float)this.Z.nextGaussian() * var8 + 0.2F);
                  var7.x = (double)((float)this.Z.nextGaussian() * var8);
                  this.o.d((sa)var7);
               }
            }
         }
      }

      super.B();
   }

   protected void b(dh var1) {
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
   }

   protected void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.a = new add[this.a()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         int var5 = var4.d("Slot") & 255;
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = add.a(var4);
         }
      }

   }

   public boolean c(yz var1) {
      if(!this.o.E) {
         var1.a((rb)this);
      }

      return true;
   }

   protected void i() {
      int var1 = 15 - zs.b((rb)this);
      float var2 = 0.98F + (float)var1 * 0.001F;
      this.v *= (double)var2;
      this.w *= 0.0D;
      this.x *= (double)var2;
   }
}
