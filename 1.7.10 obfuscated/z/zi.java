
public class zi extends ze {

   public zi(ahb var1) {
      super(var1);
      this.a(0.3125F, 0.3125F);
   }

   public zi(ahb var1, sv var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.a(0.3125F, 0.3125F);
   }

   public zi(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.a(0.3125F, 0.3125F);
   }

   protected void a(azu var1) {
      if(!this.o.E) {
         if(var1.g != null) {
            if(!var1.g.K() && var1.g.a(ro.a((ze)this, this.a), 5.0F)) {
               var1.g.e(5);
            }
         } else {
            int var2 = var1.b;
            int var3 = var1.c;
            int var4 = var1.d;
            switch(var1.e) {
            case 0:
               --var3;
               break;
            case 1:
               ++var3;
               break;
            case 2:
               --var4;
               break;
            case 3:
               ++var4;
               break;
            case 4:
               --var2;
               break;
            case 5:
               ++var2;
            }

            if(this.o.c(var2, var3, var4)) {
               this.o.b(var2, var3, var4, (aji)ajn.ab);
            }
         }

         this.B();
      }

   }

   public boolean R() {
      return false;
   }

   public boolean a(ro var1, float var2) {
      return false;
   }
}
