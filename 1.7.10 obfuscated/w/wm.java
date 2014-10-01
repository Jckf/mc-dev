
public class wm extends wh {

   public wm(ahb var1) {
      super(var1);
      this.a(0.9F, 1.3F);
   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && var2.b() == ade.z && this.d() >= 0) {
         if(var2.b == 1) {
            var1.bm.a(var1.bm.c, new add(ade.A));
            return true;
         }

         if(var1.bm.a(new add(ade.A)) && !var1.bE.d) {
            var1.bm.a(var1.bm.c, 1);
            return true;
         }
      }

      if(var2 != null && var2.b() == ade.aZ && this.d() >= 0) {
         this.B();
         this.o.a("largeexplode", this.s, this.t + (double)(this.N / 2.0F), this.u, 0.0D, 0.0D, 0.0D);
         if(!this.o.E) {
            wh var3 = new wh(this.o);
            var3.b(this.s, this.t, this.u, this.y, this.z);
            var3.g(this.aS());
            var3.aM = this.aM;
            this.o.d((sa)var3);

            for(int var4 = 0; var4 < 5; ++var4) {
               this.o.d((sa)(new xk(this.o, this.s, this.t + (double)this.N, this.u, new add(ajn.Q))));
            }

            var2.a(1, (sv)var1);
            this.a("mob.sheep.shear", 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   public wm c(rx var1) {
      return new wm(this.o);
   }

   // $FF: synthetic method
   public wh b(rx var1) {
      return this.c(var1);
   }

   // $FF: synthetic method
   public rx a(rx var1) {
      return this.c(var1);
   }
}
