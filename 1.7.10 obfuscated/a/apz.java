
public class apz {

   private int a;
   private int b;
   private int c;
   private byte[] d;
   private apv e;
   private apv f;
   private apv g;
   private apv h;


   public apz(int var1, boolean var2) {
      this.a = var1;
      this.d = new byte[4096];
      this.f = new apv(this.d.length, 4);
      this.g = new apv(this.d.length, 4);
      if(var2) {
         this.h = new apv(this.d.length, 4);
      }

   }

   public aji a(int var1, int var2, int var3) {
      int var4 = this.d[var2 << 8 | var3 << 4 | var1] & 255;
      if(this.e != null) {
         var4 |= this.e.a(var1, var2, var3) << 8;
      }

      return aji.e(var4);
   }

   public void a(int var1, int var2, int var3, aji var4) {
      int var5 = this.d[var2 << 8 | var3 << 4 | var1] & 255;
      if(this.e != null) {
         var5 |= this.e.a(var1, var2, var3) << 8;
      }

      aji var6 = aji.e(var5);
      if(var6 != ajn.a) {
         --this.b;
         if(var6.t()) {
            --this.c;
         }
      }

      if(var4 != ajn.a) {
         ++this.b;
         if(var4.t()) {
            ++this.c;
         }
      }

      int var7 = aji.b(var4);
      this.d[var2 << 8 | var3 << 4 | var1] = (byte)(var7 & 255);
      if(var7 > 255) {
         if(this.e == null) {
            this.e = new apv(this.d.length, 4);
         }

         this.e.a(var1, var2, var3, (var7 & 3840) >> 8);
      } else if(this.e != null) {
         this.e.a(var1, var2, var3, 0);
      }

   }

   public int b(int var1, int var2, int var3) {
      return this.f.a(var1, var2, var3);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.f.a(var1, var2, var3, var4);
   }

   public boolean a() {
      return this.b == 0;
   }

   public boolean b() {
      return this.c > 0;
   }

   public int d() {
      return this.a;
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.h.a(var1, var2, var3, var4);
   }

   public int c(int var1, int var2, int var3) {
      return this.h.a(var1, var2, var3);
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.g.a(var1, var2, var3, var4);
   }

   public int d(int var1, int var2, int var3) {
      return this.g.a(var1, var2, var3);
   }

   public void e() {
      this.b = 0;
      this.c = 0;

      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 16; ++var2) {
            for(int var3 = 0; var3 < 16; ++var3) {
               aji var4 = this.a(var1, var2, var3);
               if(var4 != ajn.a) {
                  ++this.b;
                  if(var4.t()) {
                     ++this.c;
                  }
               }
            }
         }
      }

   }

   public byte[] g() {
      return this.d;
   }

   public apv i() {
      return this.e;
   }

   public apv j() {
      return this.f;
   }

   public apv k() {
      return this.g;
   }

   public apv l() {
      return this.h;
   }

   public void a(byte[] var1) {
      this.d = var1;
   }

   public void a(apv var1) {
      this.e = var1;
   }

   public void b(apv var1) {
      this.f = var1;
   }

   public void c(apv var1) {
      this.g = var1;
   }

   public void d(apv var1) {
      this.h = var1;
   }
}
