import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class ays {

   private long a;
   private ahm b;
   private String c;
   private int d;
   private int e;
   private int f;
   private long g;
   private long h;
   private long i;
   private long j;
   private dh k;
   private int l;
   private String m;
   private int n;
   private boolean o;
   private int p;
   private boolean q;
   private int r;
   private ahk s;
   private boolean t;
   private boolean u;
   private boolean v;
   private boolean w;
   private agy x;


   protected ays() {
      this.b = ahm.b;
      this.c = "";
      this.x = new agy();
   }

   public ays(dh var1) {
      this.b = ahm.b;
      this.c = "";
      this.x = new agy();
      this.a = var1.g("RandomSeed");
      if(var1.b("generatorName", 8)) {
         String var2 = var1.j("generatorName");
         this.b = ahm.a(var2);
         if(this.b == null) {
            this.b = ahm.b;
         } else if(this.b.f()) {
            int var3 = 0;
            if(var1.b("generatorVersion", 99)) {
               var3 = var1.f("generatorVersion");
            }

            this.b = this.b.a(var3);
         }

         if(var1.b("generatorOptions", 8)) {
            this.c = var1.j("generatorOptions");
         }
      }

      this.s = ahk.a(var1.f("GameType"));
      if(var1.b("MapFeatures", 99)) {
         this.t = var1.n("MapFeatures");
      } else {
         this.t = true;
      }

      this.d = var1.f("SpawnX");
      this.e = var1.f("SpawnY");
      this.f = var1.f("SpawnZ");
      this.g = var1.g("Time");
      if(var1.b("DayTime", 99)) {
         this.h = var1.g("DayTime");
      } else {
         this.h = this.g;
      }

      this.i = var1.g("LastPlayed");
      this.j = var1.g("SizeOnDisk");
      this.m = var1.j("LevelName");
      this.n = var1.f("version");
      this.p = var1.f("rainTime");
      this.o = var1.n("raining");
      this.r = var1.f("thunderTime");
      this.q = var1.n("thundering");
      this.u = var1.n("hardcore");
      if(var1.b("initialized", 99)) {
         this.w = var1.n("initialized");
      } else {
         this.w = true;
      }

      if(var1.b("allowCommands", 99)) {
         this.v = var1.n("allowCommands");
      } else {
         this.v = this.s == ahk.c;
      }

      if(var1.b("Player", 10)) {
         this.k = var1.m("Player");
         this.l = this.k.f("Dimension");
      }

      if(var1.b("GameRules", 10)) {
         this.x.a(var1.m("GameRules"));
      }

   }

   public ays(ahj var1, String var2) {
      this.b = ahm.b;
      this.c = "";
      this.x = new agy();
      this.a = var1.d();
      this.s = var1.e();
      this.t = var1.g();
      this.m = var2;
      this.u = var1.f();
      this.b = var1.h();
      this.c = var1.j();
      this.v = var1.i();
      this.w = false;
   }

   public ays(ays var1) {
      this.b = ahm.b;
      this.c = "";
      this.x = new agy();
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.s = var1.s;
      this.t = var1.t;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
      this.m = var1.m;
      this.n = var1.n;
      this.p = var1.p;
      this.o = var1.o;
      this.r = var1.r;
      this.q = var1.q;
      this.u = var1.u;
      this.v = var1.v;
      this.w = var1.w;
      this.x = var1.x;
   }

   public dh a() {
      dh var1 = new dh();
      this.a(var1, this.k);
      return var1;
   }

   public dh a(dh var1) {
      dh var2 = new dh();
      this.a(var2, var1);
      return var2;
   }

   private void a(dh var1, dh var2) {
      var1.a("RandomSeed", this.a);
      var1.a("generatorName", this.b.a());
      var1.a("generatorVersion", this.b.d());
      var1.a("generatorOptions", this.c);
      var1.a("GameType", this.s.a());
      var1.a("MapFeatures", this.t);
      var1.a("SpawnX", this.d);
      var1.a("SpawnY", this.e);
      var1.a("SpawnZ", this.f);
      var1.a("Time", this.g);
      var1.a("DayTime", this.h);
      var1.a("SizeOnDisk", this.j);
      var1.a("LastPlayed", MinecraftServer.ar());
      var1.a("LevelName", this.m);
      var1.a("version", this.n);
      var1.a("rainTime", this.p);
      var1.a("raining", this.o);
      var1.a("thunderTime", this.r);
      var1.a("thundering", this.q);
      var1.a("hardcore", this.u);
      var1.a("allowCommands", this.v);
      var1.a("initialized", this.w);
      var1.a("GameRules", (dy)this.x.a());
      if(var2 != null) {
         var1.a("Player", (dy)var2);
      }

   }

   public long b() {
      return this.a;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }

   public long f() {
      return this.g;
   }

   public long g() {
      return this.h;
   }

   public dh i() {
      return this.k;
   }

   public int j() {
      return this.l;
   }

   public void b(long var1) {
      this.g = var1;
   }

   public void c(long var1) {
      this.h = var1;
   }

   public void a(int var1, int var2, int var3) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
   }

   public String k() {
      return this.m;
   }

   public void a(String var1) {
      this.m = var1;
   }

   public int l() {
      return this.n;
   }

   public void e(int var1) {
      this.n = var1;
   }

   public boolean n() {
      return this.q;
   }

   public void a(boolean var1) {
      this.q = var1;
   }

   public int o() {
      return this.r;
   }

   public void f(int var1) {
      this.r = var1;
   }

   public boolean p() {
      return this.o;
   }

   public void b(boolean var1) {
      this.o = var1;
   }

   public int q() {
      return this.p;
   }

   public void g(int var1) {
      this.p = var1;
   }

   public ahk r() {
      return this.s;
   }

   public boolean s() {
      return this.t;
   }

   public void a(ahk var1) {
      this.s = var1;
   }

   public boolean t() {
      return this.u;
   }

   public ahm u() {
      return this.b;
   }

   public void a(ahm var1) {
      this.b = var1;
   }

   public String y() {
      return this.c;
   }

   public boolean v() {
      return this.v;
   }

   public boolean w() {
      return this.w;
   }

   public void d(boolean var1) {
      this.w = var1;
   }

   public agy x() {
      return this.x;
   }

   public void a(k var1) {
      var1.a("Level seed", (Callable)(new ayt(this)));
      var1.a("Level generator", (Callable)(new ayu(this)));
      var1.a("Level generator options", (Callable)(new ayv(this)));
      var1.a("Level spawn location", (Callable)(new ayw(this)));
      var1.a("Level time", (Callable)(new ayx(this)));
      var1.a("Level dimension", (Callable)(new ayy(this)));
      var1.a("Level storage version", (Callable)(new ayz(this)));
      var1.a("Level weather", (Callable)(new aza(this)));
      var1.a("Level game mode", (Callable)(new azb(this)));
   }

   // $FF: synthetic method
   static ahm a(ays var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static boolean b(ays var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static String c(ays var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static int d(ays var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int e(ays var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int f(ays var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static long g(ays var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static long h(ays var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int i(ays var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static int j(ays var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static int k(ays var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static boolean l(ays var0) {
      return var0.o;
   }

   // $FF: synthetic method
   static int m(ays var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static boolean n(ays var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static ahk o(ays var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static boolean p(ays var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static boolean q(ays var0) {
      return var0.v;
   }
}
