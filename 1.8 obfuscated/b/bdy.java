import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class bdy {

   private final aqu a;
   private final dt b;
   private final dt c;
   private final ej d;
   private final List e = Lists.newArrayList();
   private final List f = Lists.newArrayList();


   public bdy(aqu var1, dt var2, ej var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      if(var4) {
         this.d = var3;
         this.c = var2.a(var3);
      } else {
         this.d = var3.d();
         this.c = var2.a(var3, 2);
      }

   }

   public boolean a() {
      this.e.clear();
      this.f.clear();
      atr var1 = this.a.p(this.c).c();
      if(!bdq.a(var1, this.a, this.c, this.d, false)) {
         if(var1.i() != 1) {
            return false;
         } else {
            this.f.add(this.c);
            return true;
         }
      } else if(!this.a(this.c)) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            dt var3 = (dt)this.e.get(var2);
            if(this.a.p(var3).c() == aty.cE && !this.b(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(dt var1) {
      atr var2 = this.a.p(var1).c();
      if(var2.r() == bof.a) {
         return true;
      } else if(!bdq.a(var2, this.a, var1, this.d, false)) {
         return true;
      } else if(var1.equals(this.b)) {
         return true;
      } else if(this.e.contains(var1)) {
         return true;
      } else {
         int var3 = 1;
         if(var3 + this.e.size() > 12) {
            return false;
         } else {
            while(var2 == aty.cE) {
               dt var4 = var1.a(this.d.d(), var3);
               var2 = this.a.p(var4).c();
               if(var2.r() == bof.a || !bdq.a(var2, this.a, var4, this.d, false) || var4.equals(this.b)) {
                  break;
               }

               ++var3;
               if(var3 + this.e.size() > 12) {
                  return false;
               }
            }

            int var10 = 0;

            int var5;
            for(var5 = var3 - 1; var5 >= 0; --var5) {
               this.e.add(var1.a(this.d.d(), var5));
               ++var10;
            }

            var5 = 1;

            while(true) {
               dt var6 = var1.a(this.d, var5);
               int var7 = this.e.indexOf(var6);
               if(var7 > -1) {
                  this.a(var10, var7);

                  for(int var8 = 0; var8 <= var7 + var10; ++var8) {
                     dt var9 = (dt)this.e.get(var8);
                     if(this.a.p(var9).c() == aty.cE && !this.b(var9)) {
                        return false;
                     }
                  }

                  return true;
               }

               var2 = this.a.p(var6).c();
               if(var2.r() == bof.a) {
                  return true;
               }

               if(!bdq.a(var2, this.a, var6, this.d, true) || var6.equals(this.b)) {
                  return false;
               }

               if(var2.i() == 1) {
                  this.f.add(var6);
                  return true;
               }

               if(this.e.size() >= 12) {
                  return false;
               }

               this.e.add(var6);
               ++var10;
               ++var5;
            }
         }
      }
   }

   private void a(int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      var3.addAll(this.e.subList(0, var2));
      var4.addAll(this.e.subList(this.e.size() - var1, this.e.size()));
      var5.addAll(this.e.subList(var2, this.e.size() - var1));
      this.e.clear();
      this.e.addAll(var3);
      this.e.addAll(var4);
      this.e.addAll(var5);
   }

   private boolean b(dt var1) {
      ej[] var2 = ej.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ej var5 = var2[var4];
         if(var5.k() != this.d.k() && !this.a(var1.a(var5))) {
            return false;
         }
      }

      return true;
   }

   public List c() {
      return this.e;
   }

   public List d() {
      return this.f;
   }
}
