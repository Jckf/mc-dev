import java.util.Calendar;

public class we extends wd {

   private r h;


   public we(ahb var1) {
      super(var1);
      this.a(0.5F, 0.9F);
      this.a(true);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
   }

   protected float bf() {
      return 0.1F;
   }

   protected float bg() {
      return super.bg() * 0.95F;
   }

   protected String t() {
      return this.bP() && this.Z.nextInt(4) != 0?null:"mob.bat.idle";
   }

   protected String aT() {
      return "mob.bat.hurt";
   }

   protected String aU() {
      return "mob.bat.death";
   }

   public boolean S() {
      return false;
   }

   protected void o(sa var1) {}

   protected void bo() {}

   protected void aD() {
      super.aD();
      this.a(yj.a).a(6.0D);
   }

   public boolean bP() {
      return (this.af.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   protected boolean bk() {
      return true;
   }

   public void h() {
      super.h();
      if(this.bP()) {
         this.v = this.w = this.x = 0.0D;
         this.t = (double)qh.c(this.t) + 1.0D - (double)this.N;
      } else {
         this.w *= 0.6000000238418579D;
      }

   }

   protected void bn() {
      super.bn();
      if(this.bP()) {
         if(!this.o.a(qh.c(this.s), (int)this.t + 1, qh.c(this.u)).r()) {
            this.a(false);
            this.o.a((yz)null, 1015, (int)this.s, (int)this.t, (int)this.u, 0);
         } else {
            if(this.Z.nextInt(200) == 0) {
               this.aO = (float)this.Z.nextInt(360);
            }

            if(this.o.a(this, 4.0D) != null) {
               this.a(false);
               this.o.a((yz)null, 1015, (int)this.s, (int)this.t, (int)this.u, 0);
            }
         }
      } else {
         if(this.h != null && (!this.o.c(this.h.a, this.h.b, this.h.c) || this.h.b < 1)) {
            this.h = null;
         }

         if(this.h == null || this.Z.nextInt(30) == 0 || this.h.e((int)this.s, (int)this.t, (int)this.u) < 4.0F) {
            this.h = new r((int)this.s + this.Z.nextInt(7) - this.Z.nextInt(7), (int)this.t + this.Z.nextInt(6) - 2, (int)this.u + this.Z.nextInt(7) - this.Z.nextInt(7));
         }

         double var1 = (double)this.h.a + 0.5D - this.s;
         double var3 = (double)this.h.b + 0.1D - this.t;
         double var5 = (double)this.h.c + 0.5D - this.u;
         this.v += (Math.signum(var1) * 0.5D - this.v) * 0.10000000149011612D;
         this.w += (Math.signum(var3) * 0.699999988079071D - this.w) * 0.10000000149011612D;
         this.x += (Math.signum(var5) * 0.5D - this.x) * 0.10000000149011612D;
         float var7 = (float)(Math.atan2(this.x, this.v) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var8 = qh.g(var7 - this.y);
         this.be = 0.5F;
         this.y += var8;
         if(this.Z.nextInt(100) == 0 && this.o.a(qh.c(this.s), (int)this.t + 1, qh.c(this.u)).r()) {
            this.a(true);
         }
      }

   }

   protected boolean g_() {
      return false;
   }

   protected void b(float var1) {}

   protected void a(double var1, boolean var3) {}

   public boolean az() {
      return true;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         if(!this.o.E && this.bP()) {
            this.a(false);
         }

         return super.a(var1, var2);
      }
   }

   public void a(dh var1) {
      super.a(var1);
      this.af.b(16, Byte.valueOf(var1.d("BatFlags")));
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("BatFlags", this.af.a(16));
   }

   public boolean by() {
      int var1 = qh.c(this.C.b);
      if(var1 >= 63) {
         return false;
      } else {
         int var2 = qh.c(this.s);
         int var3 = qh.c(this.u);
         int var4 = this.o.k(var2, var1, var3);
         byte var5 = 4;
         Calendar var6 = this.o.V();
         if((var6.get(2) + 1 != 10 || var6.get(5) < 20) && (var6.get(2) + 1 != 11 || var6.get(5) > 3)) {
            if(this.Z.nextBoolean()) {
               return false;
            }
         } else {
            var5 = 7;
         }

         return var4 > this.Z.nextInt(var5)?false:super.by();
      }
   }
}
