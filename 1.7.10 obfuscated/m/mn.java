import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mn {

   private static final Logger a = LogManager.getLogger();
   private final mt b;
   private Set c = new HashSet();
   private pz d = new pz();
   private int e;


   public mn(mt var1) {
      this.b = var1;
      this.e = var1.q().ah().d();
   }

   public void a(sa var1) {
      if(var1 instanceof mw) {
         this.a(var1, 512, 2);
         mw var2 = (mw)var1;
         Iterator var3 = this.c.iterator();

         while(var3.hasNext()) {
            my var4 = (my)var3.next();
            if(var4.a != var2) {
               var4.b(var2);
            }
         }
      } else if(var1 instanceof xe) {
         this.a(var1, 64, 5, true);
      } else if(var1 instanceof zc) {
         this.a(var1, 64, 20, false);
      } else if(var1 instanceof zi) {
         this.a(var1, 64, 10, false);
      } else if(var1 instanceof ze) {
         this.a(var1, 64, 10, false);
      } else if(var1 instanceof zj) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof zm) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof zd) {
         this.a(var1, 64, 4, true);
      } else if(var1 instanceof zl) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof zo) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof zn) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof zf) {
         this.a(var1, 64, 10, true);
      } else if(var1 instanceof xk) {
         this.a(var1, 64, 20, true);
      } else if(var1 instanceof xl) {
         this.a(var1, 80, 3, true);
      } else if(var1 instanceof xi) {
         this.a(var1, 80, 3, true);
      } else if(var1 instanceof ws) {
         this.a(var1, 64, 3, true);
      } else if(var1 instanceof xc) {
         this.a(var1, 80, 3, false);
      } else if(var1 instanceof we) {
         this.a(var1, 80, 3, false);
      } else if(var1 instanceof ry) {
         this.a(var1, 80, 3, true);
      } else if(var1 instanceof xa) {
         this.a(var1, 160, 3, true);
      } else if(var1 instanceof xw) {
         this.a(var1, 160, 10, true);
      } else if(var1 instanceof xj) {
         this.a(var1, 160, 20, true);
      } else if(var1 instanceof ss) {
         this.a(var1, 160, Integer.MAX_VALUE, false);
      } else if(var1 instanceof sq) {
         this.a(var1, 160, 20, true);
      } else if(var1 instanceof wz) {
         this.a(var1, 256, Integer.MAX_VALUE, false);
      }

   }

   public void a(sa var1, int var2, int var3) {
      this.a(var1, var2, var3, false);
   }

   public void a(sa var1, int var2, int var3, boolean var4) {
      if(var2 > this.e) {
         var2 = this.e;
      }

      try {
         if(this.d.b(var1.y())) {
            throw new IllegalStateException("Entity is already tracked!");
         }

         my var5 = new my(var1, var2, var3, var4);
         this.c.add(var5);
         this.d.a(var1.y(), var5);
         var5.b(this.b.h);
      } catch (Throwable var11) {
         b var6 = b.a(var11, "Adding entity to track");
         k var7 = var6.a("Entity To Track");
         var7.a("Tracking range", (Object)(var2 + " blocks"));
         var7.a("Update interval", (Callable)(new mo(this, var3)));
         var1.a(var7);
         k var8 = var6.a("Entity That Is Already Tracked");
         ((my)this.d.a(var1.y())).a.a(var8);

         try {
            throw new s(var6);
         } catch (s var10) {
            a.error("\"Silently\" catching entity tracking error.", (Throwable)var10);
         }
      }

   }

   public void b(sa var1) {
      if(var1 instanceof mw) {
         mw var2 = (mw)var1;
         Iterator var3 = this.c.iterator();

         while(var3.hasNext()) {
            my var4 = (my)var3.next();
            var4.a(var2);
         }
      }

      my var5 = (my)this.d.d(var1.y());
      if(var5 != null) {
         this.c.remove(var5);
         var5.a();
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.c.iterator();

      while(var2.hasNext()) {
         my var3 = (my)var2.next();
         var3.a(this.b.h);
         if(var3.n && var3.a instanceof mw) {
            var1.add((mw)var3.a);
         }
      }

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         mw var7 = (mw)var1.get(var6);
         Iterator var4 = this.c.iterator();

         while(var4.hasNext()) {
            my var5 = (my)var4.next();
            if(var5.a != var7) {
               var5.b(var7);
            }
         }
      }

   }

   public void a(sa var1, ft var2) {
      my var3 = (my)this.d.a(var1.y());
      if(var3 != null) {
         var3.a(var2);
      }

   }

   public void b(sa var1, ft var2) {
      my var3 = (my)this.d.a(var1.y());
      if(var3 != null) {
         var3.b(var2);
      }

   }

   public void a(mw var1) {
      Iterator var2 = this.c.iterator();

      while(var2.hasNext()) {
         my var3 = (my)var2.next();
         var3.c(var1);
      }

   }

   public void a(mw var1, apx var2) {
      Iterator var3 = this.c.iterator();

      while(var3.hasNext()) {
         my var4 = (my)var3.next();
         if(var4.a != var1 && var4.a.ah == var2.g && var4.a.aj == var2.h) {
            var4.b(var1);
         }
      }

   }

}
