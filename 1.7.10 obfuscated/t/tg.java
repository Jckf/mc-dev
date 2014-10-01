import java.util.UUID;

public abstract class tg extends wf implements ta {

   protected vh bp = new vh(this);


   public tg(ahb var1) {
      super(var1);
   }

   protected void c() {
      super.c();
      this.af.a(16, Byte.valueOf((byte)0));
      this.af.a(17, "");
   }

   public void b(dh var1) {
      super.b(var1);
      if(this.b() == null) {
         var1.a("OwnerUUID", "");
      } else {
         var1.a("OwnerUUID", this.b());
      }

      var1.a("Sitting", this.ca());
   }

   public void a(dh var1) {
      super.a(var1);
      String var2 = "";
      if(var1.b("OwnerUUID", 8)) {
         var2 = var1.j("OwnerUUID");
      } else {
         String var3 = var1.j("Owner");
         var2 = nz.a(var3);
      }

      if(var2.length() > 0) {
         this.b(var2);
         this.j(true);
      }

      this.bp.a(var1.n("Sitting"));
      this.k(var1.n("Sitting"));
   }

   protected void i(boolean var1) {
      String var2 = "heart";
      if(!var1) {
         var2 = "smoke";
      }

      for(int var3 = 0; var3 < 7; ++var3) {
         double var4 = this.Z.nextGaussian() * 0.02D;
         double var6 = this.Z.nextGaussian() * 0.02D;
         double var8 = this.Z.nextGaussian() * 0.02D;
         this.o.a(var2, this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + 0.5D + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, var4, var6, var8);
      }

   }

   public boolean bZ() {
      return (this.af.a(16) & 4) != 0;
   }

   public void j(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 4)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -5)));
      }

   }

   public boolean ca() {
      return (this.af.a(16) & 1) != 0;
   }

   public void k(boolean var1) {
      byte var2 = this.af.a(16);
      if(var1) {
         this.af.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.af.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public String b() {
      return this.af.e(17);
   }

   public void b(String var1) {
      this.af.b(17, var1);
   }

   public sv cb() {
      try {
         UUID var1 = UUID.fromString(this.b());
         return var1 == null?null:this.o.a(var1);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   public boolean e(sv var1) {
      return var1 == this.cb();
   }

   public vh cc() {
      return this.bp;
   }

   public boolean a(sv var1, sv var2) {
      return true;
   }

   public bae bt() {
      if(this.bZ()) {
         sv var1 = this.cb();
         if(var1 != null) {
            return var1.bt();
         }
      }

      return super.bt();
   }

   public boolean c(sv var1) {
      if(this.bZ()) {
         sv var2 = this.cb();
         if(var1 == var2) {
            return true;
         }

         if(var2 != null) {
            return var2.c(var1);
         }
      }

      return super.c(var1);
   }

   // $FF: synthetic method
   public sa i_() {
      return this.cb();
   }
}
