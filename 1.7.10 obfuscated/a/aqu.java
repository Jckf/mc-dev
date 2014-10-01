import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aqu implements apu {

   private ahb a;
   private Random b;
   private final aji[] c = new aji[256];
   private final byte[] d = new byte[256];
   private final ass e;
   private final List f = new ArrayList();
   private final boolean g;
   private final boolean h;
   private arx i;
   private arx j;


   public aqu(ahb var1, long var2, boolean var4, String var5) {
      this.a = var1;
      this.b = new Random(var2);
      this.e = ass.a(var5);
      if(var4) {
         Map var6 = this.e.b();
         if(var6.containsKey("village")) {
            Map var7 = (Map)var6.get("village");
            if(!var7.containsKey("size")) {
               var7.put("size", "1");
            }

            this.f.add(new avn(var7));
         }

         if(var6.containsKey("biome_1")) {
            this.f.add(new atx((Map)var6.get("biome_1")));
         }

         if(var6.containsKey("mineshaft")) {
            this.f.add(new asw((Map)var6.get("mineshaft")));
         }

         if(var6.containsKey("stronghold")) {
            this.f.add(new aug((Map)var6.get("stronghold")));
         }
      }

      this.g = this.e.b().containsKey("decoration");
      if(this.e.b().containsKey("lake")) {
         this.i = new arx(ajn.j);
      }

      if(this.e.b().containsKey("lava_lake")) {
         this.j = new arx(ajn.l);
      }

      this.h = this.e.b().containsKey("dungeon");
      Iterator var9 = this.e.c().iterator();

      while(var9.hasNext()) {
         ast var10 = (ast)var9.next();

         for(int var8 = var10.d(); var8 < var10.d() + var10.a(); ++var8) {
            this.c[var8] = var10.b();
            this.d[var8] = (byte)var10.c();
         }
      }

   }

   public apx c(int var1, int var2) {
      return this.d(var1, var2);
   }

   public apx d(int var1, int var2) {
      apx var3 = new apx(this.a, var1, var2);

      int var6;
      for(int var4 = 0; var4 < this.c.length; ++var4) {
         aji var5 = this.c[var4];
         if(var5 != null) {
            var6 = var4 >> 4;
            apz var7 = var3.i()[var6];
            if(var7 == null) {
               var7 = new apz(var4, !this.a.t.g);
               var3.i()[var6] = var7;
            }

            for(int var8 = 0; var8 < 16; ++var8) {
               for(int var9 = 0; var9 < 16; ++var9) {
                  var7.a(var8, var4 & 15, var9, var5);
                  var7.a(var8, var4 & 15, var9, this.d[var4]);
               }
            }
         }
      }

      var3.b();
      ahu[] var10 = this.a.v().b((ahu[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var11 = var3.m();

      for(var6 = 0; var6 < var11.length; ++var6) {
         var11[var6] = (byte)var10[var6].ay;
      }

      Iterator var12 = this.f.iterator();

      while(var12.hasNext()) {
         aqx var13 = (aqx)var12.next();
         var13.a(this, this.a, var1, var2, (aji[])null);
      }

      var3.b();
      return var3;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(apu var1, int var2, int var3) {
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      ahu var6 = this.a.a(var4 + 16, var5 + 16);
      boolean var7 = false;
      this.b.setSeed(this.a.H());
      long var8 = this.b.nextLong() / 2L * 2L + 1L;
      long var10 = this.b.nextLong() / 2L * 2L + 1L;
      this.b.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.a.H());
      Iterator var12 = this.f.iterator();

      while(var12.hasNext()) {
         ave var13 = (ave)var12.next();
         boolean var14 = var13.a(this.a, this.b, var2, var3);
         if(var13 instanceof avn) {
            var7 |= var14;
         }
      }

      int var16;
      int var17;
      int var18;
      if(this.i != null && !var7 && this.b.nextInt(4) == 0) {
         var16 = var4 + this.b.nextInt(16) + 8;
         var17 = this.b.nextInt(256);
         var18 = var5 + this.b.nextInt(16) + 8;
         this.i.a(this.a, this.b, var16, var17, var18);
      }

      if(this.j != null && !var7 && this.b.nextInt(8) == 0) {
         var16 = var4 + this.b.nextInt(16) + 8;
         var17 = this.b.nextInt(this.b.nextInt(248) + 8);
         var18 = var5 + this.b.nextInt(16) + 8;
         if(var17 < 63 || this.b.nextInt(10) == 0) {
            this.j.a(this.a, this.b, var16, var17, var18);
         }
      }

      if(this.h) {
         for(var16 = 0; var16 < 8; ++var16) {
            var17 = var4 + this.b.nextInt(16) + 8;
            var18 = this.b.nextInt(256);
            int var15 = var5 + this.b.nextInt(16) + 8;
            (new asd()).a(this.a, this.b, var17, var18, var15);
         }
      }

      if(this.g) {
         var6.a(this.a, this.b, var4, var5);
      }

   }

   public boolean a(boolean var1, qk var2) {
      return true;
   }

   public void c() {}

   public boolean d() {
      return false;
   }

   public boolean e() {
      return true;
   }

   public String f() {
      return "FlatLevelSource";
   }

   public List a(sx var1, int var2, int var3, int var4) {
      ahu var5 = this.a.a(var2, var4);
      return var5.a(var1);
   }

   public agt a(ahb var1, String var2, int var3, int var4, int var5) {
      if("Stronghold".equals(var2)) {
         Iterator var6 = this.f.iterator();

         while(var6.hasNext()) {
            ave var7 = (ave)var6.next();
            if(var7 instanceof aug) {
               return var7.a(var1, var3, var4, var5);
            }
         }
      }

      return null;
   }

   public int g() {
      return 0;
   }

   public void e(int var1, int var2) {
      Iterator var3 = this.f.iterator();

      while(var3.hasNext()) {
         ave var4 = (ave)var3.next();
         var4.a(this, this.a, var1, var2, (aji[])null);
      }

   }
}
