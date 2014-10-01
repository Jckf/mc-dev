import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ayi extends ayl {

   public int a;
   public int b;
   public byte c;
   public byte d;
   public byte[] e = new byte[16384];
   public List f = new ArrayList();
   private Map i = new HashMap();
   public Map g = new LinkedHashMap();


   public ayi(String var1) {
      super(var1);
   }

   public void a(dh var1) {
      this.c = var1.d("dimension");
      this.a = var1.f("xCenter");
      this.b = var1.f("zCenter");
      this.d = var1.d("scale");
      if(this.d < 0) {
         this.d = 0;
      }

      if(this.d > 4) {
         this.d = 4;
      }

      short var2 = var1.e("width");
      short var3 = var1.e("height");
      if(var2 == 128 && var3 == 128) {
         this.e = var1.k("colors");
      } else {
         byte[] var4 = var1.k("colors");
         this.e = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if(var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if(var10 >= 0 || var10 < 128) {
                     this.e[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public void b(dh var1) {
      var1.a("dimension", this.c);
      var1.a("xCenter", this.a);
      var1.a("zCenter", this.b);
      var1.a("scale", this.d);
      var1.a("width", (short)128);
      var1.a("height", (short)128);
      var1.a("colors", this.e);
   }

   public void a(yz var1, add var2) {
      if(!this.i.containsKey(var1)) {
         ayj var3 = new ayj(this, var1);
         this.i.put(var1, var3);
         this.f.add(var3);
      }

      if(!var1.bm.c(var2)) {
         this.g.remove(var1.b_());
      }

      for(int var5 = 0; var5 < this.f.size(); ++var5) {
         ayj var4 = (ayj)this.f.get(var5);
         if(!var4.a.K && (var4.a.bm.c(var2) || var2.A())) {
            if(!var2.A() && var4.a.ap == this.c) {
               this.a(0, var4.a.o, var4.a.b_(), var4.a.s, var4.a.u, (double)var4.a.y);
            }
         } else {
            this.i.remove(var4.a);
            this.f.remove(var4);
         }
      }

      if(var2.A()) {
         this.a(1, var1.o, "frame-" + var2.B().y(), (double)var2.B().b, (double)var2.B().d, (double)(var2.B().a * 90));
      }

   }

   private void a(int var1, ahb var2, String var3, double var4, double var6, double var8) {
      int var10 = 1 << this.d;
      float var11 = (float)(var4 - (double)this.a) / (float)var10;
      float var12 = (float)(var6 - (double)this.b) / (float)var10;
      byte var13 = (byte)((int)((double)(var11 * 2.0F) + 0.5D));
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5D));
      byte var16 = 63;
      byte var15;
      if(var11 >= (float)(-var16) && var12 >= (float)(-var16) && var11 <= (float)var16 && var12 <= (float)var16) {
         var8 += var8 < 0.0D?-8.0D:8.0D;
         var15 = (byte)((int)(var8 * 16.0D / 360.0D));
         if(this.c < 0) {
            int var17 = (int)(var2.N().g() / 10L);
            var15 = (byte)(var17 * var17 * 34187121 + var17 * 121 >> 15 & 15);
         }
      } else {
         if(Math.abs(var11) >= 320.0F || Math.abs(var12) >= 320.0F) {
            this.g.remove(var3);
            return;
         }

         var1 = 6;
         var15 = 0;
         if(var11 <= (float)(-var16)) {
            var13 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if(var12 <= (float)(-var16)) {
            var14 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if(var11 >= (float)var16) {
            var13 = (byte)(var16 * 2 + 1);
         }

         if(var12 >= (float)var16) {
            var14 = (byte)(var16 * 2 + 1);
         }
      }

      this.g.put(var3, new ayk(this, (byte)var1, var13, var14, var15));
   }

   public byte[] a(add var1, ahb var2, yz var3) {
      ayj var4 = (ayj)this.i.get(var3);
      return var4 == null?null:var4.a(var1);
   }

   public void a(int var1, int var2, int var3) {
      super.c();

      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         ayj var5 = (ayj)this.f.get(var4);
         if(var5.b[var1] < 0 || var5.b[var1] > var2) {
            var5.b[var1] = var2;
         }

         if(var5.c[var1] < 0 || var5.c[var1] < var3) {
            var5.c[var1] = var3;
         }
      }

   }

   public ayj a(yz var1) {
      ayj var2 = (ayj)this.i.get(var1);
      if(var2 == null) {
         var2 = new ayj(this, var1);
         this.i.put(var1, var2);
         this.f.add(var2);
      }

      return var2;
   }
}
