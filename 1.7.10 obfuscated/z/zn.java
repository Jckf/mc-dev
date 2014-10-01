
public class zn extends zk {

   public zn(ahb var1) {
      super(var1);
   }

   public zn(ahb var1, sv var2) {
      super(var1, var2);
   }

   public zn(ahb var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected float i() {
      return 0.07F;
   }

   protected float e() {
      return 0.7F;
   }

   protected float f() {
      return -20.0F;
   }

   protected void a(azu var1) {
      if(!this.o.E) {
         this.o.c(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), 0);
         int var2 = 3 + this.o.s.nextInt(5) + this.o.s.nextInt(5);

         while(var2 > 0) {
            int var3 = sq.a(var2);
            var2 -= var3;
            this.o.d((sa)(new sq(this.o, this.s, this.t, this.u, var3)));
         }

         this.B();
      }

   }
}
