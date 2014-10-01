import com.google.common.collect.Multimap;
import java.util.Set;

public class acg extends adb {

   private Set c;
   protected float a = 4.0F;
   private float d;
   protected adc b;


   protected acg(float var1, adc var2, Set var3) {
      this.b = var2;
      this.c = var3;
      this.h = 1;
      this.f(var2.a());
      this.a = var2.b();
      this.d = var1 + var2.c();
      this.a(abt.i);
   }

   public float a(add var1, aji var2) {
      return this.c.contains(var2)?this.a:1.0F;
   }

   public boolean a(add var1, sv var2, sv var3) {
      var1.a(2, var3);
      return true;
   }

   public boolean a(add var1, ahb var2, aji var3, int var4, int var5, int var6, sv var7) {
      if((double)var3.f(var2, var4, var5, var6) != 0.0D) {
         var1.a(1, var7);
      }

      return true;
   }

   public adc i() {
      return this.b;
   }

   public int c() {
      return this.b.e();
   }

   public String j() {
      return this.b.toString();
   }

   public boolean a(add var1, add var2) {
      return this.b.f() == var2.b()?true:super.a(var1, var2);
   }

   public Multimap k() {
      Multimap var1 = super.k();
      var1.put(yj.e.a(), new tj(f, "Tool modifier", (double)this.d, 0));
      return var1;
   }
}
