import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class yp extends yg implements yi {

   private static final UUID bp = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final tj bq = (new tj(bp, "Drinking speed penalty", -0.25D, 0)).a(false);
   private static final adb[] br = new adb[]{ade.aO, ade.aT, ade.ax, ade.bp, ade.bo, ade.H, ade.y, ade.y};
   private int bs;


   public yp(ahb var1) {
      super(var1);
      this.c.a(1, new uf(this));
      this.c.a(2, new vd(this, 1.0D, 60, 10.0F));
      this.c.a(2, new vc(this, 1.0D));
      this.c.a(3, new un(this, yz.class, 8.0F));
      this.c.a(3, new vb(this));
      this.d.a(1, new vn(this, false));
      this.d.a(2, new vo(this, yz.class, 0, true));
   }

   protected void c() {
      super.c();
      this.z().a(21, Byte.valueOf((byte)0));
   }

   protected String t() {
      return "mob.witch.idle";
   }

   protected String aT() {
      return "mob.witch.hurt";
   }

   protected String aU() {
      return "mob.witch.death";
   }

   public void a(boolean var1) {
      this.z().b(21, Byte.valueOf((byte)(var1?1:0)));
   }

   public boolean bZ() {
      return this.z().a(21) == 1;
   }

   protected void aD() {
      super.aD();
      this.a(yj.a).a(26.0D);
      this.a(yj.d).a(0.25D);
   }

   public boolean bk() {
      return true;
   }

   public void e() {
      if(!this.o.E) {
         if(this.bZ()) {
            if(this.bs-- <= 0) {
               this.a(false);
               add var1 = this.be();
               this.c(0, (add)null);
               if(var1 != null && var1.b() == ade.bn) {
                  List var2 = ade.bn.g(var1);
                  if(var2 != null) {
                     Iterator var3 = var2.iterator();

                     while(var3.hasNext()) {
                        rw var4 = (rw)var3.next();
                        this.c(new rw(var4));
                     }
                  }
               }

               this.a(yj.d).b(bq);
            }
         } else {
            short var5 = -1;
            if(this.Z.nextFloat() < 0.15F && this.a(awt.h) && !this.a(rv.o)) {
               var5 = 8237;
            } else if(this.Z.nextFloat() < 0.15F && this.al() && !this.a(rv.n)) {
               var5 = 16307;
            } else if(this.Z.nextFloat() < 0.05F && this.aS() < this.aY()) {
               var5 = 16341;
            } else if(this.Z.nextFloat() < 0.25F && this.o() != null && !this.a(rv.c) && this.o().f(this) > 121.0D) {
               var5 = 16274;
            } else if(this.Z.nextFloat() < 0.25F && this.o() != null && !this.a(rv.c) && this.o().f(this) > 121.0D) {
               var5 = 16274;
            }

            if(var5 > -1) {
               this.c(0, new add(ade.bn, 1, var5));
               this.bs = this.be().n();
               this.a(true);
               ti var6 = this.a(yj.d);
               var6.b(bq);
               var6.a(bq);
            }
         }

         if(this.Z.nextFloat() < 7.5E-4F) {
            this.o.a(this, (byte)15);
         }
      }

      super.e();
   }

   protected float c(ro var1, float var2) {
      var2 = super.c(var1, var2);
      if(var1.j() == this) {
         var2 = 0.0F;
      }

      if(var1.s()) {
         var2 = (float)((double)var2 * 0.15D);
      }

      return var2;
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(3) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.Z.nextInt(3);
         adb var6 = br[this.Z.nextInt(br.length)];
         if(var2 > 0) {
            var5 += this.Z.nextInt(var2 + 1);
         }

         for(int var7 = 0; var7 < var5; ++var7) {
            this.a(var6, 1);
         }
      }

   }

   public void a(sv var1, float var2) {
      if(!this.bZ()) {
         zo var3 = new zo(this.o, this, 32732);
         var3.z -= -20.0F;
         double var4 = var1.s + var1.v - this.s;
         double var6 = var1.t + (double)var1.g() - 1.100000023841858D - this.t;
         double var8 = var1.u + var1.x - this.u;
         float var10 = qh.a(var4 * var4 + var8 * var8);
         if(var10 >= 8.0F && !var1.a(rv.d)) {
            var3.a(32698);
         } else if(var1.aS() >= 8.0F && !var1.a(rv.u)) {
            var3.a(32660);
         } else if(var10 <= 3.0F && !var1.a(rv.t) && this.Z.nextFloat() < 0.25F) {
            var3.a(32696);
         }

         var3.c(var4, var6 + (double)(var10 * 0.2F), var8, 0.75F, 8.0F);
         this.o.d((sa)var3);
      }
   }

}
