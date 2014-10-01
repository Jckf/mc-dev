import java.util.ArrayList;
import java.util.List;

class mr {

   private final List b;
   private final agu c;
   private short[] d;
   private int e;
   private int f;
   private long g;
   // $FF: synthetic field
   final mq a;


   public mr(mq var1, int var2, int var3) {
      this.a = var1;
      this.b = new ArrayList();
      this.d = new short[64];
      this.c = new agu(var2, var3);
      var1.a().b.c(var2, var3);
   }

   public void a(mw var1) {
      if(this.b.contains(var1)) {
         mq.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{var1, Integer.valueOf(this.c.a), Integer.valueOf(this.c.b)});
      } else {
         if(this.b.isEmpty()) {
            this.g = mq.a(this.a).I();
         }

         this.b.add(var1);
         var1.f.add(this.c);
      }
   }

   public void b(mw var1) {
      if(this.b.contains(var1)) {
         apx var2 = mq.a(this.a).e(this.c.a, this.c.b);
         if(var2.k()) {
            var1.a.a((ft)(new gx(var2, true, 0)));
         }

         this.b.remove(var1);
         var1.f.remove(this.c);
         if(this.b.isEmpty()) {
            long var3 = (long)this.c.a + 2147483647L | (long)this.c.b + 2147483647L << 32;
            this.a(var2);
            mq.b(this.a).d(var3);
            mq.c(this.a).remove(this);
            if(this.e > 0) {
               mq.d(this.a).remove(this);
            }

            this.a.a().b.b(this.c.a, this.c.b);
         }

      }
   }

   public void a() {
      this.a(mq.a(this.a).e(this.c.a, this.c.b));
   }

   private void a(apx var1) {
      var1.s += mq.a(this.a).I() - this.g;
      this.g = mq.a(this.a).I();
   }

   public void a(int var1, int var2, int var3) {
      if(this.e == 0) {
         mq.d(this.a).add(this);
      }

      this.f |= 1 << (var2 >> 4);
      if(this.e < 64) {
         short var4 = (short)(var1 << 12 | var3 << 8 | var2);

         for(int var5 = 0; var5 < this.e; ++var5) {
            if(this.d[var5] == var4) {
               return;
            }
         }

         this.d[this.e++] = var4;
      }

   }

   public void a(ft var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         mw var3 = (mw)this.b.get(var2);
         if(!var3.f.contains(this.c)) {
            var3.a.a(var1);
         }
      }

   }

   public void b() {
      if(this.e != 0) {
         int var1;
         int var2;
         int var3;
         if(this.e == 1) {
            var1 = this.c.a * 16 + (this.d[0] >> 12 & 15);
            var2 = this.d[0] & 255;
            var3 = this.c.b * 16 + (this.d[0] >> 8 & 15);
            this.a((ft)(new gh(var1, var2, var3, mq.a(this.a))));
            if(mq.a(this.a).a(var1, var2, var3).u()) {
               this.a(mq.a(this.a).o(var1, var2, var3));
            }
         } else {
            int var4;
            if(this.e == 64) {
               var1 = this.c.a * 16;
               var2 = this.c.b * 16;
               this.a((ft)(new gx(mq.a(this.a).e(this.c.a, this.c.b), false, this.f)));

               for(var3 = 0; var3 < 16; ++var3) {
                  if((this.f & 1 << var3) != 0) {
                     var4 = var3 << 4;
                     List var5 = mq.a(this.a).a(var1, var4, var2, var1 + 16, var4 + 16, var2 + 16);

                     for(int var6 = 0; var6 < var5.size(); ++var6) {
                        this.a((aor)var5.get(var6));
                     }
                  }
               }
            } else {
               this.a((ft)(new gk(this.e, this.d, mq.a(this.a).e(this.c.a, this.c.b))));

               for(var1 = 0; var1 < this.e; ++var1) {
                  var2 = this.c.a * 16 + (this.d[var1] >> 12 & 15);
                  var3 = this.d[var1] & 255;
                  var4 = this.c.b * 16 + (this.d[var1] >> 8 & 15);
                  if(mq.a(this.a).a(var2, var3, var4).u()) {
                     this.a(mq.a(this.a).o(var2, var3, var4));
                  }
               }
            }
         }

         this.e = 0;
         this.f = 0;
      }
   }

   private void a(aor var1) {
      if(var1 != null) {
         ft var2 = var1.m();
         if(var2 != null) {
            this.a(var2);
         }
      }

   }

   // $FF: synthetic method
   static agu a(mr var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static List b(mr var0) {
      return var0.b;
   }
}
