
public class rp extends ro {

   protected sa p;


   public rp(String var1, sa var2) {
      super(var1);
      this.p = var2;
   }

   public sa j() {
      return this.p;
   }

   public fj b(sv var1) {
      add var2 = this.p instanceof sv?((sv)this.p).be():null;
      String var3 = "death.attack." + this.o;
      String var4 = var3 + ".item";
      return var2 != null && var2.u() && dd.c(var4)?new fr(var4, new Object[]{var1.c_(), this.p.c_(), var2.E()}):new fr(var3, new Object[]{var1.c_(), this.p.c_()});
   }

   public boolean r() {
      return this.p != null && this.p instanceof sv && !(this.p instanceof yz);
   }
}
