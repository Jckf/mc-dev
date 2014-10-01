import java.util.ArrayList;

public abstract class aft {

   public static final aft[] b = new aft[256];
   public static final aft[] c;
   public static final aft d = new agi(0, 10, 0);
   public static final aft e = new agi(1, 5, 1);
   public static final aft f = new agi(2, 5, 2);
   public static final aft g = new agi(3, 2, 3);
   public static final aft h = new agi(4, 5, 4);
   public static final aft i = new agh(5, 2);
   public static final aft j = new agl(6, 2);
   public static final aft k = new agj(7, 1);
   public static final aft l = new afq(16, 10, 0);
   public static final aft m = new afq(17, 5, 1);
   public static final aft n = new afq(18, 5, 2);
   public static final aft o = new agf(19, 5);
   public static final aft p = new agd(20, 2);
   public static final aft q = new agg(21, 2, afu.g);
   public static final aft r = new afs(32, 10);
   public static final aft s = new agk(33, 1);
   public static final aft t = new afr(34, 5);
   public static final aft u = new agg(35, 2, afu.h);
   public static final aft v = new afm(48, 10);
   public static final aft w = new afp(49, 2);
   public static final aft x = new afn(50, 2);
   public static final aft y = new afo(51, 1);
   public static final aft z = new agg(61, 2, afu.i);
   public static final aft A = new age(62, 2, afu.i);
   public final int B;
   private final int a;
   public afu C;
   protected String D;


   protected aft(int var1, int var2, afu var3) {
      this.B = var1;
      this.a = var2;
      this.C = var3;
      if(b[var1] != null) {
         throw new IllegalArgumentException("Duplicate enchantment id!");
      } else {
         b[var1] = this;
      }
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return 1;
   }

   public int b() {
      return 1;
   }

   public int a(int var1) {
      return 1 + var1 * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 5;
   }

   public int a(int var1, ro var2) {
      return 0;
   }

   public float a(int var1, sz var2) {
      return 0.0F;
   }

   public boolean a(aft var1) {
      return this != var1;
   }

   public aft b(String var1) {
      this.D = var1;
      return this;
   }

   public String a() {
      return "enchantment." + this.D;
   }

   public String c(int var1) {
      String var2 = dd.a(this.a());
      return var2 + " " + dd.a("enchantment.level." + var1);
   }

   public boolean a(add var1) {
      return this.C.a(var1.b());
   }

   public void a(sv var1, sa var2, int var3) {}

   public void b(sv var1, sa var2, int var3) {}

   static {
      ArrayList var0 = new ArrayList();
      aft[] var1 = b;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         aft var4 = var1[var3];
         if(var4 != null) {
            var0.add(var4);
         }
      }

      c = (aft[])var0.toArray(new aft[0]);
   }
}
