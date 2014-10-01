import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class vz {

   private ahb a;
   private final List b = new ArrayList();
   private final r c = new r(0, 0, 0);
   private final r d = new r(0, 0, 0);
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private TreeMap j = new TreeMap();
   private List k = new ArrayList();
   private int l;


   public vz() {}

   public vz(ahb var1) {
      this.a = var1;
   }

   public void a(ahb var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.g = var1;
      this.m();
      this.l();
      if(var1 % 20 == 0) {
         this.k();
      }

      if(var1 % 30 == 0) {
         this.j();
      }

      int var2 = this.h / 10;
      if(this.l < var2 && this.b.size() > 20 && this.a.s.nextInt(7000) == 0) {
         azw var3 = this.a(qh.d((float)this.d.a), qh.d((float)this.d.b), qh.d((float)this.d.c), 2, 4, 2);
         if(var3 != null) {
            wt var4 = new wt(this.a);
            var4.b(var3.a, var3.b, var3.c);
            this.a.d((sa)var4);
            ++this.l;
         }
      }

   }

   private azw a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 10; ++var7) {
         int var8 = var1 + this.a.s.nextInt(16) - 8;
         int var9 = var2 + this.a.s.nextInt(6) - 3;
         int var10 = var3 + this.a.s.nextInt(16) - 8;
         if(this.a(var8, var9, var10) && this.b(var8, var9, var10, var4, var5, var6)) {
            return azw.a((double)var8, (double)var9, (double)var10);
         }
      }

      return null;
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(!ahb.a((ahl)this.a, var1, var2 - 1, var3)) {
         return false;
      } else {
         int var7 = var1 - var4 / 2;
         int var8 = var3 - var6 / 2;

         for(int var9 = var7; var9 < var7 + var4; ++var9) {
            for(int var10 = var2; var10 < var2 + var5; ++var10) {
               for(int var11 = var8; var11 < var8 + var6; ++var11) {
                  if(this.a.a(var9, var10, var11).r()) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void j() {
      List var1 = this.a.a(wt.class, azt.a((double)(this.d.a - this.e), (double)(this.d.b - 4), (double)(this.d.c - this.e), (double)(this.d.a + this.e), (double)(this.d.b + 4), (double)(this.d.c + this.e)));
      this.l = var1.size();
   }

   private void k() {
      List var1 = this.a.a(yv.class, azt.a((double)(this.d.a - this.e), (double)(this.d.b - 4), (double)(this.d.c - this.e), (double)(this.d.a + this.e), (double)(this.d.b + 4), (double)(this.d.c + this.e)));
      this.h = var1.size();
      if(this.h == 0) {
         this.j.clear();
      }

   }

   public r a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.b.size();
   }

   public int d() {
      return this.g - this.f;
   }

   public int e() {
      return this.h;
   }

   public boolean a(int var1, int var2, int var3) {
      return this.d.e(var1, var2, var3) < (float)(this.e * this.e);
   }

   public List f() {
      return this.b;
   }

   public vy b(int var1, int var2, int var3) {
      vy var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         vy var7 = (vy)var6.next();
         int var8 = var7.b(var1, var2, var3);
         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public vy c(int var1, int var2, int var3) {
      vy var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         vy var7 = (vy)var6.next();
         int var8 = var7.b(var1, var2, var3);
         if(var8 > 256) {
            var8 *= 1000;
         } else {
            var8 = var7.f();
         }

         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public vy e(int var1, int var2, int var3) {
      if(this.d.e(var1, var2, var3) > (float)(this.e * this.e)) {
         return null;
      } else {
         Iterator var4 = this.b.iterator();

         vy var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            var5 = (vy)var4.next();
         } while(var5.a != var1 || var5.c != var3 || Math.abs(var5.b - var2) > 1);

         return var5;
      }
   }

   public void a(vy var1) {
      this.b.add(var1);
      this.c.a += var1.a;
      this.c.b += var1.b;
      this.c.c += var1.c;
      this.n();
      this.f = var1.f;
   }

   public boolean g() {
      return this.b.isEmpty();
   }

   public void a(sv var1) {
      Iterator var2 = this.k.iterator();

      wa var3;
      do {
         if(!var2.hasNext()) {
            this.k.add(new wa(this, var1, this.g));
            return;
         }

         var3 = (wa)var2.next();
      } while(var3.a != var1);

      var3.b = this.g;
   }

   public sv b(sv var1) {
      double var2 = Double.MAX_VALUE;
      wa var4 = null;

      for(int var5 = 0; var5 < this.k.size(); ++var5) {
         wa var6 = (wa)this.k.get(var5);
         double var7 = var6.a.f(var1);
         if(var7 <= var2) {
            var4 = var6;
            var2 = var7;
         }
      }

      return var4 != null?var4.a:null;
   }

   public yz c(sv var1) {
      double var2 = Double.MAX_VALUE;
      yz var4 = null;
      Iterator var5 = this.j.keySet().iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if(this.d(var6)) {
            yz var7 = this.a.a(var6);
            if(var7 != null) {
               double var8 = var7.f(var1);
               if(var8 <= var2) {
                  var4 = var7;
                  var2 = var8;
               }
            }
         }
      }

      return var4;
   }

   private void l() {
      Iterator var1 = this.k.iterator();

      while(var1.hasNext()) {
         wa var2 = (wa)var1.next();
         if(!var2.a.Z() || Math.abs(this.g - var2.b) > 300) {
            var1.remove();
         }
      }

   }

   private void m() {
      boolean var1 = false;
      boolean var2 = this.a.s.nextInt(50) == 0;
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         vy var4 = (vy)var3.next();
         if(var2) {
            var4.d();
         }

         if(!this.f(var4.a, var4.b, var4.c) || Math.abs(this.g - var4.f) > 1200) {
            this.c.a -= var4.a;
            this.c.b -= var4.b;
            this.c.c -= var4.c;
            var1 = true;
            var4.g = true;
            var3.remove();
         }
      }

      if(var1) {
         this.n();
      }

   }

   private boolean f(int var1, int var2, int var3) {
      return this.a.a(var1, var2, var3) == ajn.ao;
   }

   private void n() {
      int var1 = this.b.size();
      if(var1 == 0) {
         this.d.b(0, 0, 0);
         this.e = 0;
      } else {
         this.d.b(this.c.a / var1, this.c.b / var1, this.c.c / var1);
         int var2 = 0;

         vy var4;
         for(Iterator var3 = this.b.iterator(); var3.hasNext(); var2 = Math.max(var4.b(this.d.a, this.d.b, this.d.c), var2)) {
            var4 = (vy)var3.next();
         }

         this.e = Math.max(32, (int)Math.sqrt((double)var2) + 1);
      }
   }

   public int a(String var1) {
      Integer var2 = (Integer)this.j.get(var1);
      return var2 != null?var2.intValue():0;
   }

   public int a(String var1, int var2) {
      int var3 = this.a(var1);
      int var4 = qh.a(var3 + var2, -30, 10);
      this.j.put(var1, Integer.valueOf(var4));
      return var4;
   }

   public boolean d(String var1) {
      return this.a(var1) <= -15;
   }

   public void a(dh var1) {
      this.h = var1.f("PopSize");
      this.e = var1.f("Radius");
      this.l = var1.f("Golems");
      this.f = var1.f("Stable");
      this.g = var1.f("Tick");
      this.i = var1.f("MTick");
      this.d.a = var1.f("CX");
      this.d.b = var1.f("CY");
      this.d.c = var1.f("CZ");
      this.c.a = var1.f("ACX");
      this.c.b = var1.f("ACY");
      this.c.c = var1.f("ACZ");
      dq var2 = var1.c("Doors", 10);

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         vy var5 = new vy(var4.f("X"), var4.f("Y"), var4.f("Z"), var4.f("IDX"), var4.f("IDZ"), var4.f("TS"));
         this.b.add(var5);
      }

      dq var6 = var1.c("Players", 10);

      for(int var7 = 0; var7 < var6.c(); ++var7) {
         dh var8 = var6.b(var7);
         this.j.put(var8.j("Name"), Integer.valueOf(var8.f("S")));
      }

   }

   public void b(dh var1) {
      var1.a("PopSize", this.h);
      var1.a("Radius", this.e);
      var1.a("Golems", this.l);
      var1.a("Stable", this.f);
      var1.a("Tick", this.g);
      var1.a("MTick", this.i);
      var1.a("CX", this.d.a);
      var1.a("CY", this.d.b);
      var1.a("CZ", this.d.c);
      var1.a("ACX", this.c.a);
      var1.a("ACY", this.c.b);
      var1.a("ACZ", this.c.c);
      dq var2 = new dq();
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         vy var4 = (vy)var3.next();
         dh var5 = new dh();
         var5.a("X", var4.a);
         var5.a("Y", var4.b);
         var5.a("Z", var4.c);
         var5.a("IDX", var4.d);
         var5.a("IDZ", var4.e);
         var5.a("TS", var4.f);
         var2.a((dy)var5);
      }

      var1.a("Doors", (dy)var2);
      dq var7 = new dq();
      Iterator var8 = this.j.keySet().iterator();

      while(var8.hasNext()) {
         String var9 = (String)var8.next();
         dh var6 = new dh();
         var6.a("Name", var9);
         var6.a("S", ((Integer)this.j.get(var9)).intValue());
         var7.a((dy)var6);
      }

      var1.a("Players", (dy)var7);
   }

   public void h() {
      this.i = this.g;
   }

   public boolean i() {
      return this.i == 0 || this.g - this.i >= 3600;
   }

   public void b(int var1) {
      Iterator var2 = this.j.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.a(var3, var1);
      }

   }
}
