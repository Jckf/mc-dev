
public class zs extends zb {

   private acq a;
   private agp b;
   private int c;


   public zs(acq var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      if(!this.a.o.w()) {
         return false;
      } else if(this.a.bb().nextInt(8000) != 0) {
         return false;
      } else {
         this.b = (agp)this.a.o.a(agp.class, this.a.aQ().b(6.0D, 2.0D, 6.0D), (wv)this.a);
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
      this.a.p().a(this.b, 30.0F, 30.0F);
      --this.c;
   }
}
