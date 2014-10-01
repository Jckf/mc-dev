import java.util.ArrayList;
import java.util.List;

public class ajf {

   private ahb b;
   private int c;
   private int d;
   private int e;
   private final boolean f;
   private List g;
   // $FF: synthetic field
   final aje a;


   public ajf(aje var1, ahb var2, int var3, int var4, int var5) {
      this.a = var1;
      this.g = new ArrayList();
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      aji var6 = var2.a(var3, var4, var5);
      int var7 = var2.e(var3, var4, var5);
      if(((aje)var6).a) {
         this.f = true;
         var7 &= -9;
      } else {
         this.f = false;
      }

      this.a(var7);
   }

   private void a(int var1) {
      this.g.clear();
      if(var1 == 0) {
         this.g.add(new agt(this.c, this.d, this.e - 1));
         this.g.add(new agt(this.c, this.d, this.e + 1));
      } else if(var1 == 1) {
         this.g.add(new agt(this.c - 1, this.d, this.e));
         this.g.add(new agt(this.c + 1, this.d, this.e));
      } else if(var1 == 2) {
         this.g.add(new agt(this.c - 1, this.d, this.e));
         this.g.add(new agt(this.c + 1, this.d + 1, this.e));
      } else if(var1 == 3) {
         this.g.add(new agt(this.c - 1, this.d + 1, this.e));
         this.g.add(new agt(this.c + 1, this.d, this.e));
      } else if(var1 == 4) {
         this.g.add(new agt(this.c, this.d + 1, this.e - 1));
         this.g.add(new agt(this.c, this.d, this.e + 1));
      } else if(var1 == 5) {
         this.g.add(new agt(this.c, this.d, this.e - 1));
         this.g.add(new agt(this.c, this.d + 1, this.e + 1));
      } else if(var1 == 6) {
         this.g.add(new agt(this.c + 1, this.d, this.e));
         this.g.add(new agt(this.c, this.d, this.e + 1));
      } else if(var1 == 7) {
         this.g.add(new agt(this.c - 1, this.d, this.e));
         this.g.add(new agt(this.c, this.d, this.e + 1));
      } else if(var1 == 8) {
         this.g.add(new agt(this.c - 1, this.d, this.e));
         this.g.add(new agt(this.c, this.d, this.e - 1));
      } else if(var1 == 9) {
         this.g.add(new agt(this.c + 1, this.d, this.e));
         this.g.add(new agt(this.c, this.d, this.e - 1));
      }

   }

