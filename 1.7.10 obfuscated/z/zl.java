
public class zl extends zk {

   public zl(ahb var1) {
      super(var1);
   }

   public zl(ahb var1, sv var2) {
      super(var1, var2);
   }

   public zl(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(azu var1) {
      if(var1.g != null) {
         var1.g.a(ro.a((sa)this, this.j()), 0.0F);
      }

      if(!this.o.E && this.Z.nextInt(8) == 0) {
         byte var2 = 1;
         if(this.Z.nextInt(32) == 0) {
            var2 = 4;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            wg var4 = new wg(this.o);
            var4.c(-24000);
            var4.b(this.s, this.t, this.u, this.y, 0.0F);
            this.o.d((sa)var4);
         }
      }

      for(int var5 = 0; var5 < 8; ++var5) {
         this.o.a("snowballpoof", this.s, this.t, this.u, 0.0D, 0.0D, 0.0D);
      }

      if(!this.o.E) {
         this.B();
      }

   }
}
