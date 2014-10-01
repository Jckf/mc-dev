import java.util.ArrayList;

public class aey implements afg {

   private add a;


   public boolean a(aae var1, ahb var2) {
      this.a = null;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.a(); ++var9) {
         add var10 = var1.a(var9);
         if(var10 != null) {
            if(var10.b() == ade.H) {
               ++var4;
            } else if(var10.b() == ade.bQ) {
               ++var6;
            } else if(var10.b() == ade.aR) {
               ++var5;
            } else if(var10.b() == ade.aF) {
               ++var3;
            } else if(var10.b() == ade.aO) {
               ++var7;
            } else if(var10.b() == ade.i) {
               ++var7;
            } else if(var10.b() == ade.bz) {
               ++var8;
            } else if(var10.b() == ade.G) {
               ++var8;
            } else if(var10.b() == ade.bl) {
               ++var8;
            } else {
               if(var10.b() != ade.bL) {
                  return false;
               }

               ++var8;
            }
         }
      }

      var7 += var5 + var8;
      if(var4 <= 3 && var3 <= 1) {
         dh var16;
         dh var19;
         if(var4 >= 1 && var3 == 1 && var7 == 0) {
            this.a = new add(ade.bP);
            if(var6 > 0) {
               var16 = new dh();
               var19 = new dh();
               dq var23 = new dq();

               for(int var24 = 0; var24 < var1.a(); ++var24) {
                  add var26 = var1.a(var24);
                  if(var26 != null && var26.b() == ade.bQ && var26.p() && var26.q().b("Explosion", 10)) {
                     var23.a((dy)var26.q().m("Explosion"));
                  }
               }

               var19.a("Explosions", (dy)var23);
               var19.a("Flight", (byte)var4);
               var16.a("Fireworks", (dy)var19);
               this.a.d(var16);
            }

            return true;
         } else if(var4 == 1 && var3 == 0 && var6 == 0 && var5 > 0 && var8 <= 1) {
            this.a = new add(ade.bQ);
            var16 = new dh();
            var19 = new dh();
            byte var22 = 0;
            ArrayList var12 = new ArrayList();

            for(int var13 = 0; var13 < var1.a(); ++var13) {
               add var14 = var1.a(var13);
               if(var14 != null) {
                  if(var14.b() == ade.aR) {
                     var12.add(Integer.valueOf(acj.c[var14.k()]));
                  } else if(var14.b() == ade.aO) {
                     var19.a("Flicker", true);
                  } else if(var14.b() == ade.i) {
                     var19.a("Trail", true);
                  } else if(var14.b() == ade.bz) {
                     var22 = 1;
                  } else if(var14.b() == ade.G) {
                     var22 = 4;
                  } else if(var14.b() == ade.bl) {
                     var22 = 2;
                  } else if(var14.b() == ade.bL) {
                     var22 = 3;
                  }
               }
            }

            int[] var25 = new int[var12.size()];

            for(int var27 = 0; var27 < var25.length; ++var27) {
               var25[var27] = ((Integer)var12.get(var27)).intValue();
            }

            var19.a("Colors", var25);
            var19.a("Type", var22);
            var16.a("Explosion", (dy)var19);
            this.a.d(var16);
            return true;
         } else if(var4 == 0 && var3 == 0 && var6 == 1 && var5 > 0 && var5 == var7) {
            ArrayList var15 = new ArrayList();

            for(int var17 = 0; var17 < var1.a(); ++var17) {
               add var11 = var1.a(var17);
               if(var11 != null) {
                  if(var11.b() == ade.aR) {
                     var15.add(Integer.valueOf(acj.c[var11.k()]));
                  } else if(var11.b() == ade.bQ) {
                     this.a = var11.m();
                     this.a.b = 1;
                  }
               }
            }

            int[] var18 = new int[var15.size()];

            for(int var20 = 0; var20 < var18.length; ++var20) {
               var18[var20] = ((Integer)var15.get(var20)).intValue();
            }

            if(this.a != null && this.a.p()) {
               dh var21 = this.a.q().m("Explosion");
               if(var21 == null) {
                  return false;
               } else {
                  var21.a("FadeColors", var18);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public add a(aae var1) {
      return this.a.m();
   }

   public int a() {
      return 10;
   }

   public add b() {
      return this.a;
   }
}
