import org.apache.commons.lang3.tuple.ImmutablePair;

public class yk extends yg {

   private int bp;


   public yk(ahb var1) {
      super(var1);
      this.a(0.3F, 0.7F);
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(8.0D);
      this.a(yj.d).a(0.6000000238418579D);
      this.a(yj.e).a(1.0D);
   }

   protected boolean g_() {
      return false;
   }

   protected sa bR() {
      double var1 = 8.0D;
      return this.o.b(this, var1);
   }

   protected String t() {
      return "mob.silverfish.say";
   }

   protected String aT() {
      return "mob.silverfish.hit";
   }

   protected String aU() {
      return "mob.silverfish.kill";
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         if(this.bp <= 0 && (var1 instanceof rp || var1 == ro.k)) {
            this.bp = 20;
         }

         return super.a(var1, var2);
      }
   }

   protected void a(sa var1, float var2) {
      if(this.aB <= 0 && var2 < 1.2F && var1.C.e > this.C.b && var1.C.b < this.C.e) {
         this.aB = 20;
         this.n(var1);
      }

   }

   protected void a(int var1, int var2, int var3, aji var4) {
      this.a("mob.silverfish.step", 0.15F, 1.0F);
   }

   protected adb u() {
      return adb.d(0);
   }

   public void h() {
      this.aM = this.y;
      super.h();
   }

   protected void bq() {
      super.bq();
      if(!this.o.E) {
         int var1;
         int var2;
         int var3;
         int var6;
         if(this.bp > 0) {
            --this.bp;
            if(this.bp == 0) {
               var1 = qh.c(this.s);
               var2 = qh.c(this.t);
               var3 = qh.c(this.u);
               boolean var4 = false;

               for(int var5 = 0; !var4 && var5 <= 5 && var5 >= -5; var5 = var5 <= 0?1 - var5:0 - var5) {
                  for(var6 = 0; !var4 && var6 <= 10 && var6 >= -10; var6 = var6 <= 0?1 - var6:0 - var6) {
                     for(int var7 = 0; !var4 && var7 <= 10 && var7 >= -10; var7 = var7 <= 0?1 - var7:0 - var7) {
                        if(this.o.a(var1 + var6, var2 + var5, var3 + var7) == ajn.aU) {
                           if(!this.o.O().b("mobGriefing")) {
                              int var8 = this.o.e(var1 + var6, var2 + var5, var3 + var7);
                              ImmutablePair var9 = amb.b(var8);
                              this.o.d(var1 + var6, var2 + var5, var3 + var7, (aji)var9.getLeft(), ((Integer)var9.getRight()).intValue(), 3);
                           } else {
                              this.o.a(var1 + var6, var2 + var5, var3 + var7, false);
                           }

                           ajn.aU.b(this.o, var1 + var6, var2 + var5, var3 + var7, 0);
                           if(this.Z.nextBoolean()) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(this.bm == null && !this.bS()) {
            var1 = qh.c(this.s);
            var2 = qh.c(this.t + 0.5D);
            var3 = qh.c(this.u);
            int var10 = this.Z.nextInt(6);
            aji var11 = this.o.a(var1 + q.b[var10], var2 + q.c[var10], var3 + q.d[var10]);
            var6 = this.o.e(var1 + q.b[var10], var2 + q.c[var10], var3 + q.d[var10]);
            if(amb.a(var11)) {
               this.o.d(var1 + q.b[var10], var2 + q.c[var10], var3 + q.d[var10], ajn.aU, amb.a(var11, var6), 3);
               this.s();
               this.B();
            } else {
               this.bQ();
            }
         } else if(this.bm != null && !this.bS()) {
            this.bm = null;
         }

      }
   }

   public float a(int var1, int var2, int var3) {
      return this.o.a(var1, var2 - 1, var3) == ajn.b?10.0F:super.a(var1, var2, var3);
   }

   protected boolean j_() {
      return true;
   }

   public boolean by() {
      if(super.by()) {
         yz var1 = this.o.a(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public sz bd() {
      return sz.c;
   }
}
