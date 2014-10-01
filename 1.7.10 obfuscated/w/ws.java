
public class ws extends wu {

   public float bp;
   public float bq;
   public float br;
   public float bs;
   public float bt;
   public float bu;
   public float bv;
   public float bw;
   private float bx;
   private float by;
   private float bz;
   private float bA;
   private float bB;
   private float bC;


   public ws(ahb var1) {
      super(var1);
      this.a(0.95F, 0.95F);
      this.by = 1.0F / (this.Z.nextFloat() + 1.0F) * 0.2F;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(10.0D);
   }

   protected String t() {
      return null;
   }

   protected String aT() {
      return null;
   }

   protected String aU() {
      return null;
   }

   protected float bf() {
      return 0.4F;
   }

   protected adb u() {
      return adb.d(0);
   }

   protected boolean g_() {
      return false;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3 + var2) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(new add(ade.aR, 1, 0), 0.0F);
      }

   }

   public boolean M() {
      return this.o.a(this.C.b(0.0D, -0.6000000238418579D, 0.0D), awt.h, (sa)this);
   }

   public void e() {
      super.e();
      this.bq = this.bp;
      this.bs = this.br;
      this.bu = this.bt;
      this.bw = this.bv;
      this.bt += this.by;
      if(this.bt > 6.2831855F) {
         this.bt -= 6.2831855F;
         if(this.Z.nextInt(10) == 0) {
            this.by = 1.0F / (this.Z.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if(this.M()) {
         float var1;
         if(this.bt < 3.1415927F) {
            var1 = this.bt / 3.1415927F;
            this.bv = qh.a(var1 * var1 * 3.1415927F) * 3.1415927F * 0.25F;
            if((double)var1 > 0.75D) {
               this.bx = 1.0F;
               this.bz = 1.0F;
            } else {
               this.bz *= 0.8F;
            }
         } else {
            this.bv = 0.0F;
            this.bx *= 0.9F;
            this.bz *= 0.99F;
         }

         if(!this.o.E) {
            this.v = (double)(this.bA * this.bx);
            this.w = (double)(this.bB * this.bx);
            this.x = (double)(this.bC * this.bx);
         }

         var1 = qh.a(this.v * this.v + this.x * this.x);
         this.aM += (-((float)Math.atan2(this.v, this.x)) * 180.0F / 3.1415927F - this.aM) * 0.1F;
         this.y = this.aM;
         this.br += 3.1415927F * this.bz * 1.5F;
         this.bp += (-((float)Math.atan2((double)var1, this.w)) * 180.0F / 3.1415927F - this.bp) * 0.1F;
      } else {
         this.bv = qh.e(qh.a(this.bt)) * 3.1415927F * 0.25F;
         if(!this.o.E) {
            this.v = 0.0D;
            this.w -= 0.08D;
            this.w *= 0.9800000190734863D;
            this.x = 0.0D;
         }

         this.bp = (float)((double)this.bp + (double)(-90.0F - this.bp) * 0.02D);
      }

   }

   public void e(float var1, float var2) {
      this.d(this.v, this.w, this.x);
   }

   protected void bq() {
      ++this.aU;
      if(this.aU > 100) {
         this.bA = this.bB = this.bC = 0.0F;
      } else if(this.Z.nextInt(50) == 0 || !this.ac || this.bA == 0.0F && this.bB == 0.0F && this.bC == 0.0F) {
         float var1 = this.Z.nextFloat() * 3.1415927F * 2.0F;
         this.bA = qh.b(var1) * 0.2F;
         this.bB = -0.1F + this.Z.nextFloat() * 0.2F;
         this.bC = qh.a(var1) * 0.2F;
      }

      this.w();
   }

   public boolean by() {
      return this.t > 45.0D && this.t < 63.0D && super.by();
   }
}