   private void b() {
      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         ajf var2 = this.a((agt)this.g.get(var1));
         if(var2 != null && var2.a(this)) {
            this.g.set(var1, new agt(var2.c, var2.d, var2.e));
         } else {
            this.g.remove(var1--);
         }
      }

   }

   private boolean a(int var1, int var2, int var3) {
      return aje.b_(this.b, var1, var2, var3)?true:(aje.b_(this.b, var1, var2 + 1, var3)?true:aje.b_(this.b, var1, var2 - 1, var3));
   }

   private ajf a(agt var1) {
      return aje.b_(this.b, var1.a, var1.b, var1.c)?new ajf(this.a, this.b, var1.a, var1.b, var1.c):(aje.b_(this.b, var1.a, var1.b + 1, var1.c)?new ajf(this.a, this.b, var1.a, var1.b + 1, var1.c):(aje.b_(this.b, var1.a, var1.b - 1, var1.c)?new ajf(this.a, this.b, var1.a, var1.b - 1, var1.c):null));
   }

   private boolean a(ajf var1) {
      for(int var2 = 0; var2 < this.g.size(); ++var2) {
         agt var3 = (agt)this.g.get(var2);
         if(var3.a == var1.c && var3.c == var1.e) {
            return true;
         }
      }

      return false;
   }

   private boolean b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.g.size(); ++var4) {
         agt var5 = (agt)this.g.get(var4);
         if(var5.a == var1 && var5.c == var3) {
            return true;
         }
      }

      return false;
   }

   protected int a() {
      int var1 = 0;
      if(this.a(this.c, this.d, this.e - 1)) {
         ++var1;
      }

      if(this.a(this.c, this.d, this.e + 1)) {
         ++var1;
      }

      if(this.a(this.c - 1, this.d, this.e)) {
         ++var1;
      }

      if(this.a(this.c + 1, this.d, this.e)) {
         ++var1;
      }

      return var1;
   }

   private boolean b(ajf var1) {
      return this.a(var1)?true:(this.g.size() == 2?false:(this.g.isEmpty()?true:true));
   }

   private void c(ajf var1) {
      this.g.add(new agt(var1.c, var1.d, var1.e));
      boolean var2 = this.b(this.c, this.d, this.e - 1);
      boolean var3 = this.b(this.c, this.d, this.e + 1);
      boolean var4 = this.b(this.c - 1, this.d, this.e);
      boolean var5 = this.b(this.c + 1, this.d, this.e);
      byte var6 = -1;
      if(var2 || var3) {
         var6 = 0;
      }

      if(var4 || var5) {
         var6 = 1;
      }

      if(!this.f) {
         if(var3 && var5 && !var2 && !var4) {
            var6 = 6;
         }

         if(var3 && var4 && !var2 && !var5) {
            var6 = 7;
         }

         if(var2 && var4 && !var3 && !var5) {
            var6 = 8;
         }

         if(var2 && var5 && !var3 && !var4) {
            var6 = 9;
         }
      }

      if(var6 == 0) {
         if(aje.b_(this.b, this.c, this.d + 1, this.e - 1)) {
            var6 = 4;
         }

         if(aje.b_(this.b, this.c, this.d + 1, this.e + 1)) {
            var6 = 5;
         }
      }

      if(var6 == 1) {
         if(aje.b_(this.b, this.c + 1, this.d + 1, this.e)) {
            var6 = 2;
         }

         if(aje.b_(this.b, this.c - 1, this.d + 1, this.e)) {
            var6 = 3;
         }
      }

      if(var6 < 0) {
         var6 = 0;
      }

      int var7 = var6;
      if(this.f) {
         var7 = this.b.e(this.c, this.d, this.e) & 8 | var6;
      }

      this.b.a(this.c, this.d, this.e, var7, 3);
   }

   private boolean c(int var1, int var2, int var3) {
      ajf var4 = this.a(new agt(var1, var2, var3));
      if(var4 == null) {
         return false;
      } else {
         var4.b();
         return var4.b(this);
      }
   }

   public void a(boolean var1, boolean var2) {
      boolean var3 = this.c(this.c, this.d, this.e - 1);
      boolean var4 = this.c(this.c, this.d, this.e + 1);
      boolean var5 = this.c(this.c - 1, this.d, this.e);
      boolean var6 = this.c(this.c + 1, this.d, this.e);
      byte var7 = -1;
      if((var3 || var4) && !var5 && !var6) {
         var7 = 0;
      }

      if((var5 || var6) && !var3 && !var4) {
         var7 = 1;
      }

      if(!this.f) {
         if(var4 && var6 && !var3 && !var5) {
            var7 = 6;
         }

         if(var4 && var5 && !var3 && !var6) {
            var7 = 7;
         }

         if(var3 && var5 && !var4 && !var6) {
            var7 = 8;
         }

         if(var3 && var6 && !var4 && !var5) {
            var7 = 9;
         }
      }

      if(var7 == -1) {
         if(var3 || var4) {
            var7 = 0;
         }

         if(var5 || var6) {
            var7 = 1;
         }

         if(!this.f) {
            if(var1) {
               if(var4 && var6) {
                  var7 = 6;
               }

               if(var5 && var4) {
                  var7 = 7;
               }

               if(var6 && var3) {
                  var7 = 9;
               }

               if(var3 && var5) {
                  var7 = 8;
               }
            } else {
               if(var3 && var5) {
                  var7 = 8;
               }

               if(var6 && var3) {
                  var7 = 9;
               }

               if(var5 && var4) {
                  var7 = 7;
               }

               if(var4 && var6) {
                  var7 = 6;
               }
            }
         }
      }

      if(var7 == 0) {
         if(aje.b_(this.b, this.c, this.d + 1, this.e - 1)) {
            var7 = 4;
         }

         if(aje.b_(this.b, this.c, this.d + 1, this.e + 1)) {
            var7 = 5;
         }
      }

      if(var7 == 1) {
         if(aje.b_(this.b, this.c + 1, this.d + 1, this.e)) {
            var7 = 2;
         }

         if(aje.b_(this.b, this.c - 1, this.d + 1, this.e)) {
            var7 = 3;
         }
      }

      if(var7 < 0) {
         var7 = 0;
      }

      this.a(var7);
      int var8 = var7;
      if(this.f) {
         var8 = this.b.e(this.c, this.d, this.e) & 8 | var7;
      }

      if(var2 || this.b.e(this.c, this.d, this.e) != var8) {
         this.b.a(this.c, this.d, this.e, var8, 3);

         for(int var9 = 0; var9 < this.g.size(); ++var9) {
            ajf var10 = this.a((agt)this.g.get(var9));
            if(var10 != null) {
               var10.b();
               if(var10.b(this)) {
                  var10.c(this);
               }
            }
         }
      }

   }
}
