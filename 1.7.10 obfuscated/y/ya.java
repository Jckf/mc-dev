import java.util.UUID;

public class ya extends yg {

   private static final UUID bp = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final tj bq = (new tj(bp, "Attacking speed boost", 6.199999809265137D, 0)).a(false);
   private static boolean[] br = new boolean[256];
   private int bs;
   private int bt;
   private sa bu;
   private boolean bv;


   public ya(ahb var1) {
      super(var1);
      this.a(0.6F, 2.9F);
      this.W = 1.0F;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(40.0D);
      this.a(yj.d).a(0.30000001192092896D);
      this.a(yj.e).a(7.0D);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
      this.af.a(17, new Byte((byte)0));
      this.af.a(18, new Byte((byte)0));
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("carried", (short)aji.b(this.cb()));
      var1.a("carriedData", (short)this.cc());
   }

   public void a(dh var1) {
      super.a(var1);
      this.a(aji.e(var1.e("carried")));
      this.a(var1.e("carriedData"));
   }

   protected sa bR() {
      yz var1 = this.o.b(this, 64.0D);
      if(var1 != null) {
         if(this.f(var1)) {
            this.bv = true;
            if(this.bt == 0) {
               this.o.a(var1.s, var1.t, var1.u, "mob.endermen.stare", 1.0F, 1.0F);
            }

            if(this.bt++ == 5) {
               this.bt = 0;
               this.a(true);
               return var1;
            }
         } else {
            this.bt = 0;
         }
      }

      return null;
   }

   private boolean f(yz var1) {
      add var2 = var1.bm.b[3];
      if(var2 != null && var2.b() == adb.a(ajn.aK)) {
         return false;
      } else {
         azw var3 = var1.j(1.0F).a();
         azw var4 = azw.a(this.s - var1.s, this.C.b + (double)(this.N / 2.0F) - (var1.t + (double)var1.g()), this.u - var1.u);
         double var5 = var4.b();
         var4 = var4.a();
         double var7 = var3.b(var4);
         return var7 > 1.0D - 0.025D / var5 && var1.p(this);
      }
   }

   public void e() {
      if(this.L()) {
         this.a(ro.e, 1.0F);
      }

      if(this.bu != this.bm) {
         ti var1 = this.a(yj.d);
         var1.b(bq);
         if(this.bm != null) {
            var1.a(bq);
         }
      }

      this.bu = this.bm;
      int var6;
      if(!this.o.E && this.o.O().b("mobGriefing")) {
         int var2;
         int var3;
         aji var4;
         if(this.cb().o() == awt.a) {
            if(this.Z.nextInt(20) == 0) {
               var6 = qh.c(this.s - 2.0D + this.Z.nextDouble() * 4.0D);
               var2 = qh.c(this.t + this.Z.nextDouble() * 3.0D);
               var3 = qh.c(this.u - 2.0D + this.Z.nextDouble() * 4.0D);
               var4 = this.o.a(var6, var2, var3);
               if(br[aji.b(var4)]) {
                  this.a(var4);
                  this.a(this.o.e(var6, var2, var3));
                  this.o.b(var6, var2, var3, ajn.a);
               }
            }
         } else if(this.Z.nextInt(2000) == 0) {
            var6 = qh.c(this.s - 1.0D + this.Z.nextDouble() * 2.0D);
            var2 = qh.c(this.t + this.Z.nextDouble() * 2.0D);
            var3 = qh.c(this.u - 1.0D + this.Z.nextDouble() * 2.0D);
            var4 = this.o.a(var6, var2, var3);
            aji var5 = this.o.a(var6, var2 - 1, var3);
            if(var4.o() == awt.a && var5.o() != awt.a && var5.d()) {
               this.o.d(var6, var2, var3, this.cb(), this.cc(), 3);
               this.a(ajn.a);
            }
         }
      }

      for(var6 = 0; var6 < 2; ++var6) {
         this.o.a("portal", this.s + (this.Z.nextDouble() - 0.5D) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N - 0.25D, this.u + (this.Z.nextDouble() - 0.5D) * (double)this.M, (this.Z.nextDouble() - 0.5D) * 2.0D, -this.Z.nextDouble(), (this.Z.nextDouble() - 0.5D) * 2.0D);
      }

      if(this.o.w() && !this.o.E) {
         float var7 = this.d(1.0F);
         if(var7 > 0.5F && this.o.i(qh.c(this.s), qh.c(this.t), qh.c(this.u)) && this.Z.nextFloat() * 30.0F < (var7 - 0.4F) * 2.0F) {
            this.bm = null;
            this.a(false);
            this.bv = false;
            this.bZ();
         }
      }

      if(this.L() || this.al()) {
         this.bm = null;
         this.a(false);
         this.bv = false;
         this.bZ();
      }

      if(this.cd() && !this.bv && this.Z.nextInt(100) == 0) {
         this.a(false);
      }

      this.bc = false;
      if(this.bm != null) {
         this.a(this.bm, 100.0F, 100.0F);
      }

      if(!this.o.E && this.Z()) {
         if(this.bm != null) {
            if(this.bm instanceof yz && this.f((yz)this.bm)) {
               if(this.bm.f((sa)this) < 16.0D) {
                  this.bZ();
               }

               this.bs = 0;
            } else if(this.bm.f((sa)this) > 256.0D && this.bs++ >= 30 && this.c(this.bm)) {
               this.bs = 0;
            }
         } else {
            this.a(false);
            this.bs = 0;
         }
      }

      super.e();
   }

