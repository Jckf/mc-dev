import java.util.Random;

public class xf extends qw {

   private final add b;
   private float c;
   private boolean d;


   public xf(add var1, int var2) {
      super(var2);
      this.b = var1;
   }

   public add a(Random var1) {
      add var2 = this.b.m();
      if(this.c > 0.0F) {
         int var3 = (int)(this.c * (float)this.b.l());
         int var4 = var2.l() - var1.nextInt(var1.nextInt(var3) + 1);
         if(var4 > var3) {
            var4 = var3;
         }

         if(var4 < 1) {
            var4 = 1;
         }

         var2.b(var4);
      }

      if(this.d) {
         afv.a(var1, var2, 30);
      }

      return var2;
   }

   public xf a(float var1) {
      this.c = var1;
      return this;
   }

   public xf a() {
      this.d = true;
      return this;
   }
}
