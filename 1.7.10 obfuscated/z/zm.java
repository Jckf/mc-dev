
public class zm extends zk {

   public zm(ahb var1) {
      super(var1);
   }

   public zm(ahb var1, sv var2) {
      super(var1, var2);
   }

   protected void a(azu var1) {
      if(var1.g != null) {
         var1.g.a(ro.a((sa)this, this.j()), 0.0F);
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.o.a("portal", this.s, this.t + this.Z.nextDouble() * 2.0D, this.u, this.Z.nextGaussian(), 0.0D, this.Z.nextGaussian());
      }

      if(!this.o.E) {
         if(this.j() != null && this.j() instanceof mw) {
            mw var3 = (mw)this.j();
            if(var3.a.b().d() && var3.o == this.o) {
               if(this.j().am()) {
                  this.j().a((sa)null);
               }

               this.j().a(this.s, this.t, this.u);
               this.j().R = 0.0F;
               this.j().a(ro.h, 5.0F);
            }
         }

         this.B();
      }

   }
}
