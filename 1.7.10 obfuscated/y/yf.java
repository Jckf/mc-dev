
public class yf extends ym {

   public yf(ahb var1) {
      super(var1);
      this.ae = true;
   }

   protected void aD() {
      super.aD();
      this.a(yj.d).a(0.20000000298023224D);
   }

   public boolean by() {
      return this.o.r != rd.a && this.o.b(this.C) && this.o.a((sa)this, this.C).isEmpty() && !this.o.d(this.C);
   }

   public int aV() {
      return this.bX() * 3;
   }

   public float d(float var1) {
      return 1.0F;
   }

   protected String bP() {
      return "flame";
   }

   protected ym bQ() {
      return new yf(this.o);
   }

   protected adb u() {
      return ade.bs;
   }

   protected void b(boolean var1, int var2) {
      adb var3 = this.u();
      if(var3 != null && this.bX() > 1) {
         int var4 = this.Z.nextInt(4) - 2;
         if(var2 > 0) {
            var4 += this.Z.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.a(var3, 1);
         }
      }

   }

   public boolean al() {
      return false;
   }

   protected int bR() {
      return super.bR() * 4;
   }

   protected void bS() {
      this.h *= 0.9F;
   }

   protected void bj() {
      this.w = (double)(0.42F + (float)this.bX() * 0.1F);
      this.al = true;
   }

   protected void b(float var1) {}

   protected boolean bT() {
      return true;
   }

   protected int bU() {
      return super.bU() + 2;
   }

   protected String bV() {
      return this.bX() > 1?"mob.magmacube.big":"mob.magmacube.small";
   }

   public boolean P() {
      return false;
   }

   protected boolean bW() {
      return true;
   }
}
