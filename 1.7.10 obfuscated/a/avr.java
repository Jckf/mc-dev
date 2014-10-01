import java.util.List;
import java.util.Random;

public class avr extends awd {

   private aji a;
   private aji b;
   private aji c;
   private aji d;


   public avr() {}

   public avr(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
      this.a = this.a(var3);
      this.b = this.a(var3);
      this.c = this.a(var3);
      this.d = this.a(var3);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("CA", aji.c.b((Object)this.a));
      var1.a("CB", aji.c.b((Object)this.b));
      var1.a("CC", aji.c.b((Object)this.c));
      var1.a("CD", aji.c.b((Object)this.d));
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = aji.e(var1.f("CA"));
      this.b = aji.e(var1.f("CB"));
      this.c = aji.e(var1.f("CC"));
      this.d = aji.e(var1.f("CD"));
   }

   private aji a(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return ajn.bM;
      case 1:
         return ajn.bN;
      default:
         return ajn.aj;
      }
   }

   public static avr a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      return a(var8) && avk.a(var1, var8) == null?new avr(var0, var7, var2, var8, var6):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 12, 4, 8, ajn.a, ajn.a, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 7, ajn.ak, ajn.ak, false);
      this.a(var1, var3, 4, 0, 1, 5, 0, 7, ajn.ak, ajn.ak, false);
      this.a(var1, var3, 7, 0, 1, 8, 0, 7, ajn.ak, ajn.ak, false);
      this.a(var1, var3, 10, 0, 1, 11, 0, 7, ajn.ak, ajn.ak, false);
      this.a(var1, var3, 0, 0, 0, 0, 0, 8, ajn.r, ajn.r, false);
      this.a(var1, var3, 6, 0, 0, 6, 0, 8, ajn.r, ajn.r, false);
      this.a(var1, var3, 12, 0, 0, 12, 0, 8, ajn.r, ajn.r, false);
      this.a(var1, var3, 1, 0, 0, 11, 0, 0, ajn.r, ajn.r, false);
      this.a(var1, var3, 1, 0, 8, 11, 0, 8, ajn.r, ajn.r, false);
      this.a(var1, var3, 3, 0, 1, 3, 0, 7, ajn.j, ajn.j, false);
      this.a(var1, var3, 9, 0, 1, 9, 0, 7, ajn.j, ajn.j, false);

      int var4;
      for(var4 = 1; var4 <= 7; ++var4) {
         this.a(var1, this.a, qh.a(var2, 2, 7), 1, 1, var4, var3);
         this.a(var1, this.a, qh.a(var2, 2, 7), 2, 1, var4, var3);
         this.a(var1, this.b, qh.a(var2, 2, 7), 4, 1, var4, var3);
         this.a(var1, this.b, qh.a(var2, 2, 7), 5, 1, var4, var3);
         this.a(var1, this.c, qh.a(var2, 2, 7), 7, 1, var4, var3);
         this.a(var1, this.c, qh.a(var2, 2, 7), 8, 1, var4, var3);
         this.a(var1, this.d, qh.a(var2, 2, 7), 10, 1, var4, var3);
         this.a(var1, this.d, qh.a(var2, 2, 7), 11, 1, var4, var3);
      }

      for(var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.b(var1, var5, 4, var4, var3);
            this.b(var1, ajn.d, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
