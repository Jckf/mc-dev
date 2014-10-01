
public class ux extends ui {

   private wt a;
   private yv b;
   private int c;


   public ux(wt var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      if(!this.a.o.w()) {
         return false;
      } else if(this.a.aI().nextInt(8000) != 0) {
         return false;
      } else {
         this.b = (yv)this.a.o.a(yv.class, this.a.C.b(6.0D, 2.0D, 6.0D), (sa)this.a);
         return this.b != null;
      }
   }

   public boolean b() {
      return this.c > 0;
   }

   public void c() {
      this.c = 400;
      this.a.a(true);
   }

   public void d() {
      this.a.a(false);
      this.b = null;
   }

   public void e() {
      this.a.j().a(this.b, 30.0F, 30.0F);
      --this.c;
   }
}
