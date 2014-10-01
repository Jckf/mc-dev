import java.util.UUID;

public abstract class td extends sw {

   public static final UUID h = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
   public static final tj i = (new tj(h, "Fleeing speed bonus", 2.0D, 2)).a(false);
   private ayf bp;
   protected sa bm;
   protected boolean bn;
   protected int bo;
   private r bq = new r(0, 0, 0);
   private float br = -1.0F;
   private ui bs = new ut(this, 1.0D);
   private boolean bt;


   public td(ahb var1) {
      super(var1);
   }

   protected boolean bP() {
      return false;
   }

   protected void bq() {
      this.o.C.a("ai");
      if(this.bo > 0 && --this.bo == 0) {
         ti var1 = this.a(yj.d);
         var1.b(i);
      }

      this.bn = this.bP();
      float var21 = 16.0F;
      if(this.bm == null) {
         this.bm = this.bR();
         if(this.bm != null) {
            this.bp = this.o.a(this, this.bm, var21, true, false, false, true);
         }
      } else if(this.bm.Z()) {
         float var2 = this.bm.e((sa)this);
         if(this.p(this.bm)) {
            this.a(this.bm, var2);
         }
      } else {
         this.bm = null;
      }

      if(this.bm instanceof mw && ((mw)this.bm).c.d()) {
         this.bm = null;
      }

      this.o.C.b();
      if(!this.bn && this.bm != null && (this.bp == null || this.Z.nextInt(20) == 0)) {
         this.bp = this.o.a(this, this.bm, var21, true, false, false, true);
      } else if(!this.bn && (this.bp == null && this.Z.nextInt(180) == 0 || this.Z.nextInt(120) == 0 || this.bo > 0) && this.aU < 100) {
         this.bQ();
      }

      int var22 = qh.c(this.C.b + 0.5D);
      boolean var3 = this.M();
      boolean var4 = this.P();
      this.z = 0.0F;
      if(this.bp != null && this.Z.nextInt(100) != 0) {
         this.o.C.a("followpath");
         azw var5 = this.bp.a((sa)this);
         double var6 = (double)(this.M * 2.0F);

         while(var5 != null && var5.d(this.s, var5.b, this.u) < var6 * var6) {
            this.bp.a();
            if(this.bp.b()) {
               var5 = null;
               this.bp = null;
            } else {
               var5 = this.bp.a((sa)this);
            }
         }

         this.bc = false;
         if(var5 != null) {
            double var8 = var5.a - this.s;
            double var10 = var5.c - this.u;
            double var12 = var5.b - (double)var22;
            float var14 = (float)(Math.atan2(var10, var8) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = qh.g(var14 - this.y);
            this.be = (float)this.a(yj.d).e();
            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.y += var15;
            if(this.bn && this.bm != null) {
               double var16 = this.bm.s - this.s;
               double var18 = this.bm.u - this.u;
               float var20 = this.y;
               this.y = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.y + 90.0F) * 3.1415927F / 180.0F;
               this.bd = -qh.a(var15) * this.be * 1.0F;
               this.be = qh.b(var15) * this.be * 1.0F;
            }

            if(var12 > 0.0D) {
               this.bc = true;
            }
         }

         if(this.bm != null) {
            this.a(this.bm, 30.0F, 30.0F);
         }

         if(this.E && !this.bS()) {
            this.bc = true;
         }

         if(this.Z.nextFloat() < 0.8F && (var3 || var4)) {
            this.bc = true;
         }

         this.o.C.b();
      } else {
         super.bq();
         this.bp = null;
      }
   }

   protected void bQ() {
      this.o.C.a("stroll");
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      float var5 = -99999.0F;

      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = qh.c(this.s + (double)this.Z.nextInt(13) - 6.0D);
         int var8 = qh.c(this.t + (double)this.Z.nextInt(7) - 3.0D);
         int var9 = qh.c(this.u + (double)this.Z.nextInt(13) - 6.0D);
         float var10 = this.a(var7, var8, var9);
         if(var10 > var5) {
            var5 = var10;
            var2 = var7;
            var3 = var8;
            var4 = var9;
            var1 = true;
         }
      }

      if(var1) {
         this.bp = this.o.a(this, var2, var3, var4, 10.0F, true, false, false, true);
      }

      this.o.C.b();
   }

   protected void a(sa var1, float var2) {}

   public float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected sa bR() {
      return null;
   }

   public boolean by() {
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.C.b);
      int var3 = qh.c(this.u);
      return super.by() && this.a(var1, var2, var3) >= 0.0F;
   }

   public boolean bS() {
      return this.bp != null;
   }

   public void a(ayf var1) {
      this.bp = var1;
   }

   public sa bT() {
      return this.bm;
   }

   public void b(sa var1) {
      this.bm = var1;
   }

   public boolean bU() {
      return this.b(qh.c(this.s), qh.c(this.t), qh.c(this.u));
   }

   public boolean b(int var1, int var2, int var3) {
      return this.br == -1.0F?true:this.bq.e(var1, var2, var3) < this.br * this.br;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.bq.b(var1, var2, var3);
      this.br = (float)var4;
   }

   public r bV() {
      return this.bq;
   }

   public float bW() {
      return this.br;
   }

   public void bX() {
      this.br = -1.0F;
   }

   public boolean bY() {
      return this.br != -1.0F;
   }

   protected void bL() {
      super.bL();
      if(this.bN() && this.bO() != null && this.bO().o == this.o) {
         sa var1 = this.bO();
         this.a((int)var1.s, (int)var1.t, (int)var1.u, 5);
         float var2 = this.e(var1);
         if(this instanceof tg && ((tg)this).ca()) {
            if(var2 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         if(!this.bt) {
            this.c.a(2, this.bs);
            this.m().a(false);
            this.bt = true;
         }

         this.o(var2);
         if(var2 > 4.0F) {
            this.m().a(var1, 1.0D);
         }

         if(var2 > 6.0F) {
            double var3 = (var1.s - this.s) / (double)var2;
            double var5 = (var1.t - this.t) / (double)var2;
            double var7 = (var1.u - this.u) / (double)var2;
            this.v += var3 * Math.abs(var3) * 0.4D;
            this.w += var5 * Math.abs(var5) * 0.4D;
            this.x += var7 * Math.abs(var7) * 0.4D;
         }

         if(var2 > 10.0F) {
            this.a(true, true);
         }
      } else if(!this.bN() && this.bt) {
         this.bt = false;
         this.c.a(this.bs);
         this.m().a(true);
         this.bX();
      }

   }

   protected void o(float var1) {}

}
