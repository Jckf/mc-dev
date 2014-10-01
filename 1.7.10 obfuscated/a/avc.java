import java.util.List;
import java.util.Random;

abstract class avc extends avk {

   protected avd d;


   public avc() {
      this.d = avd.a;
   }

   protected avc(int var1) {
      super(var1);
      this.d = avd.a;
   }

   protected void a(dh var1) {
      var1.a("EntryDoor", this.d.name());
   }

   protected void b(dh var1) {
      this.d = avd.valueOf(var1.j("EntryDoor"));
   }

   protected void a(ahb var1, Random var2, asv var3, avd var4, int var5, int var6, int var7) {
      switch(aul.a[var4.ordinal()]) {
      case 1:
      default:
         this.a(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, ajn.a, ajn.a, false);
         break;
      case 2:
         this.a(var1, ajn.aV, 0, var5, var6, var7, var3);
         this.a(var1, ajn.aV, 0, var5, var6 + 1, var7, var3);
         this.a(var1, ajn.aV, 0, var5, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6, var7, var3);
         this.a(var1, ajn.ao, 0, var5 + 1, var6, var7, var3);
         this.a(var1, ajn.ao, 8, var5 + 1, var6 + 1, var7, var3);
         break;
      case 3:
         this.a(var1, ajn.a, 0, var5 + 1, var6, var7, var3);
         this.a(var1, ajn.a, 0, var5 + 1, var6 + 1, var7, var3);
         this.a(var1, ajn.aY, 0, var5, var6, var7, var3);
         this.a(var1, ajn.aY, 0, var5, var6 + 1, var7, var3);
         this.a(var1, ajn.aY, 0, var5, var6 + 2, var7, var3);
         this.a(var1, ajn.aY, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, ajn.aY, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, ajn.aY, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, ajn.aY, 0, var5 + 2, var6, var7, var3);
         break;
      case 4:
         this.a(var1, ajn.aV, 0, var5, var6, var7, var3);
         this.a(var1, ajn.aV, 0, var5, var6 + 1, var7, var3);
         this.a(var1, ajn.aV, 0, var5, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, ajn.aV, 0, var5 + 2, var6, var7, var3);
         this.a(var1, ajn.av, 0, var5 + 1, var6, var7, var3);
         this.a(var1, ajn.av, 8, var5 + 1, var6 + 1, var7, var3);
         this.a(var1, ajn.aB, this.a(ajn.aB, 4), var5 + 2, var6 + 1, var7 + 1, var3);
         this.a(var1, ajn.aB, this.a(ajn.aB, 3), var5 + 2, var6 + 1, var7 - 1, var3);
      }

   }

   protected avd a(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return avd.a;
      case 2:
         return avd.b;
      case 3:
         return avd.c;
      case 4:
         return avd.d;
      }
   }

   protected avk a(auz var1, List var2, Random var3, int var4, int var5) {
      switch(this.g) {
      case 0:
         return aui.a(var1, var2, var3, this.f.a + var4, this.f.b + var5, this.f.f + 1, this.g, this.d());
      case 1:
         return aui.a(var1, var2, var3, this.f.a - 1, this.f.b + var5, this.f.c + var4, this.g, this.d());
      case 2:
         return aui.a(var1, var2, var3, this.f.a + var4, this.f.b + var5, this.f.c - 1, this.g, this.d());
      case 3:
         return aui.a(var1, var2, var3, this.f.d + 1, this.f.b + var5, this.f.c + var4, this.g, this.d());
      default:
         return null;
      }
   }

   protected avk b(auz var1, List var2, Random var3, int var4, int var5) {
      switch(this.g) {
      case 0:
         return aui.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d());
      case 1:
         return aui.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d());
      case 2:
         return aui.a(var1, var2, var3, this.f.a - 1, this.f.b + var4, this.f.c + var5, 1, this.d());
      case 3:
         return aui.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.c - 1, 2, this.d());
      default:
         return null;
      }
   }

   protected avk c(auz var1, List var2, Random var3, int var4, int var5) {
      switch(this.g) {
      case 0:
         return aui.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d());
      case 1:
         return aui.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d());
      case 2:
         return aui.a(var1, var2, var3, this.f.d + 1, this.f.b + var4, this.f.c + var5, 3, this.d());
      case 3:
         return aui.a(var1, var2, var3, this.f.a + var5, this.f.b + var4, this.f.f + 1, 0, this.d());
      default:
         return null;
      }
   }

   protected static boolean a(asv var0) {
      return var0 != null && var0.b > 10;
   }
}
