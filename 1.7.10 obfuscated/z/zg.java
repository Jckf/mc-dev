
public class zg extends ze {

   public int e = 1;


   public zg(ahb var1) {
      super(var1);
   }

   public zg(ahb var1, sv var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
   }

   protected void a(azu var1) {
      if(!this.o.E) {
         if(var1.g != null) {
            var1.g.a(ro.a((ze)this, this.a), 6.0F);
         }

         this.o.a((sa)null, this.s, this.t, this.u, (float)this.e, true, this.o.O().b("mobGriefing"));
         this.B();
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("ExplosionPower", this.e);
   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("ExplosionPower", 99)) {
         this.e = var1.f("ExplosionPower");
      }

   }
}
