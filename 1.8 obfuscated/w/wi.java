
public class wi extends wh {

   protected wv q;
   private boolean r = false;


   public wi(String var1, wv var2) {
      super(var1);
      this.q = var2;
   }

   public wi v() {
      this.r = true;
      return this;
   }

   public boolean w() {
      return this.r;
   }

   public wv j() {
      return this.q;
   }

   public ho b(xm var1) {
      amj var2 = this.q instanceof xm?((xm)this.q).bz():null;
      String var3 = "death.attack." + this.p;
      String var4 = var3 + ".item";
      return var2 != null && var2.s() && fi.c(var4)?new hz(var4, new Object[]{var1.e_(), this.q.e_(), var2.C()}):new hz(var3, new Object[]{var1.e_(), this.q.e_()});
   }

   public boolean r() {
      return this.q != null && this.q instanceof xm && !(this.q instanceof ahd);
   }
}
