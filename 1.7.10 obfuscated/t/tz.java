
public class tz extends uc {

   private int i;
   private int j = -1;


   public tz(sw var1) {
      super(var1);
   }

   public boolean a() {
      return !super.a()?false:(!this.a.o.O().b("mobGriefing")?false:!this.e.f(this.a.o, this.b, this.c, this.d));
   }

   public void c() {
      super.c();
      this.i = 0;
   }

   public boolean b() {
      double var1 = this.a.e((double)this.b, (double)this.c, (double)this.d);
      return this.i <= 240 && !this.e.f(this.a.o, this.b, this.c, this.d) && var1 < 4.0D;
   }

   public void d() {
      super.d();
      this.a.o.d(this.a.y(), this.b, this.c, this.d, -1);
   }

   public void e() {
      super.e();
      if(this.a.aI().nextInt(20) == 0) {
         this.a.o.c(1010, this.b, this.c, this.d, 0);
      }

      ++this.i;
      int var1 = (int)((float)this.i / 240.0F * 10.0F);
      if(var1 != this.j) {
         this.a.o.d(this.a.y(), this.b, this.c, this.d, var1);
         this.j = var1;
      }

      if(this.i == 240 && this.a.o.r == rd.d) {
         this.a.o.f(this.b, this.c, this.d);
         this.a.o.c(1012, this.b, this.c, this.d, 0);
         this.a.o.c(2001, this.b, this.c, this.d, aji.b((aji)this.e));
      }

   }
}
