
public class zp extends ze {

   public zp(ahb var1) {
      super(var1);
      this.a(0.3125F, 0.3125F);
   }

   public zp(ahb var1, sv var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.a(0.3125F, 0.3125F);
   }

   protected float e() {
      return this.f()?0.73F:super.e();
   }

   public boolean al() {
      return false;
   }

   public float a(agw var1, ahb var2, int var3, int var4, int var5, aji var6) {
      float var7 = super.a(var1, var2, var3, var4, var5, var6);
      if(this.f() && var6 != ajn.h && var6 != ajn.bq && var6 != ajn.br && var6 != ajn.bI) {
         var7 = Math.min(0.8F, var7);
      }

      return var7;
   }

   protected void a(azu var1) {
      if(!this.o.E) {
         if(var1.g != null) {
            if(this.a != null) {
               if(var1.g.a(ro.a(this.a), 8.0F) && !var1.g.Z()) {
                  this.a.f(5.0F);
               }
            } else {
               var1.g.a(ro.k, 5.0F);
            }

            if(var1.g instanceof sv) {
               byte var2 = 0;
               if(this.o.r == rd.c) {
                  var2 = 10;
               } else if(this.o.r == rd.d) {
                  var2 = 40;
               }

               if(var2 > 0) {
                  ((sv)var1.g).c(new rw(rv.v.H, 20 * var2, 1));
               }
            }
         }

         this.o.a(this, this.s, this.t, this.u, 1.0F, false, this.o.O().b("mobGriefing"));
         this.B();
      }

   }

   public boolean R() {
      return false;
   }

   public boolean a(ro var1, float var2) {
      return false;
   }

   protected void c() {
      this.af.a(10, Byte.valueOf((byte)0));
   }

   public boolean f() {
      return this.af.a(10) == 1;
   }

   public void a(boolean var1) {
      this.af.b(10, Byte.valueOf((byte)(var1?1:0)));
   }
}
