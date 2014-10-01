import java.util.Random;

public class aob extends aji {

   public aob() {
      super(awt.u);
      this.a(abt.d);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(var1.v(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 1);
         var1.f(var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(var1.v(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 1);
         var1.f(var2, var3, var4);
      }

   }

   public int a(Random var1) {
      return 1;
   }

   public void a(ahb var1, int var2, int var3, int var4, agw var5) {
      if(!var1.E) {
         xw var6 = new xw(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5.c());
         var6.a = var1.s.nextInt(var6.a / 4) + var6.a / 8;
         var1.d((sa)var6);
      }
   }

   public void b(ahb var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, (sv)null);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, sv var6) {
      if(!var1.E) {
         if((var5 & 1) == 1) {
            xw var7 = new xw(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var6);
            var1.d((sa)var7);
            var1.a((sa)var7, "game.tnt.primed", 1.0F, 1.0F);
         }

      }
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var5.bF() != null && var5.bF().b() == ade.d) {
         this.a(var1, var2, var3, var4, 1, var5);
         var1.f(var2, var3, var4);
         var5.bF().a(1, (sv)var5);
         return true;
      } else {
         return super.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(var5 instanceof zc && !var1.E) {
         zc var6 = (zc)var5;
         if(var6.al()) {
            this.a(var1, var2, var3, var4, 1, var6.c instanceof sv?(sv)var6.c:null);
            var1.f(var2, var3, var4);
         }
      }

   }

   public boolean a(agw var1) {
      return false;
   }
}
