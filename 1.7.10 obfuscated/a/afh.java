
public class afh implements afg {

   private int a;
   private int b;
   private add[] c;
   private add d;
   private boolean e;


   public afh(int var1, int var2, add[] var3, add var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public add b() {
      return this.d;
   }

   public boolean a(aae var1, ahb var2) {
      for(int var3 = 0; var3 <= 3 - this.a; ++var3) {
         for(int var4 = 0; var4 <= 3 - this.b; ++var4) {
            if(this.a(var1, var3, var4, true)) {
               return true;
            }

            if(this.a(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(aae var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 3; ++var6) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            add var9 = null;
            if(var7 >= 0 && var8 >= 0 && var7 < this.a && var8 < this.b) {
               if(var4) {
                  var9 = this.c[this.a - var7 - 1 + var8 * this.a];
               } else {
                  var9 = this.c[var7 + var8 * this.a];
               }
            }

            add var10 = var1.b(var5, var6);
            if(var10 != null || var9 != null) {
               if(var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if(var9.b() != var10.b()) {
                  return false;
               }

               if(var9.k() != 32767 && var9.k() != var10.k()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public add a(aae var1) {
      add var2 = this.b().m();
      if(this.e) {
         for(int var3 = 0; var3 < var1.a(); ++var3) {
            add var4 = var1.a(var3);
            if(var4 != null && var4.p()) {
               var2.d((dh)var4.d.b());
            }
         }
      }

      return var2;
   }

   public int a() {
      return this.a * this.b;
   }

   public afh c() {
      this.e = true;
      return this;
   }
}
