import java.util.Random;

public abstract class ayl extends awq {

   public static final bet b = bet.a("seamless");
   public static final bev M = bev.a("variant", aym.class);


   public ayl() {
      super(bof.e);
      bec var1 = this.L.b();
      if(this.j()) {
         var1 = var1.a(b, Boolean.valueOf(false));
      } else {
         var1 = var1.a(a, awr.b);
      }

      this.j(var1.a(M, aym.a));
      this.a(akf.b);
   }

   public alq a(bec var1, Random var2, int var3) {
      return alq.a((atr)aty.cP);
   }

   public String b(int var1) {
      return super.a() + "." + aym.a(var1).c();
   }

   public bex l() {
      return M;
   }

   public Object a(amj var1) {
      return aym.a(var1.i() & 7);
   }

   public bec a(int var1) {
      bec var2 = this.P().a(M, aym.a(var1 & 7));
      if(this.j()) {
         var2 = var2.a(b, Boolean.valueOf((var1 & 8) != 0));
      } else {
         var2 = var2.a(a, (var1 & 8) == 0?awr.b:awr.a);
      }

      return var2;
   }

   public int c(bec var1) {
      byte var2 = 0;
      int var3 = var2 | ((aym)var1.b(M)).a();
      if(this.j()) {
         if(((Boolean)var1.b(b)).booleanValue()) {
            var3 |= 8;
         }
      } else if(var1.b(a) == awr.a) {
         var3 |= 8;
      }

      return var3;
   }

   protected bed e() {
      return this.j()?new bed(this, new bex[]{b, M}):new bed(this, new bex[]{a, M});
   }

   public int a(bec var1) {
      return ((aym)var1.b(M)).a();
   }

}
