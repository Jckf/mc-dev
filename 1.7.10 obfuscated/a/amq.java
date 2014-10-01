
public class amq {

   private final ahb a;
   private final int b;
   private final int c;
   private final int d;
   private int e = 0;
   private r f;
   private int g;
   private int h;


   public amq(ahb var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var5;
      this.d = amp.a[var5][0];
      this.c = amp.a[var5][1];

      for(int var6 = var3; var3 > var6 - 21 && var3 > 0 && this.a(var1.a(var2, var3 - 1, var4)); --var3) {
         ;
      }

      int var7 = this.a(var2, var3, var4, this.d) - 1;
      if(var7 >= 0) {
         this.f = new r(var2 + var7 * p.a[this.d], var3, var4 + var7 * p.b[this.d]);
         this.h = this.a(this.f.a, this.f.b, this.f.c, this.c);
         if(this.h < 2 || this.h > 21) {
            this.f = null;
            this.h = 0;
         }
      }

      if(this.f != null) {
         this.g = this.a();
      }

   }

   protected int a(int var1, int var2, int var3, int var4) {
      int var6 = p.a[var4];
      int var7 = p.b[var4];

      int var5;
      aji var8;
      for(var5 = 0; var5 < 22; ++var5) {
         var8 = this.a.a(var1 + var6 * var5, var2, var3 + var7 * var5);
         if(!this.a(var8)) {
            break;
         }

         aji var9 = this.a.a(var1 + var6 * var5, var2 - 1, var3 + var7 * var5);
         if(var9 != ajn.Z) {
            break;
         }
      }

      var8 = this.a.a(var1 + var6 * var5, var2, var3 + var7 * var5);
      return var8 == ajn.Z?var5:0;
   }

   protected int a() {
      int var1;
      int var2;
      int var3;
      int var4;
      label56:
      for(this.g = 0; this.g < 21; ++this.g) {
         var1 = this.f.b + this.g;

         for(var2 = 0; var2 < this.h; ++var2) {
            var3 = this.f.a + var2 * p.a[amp.a[this.b][1]];
            var4 = this.f.c + var2 * p.b[amp.a[this.b][1]];
            aji var5 = this.a.a(var3, var1, var4);
            if(!this.a(var5)) {
               break label56;
            }

            if(var5 == ajn.aO) {
               ++this.e;
            }

            if(var2 == 0) {
               var5 = this.a.a(var3 + p.a[amp.a[this.b][0]], var1, var4 + p.b[amp.a[this.b][0]]);
               if(var5 != ajn.Z) {
                  break label56;
               }
            } else if(var2 == this.h - 1) {
               var5 = this.a.a(var3 + p.a[amp.a[this.b][1]], var1, var4 + p.b[amp.a[this.b][1]]);
               if(var5 != ajn.Z) {
                  break label56;
               }
            }
         }
      }

      for(var1 = 0; var1 < this.h; ++var1) {
         var2 = this.f.a + var1 * p.a[amp.a[this.b][1]];
         var3 = this.f.b + this.g;
         var4 = this.f.c + var1 * p.b[amp.a[this.b][1]];
         if(this.a.a(var2, var3, var4) != ajn.Z) {
            this.g = 0;
            break;
         }
      }

      if(this.g <= 21 && this.g >= 3) {
         return this.g;
      } else {
         this.f = null;
         this.h = 0;
         this.g = 0;
         return 0;
      }
   }

   protected boolean a(aji var1) {
      return var1.J == awt.a || var1 == ajn.ab || var1 == ajn.aO;
   }

   public boolean b() {
      return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
   }

   public void c() {
      for(int var1 = 0; var1 < this.h; ++var1) {
         int var2 = this.f.a + p.a[this.c] * var1;
         int var3 = this.f.c + p.b[this.c] * var1;

         for(int var4 = 0; var4 < this.g; ++var4) {
            int var5 = this.f.b + var4;
            this.a.d(var2, var5, var3, ajn.aO, this.b, 2);
         }
      }

   }

   // $FF: synthetic method
   static int a(amq var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int b(amq var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int c(amq var0) {
      return var0.g;
   }
}
