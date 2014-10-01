
public class amj extends ajc {

   public amj() {
      super(awt.d);
      this.a(abt.d);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      boolean var6 = var1.v(var2, var3, var4);
      apl var7 = (apl)var1.o(var2, var3, var4);
      if(var7 != null && var7.i != var6) {
         if(var6) {
            var7.a(var1, var2, var3, var4);
         }

         var7.i = var6;
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         apl var10 = (apl)var1.o(var2, var3, var4);
         if(var10 != null) {
            var10.a();
            var10.a(var1, var2, var3, var4);
         }

         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {
      if(!var1.E) {
         apl var6 = (apl)var1.o(var2, var3, var4);
         if(var6 != null) {
            var6.a(var1, var2, var3, var4);
         }

      }
   }

   public aor a(ahb var1, int var2) {
      return new apl();
   }

   public boolean a(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)Math.pow(2.0D, (double)(var6 - 12) / 12.0D);
      String var8 = "harp";
      if(var5 == 1) {
         var8 = "bd";
      }

      if(var5 == 2) {
         var8 = "snare";
      }

      if(var5 == 3) {
         var8 = "hat";
      }

      if(var5 == 4) {
         var8 = "bassattack";
      }

      var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "note." + var8, 3.0F, var7);
      var1.a("note", (double)var2 + 0.5D, (double)var3 + 1.2D, (double)var4 + 0.5D, (double)var6 / 24.0D, 0.0D, 0.0D);
      return true;
   }
}
