
public class xx extends yg {

   private float bp = 0.5F;
   private int bq;
   private int br;


   public xx(ahb var1) {
      super(var1);
      this.ae = true;
      this.b = 10;
   }

   protected void aD() {
      super.aD();
      this.a(yj.e).a(6.0D);
   }

   protected void c() {
      super.c();
      this.af.a(16, new Byte((byte)0));
   }

   protected String t() {
      return "mob.blaze.breathe";
   }

   protected String aT() {
      return "mob.blaze.hit";
   }

   protected String aU() {
      return "mob.blaze.death";
   }

   public float d(float var1) {
      return 1.0F;
   }

   public void e() {
      if(!this.o.E) {
         if(this.L()) {
            this.a(ro.e, 1.0F);
         }

         --this.bq;
         if(this.bq <= 0) {
            this.bq = 100;
            this.bp = 0.5F + (float)this.Z.nextGaussian() * 3.0F;
         }

         if(this.bT() != null && this.bT().t + (double)this.bT().g() > this.t + (double)this.g() + (double)this.bp) {
            this.w += (0.30000001192092896D - this.w) * 0.30000001192092896D;
         }
      }

      if(this.Z.nextInt(24) == 0) {
         this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.fire", 1.0F + this.Z.nextFloat(), this.Z.nextFloat() * 0.7F + 0.3F);
      }

      if(!this.D && this.w < 0.0D) {
         this.w *= 0.6D;
      }

      for(int var1 = 0; var1 < 2; ++var1) {
         this.o.a("largesmoke", this.s + (this.Z.nextDouble() - 0.5D) * (double)this.M, this.t + this.Z.nextDouble() * (double)this.N, this.u + (this.Z.nextDouble() - 0.5D) * (double)this.M, 0.0D, 0.0D, 0.0D);
      }

      super.e();
   }

   protected void a(sa var1, float var2) {
      if(this.aB <= 0 && var2 < 2.0F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aB = 20;
         this.n(var1);
      } else if(var2 < 30.0F) {
         double var3 = var1.s - this.s;
         double var5 = var1.C.b + (double)(var1.N / 2.0F) - (this.t + (double)(this.N / 2.0F));
         double var7 = var1.u - this.u;
         if(this.aB == 0) {
            ++this.br;
            if(this.br == 1) {
               this.aB = 60;
               this.a(true);
            } else if(this.br <= 4) {
               this.aB = 6;
            } else {
               this.aB = 100;
               this.br = 0;
               this.a(false);
            }

            if(this.br > 1) {
               float var9 = qh.c(var2) * 0.5F;
               this.o.a((yz)null, 1009, (int)this.s, (int)this.t, (int)this.u, 0);

               for(int var10 = 0; var10 < 1; ++var10) {
                  zi var11 = new zi(this.o, this, var3 + this.Z.nextGaussian() * (double)var9, var5, var7 + this.Z.nextGaussian() * (double)var9);
                  var11.t = this.t + (double)(this.N / 2.0F) + 0.5D;
                  this.o.d((sa)var11);
               }
            }
         }

         this.y = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.bn = true;
      }

   }

   protected void b(float var1) {}

   protected adb u() {
      return ade.bj;
   }

   public boolean al() {
      return this.bZ();
   }

   protected void b(boolean var1, int var2) {
      if(var1) {
         int var3 = this.Z.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.a(ade.bj, 1);
         }
      }

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

   protected boolean j_() {
      return true;
   }
}
