import java.util.Random;

public class aia {

   protected ahb a;
   protected Random b;
   protected int c;
   protected int d;
   protected arn e = new arj(4);
   protected arn f;
   protected arn g;
   protected arn h;
   protected arn i;
   protected arn j;
   protected arn k;
   protected arn l;
   protected arn m;
   protected arn n;
   protected arn o;
   protected aro p;
   protected arn q;
   protected arn r;
   protected arn s;
   protected arn t;
   protected arn u;
   protected arn v;
   protected int w;
   protected int x;
   protected int y;
   protected int z;
   protected int A;
   protected int B;
   protected int C;
   protected int D;
   protected int E;
   protected int F;
   protected int G;
   protected int H;
   public boolean I;


   public aia() {
      this.f = new asj(ajn.m, 7);
      this.g = new asj(ajn.n, 6);
      this.h = new ase(ajn.d, 32);
      this.i = new ase(ajn.n, 32);
      this.j = new ase(ajn.q, 16);
      this.k = new ase(ajn.p, 8);
      this.l = new ase(ajn.o, 8);
      this.m = new ase(ajn.ax, 7);
      this.n = new ase(ajn.ag, 7);
      this.o = new ase(ajn.x, 6);
      this.p = new aro(ajn.N);
      this.q = new aro(ajn.P);
      this.r = new aro(ajn.Q);
      this.s = new aru();
      this.t = new ash();
      this.u = new arh();
      this.v = new aiz();
      this.y = 2;
      this.z = 1;
      this.E = 1;
      this.F = 3;
      this.G = 1;
      this.I = true;
   }

   public void a(ahb var1, Random var2, ahu var3, int var4, int var5) {
      if(this.a != null) {
         throw new RuntimeException("Already decorating!!");
      } else {
         this.a = var1;
         this.b = var2;
         this.c = var4;
         this.d = var5;
         this.a(var3);
         this.a = null;
         this.b = null;
      }
   }

   protected void a(ahu var1) {
      this.a();

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < this.F; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         this.f.a(this.a, this.b, var3, this.a.i(var3, var4), var4);
      }

      for(var2 = 0; var2 < this.G; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         this.e.a(this.a, this.b, var3, this.a.i(var3, var4), var4);
      }

      for(var2 = 0; var2 < this.E; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         this.g.a(this.a, this.b, var3, this.a.i(var3, var4), var4);
      }

      var2 = this.x;
      if(this.b.nextInt(10) == 0) {
         ++var2;
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.a.f(var4, var5);
         arc var7 = var1.a(this.b);
         var7.a(1.0D, 1.0D, 1.0D);
         if(var7.a(this.a, this.b, var4, var6, var5)) {
            var7.b(this.a, this.b, var4, var6, var5);
         }
      }

      for(var3 = 0; var3 < this.H; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         this.s.a(this.a, this.b, var4, this.a.f(var4, var5), var5);
      }

      for(var3 = 0; var3 < this.y; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) + 32);
         String var9 = var1.a(this.b, var4, var6, var5);
         alc var8 = alc.e(var9);
         if(var8.o() != awt.a) {
            this.p.a(var8, alc.f(var9));
            this.p.a(this.a, this.b, var4, var6, var5);
         }
      }

      for(var3 = 0; var3 < this.z; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
         arn var10 = var1.b(this.b);
         var10.a(this.a, this.b, var4, var6, var5);
      }

      for(var3 = 0; var3 < this.A; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
         (new ark(ajn.I)).a(this.a, this.b, var4, var6, var5);
      }

      for(var3 = 0; var3 < this.w; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;

         for(var6 = this.b.nextInt(this.a.f(var4, var5) * 2); var6 > 0 && this.a.c(var4, var6 - 1, var5); --var6) {
            ;
         }

         this.v.a(this.a, this.b, var4, var6, var5);
      }

      for(var3 = 0; var3 < this.B; ++var3) {
         if(this.b.nextInt(4) == 0) {
            var4 = this.c + this.b.nextInt(16) + 8;
            var5 = this.d + this.b.nextInt(16) + 8;
            var6 = this.a.f(var4, var5);
            this.q.a(this.a, this.b, var4, var6, var5);
         }

         if(this.b.nextInt(8) == 0) {
            var4 = this.c + this.b.nextInt(16) + 8;
            var5 = this.d + this.b.nextInt(16) + 8;
            var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
            this.r.a(this.a, this.b, var4, var6, var5);
         }
      }

      if(this.b.nextInt(4) == 0) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         var5 = this.b.nextInt(this.a.f(var3, var4) * 2);
         this.q.a(this.a, this.b, var3, var5, var4);
      }

      if(this.b.nextInt(8) == 0) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         var5 = this.b.nextInt(this.a.f(var3, var4) * 2);
         this.r.a(this.a, this.b, var3, var5, var4);
      }

      for(var3 = 0; var3 < this.C; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
         this.t.a(this.a, this.b, var4, var6, var5);
      }

      for(var3 = 0; var3 < 10; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
         this.t.a(this.a, this.b, var4, var6, var5);
      }

      if(this.b.nextInt(32) == 0) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         var5 = this.b.nextInt(this.a.f(var3, var4) * 2);
         (new asg()).a(this.a, this.b, var3, var5, var4);
      }

      for(var3 = 0; var3 < this.D; ++var3) {
         var4 = this.c + this.b.nextInt(16) + 8;
         var5 = this.d + this.b.nextInt(16) + 8;
         var6 = this.b.nextInt(this.a.f(var4, var5) * 2);
         this.u.a(this.a, this.b, var4, var6, var5);
      }

      if(this.I) {
         for(var3 = 0; var3 < 50; ++var3) {
            var4 = this.c + this.b.nextInt(16) + 8;
            var5 = this.b.nextInt(this.b.nextInt(248) + 8);
            var6 = this.d + this.b.nextInt(16) + 8;
            (new asm(ajn.i)).a(this.a, this.b, var4, var5, var6);
         }

         for(var3 = 0; var3 < 20; ++var3) {
            var4 = this.c + this.b.nextInt(16) + 8;
            var5 = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
            var6 = this.d + this.b.nextInt(16) + 8;
            (new asm(ajn.k)).a(this.a, this.b, var4, var5, var6);
         }
      }

   }

   protected void a(int var1, arn var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4 - var3) + var3;
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void b(int var1, arn var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4) + this.b.nextInt(var4) + (var3 - var4);
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void a() {
      this.a(20, this.h, 0, 256);
      this.a(10, this.i, 0, 256);
      this.a(20, this.j, 0, 128);
      this.a(20, this.k, 0, 64);
      this.a(2, this.l, 0, 32);
      this.a(8, this.m, 0, 16);
      this.a(1, this.n, 0, 16);
      this.b(1, this.o, 16, 16);
   }
}
