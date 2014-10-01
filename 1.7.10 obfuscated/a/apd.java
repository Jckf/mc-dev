import java.util.Random;

public class apd extends aor {

   public int a;
   public float i;
   public float j;
   public float k;
   public float l;
   public float m;
   public float n;
   public float o;
   public float p;
   public float q;
   private static Random r = new Random();
   private String s;


   public void b(dh var1) {
      super.b(var1);
      if(this.b()) {
         var1.a("CustomName", this.s);
      }

   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("CustomName", 8)) {
         this.s = var1.j("CustomName");
      }

   }

   public void h() {
      super.h();
      this.n = this.m;
      this.p = this.o;
      yz var1 = this.b.a((double)((float)this.c + 0.5F), (double)((float)this.d + 0.5F), (double)((float)this.e + 0.5F), 3.0D);
      if(var1 != null) {
         double var2 = var1.s - (double)((float)this.c + 0.5F);
         double var4 = var1.u - (double)((float)this.e + 0.5F);
         this.q = (float)Math.atan2(var4, var2);
         this.m += 0.1F;
         if(this.m < 0.5F || r.nextInt(40) == 0) {
            float var6 = this.k;

            do {
               this.k += (float)(r.nextInt(4) - r.nextInt(4));
            } while(var6 == this.k);
         }
      } else {
         this.q += 0.02F;
         this.m -= 0.1F;
      }

      while(this.o >= 3.1415927F) {
         this.o -= 6.2831855F;
      }

      while(this.o < -3.1415927F) {
         this.o += 6.2831855F;
      }

      while(this.q >= 3.1415927F) {
         this.q -= 6.2831855F;
      }

      while(this.q < -3.1415927F) {
         this.q += 6.2831855F;
      }

      float var7;
      for(var7 = this.q - this.o; var7 >= 3.1415927F; var7 -= 6.2831855F) {
         ;
      }

      while(var7 < -3.1415927F) {
         var7 += 6.2831855F;
      }

      this.o += var7 * 0.4F;
      if(this.m < 0.0F) {
         this.m = 0.0F;
      }

      if(this.m > 1.0F) {
         this.m = 1.0F;
      }

      ++this.a;
      this.j = this.i;
      float var3 = (this.k - this.i) * 0.4F;
      float var8 = 0.2F;
      if(var3 < -var8) {
         var3 = -var8;
      }

      if(var3 > var8) {
         var3 = var8;
      }

      this.l += (var3 - this.l) * 0.9F;
      this.i += this.l;
   }

   public String a() {
      return this.b()?this.s:"container.enchant";
   }

   public boolean b() {
      return this.s != null && this.s.length() > 0;
   }

   public void a(String var1) {
      this.s = var1;
   }

}
