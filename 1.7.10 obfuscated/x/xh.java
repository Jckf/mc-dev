import java.util.List;

public class xh extends xg {

   private int b;
   public long a;
   private int c;


   public xh(ahb var1, double var2, double var4, double var6) {
      super(var1);
      this.b(var2, var4, var6, 0.0F, 0.0F);
      this.b = 2;
      this.a = this.Z.nextLong();
      this.c = this.Z.nextInt(3) + 1;
      if(!var1.E && var1.O().b("doFireTick") && (var1.r == rd.c || var1.r == rd.d) && var1.a(qh.c(var2), qh.c(var4), qh.c(var6), 10)) {
         int var8 = qh.c(var2);
         int var9 = qh.c(var4);
         int var10 = qh.c(var6);
         if(var1.a(var8, var9, var10).o() == awt.a && ajn.ab.c(var1, var8, var9, var10)) {
            var1.b(var8, var9, var10, (aji)ajn.ab);
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = qh.c(var2) + this.Z.nextInt(3) - 1;
            var10 = qh.c(var4) + this.Z.nextInt(3) - 1;
            int var11 = qh.c(var6) + this.Z.nextInt(3) - 1;
            if(var1.a(var9, var10, var11).o() == awt.a && ajn.ab.c(var1, var9, var10, var11)) {
               var1.b(var9, var10, var11, (aji)ajn.ab);
            }
         }
      }

   }

   public void h() {
      super.h();
      if(this.b == 2) {
         this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0F, 0.8F + this.Z.nextFloat() * 0.2F);
         this.o.a(this.s, this.t, this.u, "random.explode", 2.0F, 0.5F + this.Z.nextFloat() * 0.2F);
      }

      --this.b;
      if(this.b < 0) {
         if(this.c == 0) {
            this.B();
         } else if(this.b < -this.Z.nextInt(10)) {
            --this.c;
            this.b = 1;
            this.a = this.Z.nextLong();
            if(!this.o.E && this.o.O().b("doFireTick") && this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 10)) {
               int var1 = qh.c(this.s);
               int var2 = qh.c(this.t);
               int var3 = qh.c(this.u);
               if(this.o.a(var1, var2, var3).o() == awt.a && ajn.ab.c(this.o, var1, var2, var3)) {
                  this.o.b(var1, var2, var3, (aji)ajn.ab);
               }
            }
         }
      }

      if(this.b >= 0) {
         if(this.o.E) {
            this.o.q = 2;
         } else {
            double var6 = 3.0D;
            List var7 = this.o.b((sa)this, azt.a(this.s - var6, this.t - var6, this.u - var6, this.s + var6, this.t + 6.0D + var6, this.u + var6));

            for(int var4 = 0; var4 < var7.size(); ++var4) {
               sa var5 = (sa)var7.get(var4);
               var5.a(this);
            }
         }
      }

   }

   protected void c() {}

   protected void a(dh var1) {}

   protected void b(dh var1) {}
}
