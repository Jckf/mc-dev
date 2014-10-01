import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class pp {

   protected static Map a = new HashMap();
   public static List b = new ArrayList();
   public static List c = new ArrayList();
   public static List d = new ArrayList();
   public static List e = new ArrayList();
   public static ph f = (new pe("stat.leaveGame", new fr("stat.leaveGame", new Object[0]))).i().h();
   public static ph g = (new pe("stat.playOneMinute", new fr("stat.playOneMinute", new Object[0]), ph.h)).i().h();
   public static ph h = (new pe("stat.walkOneCm", new fr("stat.walkOneCm", new Object[0]), ph.i)).i().h();
   public static ph i = (new pe("stat.swimOneCm", new fr("stat.swimOneCm", new Object[0]), ph.i)).i().h();
   public static ph j = (new pe("stat.fallOneCm", new fr("stat.fallOneCm", new Object[0]), ph.i)).i().h();
   public static ph k = (new pe("stat.climbOneCm", new fr("stat.climbOneCm", new Object[0]), ph.i)).i().h();
   public static ph l = (new pe("stat.flyOneCm", new fr("stat.flyOneCm", new Object[0]), ph.i)).i().h();
   public static ph m = (new pe("stat.diveOneCm", new fr("stat.diveOneCm", new Object[0]), ph.i)).i().h();
   public static ph n = (new pe("stat.minecartOneCm", new fr("stat.minecartOneCm", new Object[0]), ph.i)).i().h();
   public static ph o = (new pe("stat.boatOneCm", new fr("stat.boatOneCm", new Object[0]), ph.i)).i().h();
   public static ph p = (new pe("stat.pigOneCm", new fr("stat.pigOneCm", new Object[0]), ph.i)).i().h();
   public static ph q = (new pe("stat.horseOneCm", new fr("stat.horseOneCm", new Object[0]), ph.i)).i().h();
   public static ph r = (new pe("stat.jump", new fr("stat.jump", new Object[0]))).i().h();
   public static ph s = (new pe("stat.drop", new fr("stat.drop", new Object[0]))).i().h();
   public static ph t = (new pe("stat.damageDealt", new fr("stat.damageDealt", new Object[0]), ph.j)).h();
   public static ph u = (new pe("stat.damageTaken", new fr("stat.damageTaken", new Object[0]), ph.j)).h();
   public static ph v = (new pe("stat.deaths", new fr("stat.deaths", new Object[0]))).h();
   public static ph w = (new pe("stat.mobKills", new fr("stat.mobKills", new Object[0]))).h();
   public static ph x = (new pe("stat.animalsBred", new fr("stat.animalsBred", new Object[0]))).h();
   public static ph y = (new pe("stat.playerKills", new fr("stat.playerKills", new Object[0]))).h();
   public static ph z = (new pe("stat.fishCaught", new fr("stat.fishCaught", new Object[0]))).h();
   public static ph A = (new pe("stat.junkFished", new fr("stat.junkFished", new Object[0]))).h();
   public static ph B = (new pe("stat.treasureFished", new fr("stat.treasureFished", new Object[0]))).h();
   public static final ph[] C = new ph[4096];
   public static final ph[] D = new ph[32000];
   public static final ph[] E = new ph[32000];
   public static final ph[] F = new ph[32000];


   public static void a() {
      c();
      d();
      e();
      b();
      pc.a();
      sg.a();
   }

   private static void b() {
      HashSet var0 = new HashSet();
      Iterator var1 = afe.a().b().iterator();

      while(var1.hasNext()) {
         afg var2 = (afg)var1.next();
         if(var2.b() != null) {
            var0.add(var2.b().b());
         }
      }

      var1 = afa.a().b().values().iterator();

      while(var1.hasNext()) {
         add var4 = (add)var1.next();
         var0.add(var4.b());
      }

      var1 = var0.iterator();

      while(var1.hasNext()) {
         adb var5 = (adb)var1.next();
         if(var5 != null) {
            int var3 = adb.b(var5);
            D[var3] = (new pf("stat.craftItem." + var3, new fr("stat.craftItem", new Object[]{(new add(var5)).E()}), var5)).h();
         }
      }

      a(D);
   }

   private static void c() {
      Iterator var0 = aji.c.iterator();

      while(var0.hasNext()) {
         aji var1 = (aji)var0.next();
         if(adb.a(var1) != null) {
            int var2 = aji.b(var1);
            if(var1.G()) {
               C[var2] = (new pf("stat.mineBlock." + var2, new fr("stat.mineBlock", new Object[]{(new add(var1)).E()}), adb.a(var1))).h();
               e.add((pf)C[var2]);
            }
         }
      }

      a(C);
   }

   private static void d() {
      Iterator var0 = adb.e.iterator();

      while(var0.hasNext()) {
         adb var1 = (adb)var0.next();
         if(var1 != null) {
            int var2 = adb.b(var1);
            E[var2] = (new pf("stat.useItem." + var2, new fr("stat.useItem", new Object[]{(new add(var1)).E()}), var1)).h();
            if(!(var1 instanceof abh)) {
               d.add((pf)E[var2]);
            }
         }
      }

      a(E);
   }

   private static void e() {
      Iterator var0 = adb.e.iterator();

      while(var0.hasNext()) {
         adb var1 = (adb)var0.next();
         if(var1 != null) {
            int var2 = adb.b(var1);
            if(var1.p()) {
               F[var2] = (new pf("stat.breakItem." + var2, new fr("stat.breakItem", new Object[]{(new add(var1)).E()}), var1)).h();
            }
         }
      }

      a(F);
   }

   private static void a(ph[] var0) {
      a(var0, ajn.j, ajn.i);
      a(var0, ajn.l, ajn.k);
      a(var0, ajn.aP, ajn.aK);
      a(var0, ajn.am, ajn.al);
      a(var0, ajn.ay, ajn.ax);
      a(var0, ajn.aS, ajn.aR);
      a(var0, ajn.bV, ajn.bU);
      a(var0, ajn.aA, ajn.az);
      a(var0, ajn.bv, ajn.bu);
      a(var0, ajn.Q, ajn.P);
      a(var0, ajn.T, ajn.U);
      a(var0, ajn.bw, ajn.bx);
      a(var0, ajn.c, ajn.d);
      a(var0, ajn.ak, ajn.d);
   }

   private static void a(ph[] var0, aji var1, aji var2) {
      int var3 = aji.b(var1);
      int var4 = aji.b(var2);
      if(var0[var3] != null && var0[var4] == null) {
         var0[var4] = var0[var3];
      } else {
         b.remove(var0[var3]);
         e.remove(var0[var3]);
         c.remove(var0[var3]);
         var0[var3] = var0[var4];
      }
   }

   public static ph a(sh var0) {
      String var1 = sg.b(var0.a);
      return var1 == null?null:(new ph("stat.killEntity." + var1, new fr("stat.entityKill", new Object[]{new fr("entity." + var1 + ".name", new Object[0])}))).h();
   }

   public static ph b(sh var0) {
      String var1 = sg.b(var0.a);
      return var1 == null?null:(new ph("stat.entityKilledBy." + var1, new fr("stat.entityKilledBy", new Object[]{new fr("entity." + var1 + ".name", new Object[0])}))).h();
   }

   public static ph a(String var0) {
      return (ph)a.get(var0);
   }

}
