
public class wz extends sa {

   public int a;
   public int b;


   public wz(ahb var1) {
      super(var1);
      this.k = true;
      this.a(2.0F, 2.0F);
      this.L = this.N / 2.0F;
      this.b = 5;
      this.a = this.Z.nextInt(100000);
   }

   protected boolean g_() {
      return false;
   }

   protected void c() {
      this.af.a(8, Integer.valueOf(this.b));
   }

   public void h() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      ++this.a;
      this.af.b(8, Integer.valueOf(this.b));
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.t);
      int var3 = qh.c(this.u);
      if(this.o.t instanceof aqr && this.o.a(var1, var2, var3) != ajn.ab) {
         this.o.b(var1, var2, var3, (aji)ajn.ab);
      }

   }

   protected void b(dh var1) {}

   protected void a(dh var1) {}

   public boolean R() {
      return true;
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         if(!this.K && !this.o.E) {
            this.b = 0;
            if(this.b <= 0) {
               this.B();
               if(!this.o.E) {
                  this.o.a((sa)null, this.s, this.t, this.u, 6.0F, true);
               }
            }
         }

         return true;
      }
   }
}
