
public class rq extends rp {

   private sa q;


   public rq(String var1, sa var2, sa var3) {
      super(var1, var2);
      this.q = var3;
   }

   public sa i() {
      return this.p;
   }

   public sa j() {
      return this.q;
   }

   public fj b(sv var1) {
      fj var2 = this.q == null?this.p.c_():this.q.c_();
      add var3 = this.q instanceof sv?((sv)this.q).be():null;
      String var4 = "death.attack." + this.o;
      String var5 = var4 + ".item";
      return var3 != null && var3.u() && dd.c(var5)?new fr(var5, new Object[]{var1.c_(), var2, var3.E()}):new fr(var4, new Object[]{var1.c_(), var2});
   }
}
