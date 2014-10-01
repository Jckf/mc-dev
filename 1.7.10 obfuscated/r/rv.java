import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

public class rv {

   public static final rv[] a = new rv[32];
   public static final rv b = null;
   public static final rv c = (new rv(1, false, 8171462)).b("potion.moveSpeed").b(0, 0).a(yj.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2);
   public static final rv d = (new rv(2, true, 5926017)).b("potion.moveSlowdown").b(1, 0).a(yj.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448D, 2);
   public static final rv e = (new rv(3, false, 14270531)).b("potion.digSpeed").b(2, 0).a(1.5D);
   public static final rv f = (new rv(4, true, 4866583)).b("potion.digSlowDown").b(3, 0);
   public static final rv g = (new rs(5, false, 9643043)).b("potion.damageBoost").b(4, 0).a(yj.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0D, 2);
   public static final rv h = (new ru(6, false, 16262179)).b("potion.heal");
   public static final rv i = (new ru(7, true, 4393481)).b("potion.harm");
   public static final rv j = (new rv(8, false, 7889559)).b("potion.jump").b(2, 1);
   public static final rv k = (new rv(9, true, 5578058)).b("potion.confusion").b(3, 1).a(0.25D);
   public static final rv l = (new rv(10, false, 13458603)).b("potion.regeneration").b(7, 0).a(0.25D);
   public static final rv m = (new rv(11, false, 10044730)).b("potion.resistance").b(6, 1);
   public static final rv n = (new rv(12, false, 14981690)).b("potion.fireResistance").b(7, 1);
   public static final rv o = (new rv(13, false, 3035801)).b("potion.waterBreathing").b(0, 2);
   public static final rv p = (new rv(14, false, 8356754)).b("potion.invisibility").b(0, 1);
   public static final rv q = (new rv(15, true, 2039587)).b("potion.blindness").b(5, 1).a(0.25D);
   public static final rv r = (new rv(16, false, 2039713)).b("potion.nightVision").b(4, 1);
   public static final rv s = (new rv(17, true, 5797459)).b("potion.hunger").b(1, 1);
   public static final rv t = (new rs(18, true, 4738376)).b("potion.weakness").b(5, 0).a(yj.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0D, 0);
   public static final rv u = (new rv(19, true, 5149489)).b("potion.poison").b(6, 0).a(0.25D);
   public static final rv v = (new rv(20, true, 3484199)).b("potion.wither").b(1, 2).a(0.25D);
   public static final rv w = (new rt(21, false, 16284963)).b("potion.healthBoost").b(2, 2).a(yj.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0);
   public static final rv x = (new rr(22, false, 2445989)).b("potion.absorption").b(2, 2);
   public static final rv y = (new ru(23, false, 16262179)).b("potion.saturation");
   public static final rv z = null;
   public static final rv A = null;
   public static final rv B = null;
   public static final rv C = null;
   public static final rv D = null;
   public static final rv E = null;
   public static final rv F = null;
   public static final rv G = null;
   public final int H;
   private final Map I = Maps.newHashMap();
   private final boolean J;
   private final int K;
   private String L = "";
   private int M = -1;
   private double N;
   private boolean O;


   protected rv(int var1, boolean var2, int var3) {
      this.H = var1;
      a[var1] = this;
      this.J = var2;
      if(var2) {
         this.N = 0.5D;
      } else {
         this.N = 1.0D;
      }

      this.K = var3;
   }

   protected rv b(int var1, int var2) {
      this.M = var1 + var2 * 8;
      return this;
   }

   public int c() {
      return this.H;
   }

   public void a(sv var1, int var2) {
      if(this.H == l.H) {
         if(var1.aS() < var1.aY()) {
            var1.f(1.0F);
         }
      } else if(this.H == u.H) {
         if(var1.aS() > 1.0F) {
            var1.a(ro.k, 1.0F);
         }
      } else if(this.H == v.H) {
         var1.a(ro.l, 1.0F);
      } else if(this.H == s.H && var1 instanceof yz) {
         ((yz)var1).a(0.025F * (float)(var2 + 1));
      } else if(this.H == y.H && var1 instanceof yz) {
         if(!var1.o.E) {
            ((yz)var1).bQ().a(var2 + 1, 1.0F);
         }
      } else if((this.H != h.H || var1.aR()) && (this.H != i.H || !var1.aR())) {
         if(this.H == i.H && !var1.aR() || this.H == h.H && var1.aR()) {
            var1.a(ro.k, (float)(6 << var2));
         }
      } else {
         var1.f((float)Math.max(4 << var2, 0));
      }

   }

   public void a(sv var1, sv var2, int var3, double var4) {
      int var6;
      if((this.H != h.H || var2.aR()) && (this.H != i.H || !var2.aR())) {
         if(this.H == i.H && !var2.aR() || this.H == h.H && var2.aR()) {
            var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
            if(var1 == null) {
               var2.a(ro.k, (float)var6);
            } else {
               var2.a(ro.b(var2, var1), (float)var6);
            }
         }
      } else {
         var6 = (int)(var4 * (double)(4 << var3) + 0.5D);
         var2.f((float)var6);
      }

   }

   public boolean b() {
      return false;
   }

   public boolean a(int var1, int var2) {
      int var3;
      if(this.H == l.H) {
         var3 = 50 >> var2;
         return var3 > 0?var1 % var3 == 0:true;
      } else if(this.H == u.H) {
         var3 = 25 >> var2;
         return var3 > 0?var1 % var3 == 0:true;
      } else if(this.H == v.H) {
         var3 = 40 >> var2;
         return var3 > 0?var1 % var3 == 0:true;
      } else {
         return this.H == s.H;
      }
   }

   public rv b(String var1) {
      this.L = var1;
      return this;
   }

   public String a() {
      return this.L;
   }

   protected rv a(double var1) {
      this.N = var1;
      return this;
   }

   public double g() {
      return this.N;
   }

   public boolean i() {
      return this.O;
   }

   public int j() {
      return this.K;
   }

   public rv a(th var1, String var2, double var3, int var5) {
      tj var6 = new tj(UUID.fromString(var2), this.a(), var3, var5);
      this.I.put(var1, var6);
      return this;
   }

   public void a(sv var1, tl var2, int var3) {
      Iterator var4 = this.I.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         ti var6 = var2.a((th)var5.getKey());
         if(var6 != null) {
            var6.b((tj)var5.getValue());
         }
      }

   }

   public void b(sv var1, tl var2, int var3) {
      Iterator var4 = this.I.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         ti var6 = var2.a((th)var5.getKey());
         if(var6 != null) {
            tj var7 = (tj)var5.getValue();
            var6.b(var7);
            var6.a(new tj(var7.a(), this.a() + " " + var3, this.a(var3, var7), var7.c()));
         }
      }

   }

   public double a(int var1, tj var2) {
      return var2.d() * (double)(var1 + 1);
   }

}
