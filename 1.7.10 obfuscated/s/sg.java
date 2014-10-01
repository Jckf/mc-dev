import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sg {

   private static final Logger b = LogManager.getLogger();
   private static Map c = new HashMap();
   private static Map d = new HashMap();
   private static Map e = new HashMap();
   private static Map f = new HashMap();
   private static Map g = new HashMap();
   public static HashMap a = new LinkedHashMap();


   private static void a(Class var0, String var1, int var2) {
      if(c.containsKey(var1)) {
         throw new IllegalArgumentException("ID is already registered: " + var1);
      } else if(e.containsKey(Integer.valueOf(var2))) {
         throw new IllegalArgumentException("ID is already registered: " + var2);
      } else {
         c.put(var1, var0);
         d.put(var0, var1);
         e.put(Integer.valueOf(var2), var0);
         f.put(var0, Integer.valueOf(var2));
         g.put(var1, Integer.valueOf(var2));
      }
   }

   private static void a(Class var0, String var1, int var2, int var3, int var4) {
      a(var0, var1, var2);
      a.put(Integer.valueOf(var2), new sh(var2, var3, var4));
   }

   public static sa a(String var0, ahb var1) {
      sa var2 = null;

      try {
         Class var3 = (Class)c.get(var0);
         if(var3 != null) {
            var2 = (sa)var3.getConstructor(new Class[]{ahb.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static sa a(dh var0, ahb var1) {
      sa var2 = null;
      if("Minecart".equals(var0.j("id"))) {
         switch(var0.f("Type")) {
         case 0:
            var0.a("id", "MinecartRideable");
            break;
         case 1:
            var0.a("id", "MinecartChest");
            break;
         case 2:
            var0.a("id", "MinecartFurnace");
         }

         var0.o("Type");
      }

      try {
         Class var3 = (Class)c.get(var0.j("id"));
         if(var3 != null) {
            var2 = (sa)var3.getConstructor(new Class[]{ahb.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.f(var0);
      } else {
         b.warn("Skipping Entity with id " + var0.j("id"));
      }

      return var2;
   }

   public static sa a(int var0, ahb var1) {
      sa var2 = null;

      try {
         Class var3 = a(var0);
         if(var3 != null) {
            var2 = (sa)var3.getConstructor(new Class[]{ahb.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         b.warn("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(sa var0) {
      Class var1 = var0.getClass();
      return f.containsKey(var1)?((Integer)f.get(var1)).intValue():0;
   }

   public static Class a(int var0) {
      return (Class)e.get(Integer.valueOf(var0));
   }

   public static String b(sa var0) {
      return (String)d.get(var0.getClass());
   }

   public static String b(int var0) {
      Class var1 = a(var0);
      return var1 != null?(String)d.get(var1):null;
   }

   public static void a() {}

   public static Set b() {
      return Collections.unmodifiableSet(g.keySet());
   }

   static {
      a(xk.class, "Item", 1);
      a(sq.class, "XPOrb", 2);
      a(su.class, "LeashKnot", 8);
      a(tb.class, "Painting", 9);
      a(zc.class, "Arrow", 10);
      a(zj.class, "Snowball", 11);
      a(zg.class, "Fireball", 12);
      a(zi.class, "SmallFireball", 13);
      a(zm.class, "ThrownEnderpearl", 14);
      a(zd.class, "EyeOfEnderSignal", 15);
      a(zo.class, "ThrownPotion", 16);
      a(zn.class, "ThrownExpBottle", 17);
      a(st.class, "ItemFrame", 18);
      a(zp.class, "WitherSkull", 19);
      a(xw.class, "PrimedTnt", 20);
      a(xj.class, "FallingSand", 21);
      a(zf.class, "FireworksRocketEntity", 22);
      a(xi.class, "Boat", 41);
      a(xs.class, "MinecartRideable", 42);
      a(xm.class, "MinecartChest", 43);
      a(xq.class, "MinecartFurnace", 44);
      a(xv.class, "MinecartTNT", 45);
      a(xr.class, "MinecartHopper", 46);
      a(xt.class, "MinecartSpawner", 47);
      a(xn.class, "MinecartCommandBlock", 40);
      a(sw.class, "Mob", 48);
      a(yg.class, "Monster", 49);
      a(xz.class, "Creeper", 50, 894731, 0);
      a(yl.class, "Skeleton", 51, 12698049, 4802889);
      a(yn.class, "Spider", 52, 3419431, 11013646);
      a(ye.class, "Giant", 53);
      a(yq.class, "Zombie", 54, '\uafaf', 7969893);
      a(ym.class, "Slime", 55, 5349438, 8306542);
      a(yd.class, "Ghast", 56, 16382457, 12369084);
      a(yh.class, "PigZombie", 57, 15373203, 5009705);
      a(ya.class, "Enderman", 58, 1447446, 0);
      a(xy.class, "CaveSpider", 59, 803406, 11013646);
      a(yk.class, "Silverfish", 60, 7237230, 3158064);
      a(xx.class, "Blaze", 61, 16167425, 16775294);
      a(yf.class, "LavaSlime", 62, 3407872, 16579584);
      a(xa.class, "EnderDragon", 63);
      a(xc.class, "WitherBoss", 64);
      a(we.class, "Bat", 65, 4996656, 986895);
      a(yp.class, "Witch", 66, 3407872, 5349438);
      a(wo.class, "Pig", 90, 15771042, 14377823);
      a(wp.class, "Sheep", 91, 15198183, 16758197);
      a(wh.class, "Cow", 92, 4470310, 10592673);
      a(wg.class, "Chicken", 93, 10592673, 16711680);
      a(ws.class, "Squid", 94, 2243405, 7375001);
      a(wv.class, "Wolf", 95, 14144467, 13545366);
      a(wm.class, "MushroomCow", 96, 10489616, 12040119);
      a(wr.class, "SnowMan", 97);
      a(wn.class, "Ozelot", 98, 15720061, 5653556);
      a(wt.class, "VillagerGolem", 99);
      a(wi.class, "EntityHorse", 100, 12623485, 15656192);
      a(yv.class, "Villager", 120, 5651507, 12422002);
      a(wz.class, "EnderCrystal", 200);
   }
}
