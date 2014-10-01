import java.util.Arrays;
import java.util.Random;

public class ail extends ahu {

   private byte[] aC;
   private long aD;
   private awl aE;
   private awl aF;
   private awl aG;
   private boolean aH;
   private boolean aI;


   public ail(int var1, boolean var2, boolean var3) {
      super(var1);
      this.aH = var2;
      this.aI = var3;
      this.b();
      this.a(2.0F, 0.0F);
      this.at.clear();
      this.ai = ajn.m;
      this.aj = 1;
      this.ak = ajn.ce;
      this.ar.x = -999;
      this.ar.A = 20;
      this.ar.C = 3;
      this.ar.D = 5;
      this.ar.y = 0;
      this.at.clear();
      if(var3) {
         this.ar.x = 5;
      }

   }

   public arc a(Random var1) {
      return this.az;
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      if(this.aC == null || this.aD != var1.H()) {
         this.a(var1.H());
      }

      if(this.aE == null || this.aF == null || this.aD != var1.H()) {
         Random var9 = new Random(this.aD);
         this.aE = new awl(var9, 4);
         this.aF = new awl(var9, 1);
      }

      this.aD = var1.H();
      double var25 = 0.0D;
      int var11;
      int var12;
      if(this.aH) {
         var11 = (var5 & -16) + (var6 & 15);
         var12 = (var6 & -16) + (var5 & 15);
         double var13 = Math.min(Math.abs(var7), this.aE.a((double)var11 * 0.25D, (double)var12 * 0.25D));
         if(var13 > 0.0D) {
            double var15 = 0.001953125D;
            double var17 = Math.abs(this.aF.a((double)var11 * var15, (double)var12 * var15));
            var25 = var13 * var13 * 2.5D;
            double var19 = Math.ceil(var17 * 50.0D) + 14.0D;
            if(var25 > var19) {
               var25 = var19;
            }

            var25 += 64.0D;
         }
      }

      var11 = var5 & 15;
      var12 = var6 & 15;
      boolean var26 = true;
      aji var14 = ajn.ce;
      aji var27 = this.ak;
      int var16 = (int)(var7 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      boolean var28 = Math.cos(var7 / 3.0D * 3.141592653589793D) > 0.0D;
      int var18 = -1;
      boolean var29 = false;
      int var20 = var3.length / 256;

      for(int var21 = 255; var21 >= 0; --var21) {
         int var22 = (var12 * 16 + var11) * var20 + var21;
         if((var3[var22] == null || var3[var22].o() == awt.a) && var21 < (int)var25) {
            var3[var22] = ajn.b;
         }

         if(var21 <= 0 + var2.nextInt(5)) {
            var3[var22] = ajn.h;
         } else {
            aji var23 = var3[var22];
            if(var23 != null && var23.o() != awt.a) {
               if(var23 == ajn.b) {
                  byte var24;
                  if(var18 == -1) {
                     var29 = false;
                     if(var16 <= 0) {
                        var14 = null;
                        var27 = ajn.b;
                     } else if(var21 >= 59 && var21 <= 64) {
                        var14 = ajn.ce;
                        var27 = this.ak;
                     }

                     if(var21 < 63 && (var14 == null || var14.o() == awt.a)) {
                        var14 = ajn.j;
                     }

                     var18 = var16 + Math.max(0, var21 - 63);
                     if(var21 >= 62) {
                        if(this.aI && var21 > 86 + var16 * 2) {
                           if(var28) {
                              var3[var22] = ajn.d;
                              var4[var22] = 1;
                           } else {
                              var3[var22] = ajn.c;
                           }
                        } else if(var21 > 66 + var16) {
                           var24 = 16;
                           if(var21 >= 64 && var21 <= 127) {
                              if(!var28) {
                                 var24 = this.d(var5, var21, var6);
                              }
                           } else {
                              var24 = 1;
                           }

                           if(var24 < 16) {
                              var3[var22] = ajn.ce;
                              var4[var22] = (byte)var24;
                           } else {
                              var3[var22] = ajn.ch;
                           }
                        } else {
                           var3[var22] = this.ai;
                           var4[var22] = (byte)this.aj;
                           var29 = true;
                        }
                     } else {
                        var3[var22] = var27;
                        if(var27 == ajn.ce) {
                           var4[var22] = 1;
                        }
                     }
                  } else if(var18 > 0) {
                     --var18;
                     if(var29) {
                        var3[var22] = ajn.ce;
                        var4[var22] = 1;
                     } else {
                        var24 = this.d(var5, var21, var6);
                        if(var24 < 16) {
                           var3[var22] = ajn.ce;
                           var4[var22] = var24;
                        } else {
                           var3[var22] = ajn.ch;
                        }
                     }
                  }
               }
            } else {
               var18 = -1;
            }
         }
      }

   }

   private void a(long var1) {
      this.aC = new byte[64];
      Arrays.fill(this.aC, (byte)16);
      Random var3 = new Random(var1);
      this.aG = new awl(var3, 1);

      int var4;
      for(var4 = 0; var4 < 64; ++var4) {
         var4 += var3.nextInt(5) + 1;
         if(var4 < 64) {
            this.aC[var4] = 1;
         }
      }

      var4 = var3.nextInt(4) + 2;

      int var5;
      int var6;
      int var7;
      int var8;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3.nextInt(3) + 1;
         var7 = var3.nextInt(64);

         for(var8 = 0; var7 + var8 < 64 && var8 < var6; ++var8) {
            this.aC[var7 + var8] = 4;
         }
      }

      var5 = var3.nextInt(4) + 2;

      int var9;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var3.nextInt(3) + 2;
         var8 = var3.nextInt(64);

         for(var9 = 0; var8 + var9 < 64 && var9 < var7; ++var9) {
            this.aC[var8 + var9] = 12;
         }
      }

      var6 = var3.nextInt(4) + 2;

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var3.nextInt(3) + 1;
         var9 = var3.nextInt(64);

         for(int var10 = 0; var9 + var10 < 64 && var10 < var8; ++var10) {
            this.aC[var9 + var10] = 14;
         }
      }

      var7 = var3.nextInt(3) + 3;
      var8 = 0;

      for(var9 = 0; var9 < var7; ++var9) {
         byte var12 = 1;
         var8 += var3.nextInt(16) + 4;

         for(int var11 = 0; var8 + var11 < 64 && var11 < var12; ++var11) {
            this.aC[var8 + var11] = 0;
            if(var8 + var11 > 1 && var3.nextBoolean()) {
               this.aC[var8 + var11 - 1] = 8;
            }

            if(var8 + var11 < 63 && var3.nextBoolean()) {
               this.aC[var8 + var11 + 1] = 8;
            }
         }
      }

   }

   private byte d(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.aG.a((double)var1 * 1.0D / 512.0D, (double)var1 * 1.0D / 512.0D) * 2.0D);
      return this.aC[(var2 + var4 + 64) % 64];
   }

   protected ahu k() {
      boolean var1 = this.ay == ahu.Z.ay;
      ail var2 = new ail(this.ay + 128, var1, this.aI);
      if(!var1) {
         var2.a(g);
         var2.a(this.af + " M");
      } else {
         var2.a(this.af + " (Bryce)");
      }

      var2.a(this.ag, true);
      return var2;
   }
}
