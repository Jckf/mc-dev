import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ms implements apu {

   private static final Logger b = LogManager.getLogger();
   private Set c = Collections.newSetFromMap(new ConcurrentHashMap());
   private apx d;
   private apu e;
   private aqc f;
   public boolean a = true;
   private qd g = new qd();
   private List h = new ArrayList();
   private mt i;


   public ms(mt var1, aqc var2, apu var3) {
      this.d = new apw(var1, 0, 0);
      this.i = var1;
      this.f = var2;
      this.e = var3;
   }

   public boolean a(int var1, int var2) {
      return this.g.b(agu.a(var1, var2));
   }

   public List a() {
      return this.h;
   }

   public void b(int var1, int var2) {
      if(this.i.t.e()) {
         r var3 = this.i.K();
         int var4 = var1 * 16 + 8 - var3.a;
         int var5 = var2 * 16 + 8 - var3.c;
         short var6 = 128;
         if(var4 < -var6 || var4 > var6 || var5 < -var6 || var5 > var6) {
            this.c.add(Long.valueOf(agu.a(var1, var2)));
         }
      } else {
         this.c.add(Long.valueOf(agu.a(var1, var2)));
      }

   }

   public void b() {
      Iterator var1 = this.h.iterator();

      while(var1.hasNext()) {
         apx var2 = (apx)var1.next();
         this.b(var2.g, var2.h);
      }

   }

   public apx c(int var1, int var2) {
      long var3 = agu.a(var1, var2);
      this.c.remove(Long.valueOf(var3));
      apx var5 = (apx)this.g.a(var3);
      if(var5 == null) {
         var5 = this.f(var1, var2);
         if(var5 == null) {
            if(this.e == null) {
               var5 = this.d;
            } else {
               try {
                  var5 = this.e.d(var1, var2);
               } catch (Throwable var9) {
                  b var7 = b.a(var9, "Exception generating new chunk");
                  k var8 = var7.a("Chunk to be generated");
                  var8.a("Location", (Object)String.format("%d,%d", new Object[]{Integer.valueOf(var1), Integer.valueOf(var2)}));
                  var8.a("Position hash", (Object)Long.valueOf(var3));
                  var8.a("Generator", (Object)this.e.f());
                  throw new s(var7);
               }
            }
         }

         this.g.a(var3, var5);
         this.h.add(var5);
         var5.c();
         var5.a(this, this, var1, var2);
      }

      return var5;
   }

   public apx d(int var1, int var2) {
      apx var3 = (apx)this.g.a(agu.a(var1, var2));
      return var3 == null?(!this.i.y && !this.a?this.d:this.c(var1, var2)):var3;
   }

   private apx f(int var1, int var2) {
      if(this.f == null) {
         return null;
      } else {
         try {
            apx var3 = this.f.a(this.i, var1, var2);
            if(var3 != null) {
               var3.p = this.i.I();
               if(this.e != null) {
                  this.e.e(var1, var2);
               }
            }

            return var3;
         } catch (Exception var4) {
            b.error("Couldn\'t load chunk", (Throwable)var4);
            return null;
         }
      }
   }

   private void a(apx var1) {
      if(this.f != null) {
         try {
            this.f.b(this.i, var1);
         } catch (Exception var3) {
            b.error("Couldn\'t save entities", (Throwable)var3);
         }

      }
   }

   private void b(apx var1) {
      if(this.f != null) {
         try {
            var1.p = this.i.I();
            this.f.a(this.i, var1);
         } catch (IOException var3) {
            b.error("Couldn\'t save chunk", (Throwable)var3);
         } catch (ahg var4) {
            b.error("Couldn\'t save chunk; already in use by another instance of Minecraft?", (Throwable)var4);
         }

      }
   }

   public void a(apu var1, int var2, int var3) {
      apx var4 = this.d(var2, var3);
      if(!var4.k) {
         var4.p();
         if(this.e != null) {
            this.e.a(var1, var2, var3);
            var4.e();
         }
      }

   }

   public boolean a(boolean var1, qk var2) {
      int var3 = 0;
      ArrayList var4 = Lists.newArrayList((Iterable)this.h);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         apx var6 = (apx)var4.get(var5);
         if(var1) {
            this.a(var6);
         }

         if(var6.a(var1)) {
            this.b(var6);
            var6.n = false;
            ++var3;
            if(var3 == 24 && !var1) {
               return false;
            }
         }
      }

      return true;
   }

   public void c() {
      if(this.f != null) {
         this.f.b();
      }

   }

   public boolean d() {
      if(!this.i.c) {
         for(int var1 = 0; var1 < 100; ++var1) {
            if(!this.c.isEmpty()) {
               Long var2 = (Long)this.c.iterator().next();
               apx var3 = (apx)this.g.a(var2.longValue());
               if(var3 != null) {
                  var3.d();
                  this.b(var3);
                  this.a(var3);
                  this.h.remove(var3);
               }

               this.c.remove(var2);
               this.g.d(var2.longValue());
            }
         }

         if(this.f != null) {
            this.f.a();
         }
      }

      return this.e.d();
   }

   public boolean e() {
      return !this.i.c;
   }

   public String f() {
      return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
   }

   public List a(sx var1, int var2, int var3, int var4) {
      return this.e.a(var1, var2, var3, var4);
   }

   public agt a(ahb var1, String var2, int var3, int var4, int var5) {
      return this.e.a(var1, var2, var3, var4, var5);
   }

   public int g() {
      return this.g.a();
   }

   public void e(int var1, int var2) {}

}
