
public class uw extends ui {

   private final wn a;
   private final double b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;


   public uw(wn var1, double var2) {
      this.a = var1;
      this.b = var2;
      this.a(5);
   }

   public boolean a() {
      return this.a.bZ() && !this.a.ca() && this.a.aI().nextDouble() <= 0.006500000134110451D && this.f();
   }

   public boolean b() {
      return this.c <= this.e && this.d <= 60 && this.a(this.a.o, this.f, this.g, this.h);
   }

   public void c() {
      this.a.m().a((double)((float)this.f) + 0.5D, (double)(this.g + 1), (double)((float)this.h) + 0.5D, this.b);
      this.c = 0;
      this.d = 0;
      this.e = this.a.aI().nextInt(this.a.aI().nextInt(1200) + 1200) + 1200;
      this.a.cc().a(false);
   }

   public void d() {
      this.a.k(false);
   }

   public void e() {
      ++this.c;
      this.a.cc().a(false);
      if(this.a.e((double)this.f, (double)(this.g + 1), (double)this.h) > 1.0D) {
         this.a.k(false);
         this.a.m().a((double)((float)this.f) + 0.5D, (double)(this.g + 1), (double)((float)this.h) + 0.5D, this.b);
         ++this.d;
      } else if(!this.a.ca()) {
         this.a.k(true);
      } else {
         --this.d;
      }

   }

   private boolean f() {
      int var1 = (int)this.a.t;
      double var2 = 2.147483647E9D;

      for(int var4 = (int)this.a.s - 8; (double)var4 < this.a.s + 8.0D; ++var4) {
         for(int var5 = (int)this.a.u - 8; (double)var5 < this.a.u + 8.0D; ++var5) {
            if(this.a(this.a.o, var4, var1, var5) && this.a.o.c(var4, var1 + 1, var5)) {
               double var6 = this.a.e((double)var4, (double)var1, (double)var5);
               if(var6 < var2) {
                  this.f = var4;
                  this.g = var1;
                  this.h = var5;
                  var2 = var6;
               }
            }
         }
      }

      return var2 < 2.147483647E9D;
   }

   private boolean a(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.a(var2, var3, var4);
      int var6 = var1.e(var2, var3, var4);
      if(var5 == ajn.ae) {
         aow var7 = (aow)var1.o(var2, var3, var4);
         if(var7.o < 1) {
            return true;
         }
      } else {
         if(var5 == ajn.am) {
            return true;
         }

         if(var5 == ajn.C && !ajh.b(var6)) {
            return true;
         }
      }

      return false;
   }
}