   protected boolean bZ() {
      double var1 = this.s + (this.Z.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.t + (double)(this.Z.nextInt(64) - 32);
      double var5 = this.u + (this.Z.nextDouble() - 0.5D) * 64.0D;
      return this.k(var1, var3, var5);
   }

   protected boolean c(sa var1) {
      azw var2 = azw.a(this.s - var1.s, this.C.b + (double)(this.N / 2.0F) - var1.t + (double)var1.g(), this.u - var1.u);
      var2 = var2.a();
      double var3 = 16.0D;
      double var5 = this.s + (this.Z.nextDouble() - 0.5D) * 8.0D - var2.a * var3;
      double var7 = this.t + (double)(this.Z.nextInt(16) - 8) - var2.b * var3;
      double var9 = this.u + (this.Z.nextDouble() - 0.5D) * 8.0D - var2.c * var3;
      return this.k(var5, var7, var9);
   }

   protected boolean k(double var1, double var3, double var5) {
      double var7 = this.s;
      double var9 = this.t;
      double var11 = this.u;
      this.s = var1;
      this.t = var3;
      this.u = var5;
      boolean var13 = false;
      int var14 = qh.c(this.s);
      int var15 = qh.c(this.t);
      int var16 = qh.c(this.u);
      if(this.o.d(var14, var15, var16)) {
         boolean var17 = false;

         while(!var17 && var15 > 0) {
            aji var18 = this.o.a(var14, var15 - 1, var16);
            if(var18.o().c()) {
               var17 = true;
            } else {
               --this.t;
               --var15;
            }
         }

         if(var17) {
            this.b(this.s, this.t, this.u);
            if(this.o.a((sa)this, this.C).isEmpty() && !this.o.d(this.C)) {
               var13 = true;
            }
         }
      }

      if(!var13) {
         this.b(var7, var9, var11);
         return false;
      } else {
         short var30 = 128;

         for(int var31 = 0; var31 < var30; ++var31) {
            double var19 = (double)var31 / ((double)var30 - 1.0D);
            float var21 = (this.Z.nextFloat() - 0.5F) * 0.2F;
            float var22 = (this.Z.nextFloat() - 0.5F) * 0.2F;
            float var23 = (this.Z.nextFloat() - 0.5F) * 0.2F;
            double var24 = var7 + (this.s - var7) * var19 + (this.Z.nextDouble() - 0.5D) * (double)this.M * 2.0D;
            double var26 = var9 + (this.t - var9) * var19 + this.Z.nextDouble() * (double)this.N;
            double var28 = var11 + (this.u - var11) * var19 + (this.Z.nextDouble() - 0.5D) * (double)this.M * 2.0D;
            this.o.a("portal", var24, var26, var28, (double)var21, (double)var22, (double)var23);
         }

         this.o.a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
         this.a("mob.endermen.portal", 1.0F, 1.0F);
         return true;
      }
   }

   protected String t() {
      return this.cd()?"mob.endermen.scream":"mob.endermen.idle";
   }

   protected String aT() {
      return "mob.endermen.hit";
   }

   protected String aU() {
      return "mob.endermen.death";
   }

   protected adb u() {
      return ade.bi;
   }

   protected void b(boolean var1, int var2) {
      adb var3 = this.u();
      if(var3 != null) {
         int var4 = this.Z.nextInt(2 + var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            this.a(var3, 1);
         }
      }

   }

   public void a(aji var1) {
      this.af.b(16, Byte.valueOf((byte)(aji.b(var1) & 255)));
   }

   public aji cb() {
      return aji.e(this.af.a(16));
   }

   public void a(int var1) {
      this.af.b(17, Byte.valueOf((byte)(var1 & 255)));
   }

   public int cc() {
      return this.af.a(17);
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.a(true);
         if(var1 instanceof rp && var1.j() instanceof yz) {
            this.bv = true;
         }

         if(var1 instanceof rq) {
            this.bv = false;

            for(int var3 = 0; var3 < 64; ++var3) {
               if(this.bZ()) {
                  return true;
               }
            }

            return false;
         } else {
            return super.a(var1, var2);
         }
      }
   }

   public boolean cd() {
      return this.af.a(18) > 0;
   }

   public void a(boolean var1) {
      this.af.b(18, Byte.valueOf((byte)(var1?1:0)));
   }

   static {
      br[aji.b((aji)ajn.c)] = true;
      br[aji.b(ajn.d)] = true;
      br[aji.b((aji)ajn.m)] = true;
      br[aji.b(ajn.n)] = true;
      br[aji.b((aji)ajn.N)] = true;
      br[aji.b((aji)ajn.O)] = true;
      br[aji.b((aji)ajn.P)] = true;
      br[aji.b((aji)ajn.Q)] = true;
      br[aji.b(ajn.W)] = true;
      br[aji.b(ajn.aF)] = true;
      br[aji.b(ajn.aG)] = true;
      br[aji.b(ajn.aK)] = true;
      br[aji.b(ajn.ba)] = true;
      br[aji.b((aji)ajn.bh)] = true;
   }
}
