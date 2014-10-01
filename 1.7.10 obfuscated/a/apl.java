
public class apl extends aor {

   public byte a;
   public boolean i;


   public void b(dh var1) {
      super.b(var1);
      var1.a("note", this.a);
   }

   public void a(dh var1) {
      super.a(var1);
      this.a = var1.d("note");
      if(this.a < 0) {
         this.a = 0;
      }

      if(this.a > 24) {
         this.a = 24;
      }

   }

   public void a() {
      this.a = (byte)((this.a + 1) % 25);
      this.e();
   }

   public void a(ahb var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3 + 1, var4).o() == awt.a) {
         awt var5 = var1.a(var2, var3 - 1, var4).o();
         byte var6 = 0;
         if(var5 == awt.e) {
            var6 = 1;
         }

         if(var5 == awt.p) {
            var6 = 2;
         }

         if(var5 == awt.s) {
            var6 = 3;
         }

         if(var5 == awt.d) {
            var6 = 4;
         }

         var1.c(var2, var3, var4, ajn.B, var6, this.a);
      }
   }
}
