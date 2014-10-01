
public class afq extends aft {

   private static final String[] E = new String[]{"all", "undead", "arthropods"};
   private static final int[] F = new int[]{1, 5, 5};
   private static final int[] G = new int[]{11, 8, 8};
   private static final int[] H = new int[]{20, 20, 20};
   public final int a;


   public afq(int var1, int var2, int var3) {
      super(var1, var2, afu.g);
      this.a = var3;
   }

   public int a(int var1) {
      return F[this.a] + (var1 - 1) * G[this.a];
   }

   public int b(int var1) {
      return this.a(var1) + H[this.a];
   }

   public int b() {
      return 5;
   }

   public float a(int var1, sz var2) {
      return this.a == 0?(float)var1 * 1.25F:(this.a == 1 && var2 == sz.b?(float)var1 * 2.5F:(this.a == 2 && var2 == sz.c?(float)var1 * 2.5F:0.0F));
   }

   public String a() {
      return "enchantment.damage." + E[this.a];
   }

   public boolean a(aft var1) {
      return !(var1 instanceof afq);
   }

   public boolean a(add var1) {
      return var1.b() instanceof abf?true:super.a(var1);
   }

   public void a(sv var1, sa var2, int var3) {
      if(var2 instanceof sv) {
         sv var4 = (sv)var2;
         if(this.a == 2 && var4.bd() == sz.c) {
            int var5 = 20 + var1.aI().nextInt(10 * var3);
            var4.c(new rw(rv.d.H, var5, 3));
         }
      }

   }

}
