
public abstract class abt {

   public static final abt[] a = new abt[12];
   public static final abt b = new abu(0, "buildingBlocks");
   public static final abt c = new aby(1, "decorations");
   public static final abt d = new abz(2, "redstone");
   public static final abt e = new aca(3, "transportation");
   public static final abt f = (new acb(4, "misc")).a(new afu[]{afu.a});
   public static final abt g = (new acc(5, "search")).a("item_search.png");
   public static final abt h = new acd(6, "food");
   public static final abt i = (new ace(7, "tools")).a(new afu[]{afu.h, afu.i, afu.j});
   public static final abt j = (new acf(8, "combat")).a(new afu[]{afu.b, afu.c, afu.f, afu.d, afu.e, afu.k, afu.g});
   public static final abt k = new abv(9, "brewing");
   public static final abt l = new abw(10, "materials");
   public static final abt m = (new abx(11, "inventory")).a("inventory.png").k().i();
   private final int n;
   private final String o;
   private String p = "items.png";
   private boolean q = true;
   private boolean r = true;
   private afu[] s;


   public abt(int var1, String var2) {
      this.n = var1;
      this.o = var2;
      a[var1] = this;
   }

   public abt a(String var1) {
      this.p = var1;
      return this;
   }

   public abt i() {
      this.r = false;
      return this;
   }

   public abt k() {
      this.q = false;
      return this;
   }

   public abt a(afu ... var1) {
      this.s = var1;
      return this;
   }

}
