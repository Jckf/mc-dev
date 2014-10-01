import java.util.List;
import java.util.Random;

public abstract class alj extends aji {

   protected final boolean a;


   public alj(boolean var1, awt var2) {
      super(var2);
      this.a = var1;
      if(var1) {
         this.q = true;
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.g(255);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      if(this.a) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         boolean var5 = (var1.e(var2, var3, var4) & 8) != 0;
         if(var5) {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         }
      }

   }

   public void g() {
      if(this.a) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean c() {
      return this.a;
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return this.a?var9:(var5 != 0 && (var5 == 1 || (double)var7 <= 0.5D)?var9:var9 | 8);
   }

   public int a(Random var1) {
      return this.a?2:1;
   }

   public int a(int var1) {
      return var1 & 7;
   }

   public boolean d() {
      return this.a;
   }

   public abstract String b(int var1);

   public int k(ahb var1, int var2, int var3, int var4) {
      return super.k(var1, var2, var3, var4) & 7;
   }
}
