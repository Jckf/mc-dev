import java.util.Random;

public abstract class aje extends aji {

   protected final boolean a;


   public static final boolean b_(ahb var0, int var1, int var2, int var3) {
      return a(var0.a(var1, var2, var3));
   }

   public static final boolean a(aji var0) {
      return var0 == ajn.aq || var0 == ajn.D || var0 == ajn.E || var0 == ajn.cc;
   }

   protected aje(boolean var1) {
      super(awt.q);
      this.a = var1;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(abt.e);
   }

   public boolean e() {
      return this.a;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 9;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return ahb.a((ahl)var1, var2, var3 - 1, var4);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         this.a(var1, var2, var3, var4, true);
         if(this.a) {
            this.a(var1, var2, var3, var4, this);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = var6;
         if(this.a) {
            var7 = var6 & 7;
         }

         boolean var8 = false;
         if(!ahb.a((ahl)var1, var2, var3 - 1, var4)) {
            var8 = true;
         }

         if(var7 == 2 && !ahb.a((ahl)var1, var2 + 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 3 && !ahb.a((ahl)var1, var2 - 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 4 && !ahb.a((ahl)var1, var2, var3, var4 - 1)) {
            var8 = true;
         }

         if(var7 == 5 && !ahb.a((ahl)var1, var2, var3, var4 + 1)) {
            var8 = true;
         }

         if(var8) {
            this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.f(var2, var3, var4);
         } else {
            this.a(var1, var2, var3, var4, var6, var7, var5);
         }

      }
   }

   protected void a(ahb var1, int var2, int var3, int var4, int var5, int var6, aji var7) {}

   protected void a(ahb var1, int var2, int var3, int var4, boolean var5) {
      if(!var1.E) {
         (new ajf(this, var1, var2, var3, var4)).a(var1.v(var2, var3, var4), var5);
      }
   }

   public int h() {
      return 0;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      int var7 = var6;
      if(this.a) {
         var7 = var6 & 7;
      }

      super.a(var1, var2, var3, var4, var5, var6);
      if(var7 == 2 || var7 == 3 || var7 == 4 || var7 == 5) {
         var1.d(var2, var3 + 1, var4, var5);
      }

      if(this.a) {
         var1.d(var2, var3, var4, var5);
         var1.d(var2, var3 - 1, var4, var5);
      }

   }
}
