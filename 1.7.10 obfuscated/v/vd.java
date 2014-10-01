
public class vd extends ui {

   private final sw a;
   private final yi b;
   private sv c;
   private int d;
   private double e;
   private int f;
   private int g;
   private int h;
   private float i;
   private float j;


   public vd(yi var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public vd(yi var1, double var2, int var4, int var5, float var6) {
      this.d = -1;
      if(!(var1 instanceof sv)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = var1;
         this.a = (sw)var1;
         this.e = var2;
         this.g = var4;
         this.h = var5;
         this.i = var6;
         this.j = var6 * var6;
         this.a(3);
      }
   }

   public boolean a() {
      sv var1 = this.a.o();
      if(var1 == null) {
         return false;
      } else {
         this.c = var1;
         return true;
      }
   }

   public boolean b() {
      return this.a() || !this.a.m().g();
   }

   public void d() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   public void e() {
      double var1 = this.a.e(this.c.s, this.c.C.b, this.c.u);
      boolean var3 = this.a.n().a(this.c);
      if(var3) {
         ++this.f;
      } else {
         this.f = 0;
      }

      if(var1 <= (double)this.j && this.f >= 20) {
         this.a.m().h();
      } else {
         this.a.m().a((sa)this.c, this.e);
      }

      this.a.j().a(this.c, 30.0F, 30.0F);
      float var4;
      if(--this.d == 0) {
         if(var1 > (double)this.j || !var3) {
            return;
         }

         var4 = qh.a(var1) / this.i;
         float var5 = var4;
         if(var4 < 0.1F) {
            var5 = 0.1F;
         }

         if(var5 > 1.0F) {
            var5 = 1.0F;
         }

         this.b.a(this.c, var5);
         this.d = qh.d(var4 * (float)(this.h - this.g) + (float)this.g);
      } else if(this.d < 0) {
         var4 = qh.a(var1) / this.i;
         this.d = qh.d(var4 * (float)(this.h - this.g) + (float)this.g);
      }

   }
}
