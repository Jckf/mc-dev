import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yj {

   private static final Logger f = LogManager.getLogger();
   public static final th a = (new to("generic.maxHealth", 20.0D, 0.0D, Double.MAX_VALUE)).a("Max Health").a(true);
   public static final th b = (new to("generic.followRange", 32.0D, 0.0D, 2048.0D)).a("Follow Range");
   public static final th c = (new to("generic.knockbackResistance", 0.0D, 0.0D, 1.0D)).a("Knockback Resistance");
   public static final th d = (new to("generic.movementSpeed", 0.699999988079071D, 0.0D, Double.MAX_VALUE)).a("Movement Speed").a(true);
   public static final th e = new to("generic.attackDamage", 2.0D, 0.0D, Double.MAX_VALUE);


   public static dq a(tl var0) {
      dq var1 = new dq();
      Iterator var2 = var0.a().iterator();

      while(var2.hasNext()) {
         ti var3 = (ti)var2.next();
         var1.a((dy)a(var3));
      }

      return var1;
   }

   private static dh a(ti var0) {
      dh var1 = new dh();
      th var2 = var0.a();
      var1.a("Name", var2.a());
      var1.a("Base", var0.b());
      Collection var3 = var0.c();
      if(var3 != null && !var3.isEmpty()) {
         dq var4 = new dq();
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            tj var6 = (tj)var5.next();
            if(var6.e()) {
               var4.a((dy)a(var6));
            }
         }

         var1.a("Modifiers", (dy)var4);
      }

      return var1;
   }

   private static dh a(tj var0) {
      dh var1 = new dh();
      var1.a("Name", var0.b());
      var1.a("Amount", var0.d());
      var1.a("Operation", var0.c());
      var1.a("UUIDMost", var0.a().getMostSignificantBits());
      var1.a("UUIDLeast", var0.a().getLeastSignificantBits());
      return var1;
   }

   public static void a(tl var0, dq var1) {
      for(int var2 = 0; var2 < var1.c(); ++var2) {
         dh var3 = var1.b(var2);
         ti var4 = var0.a(var3.j("Name"));
         if(var4 != null) {
            a(var4, var3);
         } else {
            f.warn("Ignoring unknown attribute \'" + var3.j("Name") + "\'");
         }
      }

   }

   private static void a(ti var0, dh var1) {
      var0.a(var1.i("Base"));
      if(var1.b("Modifiers", 9)) {
         dq var2 = var1.c("Modifiers", 10);

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            tj var4 = a(var2.b(var3));
            tj var5 = var0.a(var4.a());
            if(var5 != null) {
               var0.b(var5);
            }

            var0.a(var4);
         }
      }

   }

   public static tj a(dh var0) {
      UUID var1 = new UUID(var0.g("UUIDMost"), var0.g("UUIDLeast"));
      return new tj(var1, var0.j("Name"), var0.i("Amount"), var0.f("Operation"));
   }

}
