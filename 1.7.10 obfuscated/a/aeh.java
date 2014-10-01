import com.google.common.collect.Multimap;

public class aeh extends adb {

   private float a;
   private final adc b;


   public aeh(adc var1) {
      this.b = var1;
      this.h = 1;
      this.f(var1.a());
      this.a(abt.j);
      this.a = 4.0F + var1.c();
   }

   public float i() {
      return this.b.c();
   }

   public float a(add var1, aji var2) {
      if(var2 == ajn.G) {
         return 15.0F;
      } else {
         awt var3 = var2.o();
         return var3 != awt.k && var3 != awt.l && var3 != awt.v && var3 != awt.j && var3 != awt.C?1.0F:1.5F;
      }
   }

   public boolean a(add var1, sv var2, sv var3) {
      var1.a(1, var3);
      return true;
   }

   public boolean a(add var1, ahb var2, aji var3, int var4, int var5, int var6, sv var7) {
      if((double)var3.f(var2, var4, var5, var6) != 0.0D) {
         var1.a(2, var7);
      }

      return true;
   }

   public aei d(add var1) {
      return aei.d;
   }

   public int d_(add var1) {
      return 72000;
   }

   public add a(add var1, ahb var2, yz var3) {
      var3.a(var1, this.d_(var1));
      return var1;
   }

   public boolean b(aji var1) {
      return var1 == ajn.G;
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
      var1.put(yj.e.a(), new tj(f, "Weapon modifier", (double)this.a, 0));
      return var1;
   }
}
