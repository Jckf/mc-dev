import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public abstract class ave extends aqx {

   private avj e;
   protected Map d = new HashMap();


   public abstract String a();

   protected final void a(ahb var1, int var2, int var3, int var4, int var5, aji[] var6) {
      this.a(var1);
      if(!this.d.containsKey(Long.valueOf(agu.a(var2, var3)))) {
         this.b.nextInt();

         try {
            if(this.a(var2, var3)) {
               avm var7 = this.b(var2, var3);
               this.d.put(Long.valueOf(agu.a(var2, var3)), var7);
               this.a(var2, var3, var7);
            }

         } catch (Throwable var10) {
            b var8 = b.a(var10, "Exception preparing structure feature");
            k var9 = var8.a("Feature being prepared");
            var9.a("Is feature chunk", (Callable)(new avf(this, var2, var3)));
            var9.a("Chunk location", (Object)String.format("%d,%d", new Object[]{Integer.valueOf(var2), Integer.valueOf(var3)}));
            var9.a("Chunk pos hash", (Callable)(new avg(this, var2, var3)));
            var9.a("Structure type", (Callable)(new avh(this)));
            throw new s(var8);
         }
      }
   }

   public boolean a(ahb var1, Random var2, int var3, int var4) {
      this.a(var1);
      int var5 = (var3 << 4) + 8;
      int var6 = (var4 << 4) + 8;
      boolean var7 = false;
      Iterator var8 = this.d.values().iterator();

      while(var8.hasNext()) {
         avm var9 = (avm)var8.next();
         if(var9.d() && var9.a().a(var5, var6, var5 + 15, var6 + 15)) {
            var9.a(var1, var2, new asv(var5, var6, var5 + 15, var6 + 15));
            var7 = true;
            this.a(var9.e(), var9.f(), var9);
         }
      }

      return var7;
   }

   public boolean b(int var1, int var2, int var3) {
      this.a(this.c);
      return this.c(var1, var2, var3) != null;
   }

   protected avm c(int var1, int var2, int var3) {
      Iterator var4 = this.d.values().iterator();

      while(var4.hasNext()) {
         avm var5 = (avm)var4.next();
         if(var5.d() && var5.a().a(var1, var3, var1, var3)) {
            Iterator var6 = var5.b().iterator();

            while(var6.hasNext()) {
               avk var7 = (avk)var6.next();
               if(var7.c().b(var1, var2, var3)) {
                  return var5;
               }
            }
         }
      }

      return null;
   }

   public boolean d(int var1, int var2, int var3) {
      this.a(this.c);
      Iterator var4 = this.d.values().iterator();

      avm var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (avm)var4.next();
      } while(!var5.d());

      return var5.a().a(var1, var3, var1, var3);
   }

   public agt a(ahb var1, int var2, int var3, int var4) {
      this.c = var1;
      this.a(var1);
      this.b.setSeed(var1.H());
      long var5 = this.b.nextLong();
      long var7 = this.b.nextLong();
      long var9 = (long)(var2 >> 4) * var5;
      long var11 = (long)(var4 >> 4) * var7;
      this.b.setSeed(var9 ^ var11 ^ var1.H());
      this.a(var1, var2 >> 4, var4 >> 4, 0, 0, (aji[])null);
      double var13 = Double.MAX_VALUE;
      agt var15 = null;
      Iterator var16 = this.d.values().iterator();

      agt var19;
      int var20;
      int var21;
      int var22;
      double var23;
      while(var16.hasNext()) {
         avm var17 = (avm)var16.next();
         if(var17.d()) {
            avk var18 = (avk)var17.b().get(0);
            var19 = var18.a();
            var20 = var19.a - var2;
            var21 = var19.b - var3;
            var22 = var19.c - var4;
            var23 = (double)(var20 * var20 + var21 * var21 + var22 * var22);
            if(var23 < var13) {
               var13 = var23;
               var15 = var19;
            }
         }
      }

      if(var15 != null) {
         return var15;
      } else {
         List var25 = this.o_();
         if(var25 != null) {
            agt var26 = null;
            Iterator var27 = var25.iterator();

            while(var27.hasNext()) {
               var19 = (agt)var27.next();
               var20 = var19.a - var2;
               var21 = var19.b - var3;
               var22 = var19.c - var4;
               var23 = (double)(var20 * var20 + var21 * var21 + var22 * var22);
               if(var23 < var13) {
                  var13 = var23;
                  var26 = var19;
               }
            }

            return var26;
         } else {
            return null;
         }
      }
   }

   protected List o_() {
      return null;
   }

   private void a(ahb var1) {
      if(this.e == null) {
         this.e = (avj)var1.a(avj.class, this.a());
         if(this.e == null) {
            this.e = new avj(this.a());
            var1.a(this.a(), (ayl)this.e);
         } else {
            dh var2 = this.e.a();
            Iterator var3 = var2.c().iterator();

            while(var3.hasNext()) {
               String var4 = (String)var3.next();
               dy var5 = var2.a(var4);
               if(var5.a() == 10) {
                  dh var6 = (dh)var5;
                  if(var6.c("ChunkX") && var6.c("ChunkZ")) {
                     int var7 = var6.f("ChunkX");
                     int var8 = var6.f("ChunkZ");
                     avm var9 = avi.a(var6, var1);
                     if(var9 != null) {
                        this.d.put(Long.valueOf(agu.a(var7, var8)), var9);
                     }
                  }
               }
            }
         }
      }

   }

   private void a(int var1, int var2, avm var3) {
      this.e.a(var3.a(var1, var2), var1, var2);
      this.e.c();
   }

   protected abstract boolean a(int var1, int var2);

   protected abstract avm b(int var1, int var2);
}
