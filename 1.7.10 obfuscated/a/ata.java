import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ata extends avk {

   private List a = new LinkedList();


   public ata() {}

   public ata(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.f = new asv(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public void a(avk var1, List var2, Random var3) {
      int var4 = this.d();
      int var6 = this.f.c() - 3 - 1;
      if(var6 <= 0) {
         var6 = 1;
      }

      int var5;
      avk var7;
      asv var8;
      for(var5 = 0; var5 < this.f.b(); var5 += 4) {
         var5 += var3.nextInt(this.f.b());
         if(var5 + 3 > this.f.b()) {
            break;
         }

         var7 = asx.a(var1, var2, var3, this.f.a + var5, this.f.b + var3.nextInt(var6) + 1, this.f.c - 1, 2, var4);
         if(var7 != null) {
            var8 = var7.c();
            this.a.add(new asv(var8.a, var8.b, this.f.c, var8.d, var8.e, this.f.c + 1));
         }
      }

      for(var5 = 0; var5 < this.f.b(); var5 += 4) {
         var5 += var3.nextInt(this.f.b());
         if(var5 + 3 > this.f.b()) {
            break;
         }

         var7 = asx.a(var1, var2, var3, this.f.a + var5, this.f.b + var3.nextInt(var6) + 1, this.f.f + 1, 0, var4);
         if(var7 != null) {
            var8 = var7.c();
            this.a.add(new asv(var8.a, var8.b, this.f.f - 1, var8.d, var8.e, this.f.f));
         }
      }

      for(var5 = 0; var5 < this.f.d(); var5 += 4) {
         var5 += var3.nextInt(this.f.d());
         if(var5 + 3 > this.f.d()) {
            break;
         }

         var7 = asx.a(var1, var2, var3, this.f.a - 1, this.f.b + var3.nextInt(var6) + 1, this.f.c + var5, 1, var4);
         if(var7 != null) {
            var8 = var7.c();
            this.a.add(new asv(this.f.a, var8.b, var8.c, this.f.a + 1, var8.e, var8.f));
         }
      }

      for(var5 = 0; var5 < this.f.d(); var5 += 4) {
         var5 += var3.nextInt(this.f.d());
         if(var5 + 3 > this.f.d()) {
            break;
         }

         var7 = asx.a(var1, var2, var3, this.f.d + 1, this.f.b + var3.nextInt(var6) + 1, this.f.c + var5, 3, var4);
         if(var7 != null) {
            var8 = var7.c();
            this.a.add(new asv(this.f.d - 1, var8.b, var8.c, this.f.d, var8.e, var8.f));
         }
      }

   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, this.f.a, this.f.b, this.f.c, this.f.d, this.f.b, this.f.f, ajn.d, ajn.a, true);
         this.a(var1, var3, this.f.a, this.f.b + 1, this.f.c, this.f.d, Math.min(this.f.b + 3, this.f.e), this.f.f, ajn.a, ajn.a, false);
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            asv var5 = (asv)var4.next();
            this.a(var1, var3, var5.a, var5.e - 2, var5.c, var5.d, var5.e, var5.f, ajn.a, ajn.a, false);
         }

         this.a(var1, var3, this.f.a, this.f.b + 4, this.f.c, this.f.d, this.f.e, this.f.f, ajn.a, false);
         return true;
      }
   }

   protected void a(dh var1) {
      dq var2 = new dq();
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         asv var4 = (asv)var3.next();
         var2.a((dy)var4.h());
      }

      var1.a("Entrances", (dy)var2);
   }

   protected void b(dh var1) {
      dq var2 = var1.c("Entrances", 11);

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         this.a.add(new asv(var2.c(var3)));
      }

   }
}
