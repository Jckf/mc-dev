
public class yn extends yg {

   public yn(ahb var1) {
      super(var1);
      this.a(1.4F, 0.9F);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
   }

   public void h() {
      super.h();
      if(!this.o.E) {
         this.a(this.E);
      }

   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(16.0D);
      this.a(yj.d).a(0.800000011920929D);
   }

   protected sa bR() {
      float var1 = this.d(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.o.b(this, var2);
      } else {
         return null;
      }
   }

   protected String t() {
      return "mob.spider.say";
   }

   protected String aT() {
      return "mob.spider.say";
   }

   protected String aU() {
      return "mob.spider.death";
   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.spider.step", 0.15F, 1.0F);
   }

   protected void a(sa var1, float var2) {
      float var3 = this.d(1.0F);
      if(var3 > 0.5F && this.Z.nextInt(100) == 0) {
         this.bm = null;
      } else {
         if(var2 > 2.0F && var2 < 6.0F && this.Z.nextInt(10) == 0) {
            if(this.D) {
               double var4 = var1.s - this.s;
               double var6 = var1.u - this.u;
               float var8 = qh.a(var4 * var4 + var6 * var6);
               this.v = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.v * 0.20000000298023224D;
               this.x = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.x * 0.20000000298023224D;
               this.w = 0.4000000059604645D;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   protected adb u() {
      return ade.F;
   }

   protected void b(boolean var1, int var2) {
      super.b(var1, var2);
      if(var1 && (this.Z.nextInt(3) == 0 || this.Z.nextInt(1 + var2) > 0)) {
         this.a(ade.bp, 1);
      }

   }

   public boolean h_() {
      return this.bZ();
   }

   public void as() {}

   public sz bd() {
      return sz.c;
   }

   public boolean d(rw var1) {
      return var1.a() == rv.u.H?false:super.d(var1);
   }

   public boolean bZ() {
      return (this.af.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.af.b(16, Byte.valueOf(var2));
   }

   public sy a(sy var1) {
      Object var3 = super.a(var1);
      if(this.o.s.nextInt(100) == 0) {
         yl var2 = new yl(this.o);
         var2.b(this.s, this.t, this.u, this.y, 0.0F);
         var2.a((sy)null);
         this.o.d((sa)var2);
         var2.a((sa)this);
      }

      if(var3 == null) {
         var3 = new yo();
         if(this.o.r == rd.d && this.o.s.nextFloat() < 0.1F * this.o.b(this.s, this.t, this.u)) {
            ((yo)var3).a(this.o.s);
         }
      }

      if(var3 instanceof yo) {
         int var4 = ((yo)var3).a;
         if(var4 > 0 && rv.a[var4] != null) {
            this.c(new rw(var4, Integer.MAX_VALUE));
         }
      }

      return (sy)var3;
   }
}
