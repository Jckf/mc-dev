import java.util.ArrayList;
import java.util.Random;

public class ain extends ahu {

   protected ahu aD;


   public ain(int var1, ahu var2) {
      super(var1);
      this.aD = var2;
      this.a(var2.ag, true);
      this.af = var2.af + " M";
      this.ai = var2.ai;
      this.ak = var2.ak;
      this.al = var2.al;
      this.am = var2.am;
      this.an = var2.an;
      this.ao = var2.ao;
      this.ap = var2.ap;
      this.aq = var2.aq;
      this.aw = var2.aw;
      this.ax = var2.ax;
      this.at = new ArrayList(var2.at);
      this.as = new ArrayList(var2.as);
      this.av = new ArrayList(var2.av);
      this.au = new ArrayList(var2.au);
      this.ao = var2.ao;
      this.ap = var2.ap;
      this.am = var2.am + 0.1F;
      this.an = var2.an + 0.2F;
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      this.aD.ar.a(var1, var2, this, var3, var4);
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      this.aD.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public float g() {
      return this.aD.g();
   }

   public arc a(Random var1) {
      return this.aD.a(var1);
   }

   public Class l() {
      return this.aD.l();
   }

   public boolean a(ahu var1) {
      return this.aD.a(var1);
   }

   public ahw m() {
      return this.aD.m();
   }
}
