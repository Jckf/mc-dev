
public class ub extends ui {

   private final sw a;
   private final float b;
   private float c;
   private boolean d;
   private int e;
   private int f;


   public ub(sw var1, float var2) {
      this.a = var1;
      this.b = var2;
      this.a(7);
   }

   public void c() {
      this.c = 0.0F;
   }

   public void d() {
      this.d = false;
      this.c = 0.0F;
   }

   public boolean a() {
      return this.a.Z() && this.a.l != null && this.a.l instanceof yz && (this.d || this.a.bE());
   }

   public void e() {
      yz var1 = (yz)this.a.l;
      td var2 = (td)this.a;
      float var3 = qh.g(var1.y - this.a.y) * 0.5F;
      if(var3 > 5.0F) {
         var3 = 5.0F;
      }

      if(var3 < -5.0F) {
         var3 = -5.0F;
      }

      this.a.y = qh.g(this.a.y + var3);
      if(this.c < this.b) {
         this.c += (this.b - this.c) * 0.01F;
      }

      if(this.c > this.b) {
         this.c = this.b;
      }

      int var4 = qh.c(this.a.s);
      int var5 = qh.c(this.a.t);
      int var6 = qh.c(this.a.u);
      float var7 = this.c;
      if(this.d) {
         if(this.e++ > this.f) {
            this.d = false;
         }

         var7 += var7 * 1.15F * qh.a((float)this.e / (float)this.f * 3.1415927F);
      }

      float var8 = 0.91F;
      if(this.a.D) {
         var8 = this.a.o.a(qh.d((float)var4), qh.d((float)var5) - 1, qh.d((float)var6)).K * 0.91F;
      }

      float var9 = 0.16277136F / (var8 * var8 * var8);
      float var10 = qh.a(var2.y * 3.1415927F / 180.0F);
      float var11 = qh.b(var2.y * 3.1415927F / 180.0F);
      float var12 = var2.bl() * var9;
      float var13 = Math.max(var7, 1.0F);
      var13 = var12 / var13;
      float var14 = var7 * var13;
      float var15 = -(var14 * var10);
      float var16 = var14 * var11;
      if(qh.e(var15) > qh.e(var16)) {
         if(var15 < 0.0F) {
            var15 -= this.a.M / 2.0F;
         }

         if(var15 > 0.0F) {
            var15 += this.a.M / 2.0F;
         }

         var16 = 0.0F;
      } else {
         var15 = 0.0F;
         if(var16 < 0.0F) {
            var16 -= this.a.M / 2.0F;
         }

         if(var16 > 0.0F) {
            var16 += this.a.M / 2.0F;
         }
      }

      int var17 = qh.c(this.a.s + (double)var15);
      int var18 = qh.c(this.a.u + (double)var16);
      aye var19 = new aye(qh.d(this.a.M + 1.0F), qh.d(this.a.N + var1.N + 1.0F), qh.d(this.a.M + 1.0F));
      if(var4 != var17 || var6 != var18) {
         aji var20 = this.a.o.a(var4, var5, var6);
         boolean var21 = !this.a(var20) && (var20.o() != awt.a || !this.a(this.a.o.a(var4, var5 - 1, var6)));
         if(var21 && ayg.a(this.a, var17, var5, var18, var19, false, false, true) == 0 && ayg.a(this.a, var4, var5 + 1, var6, var19, false, false, true) == 1 && ayg.a(this.a, var17, var5 + 1, var18, var19, false, false, true) == 1) {
            var2.l().a();
         }
      }

      if(!var1.bE.d && this.c >= this.b * 0.5F && this.a.aI().nextFloat() < 0.006F && !this.d) {
         add var22 = var1.be();
         if(var22 != null && var22.b() == ade.bM) {
            var22.a(1, (sv)var1);
            if(var22.b == 0) {
               add var23 = new add(ade.aM);
               var23.d(var22.d);
               var1.bm.a[var1.bm.c] = var23;
            }
         }
      }

      this.a.e(0.0F, var7);
   }

   private boolean a(aji var1) {
      return var1.b() == 10 || var1 instanceof alj;
   }

   public boolean f() {
      return this.d;
   }

   public void g() {
      this.d = true;
      this.e = 0;
      this.f = this.a.aI().nextInt(841) + 140;
   }

   public boolean h() {
      return !this.f() && this.c > this.b * 0.3F;
   }
}
