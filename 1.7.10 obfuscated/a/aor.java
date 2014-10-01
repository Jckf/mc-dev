import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aor {

   private static final Logger a = LogManager.getLogger();
   private static Map i = new HashMap();
   private static Map j = new HashMap();
   protected ahb b;
   public int c;
   public int d;
   public int e;
   protected boolean f;
   public int g = -1;
   public aji h;


   private static void a(Class var0, String var1) {
      if(i.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         i.put(var1, var0);
         j.put(var0, var1);
      }
   }

   public ahb w() {
      return this.b;
   }

   public void a(ahb var1) {
      this.b = var1;
   }

   public boolean o() {
      return this.b != null;
   }

   public void a(dh var1) {
      this.c = var1.f("x");
      this.d = var1.f("y");
      this.e = var1.f("z");
   }

   public void b(dh var1) {
      String var2 = (String)j.get(this.getClass());
      if(var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.a("id", var2);
         var1.a("x", this.c);
         var1.a("y", this.d);
         var1.a("z", this.e);
      }
   }

   public void h() {}

   public static aor c(dh var0) {
      aor var1 = null;

      try {
         Class var2 = (Class)i.get(var0.j("id"));
         if(var2 != null) {
            var1 = (aor)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if(var1 != null) {
         var1.a(var0);
      } else {
         a.warn("Skipping BlockEntity with id " + var0.j("id"));
      }

      return var1;
   }

   public int p() {
      if(this.g == -1) {
         this.g = this.b.e(this.c, this.d, this.e);
      }

      return this.g;
   }

   public void e() {
      if(this.b != null) {
         this.g = this.b.e(this.c, this.d, this.e);
         this.b.b(this.c, this.d, this.e, this);
         if(this.q() != ajn.a) {
            this.b.f(this.c, this.d, this.e, this.q());
         }
      }

   }

   public aji q() {
      if(this.h == null) {
         this.h = this.b.a(this.c, this.d, this.e);
      }

      return this.h;
   }

   public ft m() {
      return null;
   }

   public boolean r() {
      return this.f;
   }

   public void s() {
      this.f = true;
   }

   public void t() {
      this.f = false;
   }

   public boolean c(int var1, int var2) {
      return false;
   }

   public void u() {
      this.h = null;
      this.g = -1;
   }

   public void a(k var1) {
      var1.a("Name", (Callable)(new aos(this)));
      k.a(var1, this.c, this.d, this.e, this.q(), this.p());
      var1.a("Actual block type", (Callable)(new aot(this)));
      var1.a("Actual block data value", (Callable)(new aou(this)));
   }

   // $FF: synthetic method
   static Map v() {
      return j;
   }

   static {
      a(apg.class, "Furnace");
      a(aow.class, "Chest");
      a(ape.class, "EnderChest");
      a(alr.class, "RecordPlayer");
      a(apb.class, "Trap");
      a(apc.class, "Dropper");
      a(apm.class, "Sign");
      a(apj.class, "MobSpawner");
      a(apl.class, "Music");
      a(aps.class, "Piston");
      a(aov.class, "Cauldron");
      a(apd.class, "EnchantTable");
      a(apo.class, "Airportal");
      a(aox.class, "Control");
      a(aoq.class, "Beacon");
      a(apn.class, "Skull");
      a(apa.class, "DLDetector");
      a(api.class, "Hopper");
      a(aoz.class, "Comparator");
      a(apf.class, "FlowerPot");
   }
}
