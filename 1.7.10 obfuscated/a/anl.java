import java.util.Iterator;
import java.util.Random;

public class anl extends ajc {

   protected anl() {
      super(awt.q);
      this.a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   public int b() {
      return -1;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 7;
      switch(var5) {
      case 1:
      default:
         this.a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
         break;
      case 2:
         this.a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
         break;
      case 3:
         this.a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
         break;
      case 4:
         this.a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
         break;
      case 5:
         this.a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = qh.c((double)(var5.y * 4.0F / 360.0F) + 2.5D) & 3;
      var1.a(var2, var3, var4, var7, 2);
   }

   public aor a(ahb var1, int var2) {
      return new apn();
   }

   public int k(ahb var1, int var2, int var3, int var4) {
      aor var5 = var1.o(var2, var3, var4);
      return var5 != null && var5 instanceof apn?((apn)var5).b():super.k(var1, var2, var3, var4);
   }

   public int a(int var1) {
      return var1;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {}

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(var6.bE.d) {
         var5 |= 8;
         var1.a(var2, var3, var4, var5, 4);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(!var1.E) {
         if((var6 & 8) == 0) {
            add var7 = new add(ade.bL, 1, this.k(var1, var2, var3, var4));
            apn var8 = (apn)var1.o(var2, var3, var4);
            if(var8.b() == 3 && var8.a() != null) {
               var7.d(new dh());
               dh var9 = new dh();
               dv.a(var9, var8.a());
               var7.q().a("SkullOwner", (dy)var9);
            }

            this.a(var1, var2, var3, var4, var7);
         }

         super.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.bL;
   }

   public void a(ahb var1, int var2, int var3, int var4, apn var5) {
      if(var5.b() == 1 && var3 >= 2 && var1.r != rd.a && !var1.E) {
         int var6;
         xc var7;
         Iterator var8;
         yz var9;
         int var10;
         for(var6 = -2; var6 <= 0; ++var6) {
            if(var1.a(var2, var3 - 1, var4 + var6) == ajn.aM && var1.a(var2, var3 - 1, var4 + var6 + 1) == ajn.aM && var1.a(var2, var3 - 2, var4 + var6 + 1) == ajn.aM && var1.a(var2, var3 - 1, var4 + var6 + 2) == ajn.aM && this.a(var1, var2, var3, var4 + var6, 1) && this.a(var1, var2, var3, var4 + var6 + 1, 1) && this.a(var1, var2, var3, var4 + var6 + 2, 1)) {
               var1.a(var2, var3, var4 + var6, 8, 2);
               var1.a(var2, var3, var4 + var6 + 1, 8, 2);
               var1.a(var2, var3, var4 + var6 + 2, 8, 2);
               var1.d(var2, var3, var4 + var6, e(0), 0, 2);
               var1.d(var2, var3, var4 + var6 + 1, e(0), 0, 2);
               var1.d(var2, var3, var4 + var6 + 2, e(0), 0, 2);
               var1.d(var2, var3 - 1, var4 + var6, e(0), 0, 2);
               var1.d(var2, var3 - 1, var4 + var6 + 1, e(0), 0, 2);
               var1.d(var2, var3 - 1, var4 + var6 + 2, e(0), 0, 2);
               var1.d(var2, var3 - 2, var4 + var6 + 1, e(0), 0, 2);
               if(!var1.E) {
                  var7 = new xc(var1);
                  var7.b((double)var2 + 0.5D, (double)var3 - 1.45D, (double)(var4 + var6) + 1.5D, 90.0F, 0.0F);
                  var7.aM = 90.0F;
                  var7.bZ();
                  if(!var1.E) {
                     var8 = var1.a(yz.class, var7.C.b(50.0D, 50.0D, 50.0D)).iterator();

                     while(var8.hasNext()) {
                        var9 = (yz)var8.next();
                        var9.a((ph)pc.I);
                     }
                  }

                  var1.d((sa)var7);
               }

               for(var10 = 0; var10 < 120; ++var10) {
                  var1.a("snowballpoof", (double)var2 + var1.s.nextDouble(), (double)(var3 - 2) + var1.s.nextDouble() * 3.9D, (double)(var4 + var6 + 1) + var1.s.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.c(var2, var3, var4 + var6, e(0));
               var1.c(var2, var3, var4 + var6 + 1, e(0));
               var1.c(var2, var3, var4 + var6 + 2, e(0));
               var1.c(var2, var3 - 1, var4 + var6, e(0));
               var1.c(var2, var3 - 1, var4 + var6 + 1, e(0));
               var1.c(var2, var3 - 1, var4 + var6 + 2, e(0));
               var1.c(var2, var3 - 2, var4 + var6 + 1, e(0));
               return;
            }
         }

         for(var6 = -2; var6 <= 0; ++var6) {
            if(var1.a(var2 + var6, var3 - 1, var4) == ajn.aM && var1.a(var2 + var6 + 1, var3 - 1, var4) == ajn.aM && var1.a(var2 + var6 + 1, var3 - 2, var4) == ajn.aM && var1.a(var2 + var6 + 2, var3 - 1, var4) == ajn.aM && this.a(var1, var2 + var6, var3, var4, 1) && this.a(var1, var2 + var6 + 1, var3, var4, 1) && this.a(var1, var2 + var6 + 2, var3, var4, 1)) {
               var1.a(var2 + var6, var3, var4, 8, 2);
               var1.a(var2 + var6 + 1, var3, var4, 8, 2);
               var1.a(var2 + var6 + 2, var3, var4, 8, 2);
               var1.d(var2 + var6, var3, var4, e(0), 0, 2);
               var1.d(var2 + var6 + 1, var3, var4, e(0), 0, 2);
               var1.d(var2 + var6 + 2, var3, var4, e(0), 0, 2);
               var1.d(var2 + var6, var3 - 1, var4, e(0), 0, 2);
               var1.d(var2 + var6 + 1, var3 - 1, var4, e(0), 0, 2);
               var1.d(var2 + var6 + 2, var3 - 1, var4, e(0), 0, 2);
               var1.d(var2 + var6 + 1, var3 - 2, var4, e(0), 0, 2);
               if(!var1.E) {
                  var7 = new xc(var1);
                  var7.b((double)(var2 + var6) + 1.5D, (double)var3 - 1.45D, (double)var4 + 0.5D, 0.0F, 0.0F);
                  var7.bZ();
                  if(!var1.E) {
                     var8 = var1.a(yz.class, var7.C.b(50.0D, 50.0D, 50.0D)).iterator();

                     while(var8.hasNext()) {
                        var9 = (yz)var8.next();
                        var9.a((ph)pc.I);
                     }
                  }

                  var1.d((sa)var7);
               }

               for(var10 = 0; var10 < 120; ++var10) {
                  var1.a("snowballpoof", (double)(var2 + var6 + 1) + var1.s.nextDouble(), (double)(var3 - 2) + var1.s.nextDouble() * 3.9D, (double)var4 + var1.s.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.c(var2 + var6, var3, var4, e(0));
               var1.c(var2 + var6 + 1, var3, var4, e(0));
               var1.c(var2 + var6 + 2, var3, var4, e(0));
               var1.c(var2 + var6, var3 - 1, var4, e(0));
               var1.c(var2 + var6 + 1, var3 - 1, var4, e(0));
               var1.c(var2 + var6 + 2, var3 - 1, var4, e(0));
               var1.c(var2 + var6 + 1, var3 - 2, var4, e(0));
               return;
            }
         }
      }

   }

   private boolean a(ahb var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) != this) {
         return false;
      } else {
         aor var6 = var1.o(var2, var3, var4);
         return var6 != null && var6 instanceof apn?((apn)var6).b() == var5:false;
      }
   }
}
