import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class wc extends ayl {

   private ahb a;
   private final List b = new ArrayList();
   private final List c = new ArrayList();
   private final List d = new ArrayList();
   private int e;


   public wc(String var1) {
      super(var1);
   }

   public wc(ahb var1) {
      super("villages");
      this.a = var1;
      this.c();
   }

   public void a(ahb var1) {
      this.a = var1;
      Iterator var2 = this.d.iterator();

      while(var2.hasNext()) {
         vz var3 = (vz)var2.next();
         var3.a(var1);
      }

   }

   public void a(int var1, int var2, int var3) {
      if(this.b.size() <= 64) {
         if(!this.d(var1, var2, var3)) {
            this.b.add(new r(var1, var2, var3));
         }

      }
   }

   public void a() {
      ++this.e;
      Iterator var1 = this.d.iterator();

      while(var1.hasNext()) {
         vz var2 = (vz)var1.next();
         var2.a(this.e);
      }

      this.e();
      this.f();
      this.g();
      if(this.e % 400 == 0) {
         this.c();
      }

   }

   private void e() {
      Iterator var1 = this.d.iterator();

      while(var1.hasNext()) {
         vz var2 = (vz)var1.next();
         if(var2.g()) {
            var1.remove();
            this.c();
         }
      }

   }

   public List b() {
      return this.d;
   }

   public vz a(int var1, int var2, int var3, int var4) {
      vz var5 = null;
      float var6 = Float.MAX_VALUE;
      Iterator var7 = this.d.iterator();

      while(var7.hasNext()) {
         vz var8 = (vz)var7.next();
         float var9 = var8.a().e(var1, var2, var3);
         if(var9 < var6) {
            float var10 = (float)(var4 + var8.b());
            if(var9 <= var10 * var10) {
               var5 = var8;
               var6 = var9;
            }
         }
      }

      return var5;
   }

   private void f() {
      if(!this.b.isEmpty()) {
         this.a((r)this.b.remove(0));
      }
   }

   private void g() {
      int var1 = 0;

      while(var1 < this.c.size()) {
         vy var2 = (vy)this.c.get(var1);
         boolean var3 = false;
         Iterator var4 = this.d.iterator();

         while(true) {
            if(var4.hasNext()) {
               vz var5 = (vz)var4.next();
               int var6 = (int)var5.a().e(var2.a, var2.b, var2.c);
               int var7 = 32 + var5.b();
               if(var6 > var7 * var7) {
                  continue;
               }

               var5.a(var2);
               var3 = true;
            }

            if(!var3) {
               vz var8 = new vz(this.a);
               var8.a(var2);
               this.d.add(var8);
               this.c();
            }

            ++var1;
            break;
         }
      }

      this.c.clear();
   }

   private void a(r var1) {
      byte var2 = 16;
      byte var3 = 4;
      byte var4 = 16;

      for(int var5 = var1.a - var2; var5 < var1.a + var2; ++var5) {
         for(int var6 = var1.b - var3; var6 < var1.b + var3; ++var6) {
            for(int var7 = var1.c - var4; var7 < var1.c + var4; ++var7) {
               if(this.e(var5, var6, var7)) {
                  vy var8 = this.b(var5, var6, var7);
                  if(var8 == null) {
                     this.c(var5, var6, var7);
                  } else {
                     var8.f = this.e;
                  }
               }
            }
         }
      }

   }

   private vy b(int var1, int var2, int var3) {
      Iterator var4 = this.c.iterator();

      vy var5;
      do {
         if(!var4.hasNext()) {
            var4 = this.d.iterator();

            vy var6;
            do {
               if(!var4.hasNext()) {
                  return null;
               }

               vz var7 = (vz)var4.next();
               var6 = var7.e(var1, var2, var3);
            } while(var6 == null);

            return var6;
         }

         var5 = (vy)var4.next();
      } while(var5.a != var1 || var5.c != var3 || Math.abs(var5.b - var2) > 1);

      return var5;
   }

   private void c(int var1, int var2, int var3) {
      int var4 = ((akn)ajn.ao).e(this.a, var1, var2, var3);
      int var5;
      int var6;
      if(var4 != 0 && var4 != 2) {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if(this.a.i(var1, var2, var3 + var6)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if(this.a.i(var1, var2, var3 + var6)) {
               ++var5;
            }
         }

         if(var5 != 0) {
            this.c.add(new vy(var1, var2, var3, 0, var5 > 0?-2:2, this.e));
         }
      } else {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if(this.a.i(var1 + var6, var2, var3)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if(this.a.i(var1 + var6, var2, var3)) {
               ++var5;
            }
         }

         if(var5 != 0) {
            this.c.add(new vy(var1, var2, var3, var5 > 0?-2:2, 0, this.e));
         }
      }

   }

   private boolean d(int var1, int var2, int var3) {
      Iterator var4 = this.b.iterator();

      r var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (r)var4.next();
      } while(var5.a != var1 || var5.b != var2 || var5.c != var3);

      return true;
   }

   private boolean e(int var1, int var2, int var3) {
      return this.a.a(var1, var2, var3) == ajn.ao;
   }

   public void a(dh var1) {
      this.e = var1.f("Tick");
      dq var2 = var1.c("Villages", 10);

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         vz var5 = new vz();
         var5.a(var4);
         this.d.add(var5);
      }

   }

   public void b(dh var1) {
      var1.a("Tick", this.e);
      dq var2 = new dq();
      Iterator var3 = this.d.iterator();

      while(var3.hasNext()) {
         vz var4 = (vz)var3.next();
         dh var5 = new dh();
         var4.b(var5);
         var2.a((dy)var5);
      }

      var1.a("Villages", (dy)var2);
   }
}
