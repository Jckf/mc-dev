import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zu extends zs {

   private static final Logger f = LogManager.getLogger();
   private rb g = new aaw();
   private rb h = new zv(this, "Repair", true, 2);
   private ahb i;
   private int j;
   private int k;
   private int l;
   public int a;
   private int m;
   private String n;
   private final yz o;


   public zu(yx var1, ahb var2, int var3, int var4, int var5, yz var6) {
      this.i = var2;
      this.j = var3;
      this.k = var4;
      this.l = var5;
      this.o = var6;
      this.a(new aay(this.h, 0, 27, 47));
      this.a(new aay(this.h, 1, 76, 47));
      this.a((aay)(new zw(this, this.g, 2, 134, 47, var2, var3, var4, var5)));

      int var7;
      for(var7 = 0; var7 < 3; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.a(new aay(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for(var7 = 0; var7 < 9; ++var7) {
         this.a(new aay(var1, var7, 8 + var7 * 18, 142));
      }

   }

   public void a(rb var1) {
      super.a(var1);
      if(var1 == this.h) {
         this.e();
      }

   }

   public void e() {
      add var1 = this.h.a(0);
      this.a = 0;
      int var2 = 0;
      byte var3 = 0;
      int var4 = 0;
      if(var1 == null) {
         this.g.a(0, (add)null);
         this.a = 0;
      } else {
         add var5 = var1.m();
         add var6 = this.h.a(1);
         Map var7 = afv.a(var5);
         boolean var8 = false;
         int var19 = var3 + var1.C() + (var6 == null?0:var6.C());
         this.m = 0;
         int var9;
         int var10;
         int var11;
         int var13;
         int var14;
         Iterator var21;
         aft var22;
         if(var6 != null) {
            var8 = var6.b() == ade.bR && ade.bR.g(var6).c() > 0;
            if(var5.g() && var5.b().a(var1, var6)) {
               var9 = Math.min(var5.j(), var5.l() / 4);
               if(var9 <= 0) {
                  this.g.a(0, (add)null);
                  this.a = 0;
                  return;
               }

               for(var10 = 0; var9 > 0 && var10 < var6.b; ++var10) {
                  var11 = var5.j() - var9;
                  var5.b(var11);
                  var2 += Math.max(1, var9 / 100) + var7.size();
                  var9 = Math.min(var5.j(), var5.l() / 4);
               }

               this.m = var10;
            } else {
               if(!var8 && (var5.b() != var6.b() || !var5.g())) {
                  this.g.a(0, (add)null);
                  this.a = 0;
                  return;
               }

               if(var5.g() && !var8) {
                  var9 = var1.l() - var1.j();
                  var10 = var6.l() - var6.j();
                  var11 = var10 + var5.l() * 12 / 100;
                  int var12 = var9 + var11;
                  var13 = var5.l() - var12;
                  if(var13 < 0) {
                     var13 = 0;
                  }

                  if(var13 < var5.k()) {
                     var5.b(var13);
                     var2 += Math.max(1, var11 / 100);
                  }
               }

               Map var20 = afv.a(var6);
               var21 = var20.keySet().iterator();

               while(var21.hasNext()) {
                  var11 = ((Integer)var21.next()).intValue();
                  var22 = aft.b[var11];
                  var13 = var7.containsKey(Integer.valueOf(var11))?((Integer)var7.get(Integer.valueOf(var11))).intValue():0;
                  var14 = ((Integer)var20.get(Integer.valueOf(var11))).intValue();
                  int var10000;
                  if(var13 == var14) {
                     ++var14;
                     var10000 = var14;
                  } else {
                     var10000 = Math.max(var14, var13);
                  }

                  var14 = var10000;
                  int var15 = var14 - var13;
                  boolean var16 = var22.a(var1);
                  if(this.o.bE.d || var1.b() == ade.bR) {
                     var16 = true;
                  }

                  Iterator var17 = var7.keySet().iterator();

                  while(var17.hasNext()) {
                     int var18 = ((Integer)var17.next()).intValue();
                     if(var18 != var11 && !var22.a(aft.b[var18])) {
                        var16 = false;
                        var2 += var15;
                     }
                  }

                  if(var16) {
                     if(var14 > var22.b()) {
                        var14 = var22.b();
                     }

                     var7.put(Integer.valueOf(var11), Integer.valueOf(var14));
                     int var23 = 0;
                     switch(var22.c()) {
                     case 1:
                        var23 = 8;
                        break;
                     case 2:
                        var23 = 4;
                     case 3:
                     case 4:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     default:
                        break;
                     case 5:
                        var23 = 2;
                        break;
                     case 10:
                        var23 = 1;
                     }

                     if(var8) {
                        var23 = Math.max(1, var23 / 2);
                     }

                     var2 += var23 * var15;
                  }
               }
            }
         }

         if(StringUtils.isBlank(this.n)) {
            if(var1.u()) {
               var4 = var1.g()?7:var1.b * 5;
               var2 += var4;
               var5.t();
            }
         } else if(!this.n.equals(var1.s())) {
            var4 = var1.g()?7:var1.b * 5;
            var2 += var4;
            if(var1.u()) {
               var19 += var4 / 2;
            }

            var5.c(this.n);
         }

         var9 = 0;

         for(var21 = var7.keySet().iterator(); var21.hasNext(); var19 += var9 + var13 * var14) {
            var11 = ((Integer)var21.next()).intValue();
            var22 = aft.b[var11];
            var13 = ((Integer)var7.get(Integer.valueOf(var11))).intValue();
            var14 = 0;
            ++var9;
            switch(var22.c()) {
            case 1:
               var14 = 8;
               break;
            case 2:
               var14 = 4;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 5:
               var14 = 2;
               break;
            case 10:
               var14 = 1;
            }

            if(var8) {
               var14 = Math.max(1, var14 / 2);
            }
         }

         if(var8) {
            var19 = Math.max(1, var19 / 2);
         }

         this.a = var19 + var2;
         if(var2 <= 0) {
            var5 = null;
         }

         if(var4 == var2 && var4 > 0 && this.a >= 40) {
            this.a = 39;
         }

         if(this.a >= 40 && !this.o.bE.d) {
            var5 = null;
         }

         if(var5 != null) {
            var10 = var5.C();
            if(var6 != null && var10 < var6.C()) {
               var10 = var6.C();
            }

            if(var5.u()) {
               var10 -= 9;
            }

            if(var10 < 0) {
               var10 = 0;
            }

            var10 += 2;
            var5.c(var10);
            afv.a(var7, var5);
         }

         this.g.a(0, var5);
         this.b();
      }
   }

   public void a(aac var1) {
      super.a(var1);
      var1.a(this, 0, this.a);
   }

   public void b(yz var1) {
      super.b(var1);
      if(!this.i.E) {
         for(int var2 = 0; var2 < this.h.a(); ++var2) {
            add var3 = this.h.a_(var2);
            if(var3 != null) {
               var1.a(var3, false);
            }
         }

      }
   }

   public boolean a(yz var1) {
      return this.i.a(this.j, this.k, this.l) != ajn.bQ?false:var1.e((double)this.j + 0.5D, (double)this.k + 0.5D, (double)this.l + 0.5D) <= 64.0D;
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if(var2 == 2) {
            if(!this.a(var5, 3, 39, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(var2 != 0 && var2 != 1) {
            if(var2 >= 3 && var2 < 39 && !this.a(var5, 0, 2, false)) {
               return null;
            }
         } else if(!this.a(var5, 3, 39, false)) {
            return null;
         }

         if(var5.b == 0) {
            var4.c((add)null);
         } else {
            var4.f();
         }

         if(var5.b == var3.b) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }

   public void a(String var1) {
      this.n = var1;
      if(this.a(2).e()) {
         add var2 = this.a(2).d();
         if(StringUtils.isBlank(var1)) {
            var2.t();
         } else {
            var2.c(this.n);
         }
      }

      this.e();
   }

   // $FF: synthetic method
   static rb a(zu var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int b(zu var0) {
      return var0.m;
   }

}
