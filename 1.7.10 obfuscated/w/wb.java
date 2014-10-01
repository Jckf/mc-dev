import java.util.Iterator;
import java.util.List;

public class wb {

   private ahb a;
   private boolean b;
   private int c = -1;
   private int d;
   private int e;
   private vz f;
   private int g;
   private int h;
   private int i;


   public wb(ahb var1) {
      this.a = var1;
   }

   public void a() {
      boolean var1 = false;
      if(var1) {
         if(this.c == 2) {
            this.d = 100;
            return;
         }
      } else {
         if(this.a.w()) {
            this.c = 0;
            return;
         }

         if(this.c == 2) {
            return;
         }

         if(this.c == 0) {
            float var2 = this.a.c(0.0F);
            if((double)var2 < 0.5D || (double)var2 > 0.501D) {
               return;
            }

            this.c = this.a.s.nextInt(10) == 0?1:2;
            this.b = false;
            if(this.c == 2) {
               return;
            }
         }
      }

      if(!this.b) {
         if(!this.b()) {
            return;
         }

         this.b = true;
      }

      if(this.e > 0) {
         --this.e;
      } else {
         this.e = 2;
         if(this.d > 0) {
            this.c();
            --this.d;
         } else {
            this.c = 2;
         }

      }
   }

   private boolean b() {
      List var1 = this.a.h;
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         yz var3 = (yz)var2.next();
         this.f = this.a.A.a((int)var3.s, (int)var3.t, (int)var3.u, 1);
         if(this.f != null && this.f.c() >= 10 && this.f.d() >= 20 && this.f.e() >= 20) {
            r var4 = this.f.a();
            float var5 = (float)this.f.b();
            boolean var6 = false;
            int var7 = 0;

            while(true) {
               if(var7 < 10) {
                  this.g = var4.a + (int)((double)(qh.b(this.a.s.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  this.h = var4.b;
                  this.i = var4.c + (int)((double)(qh.a(this.a.s.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  var6 = false;
                  Iterator var8 = this.a.A.b().iterator();

                  while(var8.hasNext()) {
                     vz var9 = (vz)var8.next();
                     if(var9 != this.f && var9.a(this.g, this.h, this.i)) {
                        var6 = true;
                        break;
                     }
                  }

                  if(var6) {
                     ++var7;
                     continue;
                  }
               }

               if(var6) {
                  return false;
               }

               azw var10 = this.a(this.g, this.h, this.i);
               if(var10 != null) {
                  this.e = 0;
                  this.d = 20;
                  return true;
               }
               break;
            }
         }
      }

      return false;
   }

   private boolean c() {
      azw var1 = this.a(this.g, this.h, this.i);
      if(var1 == null) {
         return false;
      } else {
         yq var2;
         try {
            var2 = new yq(this.a);
            var2.a((sy)null);
            var2.j(false);
         } catch (Exception var4) {
            var4.printStackTrace();
            return false;
         }

         var2.b(var1.a, var1.b, var1.c, this.a.s.nextFloat() * 360.0F, 0.0F);
         this.a.d((sa)var2);
         r var3 = this.f.a();
         var2.a(var3.a, var3.b, var3.c, this.f.b());
         return true;
      }
   }

   private azw a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 10; ++var4) {
         int var5 = var1 + this.a.s.nextInt(16) - 8;
         int var6 = var2 + this.a.s.nextInt(6) - 3;
         int var7 = var3 + this.a.s.nextInt(16) - 8;
         if(this.f.a(var5, var6, var7) && aho.a(sx.a, this.a, var5, var6, var7)) {
            azw.a((double)var5, (double)var6, (double)var7);
         }
      }

      return null;
   }
}
