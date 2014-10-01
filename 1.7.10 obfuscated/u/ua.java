import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ua extends ui {

   private wf d;
   ahb a;
   private wf e;
   int b;
   double c;


   public ua(wf var1, double var2) {
      this.d = var1;
      this.a = var1.o;
      this.c = var2;
      this.a(3);
   }

   public boolean a() {
      if(!this.d.ce()) {
         return false;
      } else {
         this.e = this.f();
         return this.e != null;
      }
   }

   public boolean b() {
      return this.e.Z() && this.e.ce() && this.b < 60;
   }

   public void d() {
      this.e = null;
      this.b = 0;
   }

   public void e() {
      this.d.j().a(this.e, 10.0F, (float)this.d.x());
      this.d.m().a((sa)this.e, this.c);
      ++this.b;
      if(this.b >= 60 && this.d.f(this.e) < 9.0D) {
         this.g();
      }

   }

   private wf f() {
      float var1 = 8.0F;
      List var2 = this.a.a(this.d.getClass(), this.d.C.b((double)var1, (double)var1, (double)var1));
      double var3 = Double.MAX_VALUE;
      wf var5 = null;
      Iterator var6 = var2.iterator();

      while(var6.hasNext()) {
         wf var7 = (wf)var6.next();
         if(this.d.a(var7) && this.d.f(var7) < var3) {
            var5 = var7;
            var3 = this.d.f(var7);
         }
      }

      return var5;
   }

   private void g() {
      rx var1 = this.d.a((rx)this.e);
      if(var1 != null) {
         yz var2 = this.d.cd();
         if(var2 == null && this.e.cd() != null) {
            var2 = this.e.cd();
         }

         if(var2 != null) {
            var2.a(pp.x);
            if(this.d instanceof wh) {
               var2.a((ph)pc.H);
            }
         }

         this.d.c(6000);
         this.e.c(6000);
         this.d.cf();
         this.e.cf();
         var1.c(-24000);
         var1.b(this.d.s, this.d.t, this.d.u, 0.0F, 0.0F);
         this.a.d((sa)var1);
         Random var3 = this.d.aI();

         for(int var4 = 0; var4 < 7; ++var4) {
            double var5 = var3.nextGaussian() * 0.02D;
            double var7 = var3.nextGaussian() * 0.02D;
            double var9 = var3.nextGaussian() * 0.02D;
            this.a.a("heart", this.d.s + (double)(var3.nextFloat() * this.d.M * 2.0F) - (double)this.d.M, this.d.t + 0.5D + (double)(var3.nextFloat() * this.d.N), this.d.u + (double)(var3.nextFloat() * this.d.M * 2.0F) - (double)this.d.M, var5, var7, var9);
         }

         if(this.a.O().b("doMobLoot")) {
            this.a.d((sa)(new sq(this.a, this.d.s, this.d.t, this.d.u, var3.nextInt(7) + 1)));
         }

      }
   }
}
