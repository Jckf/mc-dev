
public class aak extends aay {

   private yz a;
   private int b;


   public aak(yz var1, rb var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.a = var1;
   }

   public boolean a(add var1) {
      return false;
   }

   public add a(int var1) {
      if(this.e()) {
         this.b += Math.min(var1, this.d().b);
      }

      return super.a(var1);
   }

   public void a(yz var1, add var2) {
      this.b(var2);
      super.a(var1, var2);
   }

   protected void a(add var1, int var2) {
      this.b += var2;
      this.b(var1);
   }

   protected void b(add var1) {
      var1.a(this.a.o, this.a, this.b);
      if(!this.a.o.E) {
         int var2 = this.b;
         float var3 = afa.a().b(var1);
         int var4;
         if(var3 == 0.0F) {
            var2 = 0;
         } else if(var3 < 1.0F) {
            var4 = qh.d((float)var2 * var3);
            if(var4 < qh.f((float)var2 * var3) && (float)Math.random() < (float)var2 * var3 - (float)var4) {
               ++var4;
            }

            var2 = var4;
         }

         while(var2 > 0) {
            var4 = sq.a(var2);
            var2 -= var4;
            this.a.o.d((sa)(new sq(this.a.o, this.a.s, this.a.t + 0.5D, this.a.u + 0.5D, var4)));
         }
      }

      this.b = 0;
      if(var1.b() == ade.j) {
         this.a.a((ph)pc.k, 1);
      }

      if(var1.b() == ade.aQ) {
         this.a.a((ph)pc.p, 1);
      }

   }
}
