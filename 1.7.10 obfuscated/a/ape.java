
public class ape extends aor {

   public float a;
   public float i;
   public int j;
   private int k;


   public void h() {
      super.h();
      if(++this.k % 20 * 4 == 0) {
         this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
      }

      this.i = this.a;
      float var1 = 0.1F;
      double var4;
      if(this.j > 0 && this.a == 0.0F) {
         double var2 = (double)this.c + 0.5D;
         var4 = (double)this.e + 0.5D;
         this.b.a(var2, (double)this.d + 0.5D, var4, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
      }

      if(this.j == 0 && this.a > 0.0F || this.j > 0 && this.a < 1.0F) {
         float var8 = this.a;
         if(this.j > 0) {
            this.a += var1;
         } else {
            this.a -= var1;
         }

         if(this.a > 1.0F) {
            this.a = 1.0F;
         }

         float var3 = 0.5F;
         if(this.a < var3 && var8 >= var3) {
            var4 = (double)this.c + 0.5D;
            double var6 = (double)this.e + 0.5D;
            this.b.a(var4, (double)this.d + 0.5D, var6, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
         }

         if(this.a < 0.0F) {
            this.a = 0.0F;
         }
      }

   }

   public boolean c(int var1, int var2) {
      if(var1 == 1) {
         this.j = var2;
         return true;
      } else {
         return super.c(var1, var2);
      }
   }

   public void s() {
      this.u();
      super.s();
   }

   public void a() {
      ++this.j;
      this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
   }

   public void b() {
      --this.j;
      this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }
}
