
public class mx {

   public ahb a;
   public mw b;
   private ahk c;
   private boolean d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private boolean j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;


   public mx(ahb var1) {
      this.c = ahk.a;
      this.o = -1;
      this.a = var1;
   }

   public void a(ahk var1) {
      this.c = var1;
      var1.a(this.b.bE);
      this.b.q();
   }

   public ahk b() {
      return this.c;
   }

   public boolean d() {
      return this.c.d();
   }

   public void b(ahk var1) {
      if(this.c == ahk.a) {
         this.c = var1;
      }

      this.a(this.c);
   }

   public void a() {
      ++this.i;
      float var3;
      int var4;
      if(this.j) {
         int var1 = this.i - this.n;
         aji var2 = this.a.a(this.k, this.l, this.m);
         if(var2.o() == awt.a) {
            this.j = false;
         } else {
            var3 = var2.a(this.b, this.b.o, this.k, this.l, this.m) * (float)(var1 + 1);
            var4 = (int)(var3 * 10.0F);
            if(var4 != this.o) {
               this.a.d(this.b.y(), this.k, this.l, this.m, var4);
               this.o = var4;
            }

            if(var3 >= 1.0F) {
               this.j = false;
               this.b(this.k, this.l, this.m);
            }
         }
      } else if(this.d) {
         aji var5 = this.a.a(this.f, this.g, this.h);
         if(var5.o() == awt.a) {
            this.a.d(this.b.y(), this.f, this.g, this.h, -1);
            this.o = -1;
            this.d = false;
         } else {
            int var6 = this.i - this.e;
            var3 = var5.a(this.b, this.b.o, this.f, this.g, this.h) * (float)(var6 + 1);
            var4 = (int)(var3 * 10.0F);
            if(var4 != this.o) {
               this.a.d(this.b.y(), this.f, this.g, this.h, var4);
               this.o = var4;
            }
         }
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      if(!this.c.c() || this.b.d(var1, var2, var3)) {
         if(this.d()) {
            if(!this.a.a((yz)null, var1, var2, var3, var4)) {
               this.b(var1, var2, var3);
            }

         } else {
            this.a.a((yz)null, var1, var2, var3, var4);
            this.e = this.i;
            float var5 = 1.0F;
            aji var6 = this.a.a(var1, var2, var3);
            if(var6.o() != awt.a) {
               var6.a(this.a, var1, var2, var3, (yz)this.b);
               var5 = var6.a(this.b, this.b.o, var1, var2, var3);
            }

            if(var6.o() != awt.a && var5 >= 1.0F) {
               this.b(var1, var2, var3);
            } else {
               this.d = true;
               this.f = var1;
               this.g = var2;
               this.h = var3;
               int var7 = (int)(var5 * 10.0F);
               this.a.d(this.b.y(), var1, var2, var3, var7);
               this.o = var7;
            }

         }
      }
   }

   public void a(int var1, int var2, int var3) {
      if(var1 == this.f && var2 == this.g && var3 == this.h) {
         int var4 = this.i - this.e;
         aji var5 = this.a.a(var1, var2, var3);
         if(var5.o() != awt.a) {
            float var6 = var5.a(this.b, this.b.o, var1, var2, var3) * (float)(var4 + 1);
            if(var6 >= 0.7F) {
               this.d = false;
               this.a.d(this.b.y(), var1, var2, var3, -1);
               this.b(var1, var2, var3);
            } else if(!this.j) {
               this.d = false;
               this.j = true;
               this.k = var1;
               this.l = var2;
               this.m = var3;
               this.n = this.e;
            }
         }
      }

   }

   public void c(int var1, int var2, int var3) {
      this.d = false;
      this.a.d(this.b.y(), this.f, this.g, this.h, -1);
   }

   private boolean d(int var1, int var2, int var3) {
      aji var4 = this.a.a(var1, var2, var3);
      int var5 = this.a.e(var1, var2, var3);
      var4.a(this.a, var1, var2, var3, var5, (yz)this.b);
      boolean var6 = this.a.f(var1, var2, var3);
      if(var6) {
         var4.b(this.a, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean b(int var1, int var2, int var3) {
      if(this.c.c() && !this.b.d(var1, var2, var3)) {
         return false;
      } else if(this.c.d() && this.b.be() != null && this.b.be().b() instanceof aeh) {
         return false;
      } else {
         aji var4 = this.a.a(var1, var2, var3);
         int var5 = this.a.e(var1, var2, var3);
         this.a.a(this.b, 2001, var1, var2, var3, aji.b(var4) + (this.a.e(var1, var2, var3) << 12));
         boolean var6 = this.d(var1, var2, var3);
         if(this.d()) {
            this.b.a.a((ft)(new gh(var1, var2, var3, this.a)));
         } else {
            add var7 = this.b.bF();
            boolean var8 = this.b.a(var4);
            if(var7 != null) {
               var7.a(this.a, var4, var1, var2, var3, this.b);
               if(var7.b == 0) {
                  this.b.bG();
               }
            }

            if(var6 && var8) {
               var4.a(this.a, this.b, var1, var2, var3, var5);
            }
         }

         return var6;
      }
   }

   public boolean a(yz var1, ahb var2, add var3) {
      int var4 = var3.b;
      int var5 = var3.k();
      add var6 = var3.a(var2, var1);
      if(var6 == var3 && (var6 == null || var6.b == var4 && var6.n() <= 0 && var6.k() == var5)) {
         return false;
      } else {
         var1.bm.a[var1.bm.c] = var6;
         if(this.d()) {
            var6.b = var4;
            if(var6.g()) {
               var6.b(var5);
            }
         }

         if(var6.b == 0) {
            var1.bm.a[var1.bm.c] = null;
         }

         if(!var1.by()) {
            ((mw)var1).a(var1.bn);
         }

         return true;
      }
   }

   public boolean a(yz var1, ahb var2, add var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if((!var1.an() || var1.be() == null) && var2.a(var4, var5, var6).a(var2, var4, var5, var6, var1, var7, var8, var9, var10)) {
         return true;
      } else if(var3 == null) {
         return false;
      } else if(this.d()) {
         int var11 = var3.k();
         int var12 = var3.b;
         boolean var13 = var3.a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
         var3.b(var11);
         var3.b = var12;
         return var13;
      } else {
         return var3.a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
      }
   }

   public void a(mt var1) {
      this.a = var1;
   }
}
