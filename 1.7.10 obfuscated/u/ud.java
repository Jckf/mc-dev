
public class ud extends ui {

   private sw b;
   private ahb c;
   int a;


   public ud(sw var1) {
      this.b = var1;
      this.c = var1.o;
      this.a(7);
   }

   public boolean a() {
      if(this.b.aI().nextInt(this.b.f()?50:1000) != 0) {
         return false;
      } else {
         int var1 = qh.c(this.b.s);
         int var2 = qh.c(this.b.t);
         int var3 = qh.c(this.b.u);
         return this.c.a(var1, var2, var3) == ajn.H && this.c.e(var1, var2, var3) == 1?true:this.c.a(var1, var2 - 1, var3) == ajn.c;
      }
   }

   public void c() {
      this.a = 40;
      this.c.a(this.b, (byte)10);
      this.b.m().h();
   }

   public void d() {
      this.a = 0;
   }

   public boolean b() {
      return this.a > 0;
   }

   public int f() {
      return this.a;
   }

   public void e() {
      this.a = Math.max(0, this.a - 1);
      if(this.a == 4) {
         int var1 = qh.c(this.b.s);
         int var2 = qh.c(this.b.t);
         int var3 = qh.c(this.b.u);
         if(this.c.a(var1, var2, var3) == ajn.H) {
            if(this.c.O().b("mobGriefing")) {
               this.c.a(var1, var2, var3, false);
            }

            this.b.p();
         } else if(this.c.a(var1, var2 - 1, var3) == ajn.c) {
            if(this.c.O().b("mobGriefing")) {
               this.c.c(2001, var1, var2 - 1, var3, aji.b((aji)ajn.c));
               this.c.d(var1, var2 - 1, var3, ajn.d, 0, 2);
            }

            this.b.p();
         }

      }
   }
}
