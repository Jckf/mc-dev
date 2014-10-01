import java.util.List;

public class tw extends ui {

   public final sj a = new tx(this);
   private td b;
   private double c;
   private double d;
   private sa e;
   private float f;
   private ayf g;
   private vv h;
   private Class i;


   public tw(td var1, Class var2, float var3, double var4, double var6) {
      this.b = var1;
      this.i = var2;
      this.f = var3;
      this.c = var4;
      this.d = var6;
      this.h = var1.m();
      this.a(1);
   }

   public boolean a() {
      if(this.i == yz.class) {
         if(this.b instanceof tg && ((tg)this.b).bZ()) {
            return false;
         }

         this.e = this.b.o.a(this.b, (double)this.f);
         if(this.e == null) {
            return false;
         }
      } else {
         List var1 = this.b.o.a(this.i, this.b.C.b((double)this.f, 3.0D, (double)this.f), this.a);
         if(var1.isEmpty()) {
            return false;
         }

         this.e = (sa)var1.get(0);
      }

      azw var2 = vx.b(this.b, 16, 7, azw.a(this.e.s, this.e.t, this.e.u));
      if(var2 == null) {
         return false;
      } else if(this.e.e(var2.a, var2.b, var2.c) < this.e.f((sa)this.b)) {
         return false;
      } else {
         this.g = this.h.a(var2.a, var2.b, var2.c);
         return this.g == null?false:this.g.b(var2);
      }
   }

   public boolean b() {
      return !this.h.g();
   }

   public void c() {
      this.h.a(this.g, this.c);
   }

   public void d() {
      this.e = null;
   }

   public void e() {
      if(this.b.f(this.e) < 49.0D) {
         this.b.m().a(this.d);
      } else {
         this.b.m().a(this.c);
      }

   }

   // $FF: synthetic method
   static td a(tw var0) {
      return var0.b;
   }
}
