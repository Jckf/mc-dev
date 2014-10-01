import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.Random;

public final class add {

   public static final DecimalFormat a = new DecimalFormat("#.###");
   public int b;
   public int c;
   private adb e;
   public dh d;
   private int f;
   private st g;


   public add(aji var1) {
      this(var1, 1);
   }

   public add(aji var1, int var2) {
      this(var1, var2, 0);
   }

   public add(aji var1, int var2, int var3) {
      this(adb.a(var1), var2, var3);
   }

   public add(adb var1) {
      this(var1, 1);
   }

   public add(adb var1, int var2) {
      this(var1, var2, 0);
   }

   public add(adb var1, int var2, int var3) {
      this.e = var1;
      this.b = var2;
      this.f = var3;
      if(this.f < 0) {
         this.f = 0;
      }

   }

   public static add a(dh var0) {
      add var1 = new add();
      var1.c(var0);
      return var1.b() != null?var1:null;
   }

   private add() {}

   public add a(int var1) {
      add var2 = new add(this.e, var1, this.f);
      if(this.d != null) {
         var2.d = (dh)this.d.b();
      }

      this.b -= var1;
      return var2;
   }

   public adb b() {
      return this.e;
   }

   public boolean a(yz var1, ahb var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      boolean var10 = this.b().a(this, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      if(var10) {
         var1.a(pp.E[adb.b(this.e)], 1);
      }

      return var10;
   }

   public float a(aji var1) {
      return this.b().a(this, var1);
   }

   public add a(ahb var1, yz var2) {
      return this.b().a(this, var1, var2);
   }

   public add b(ahb var1, yz var2) {
      return this.b().b(this, var1, var2);
   }

   public dh b(dh var1) {
      var1.a("id", (short)adb.b(this.e));
      var1.a("Count", (byte)this.b);
      var1.a("Damage", (short)this.f);
      if(this.d != null) {
         var1.a("tag", (dy)this.d);
      }

      return var1;
   }

   public void c(dh var1) {
      this.e = adb.d(var1.e("id"));
      this.b = var1.d("Count");
      this.f = var1.e("Damage");
      if(this.f < 0) {
         this.f = 0;
      }

      if(var1.b("tag", 10)) {
         this.d = var1.m("tag");
      }

   }

   public int e() {
      return this.b().m();
   }

   public boolean f() {
      return this.e() > 1 && (!this.g() || !this.i());
   }

   public boolean g() {
      return this.e.o() <= 0?false:!this.p() || !this.q().n("Unbreakable");
   }

   public boolean h() {
      return this.e.n();
   }

   public boolean i() {
      return this.g() && this.f > 0;
   }

   public int j() {
      return this.f;
   }

   public int k() {
      return this.f;
   }

   public void b(int var1) {
      this.f = var1;
      if(this.f < 0) {
         this.f = 0;
      }

   }

   public int l() {
      return this.e.o();
   }

   public boolean a(int var1, Random var2) {
      if(!this.g()) {
         return false;
      } else {
         if(var1 > 0) {
            int var3 = afv.a(aft.t.B, this);
            int var4 = 0;

            for(int var5 = 0; var3 > 0 && var5 < var1; ++var5) {
               if(afr.a(this, var3, var2)) {
                  ++var4;
               }
            }

            var1 -= var4;
            if(var1 <= 0) {
               return false;
            }
         }

         this.f += var1;
         return this.f > this.l();
      }
   }

   public void a(int var1, sv var2) {
      if(!(var2 instanceof yz) || !((yz)var2).bE.d) {
         if(this.g()) {
            if(this.a(var1, var2.aI())) {
               var2.a(this);
               --this.b;
               if(var2 instanceof yz) {
                  yz var3 = (yz)var2;
                  var3.a(pp.F[adb.b(this.e)], 1);
                  if(this.b == 0 && this.b() instanceof abm) {
                     var3.bG();
                  }
               }

               if(this.b < 0) {
                  this.b = 0;
               }

               this.f = 0;
            }

         }
      }
   }

   public void a(sv var1, yz var2) {
      boolean var3 = this.e.a(this, var1, (sv)var2);
      if(var3) {
         var2.a(pp.E[adb.b(this.e)], 1);
      }

   }

   public void a(ahb var1, aji var2, int var3, int var4, int var5, yz var6) {
      boolean var7 = this.e.a(this, var1, var2, var3, var4, var5, var6);
      if(var7) {
         var6.a(pp.E[adb.b(this.e)], 1);
      }

   }

   public boolean b(aji var1) {
      return this.e.b(var1);
   }

   public boolean a(yz var1, sv var2) {
      return this.e.a(this, var1, var2);
   }

   public add m() {
      add var1 = new add(this.e, this.b, this.f);
      if(this.d != null) {
         var1.d = (dh)this.d.b();
      }

      return var1;
   }

   public static boolean a(add var0, add var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?(var0.d == null && var1.d != null?false:var0.d == null || var0.d.equals(var1.d)):false);
   }

