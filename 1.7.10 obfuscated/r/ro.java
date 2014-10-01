
public class ro {

   public static ro a = (new ro("inFire")).n();
   public static ro b = (new ro("onFire")).k().n();
   public static ro c = (new ro("lava")).n();
   public static ro d = (new ro("inWall")).k();
   public static ro e = (new ro("drown")).k();
   public static ro f = (new ro("starve")).k().m();
   public static ro g = new ro("cactus");
   public static ro h = (new ro("fall")).k();
   public static ro i = (new ro("outOfWorld")).k().l();
   public static ro j = (new ro("generic")).k();
   public static ro k = (new ro("magic")).k().t();
   public static ro l = (new ro("wither")).k();
   public static ro m = new ro("anvil");
   public static ro n = new ro("fallingBlock");
   private boolean p;
   private boolean q;
   private boolean r;
   private float s = 0.3F;
   private boolean t;
   private boolean u;
   private boolean v;
   private boolean w;
   private boolean x;
   public String o;


   public static ro a(sv var0) {
      return new rp("mob", var0);
   }

   public static ro a(yz var0) {
      return new rp("player", var0);
   }

   public static ro a(zc var0, sa var1) {
      return (new rq("arrow", var0, var1)).b();
   }

   public static ro a(ze var0, sa var1) {
      return var1 == null?(new rq("onFire", var0, var0)).n().b():(new rq("fireball", var0, var1)).n().b();
   }

   public static ro a(sa var0, sa var1) {
      return (new rq("thrown", var0, var1)).b();
   }

   public static ro b(sa var0, sa var1) {
      return (new rq("indirectMagic", var0, var1)).k().t();
   }

   public static ro a(sa var0) {
      return (new rp("thorns", var0)).t();
   }

   public static ro a(agw var0) {
      return var0 != null && var0.c() != null?(new rp("explosion.player", var0.c())).q().d():(new ro("explosion")).q().d();
   }

   public boolean a() {
      return this.u;
   }

   public ro b() {
      this.u = true;
      return this;
   }

   public boolean c() {
      return this.x;
   }

   public ro d() {
      this.x = true;
      return this;
   }

   public boolean e() {
      return this.p;
   }

   public float f() {
      return this.s;
   }

   public boolean g() {
      return this.q;
   }

   public boolean h() {
      return this.r;
   }

   protected ro(String var1) {
      this.o = var1;
   }

   public sa i() {
      return this.j();
   }

   public sa j() {
      return null;
   }

   protected ro k() {
      this.p = true;
      this.s = 0.0F;
      return this;
   }

   protected ro l() {
      this.q = true;
      return this;
   }

   protected ro m() {
      this.r = true;
      this.s = 0.0F;
      return this;
   }

   protected ro n() {
      this.t = true;
      return this;
   }

   public fj b(sv var1) {
      sv var2 = var1.aX();
      String var3 = "death.attack." + this.o;
      String var4 = var3 + ".player";
      return var2 != null && dd.c(var4)?new fr(var4, new Object[]{var1.c_(), var2.c_()}):new fr(var3, new Object[]{var1.c_()});
   }

   public boolean o() {
      return this.t;
   }

   public String p() {
      return this.o;
   }

   public ro q() {
      this.v = true;
      return this;
   }

   public boolean r() {
      return this.v;
   }

   public boolean s() {
      return this.w;
   }

   public ro t() {
      this.w = true;
      return this;
   }

}
