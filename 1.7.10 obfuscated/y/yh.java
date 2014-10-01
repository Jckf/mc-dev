import java.util.List;
import java.util.UUID;

public class yh extends yq {

   private static final UUID bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final tj br = (new tj(bq, "Attacking speed boost", 0.45D, 0)).a(false);
   private int bs;
   private int bt;
   private sa bu;


   public yh(ahb var1) {
      super(var1);
      this.ae = true;
   }

   protected void aD() {
      super.aD();
      this.a(bp).a(0.0D);
      this.a(yj.d).a(0.5D);
      this.a(yj.e).a(5.0D);
   }

   protected boolean bk() {
      return false;
   }

   public void h() {
      if(this.bu != this.bm && !this.o.E) {
         ti var1 = this.a(yj.d);
         var1.b(br);
         if(this.bm != null) {
            var1.a(br);
         }
      }

      this.bu = this.bm;
      if(this.bt > 0 && --this.bt == 0) {
         this.a("mob.zombiepig.zpigangry", this.bf() * 2.0F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.h();
   }

   public boolean by() {
      return this.o.r != rd.a && this.o.b(this.C) && this.o.a((sa)this, this.C).isEmpty() && !this.o.d(this.C);
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("Anger", (short)this.bs);
   }

   public void a(dh var1) {
      super.a(var1);
      this.bs = var1.e("Anger");
   }

   protected sa bR() {
      return this.bs == 0?null:super.bR();
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         sa var3 = var1.j();
         if(var3 instanceof yz) {
            List var4 = this.o.b((sa)this, this.C.b(32.0D, 32.0D, 32.0D));

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               sa var6 = (sa)var4.get(var5);
               if(var6 instanceof yh) {
                  yh var7 = (yh)var6;
                  var7.c(var3);
               }
            }

            this.c(var3);
         }

         return super.a(var1, var2);
      }
   }

   private void c(sa var1) {
      this.bm = var1;
      this.bs = 400 + this.Z.nextInt(400);
      this.bt = this.Z.nextInt(40);
   }

   protected String t() {
      return "mob.zombiepig.zpig";
   }

   protected String aT() {
      return "mob.zombiepig.zpighurt";
   }

   protected String aU() {
      return "mob.zombiepig.zpigdeath";
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.Z.nextInt(2 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.bh, 1);
      }

      var3 = this.Z.nextInt(2 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.a(ade.bl, 1);
      }

   }

   public boolean a(yz var1) {
      return false;
   }

   protected void n(int var1) {
      this.a(ade.k, 1);
   }

   protected void bC() {
      this.c(0, new add(ade.B));
   }

   public sy a(sy var1) {
      super.a(var1);
      this.j(false);
      return var1;
   }

}
