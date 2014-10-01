import java.util.Iterator;
import java.util.List;

public class su extends ss {

   public su(ahb var1) {
      super(var1);
   }

   public su(ahb var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 0);
      this.b((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D);
   }

   protected void c() {
      super.c();
   }

   public void a(int var1) {}

   public int f() {
      return 9;
   }

   public int i() {
      return 9;
   }

   public void b(sa var1) {}

   public boolean d(dh var1) {
      return false;
   }

   public void b(dh var1) {}

   public void a(dh var1) {}

   public boolean c(yz var1) {
      add var2 = var1.be();
      boolean var3 = false;
      double var4;
      List var6;
      Iterator var7;
      sw var8;
      if(var2 != null && var2.b() == ade.ca && !this.o.E) {
         var4 = 7.0D;
         var6 = this.o.a(sw.class, azt.a(this.s - var4, this.t - var4, this.u - var4, this.s + var4, this.t + var4, this.u + var4));
         if(var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               var8 = (sw)var7.next();
               if(var8.bN() && var8.bO() == var1) {
                  var8.b(this, true);
                  var3 = true;
               }
            }
         }
      }

      if(!this.o.E && !var3) {
         this.B();
         if(var1.bE.d) {
            var4 = 7.0D;
            var6 = this.o.a(sw.class, azt.a(this.s - var4, this.t - var4, this.u - var4, this.s + var4, this.t + var4, this.u + var4));
            if(var6 != null) {
               var7 = var6.iterator();

               while(var7.hasNext()) {
                  var8 = (sw)var7.next();
                  if(var8.bN() && var8.bO() == this) {
                     var8.a(true, false);
                  }
               }
            }
         }
      }

      return true;
   }

   public boolean e() {
      return this.o.a(this.b, this.c, this.d).b() == 11;
   }

   public static su a(ahb var0, int var1, int var2, int var3) {
      su var4 = new su(var0, var1, var2, var3);
      var4.n = true;
      var0.d((sa)var4);
      return var4;
   }

   public static su b(ahb var0, int var1, int var2, int var3) {
      List var4 = var0.a(su.class, azt.a((double)var1 - 1.0D, (double)var2 - 1.0D, (double)var3 - 1.0D, (double)var1 + 1.0D, (double)var2 + 1.0D, (double)var3 + 1.0D));
      if(var4 != null) {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            su var6 = (su)var5.next();
            if(var6.b == var1 && var6.c == var2 && var6.d == var3) {
               return var6;
            }
         }
      }

      return null;
   }
}
