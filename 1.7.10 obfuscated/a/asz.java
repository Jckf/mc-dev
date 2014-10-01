import java.util.List;
import java.util.Random;

public class asz extends avk {

   private int a;
   private boolean b;


   public asz() {}

   protected void a(dh var1) {
      var1.a("tf", this.b);
      var1.a("D", this.a);
   }

   protected void b(dh var1) {
      this.b = var1.n("tf");
      this.a = var1.f("D");
   }

   public asz(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.a = var4;
      this.f = var3;
      this.b = var3.c() > 3;
   }

   public static asv a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      asv var6 = new asv(var2, var3, var4, var2, var3 + 2, var4);
      if(var1.nextInt(4) == 0) {
         var6.e += 4;
      }

      switch(var5) {
      case 0:
         var6.a = var2 - 1;
         var6.d = var2 + 3;
         var6.f = var4 + 4;
         break;
      case 1:
         var6.a = var2 - 4;
         var6.c = var4 - 1;
         var6.f = var4 + 3;
         break;
      case 2:
         var6.a = var2 - 1;
         var6.d = var2 + 3;
         var6.c = var4 - 4;
         break;
      case 3:
         var6.d = var2 + 4;
         var6.c = var4 - 1;
         var6.f = var4 + 3;
      }

      return avk.a(var0, var6) != null?null:var6;
   }

   public void a(avk var1, List var2, Random var3) {
      int var4 = this.d();
      switch(this.a) {
      case 0:
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.f + 1, 0, var4);
         asx.a(var1, var2, var3, this.f.a - 1, this.f.b, this.f.c + 1, 1, var4);
         asx.a(var1, var2, var3, this.f.d + 1, this.f.b, this.f.c + 1, 3, var4);
         break;
      case 1:
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.c - 1, 2, var4);
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.f + 1, 0, var4);
         asx.a(var1, var2, var3, this.f.a - 1, this.f.b, this.f.c + 1, 1, var4);
         break;
      case 2:
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.c - 1, 2, var4);
         asx.a(var1, var2, var3, this.f.a - 1, this.f.b, this.f.c + 1, 1, var4);
         asx.a(var1, var2, var3, this.f.d + 1, this.f.b, this.f.c + 1, 3, var4);
         break;
      case 3:
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.c - 1, 2, var4);
         asx.a(var1, var2, var3, this.f.a + 1, this.f.b, this.f.f + 1, 0, var4);
         asx.a(var1, var2, var3, this.f.d + 1, this.f.b, this.f.c + 1, 3, var4);
      }

      if(this.b) {
         if(var3.nextBoolean()) {
            asx.a(var1, var2, var3, this.f.a + 1, this.f.b + 3 + 1, this.f.c - 1, 2, var4);
         }

         if(var3.nextBoolean()) {
            asx.a(var1, var2, var3, this.f.a - 1, this.f.b + 3 + 1, this.f.c + 1, 1, var4);
         }

         if(var3.nextBoolean()) {
            asx.a(var1, var2, var3, this.f.d + 1, this.f.b + 3 + 1, this.f.c + 1, 3, var4);
         }

         if(var3.nextBoolean()) {
            asx.a(var1, var2, var3, this.f.a + 1, this.f.b + 3 + 1, this.f.f + 1, 0, var4);
         }
      }

   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         if(this.b) {
            this.a(var1, var3, this.f.a + 1, this.f.b, this.f.c, this.f.d - 1, this.f.b + 3 - 1, this.f.f, ajn.a, ajn.a, false);
            this.a(var1, var3, this.f.a, this.f.b, this.f.c + 1, this.f.d, this.f.b + 3 - 1, this.f.f - 1, ajn.a, ajn.a, false);
            this.a(var1, var3, this.f.a + 1, this.f.e - 2, this.f.c, this.f.d - 1, this.f.e, this.f.f, ajn.a, ajn.a, false);
            this.a(var1, var3, this.f.a, this.f.e - 2, this.f.c + 1, this.f.d, this.f.e, this.f.f - 1, ajn.a, ajn.a, false);
            this.a(var1, var3, this.f.a + 1, this.f.b + 3, this.f.c + 1, this.f.d - 1, this.f.b + 3, this.f.f - 1, ajn.a, ajn.a, false);
         } else {
            this.a(var1, var3, this.f.a + 1, this.f.b, this.f.c, this.f.d - 1, this.f.e, this.f.f, ajn.a, ajn.a, false);
            this.a(var1, var3, this.f.a, this.f.b, this.f.c + 1, this.f.d, this.f.e, this.f.f - 1, ajn.a, ajn.a, false);
         }

         this.a(var1, var3, this.f.a + 1, this.f.b, this.f.c + 1, this.f.a + 1, this.f.e, this.f.c + 1, ajn.f, ajn.a, false);
         this.a(var1, var3, this.f.a + 1, this.f.b, this.f.f - 1, this.f.a + 1, this.f.e, this.f.f - 1, ajn.f, ajn.a, false);
         this.a(var1, var3, this.f.d - 1, this.f.b, this.f.c + 1, this.f.d - 1, this.f.e, this.f.c + 1, ajn.f, ajn.a, false);
         this.a(var1, var3, this.f.d - 1, this.f.b, this.f.f - 1, this.f.d - 1, this.f.e, this.f.f - 1, ajn.f, ajn.a, false);

         for(int var4 = this.f.a; var4 <= this.f.d; ++var4) {
            for(int var5 = this.f.c; var5 <= this.f.f; ++var5) {
               if(this.a(var1, var4, this.f.b - 1, var5, var3).o() == awt.a) {
                  this.a(var1, ajn.f, 0, var4, this.f.b - 1, var5, var3);
               }
            }
         }

         return true;
      }
   }
}
