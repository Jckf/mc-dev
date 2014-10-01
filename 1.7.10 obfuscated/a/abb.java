
public class abb extends adb {

   private static final int[] m = new int[]{11, 16, 15, 13};
   private static final String[] n = new String[]{"leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay"};
   public static final String[] a = new String[]{"empty_armor_slot_helmet", "empty_armor_slot_chestplate", "empty_armor_slot_leggings", "empty_armor_slot_boots"};
   private static final cp o = new abc();
   public final int b;
   public final int c;
   public final int d;
   private final abd p;


   public abb(abd var1, int var2, int var3) {
      this.p = var1;
      this.b = var3;
      this.d = var2;
      this.c = var1.b(var3);
      this.f(var1.a(var3));
      this.h = 1;
      this.a(abt.j);
      akm.a.a(this, o);
   }

   public int c() {
      return this.p.a();
   }

   public abd m_() {
      return this.p;
   }

   public boolean c_(add var1) {
      return this.p != abd.a?false:(!var1.p()?false:(!var1.q().b("display", 10)?false:var1.q().m("display").b("color", 3)));
   }

   public int b(add var1) {
      if(this.p != abd.a) {
         return -1;
      } else {
         dh var2 = var1.q();
         if(var2 == null) {
            return 10511680;
         } else {
            dh var3 = var2.m("display");
            return var3 == null?10511680:(var3.b("color", 3)?var3.f("color"):10511680);
         }
      }
   }

   public void c(add var1) {
      if(this.p == abd.a) {
         dh var2 = var1.q();
         if(var2 != null) {
            dh var3 = var2.m("display");
            if(var3.c("color")) {
               var3.o("color");
            }

         }
      }
   }

   public void b(add var1, int var2) {
      if(this.p != abd.a) {
         throw new UnsupportedOperationException("Can\'t dye non-leather!");
      } else {
         dh var3 = var1.q();
         if(var3 == null) {
            var3 = new dh();
            var1.d(var3);
         }

         dh var4 = var3.m("display");
         if(!var3.b("display", 10)) {
            var3.a("display", (dy)var4);
         }

         var4.a("color", var2);
      }
   }

   public boolean a(add var1, add var2) {
      return this.p.b() == var2.b()?true:super.a(var1, var2);
   }

   public add a(add var1, ahb var2, yz var3) {
      int var4 = sw.b(var1) - 1;
      add var5 = var3.r(var4);
      if(var5 == null) {
         var3.c(var4, var1.m());
         var1.b = 0;
      }

      return var1;
   }

   // $FF: synthetic method
   static int[] e() {
      return m;
   }

}