   public static boolean b(add var0, add var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?var0.d(var1):false);
   }

   private boolean d(add var1) {
      return this.b != var1.b?false:(this.e != var1.e?false:(this.f != var1.f?false:(this.d == null && var1.d != null?false:this.d == null || this.d.equals(var1.d))));
   }

   public boolean a(add var1) {
      return this.e == var1.e && this.f == var1.f;
   }

   public String a() {
      return this.e.a(this);
   }

   public static add b(add var0) {
      return var0 == null?null:var0.m();
   }

   public String toString() {
      return this.b + "x" + this.e.a() + "@" + this.f;
   }

   public void a(ahb var1, sa var2, int var3, boolean var4) {
      if(this.c > 0) {
         --this.c;
      }

      this.e.a(this, var1, var2, var3, var4);
   }

   public void a(ahb var1, yz var2, int var3) {
      var2.a(pp.D[adb.b(this.e)], var3);
      this.e.d(this, var1, var2);
   }

   public int n() {
      return this.b().d_(this);
   }

   public aei o() {
      return this.b().d(this);
   }

   public void b(ahb var1, yz var2, int var3) {
      this.b().a(this, var1, var2, var3);
   }

   public boolean p() {
      return this.d != null;
   }

   public dh q() {
      return this.d;
   }

   public dq r() {
      return this.d == null?null:this.d.c("ench", 10);
   }

   public void d(dh var1) {
      this.d = var1;
   }

   public String s() {
      String var1 = this.b().n(this);
      if(this.d != null && this.d.b("display", 10)) {
         dh var2 = this.d.m("display");
         if(var2.b("Name", 8)) {
            var1 = var2.j("Name");
         }
      }

      return var1;
   }

   public add c(String var1) {
      if(this.d == null) {
         this.d = new dh();
      }

      if(!this.d.b("display", 10)) {
         this.d.a("display", (dy)(new dh()));
      }

      this.d.m("display").a("Name", var1);
      return this;
   }

   public void t() {
      if(this.d != null) {
         if(this.d.b("display", 10)) {
            dh var1 = this.d.m("display");
            var1.o("Name");
            if(var1.d()) {
               this.d.o("display");
               if(this.d.d()) {
                  this.d((dh)null);
               }
            }

         }
      }
   }

   public boolean u() {
      return this.d == null?false:(!this.d.b("display", 10)?false:this.d.m("display").b("Name", 8));
   }

   public adq w() {
      return this.b().f(this);
   }

   public boolean x() {
      return !this.b().e_(this)?false:!this.y();
   }

   public void a(aft var1, int var2) {
      if(this.d == null) {
         this.d(new dh());
      }

      if(!this.d.b("ench", 9)) {
         this.d.a("ench", (dy)(new dq()));
      }

      dq var3 = this.d.c("ench", 10);
      dh var4 = new dh();
      var4.a("id", (short)var1.B);
      var4.a("lvl", (short)((byte)var2));
      var3.a((dy)var4);
   }

   public boolean y() {
      return this.d != null && this.d.b("ench", 9);
   }

   public void a(String var1, dy var2) {
      if(this.d == null) {
         this.d(new dh());
      }

      this.d.a(var1, var2);
   }

   public boolean z() {
      return this.b().v();
   }

   public boolean A() {
      return this.g != null;
   }

   public void a(st var1) {
      this.g = var1;
   }

   public st B() {
      return this.g;
   }

   public int C() {
      return this.p() && this.d.b("RepairCost", 3)?this.d.f("RepairCost"):0;
   }

   public void c(int var1) {
      if(!this.p()) {
         this.d = new dh();
      }

      this.d.a("RepairCost", var1);
   }

   public Multimap D() {
      Object var1;
      if(this.p() && this.d.b("AttributeModifiers", 9)) {
         var1 = HashMultimap.create();
         dq var2 = this.d.c("AttributeModifiers", 10);

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            dh var4 = var2.b(var3);
            tj var5 = yj.a(var4);
            if(var5.a().getLeastSignificantBits() != 0L && var5.a().getMostSignificantBits() != 0L) {
               ((Multimap)var1).put(var4.j("AttributeName"), var5);
            }
         }
      } else {
         var1 = this.b().k();
      }

      return (Multimap)var1;
   }

   public void a(adb var1) {
      this.e = var1;
   }

   public fj E() {
      fj var1 = (new fq("[")).a(this.s()).a("]");
      if(this.e != null) {
         dh var2 = new dh();
         this.b(var2);
         var1.b().a(new fl(fm.c, new fq(var2.toString())));
         var1.b().a(this.w().e);
      }

      return var1;
   }

}
