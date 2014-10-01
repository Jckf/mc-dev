import java.util.List;

public abstract class wf extends rx implements ry {

   private int bp;
   private int bq;
   private yz br;


   public wf(ahb var1) {
      super(var1);
   }

   protected void bp() {
      if(this.d() != 0) {
         this.bp = 0;
      }

      super.bp();
   }

   public void e() {
      super.e();
      if(this.d() != 0) {
         this.bp = 0;
      }

      if(this.bp > 0) {
         --this.bp;
         String var1 = "heart";
         if(this.bp % 10 == 0) {
            double var2 = this.Z.nextGaussian() * 0.02D;
            double var4 = this.Z.nextGaussian() * 0.02D;
            double var6 = this.Z.nextGaussian() * 0.02D;
            this.o.a(var1, this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + 0.5D + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, var2, var4, var6);
         }
      } else {
         this.bq = 0;
      }

   }

   protected void a(sa var1, float var2) {
      if(var1 instanceof yz) {
         if(var2 < 3.0F) {
            double var3 = var1.s - this.s;
            double var5 = var1.u - this.u;
            this.y = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.bn = true;
         }

         yz var7 = (yz)var1;
         if(var7.bF() == null || !this.c(var7.bF())) {
            this.bm = null;
         }
      } else if(var1 instanceof wf) {
         wf var8 = (wf)var1;
         if(this.d() > 0 && var8.d() < 0) {
            if((double)var2 < 2.5D) {
               this.bn = true;
            }
         } else if(this.bp > 0 && var8.bp > 0) {
            if(var8.bm == null) {
               var8.bm = this;
            }

            if(var8.bm == this && (double)var2 < 3.5D) {
               ++var8.bp;
               ++this.bp;
               ++this.bq;
               if(this.bq % 4 == 0) {
                  this.o.a("heart", this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + 0.5D + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, 0.0D, 0.0D, 0.0D);
               }

               if(this.bq == 60) {
                  this.b((wf)var1);
               }
            } else {
               this.bq = 0;
            }
         } else {
            this.bq = 0;
            this.bm = null;
         }
      }

   }

   private void b(wf var1) {
      rx var2 = this.a((rx)var1);
      if(var2 != null) {
         if(this.br == null && var1.cd() != null) {
            this.br = var1.cd();
         }

         if(this.br != null) {
            this.br.a(pp.x);
            if(this instanceof wh) {
               this.br.a((ph)pc.H);
            }
         }

         this.c(6000);
         var1.c(6000);
         this.bp = 0;
         this.bq = 0;
         this.bm = null;
         var1.bm = null;
         var1.bq = 0;
         var1.bp = 0;
         var2.c(-24000);
         var2.b(this.s, this.t, this.u, this.y, this.z);

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.Z.nextGaussian() * 0.02D;
            double var6 = this.Z.nextGaussian() * 0.02D;
            double var8 = this.Z.nextGaussian() * 0.02D;
            this.o.a("heart", this.s + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + 0.5D + (double)(this.Z.nextFloat() * this.N), this.u + (double)(this.Z.nextFloat() * this.M * 2.0F) - (double)this.M, var4, var6, var8);
         }

         this.o.d((sa)var2);
      }

   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         this.bo = 60;
         if(!this.bk()) {
            ti var3 = this.a(yj.d);
            if(var3.a(h) == null) {
               var3.a(i);
            }
         }

         this.bm = null;
         this.bp = 0;
         return super.a(var1, var2);
      }
   }

   public float a(int var1, int var2, int var3) {
      return this.o.a(var1, var2 - 1, var3) == ajn.c?10.0F:this.o.n(var1, var2, var3) - 0.5F;
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("InLove", this.bp);
   }

   public void a(dh var1) {
      super.a(var1);
      this.bp = var1.f("InLove");
   }

   protected sa bR() {
      if(this.bo > 0) {
         return null;
      } else {
         float var1 = 8.0F;
         List var2;
         int var3;
         wf var4;
         if(this.bp > 0) {
            var2 = this.o.a(this.getClass(), this.C.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (wf)var2.get(var3);
               if(var4 != this && var4.bp > 0) {
                  return var4;
               }
            }
         } else if(this.d() == 0) {
            var2 = this.o.a(yz.class, this.C.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               yz var5 = (yz)var2.get(var3);
               if(var5.bF() != null && this.c(var5.bF())) {
                  return var5;
               }
            }
         } else if(this.d() > 0) {
            var2 = this.o.a(this.getClass(), this.C.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (wf)var2.get(var3);
               if(var4 != this && var4.d() < 0) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public boolean by() {
      int var1 = qh.c(this.s);
      int var2 = qh.c(this.C.b);
      int var3 = qh.c(this.u);
      return this.o.a(var1, var2 - 1, var3) == ajn.c && this.o.j(var1, var2, var3) > 8 && super.by();
   }

   public int q() {
      return 120;
   }

   protected boolean v() {
      return false;
   }

   protected int e(yz var1) {
      return 1 + this.o.s.nextInt(3);
   }

   public boolean c(add var1) {
      return var1.b() == ade.O;
   }

   public boolean a(yz var1) {
      add var2 = var1.bm.h();
      if(var2 != null && this.c(var2) && this.d() == 0 && this.bp <= 0) {
         if(!var1.bE.d) {
            --var2.b;
            if(var2.b <= 0) {
               var1.bm.a(var1.bm.c, (add)null);
            }
         }

         this.f(var1);
         return true;
      } else {
         return super.a(var1);
      }
   }

   public void f(yz var1) {
      this.bp = 600;
      this.br = var1;
      this.bm = null;
      this.o.a(this, (byte)18);
   }

   public yz cd() {
      return this.br;
   }

   public boolean ce() {
      return this.bp > 0;
   }

   public void cf() {
      this.bp = 0;
   }

   public boolean a(wf var1) {
      return var1 == this?false:(var1.getClass() != this.getClass()?false:this.ce() && var1.ce());
   }
}
