import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nh implements io {

   private static final Logger c = LogManager.getLogger();
   public final ej a;
   private final MinecraftServer d;
   public mw b;
   private int e;
   private int f;
   private boolean g;
   private int h;
   private long i;
   private static Random j = new Random();
   private long k;
   private int l;
   private int m;
   private pz n = new pz();
   private double o;
   private double p;
   private double q;
   private boolean r = true;


   public nh(MinecraftServer var1, ej var2, mw var3) {
      this.d = var1;
      this.a = var2;
      var2.a((fb)this);
      this.b = var3;
      var3.a = this;
   }

   public void a() {
      this.g = false;
      ++this.e;
      this.d.b.a("keepAlive");
      if((long)this.e - this.k > 40L) {
         this.k = (long)this.e;
         this.i = this.d();
         this.h = (int)this.i;
         this.a((ft)(new gw(this.h)));
      }

      if(this.l > 0) {
         --this.l;
      }

      if(this.m > 0) {
         --this.m;
      }

      if(this.b.x() > 0L && this.d.as() > 0 && MinecraftServer.ar() - this.b.x() > (long)(this.d.as() * 1000 * 60)) {
         this.c("You have been idle for too long!");
      }

   }

   public ej b() {
      return this.a;
   }

   public void c(String var1) {
      fq var2 = new fq(var1);
      this.a.a((ft)(new gs(var2)), new GenericFutureListener[]{new ni(this, var2)});
      this.a.g();
   }

   public void a(jk var1) {
      this.b.a(var1.c(), var1.d(), var1.e(), var1.f());
   }

   public void a(jd var1) {
      mt var2 = this.d.a(this.b.ap);
      this.g = true;
      if(!this.b.i) {
         double var3;
         if(!this.r) {
            var3 = var1.d() - this.p;
            if(var1.c() == this.o && var3 * var3 < 0.01D && var1.e() == this.q) {
               this.r = true;
            }
         }

         if(this.r) {
            double var5;
            double var7;
            double var9;
            if(this.b.m != null) {
               float var34 = this.b.y;
               float var4 = this.b.z;
               this.b.m.ac();
               var5 = this.b.s;
               var7 = this.b.t;
               var9 = this.b.u;
               if(var1.k()) {
                  var34 = var1.g();
                  var4 = var1.h();
               }

               this.b.D = var1.i();
               this.b.i();
               this.b.V = 0.0F;
               this.b.a(var5, var7, var9, var34, var4);
               if(this.b.m != null) {
                  this.b.m.ac();
               }

               this.d.ah().d(this.b);
               if(this.r) {
                  this.o = this.b.s;
                  this.p = this.b.t;
                  this.q = this.b.u;
               }

               var2.g(this.b);
               return;
            }

            if(this.b.bm()) {
               this.b.i();
               this.b.a(this.o, this.p, this.q, this.b.y, this.b.z);
               var2.g(this.b);
               return;
            }

            var3 = this.b.t;
            this.o = this.b.s;
            this.p = this.b.t;
            this.q = this.b.u;
            var5 = this.b.s;
            var7 = this.b.t;
            var9 = this.b.u;
            float var11 = this.b.y;
            float var12 = this.b.z;
            if(var1.j() && var1.d() == -999.0D && var1.f() == -999.0D) {
               var1.a(false);
            }

            double var13;
            if(var1.j()) {
               var5 = var1.c();
               var7 = var1.d();
               var9 = var1.e();
               var13 = var1.f() - var1.d();
               if(!this.b.bm() && (var13 > 1.65D || var13 < 0.1D)) {
                  this.c("Illegal stance");
                  c.warn(this.b.b_() + " had an illegal stance: " + var13);
                  return;
               }

               if(Math.abs(var1.c()) > 3.2E7D || Math.abs(var1.e()) > 3.2E7D) {
                  this.c("Illegal position");
                  return;
               }
            }

            if(var1.k()) {
               var11 = var1.g();
               var12 = var1.h();
            }

            this.b.i();
            this.b.V = 0.0F;
            this.b.a(this.o, this.p, this.q, var11, var12);
            if(!this.r) {
               return;
            }

            var13 = var5 - this.b.s;
            double var15 = var7 - this.b.t;
            double var17 = var9 - this.b.u;
            double var19 = Math.min(Math.abs(var13), Math.abs(this.b.v));
            double var21 = Math.min(Math.abs(var15), Math.abs(this.b.w));
            double var23 = Math.min(Math.abs(var17), Math.abs(this.b.x));
            double var25 = var19 * var19 + var21 * var21 + var23 * var23;
            if(var25 > 100.0D && (!this.d.N() || !this.d.M().equals(this.b.b_()))) {
               c.warn(this.b.b_() + " moved too quickly! " + var13 + "," + var15 + "," + var17 + " (" + var19 + ", " + var21 + ", " + var23 + ")");
               this.a(this.o, this.p, this.q, this.b.y, this.b.z);
               return;
            }

            float var27 = 0.0625F;
            boolean var28 = var2.a(this.b, this.b.C.b().e((double)var27, (double)var27, (double)var27)).isEmpty();
            if(this.b.D && !var1.i() && var15 > 0.0D) {
               this.b.bj();
            }

            this.b.d(var13, var15, var17);
            this.b.D = var1.i();
            this.b.k(var13, var15, var17);
            double var29 = var15;
            var13 = var5 - this.b.s;
            var15 = var7 - this.b.t;
            if(var15 > -0.5D || var15 < 0.5D) {
               var15 = 0.0D;
            }

            var17 = var9 - this.b.u;
            var25 = var13 * var13 + var15 * var15 + var17 * var17;
            boolean var31 = false;
            if(var25 > 0.0625D && !this.b.bm() && !this.b.c.d()) {
               var31 = true;
               c.warn(this.b.b_() + " moved wrongly!");
            }

            this.b.a(var5, var7, var9, var11, var12);
            boolean var32 = var2.a(this.b, this.b.C.b().e((double)var27, (double)var27, (double)var27)).isEmpty();
            if(var28 && (var31 || !var32) && !this.b.bm()) {
               this.a(this.o, this.p, this.q, var11, var12);
               return;
            }

            azt var33 = this.b.C.b().b((double)var27, (double)var27, (double)var27).a(0.0D, -0.55D, 0.0D);
            if(!this.d.ac() && !this.b.c.d() && !var2.c(var33)) {
               if(var29 >= -0.03125D) {
                  ++this.f;
                  if(this.f > 80) {
                     c.warn(this.b.b_() + " was kicked for floating too long!");
                     this.c("Flying is not enabled on this server");
                     return;
                  }
               }
            } else {
               this.f = 0;
            }

            this.b.D = var1.i();
            this.d.ah().d(this.b);
            this.b.b(this.b.t - var3, var1.i());
         } else if(this.e % 20 == 0) {
            this.a(this.o, this.p, this.q, this.b.y, this.b.z);
         }

      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.r = false;
      this.o = var1;
      this.p = var3;
      this.q = var5;
      this.b.a(var1, var3, var5, var7, var8);
      this.b.a.a((ft)(new fu(var1, var3 + 1.6200000047683716D, var5, var7, var8, false)));
   }

   public void a(ji var1) {
      mt var2 = this.d.a(this.b.ap);
      this.b.v();
      if(var1.g() == 4) {
         this.b.a(false);
      } else if(var1.g() == 3) {
         this.b.a(true);
      } else if(var1.g() == 5) {
         this.b.bA();
      } else {
         boolean var3 = false;
         if(var1.g() == 0) {
            var3 = true;
         }

         if(var1.g() == 1) {
            var3 = true;
         }

         if(var1.g() == 2) {
            var3 = true;
         }

         int var4 = var1.c();
         int var5 = var1.d();
         int var6 = var1.e();
         if(var3) {
            double var7 = this.b.s - ((double)var4 + 0.5D);
            double var9 = this.b.t - ((double)var5 + 0.5D) + 1.5D;
            double var11 = this.b.u - ((double)var6 + 0.5D);
            double var13 = var7 * var7 + var9 * var9 + var11 * var11;
            if(var13 > 36.0D) {
               return;
            }

            if(var5 >= this.d.af()) {
               return;
            }
         }

         if(var1.g() == 0) {
            if(!this.d.a(var2, var4, var5, var6, this.b)) {
               this.b.c.a(var4, var5, var6, var1.f());
            } else {
               this.b.a.a((ft)(new gh(var4, var5, var6, var2)));
            }
         } else if(var1.g() == 2) {
            this.b.c.a(var4, var5, var6);
            if(var2.a(var4, var5, var6).o() != awt.a) {
               this.b.a.a((ft)(new gh(var4, var5, var6, var2)));
            }
         } else if(var1.g() == 1) {
            this.b.c.c(var4, var5, var6);
            if(var2.a(var4, var5, var6).o() != awt.a) {
               this.b.a.a((ft)(new gh(var4, var5, var6, var2)));
            }
         }

      }
   }

   public void a(jo var1) {
      mt var2 = this.d.a(this.b.ap);
      add var3 = this.b.bm.h();
      boolean var4 = false;
      int var5 = var1.c();
      int var6 = var1.d();
      int var7 = var1.e();
      int var8 = var1.f();
      this.b.v();
      if(var1.f() == 255) {
         if(var3 == null) {
            return;
         }

         this.b.c.a(this.b, var2, var3);
      } else if(var1.d() >= this.d.af() - 1 && (var1.f() == 1 || var1.d() >= this.d.af())) {
         fr var9 = new fr("build.tooHigh", new Object[]{Integer.valueOf(this.d.af())});
         var9.b().a(a.m);
         this.b.a.a((ft)(new gj(var9)));
         var4 = true;
      } else {
         if(this.r && this.b.e((double)var5 + 0.5D, (double)var6 + 0.5D, (double)var7 + 0.5D) < 64.0D && !this.d.a(var2, var5, var6, var7, this.b)) {
            this.b.c.a(this.b, var2, var3, var5, var6, var7, var8, var1.h(), var1.i(), var1.j());
         }

         var4 = true;
      }

      if(var4) {
         this.b.a.a((ft)(new gh(var5, var6, var7, var2)));
         if(var8 == 0) {
            --var6;
         }

         if(var8 == 1) {
            ++var6;
         }

         if(var8 == 2) {
            --var7;
         }

         if(var8 == 3) {
            ++var7;
         }

         if(var8 == 4) {
            --var5;
         }

         if(var8 == 5) {
            ++var5;
         }

         this.b.a.a((ft)(new gh(var5, var6, var7, var2)));
      }

      var3 = this.b.bm.h();
      if(var3 != null && var3.b == 0) {
         this.b.bm.a[this.b.bm.c] = null;
         var3 = null;
      }

      if(var3 == null || var3.n() == 0) {
         this.b.g = true;
         this.b.bm.a[this.b.bm.c] = add.b(this.b.bm.a[this.b.bm.c]);
         aay var10 = this.b.bo.a((rb)this.b.bm, this.b.bm.c);
         this.b.bo.b();
         this.b.g = false;
         if(!add.b(this.b.bm.h(), var1.g())) {
            this.a((ft)(new gq(this.b.bo.d, var10.g, this.b.bm.h())));
         }
      }

   }

   public void a(fj var1) {
      c.info(this.b.b_() + " lost connection: " + var1);
      this.d.az();
      fr var2 = new fr("multiplayer.player.left", new Object[]{this.b.c_()});
      var2.b().a(a.o);
      this.d.ah().a((fj)var2);
      this.b.n();
      this.d.ah().e(this.b);
      if(this.d.N() && this.b.b_().equals(this.d.M())) {
         c.info("Stopping singleplayer server as player logged out");
         this.d.r();
      }

   }

   public void a(ft var1) {
      if(var1 instanceof gj) {
         gj var2 = (gj)var1;
         zb var3 = this.b.u();
         if(var3 == zb.c) {
            return;
         }

         if(var3 == zb.b && !var2.d()) {
            return;
         }
      }

      try {
         this.a.a(var1, new GenericFutureListener[0]);
      } catch (Throwable var5) {
         b var6 = b.a(var5, "Sending packet");
         k var4 = var6.a("Packet being sent");
         var4.a("Packet class", (Callable)(new nj(this, var1)));
         throw new s(var6);
      }
   }

   public void a(jl var1) {
      if(var1.c() >= 0 && var1.c() < yx.i()) {
         this.b.bm.c = var1.c();
         this.b.v();
      } else {
         c.warn(this.b.b_() + " tried to set an invalid carried item");
      }
   }

   public void a(ir var1) {
      if(this.b.u() == zb.c) {
         fr var4 = new fr("chat.cannotSend", new Object[0]);
         var4.b().a(a.m);
         this.a((ft)(new gj(var4)));
      } else {
         this.b.v();
         String var2 = var1.c();
         var2 = StringUtils.normalizeSpace(var2);

         for(int var3 = 0; var3 < var2.length(); ++var3) {
            if(!t.a(var2.charAt(var3))) {
               this.c("Illegal characters in chat");
               return;
            }
         }

         if(var2.startsWith("/")) {
            this.d(var2);
         } else {
            fr var5 = new fr("chat.type.text", new Object[]{this.b.c_(), var2});
            this.d.ah().a(var5, false);
         }

         this.l += 20;
         if(this.l > 200 && !this.d.ah().g(this.b.bJ())) {
            this.c("disconnect.spam");
         }

      }
   }

   private void d(String var1) {
      this.d.J().a(this.b, var1);
   }

   public void a(ip var1) {
      this.b.v();
      if(var1.d() == 1) {
         this.b.ba();
      }

   }

   public void a(jj var1) {
      this.b.v();
      if(var1.d() == 1) {
         this.b.b(true);
      } else if(var1.d() == 2) {
         this.b.b(false);
      } else if(var1.d() == 4) {
         this.b.c(true);
      } else if(var1.d() == 5) {
         this.b.c(false);
      } else if(var1.d() == 3) {
         this.b.a(false, true, true);
         this.r = false;
      } else if(var1.d() == 6) {
         if(this.b.m != null && this.b.m instanceof wi) {
            ((wi)this.b.m).w(var1.e());
         }
      } else if(var1.d() == 7 && this.b.m != null && this.b.m instanceof wi) {
         ((wi)this.b.m).g(this.b);
      }

   }

   public void a(ja var1) {
      mt var2 = this.d.a(this.b.ap);
      sa var3 = var1.a((ahb)var2);
      this.b.v();
      if(var3 != null) {
         boolean var4 = this.b.p(var3);
         double var5 = 36.0D;
         if(!var4) {
            var5 = 9.0D;
         }

         if(this.b.f(var3) < var5) {
            if(var1.c() == jb.a) {
               this.b.q(var3);
            } else if(var1.c() == jb.b) {
               if(var3 instanceof xk || var3 instanceof sq || var3 instanceof zc || var3 == this.b) {
                  this.c("Attempting to attack an invalid entity");
                  this.d.f("Player " + this.b.b_() + " tried to attack an invalid entity");
                  return;
               }

               this.b.r(var3);
            }
         }
      }

   }

   public void a(is var1) {
      this.b.v();
      it var2 = var1.c();
      switch(nk.a[var2.ordinal()]) {
      case 1:
         if(this.b.i) {
            this.b = this.d.ah().a(this.b, 0, true);
         } else if(this.b.r().N().t()) {
            if(this.d.N() && this.b.b_().equals(this.d.M())) {
               this.b.a.c("You have died. Game over, man, it\'s game over!");
               this.d.U();
            } else {
               oq var3 = new oq(this.b.bJ(), (Date)null, "(You just lost the game)", (Date)null, "Death in Hardcore");
               this.d.ah().h().a((ol)var3);
               this.b.a.c("You have died. Game over, man, it\'s game over!");
            }
         } else {
            if(this.b.aS() > 0.0F) {
               return;
            }

            this.b = this.d.ah().a(this.b, 0, false);
         }
         break;
      case 2:
         this.b.w().a(this.b);
         break;
      case 3:
         this.b.a((ph)pc.f);
      }

   }

   public void a(iy var1) {
      this.b.m();
   }

   public void a(ix var1) {
      this.b.v();
      if(this.b.bo.d == var1.c() && this.b.bo.c(this.b)) {
         add var2 = this.b.bo.a(var1.d(), var1.e(), var1.h(), this.b);
         if(add.b(var1.g(), var2)) {
            this.b.a.a((ft)(new gl(var1.c(), var1.f(), true)));
            this.b.g = true;
            this.b.bo.b();
            this.b.l();
            this.b.g = false;
         } else {
            this.n.a(this.b.bo.d, Short.valueOf(var1.f()));
            this.b.a.a((ft)(new gl(var1.c(), var1.f(), false)));
            this.b.bo.a(this.b, false);
            ArrayList var3 = new ArrayList();

            for(int var4 = 0; var4 < this.b.bo.c.size(); ++var4) {
               var3.add(((aay)this.b.bo.c.get(var4)).d());
            }

            this.b.a(this.b.bo, (List)var3);
         }
      }

   }

   public void a(iw var1) {
      this.b.v();
      if(this.b.bo.d == var1.c() && this.b.bo.c(this.b)) {
         this.b.bo.a((yz)this.b, var1.d());
         this.b.bo.b();
      }

   }

   public void a(jm var1) {
      if(this.b.c.d()) {
         boolean var2 = var1.c() < 0;
         add var3 = var1.d();
         boolean var4 = var1.c() >= 1 && var1.c() < 36 + yx.i();
         boolean var5 = var3 == null || var3.b() != null;
         boolean var6 = var3 == null || var3.k() >= 0 && var3.b <= 64 && var3.b > 0;
         if(var4 && var5 && var6) {
            if(var3 == null) {
               this.b.bn.a(var1.c(), (add)null);
            } else {
               this.b.bn.a(var1.c(), var3);
            }

            this.b.bn.a(this.b, true);
         } else if(var2 && var5 && var6 && this.m < 200) {
            this.m += 20;
            xk var7 = this.b.a(var3, true);
            if(var7 != null) {
               var7.e();
            }
         }
      }

   }

   public void a(iv var1) {
      Short var2 = (Short)this.n.a(this.b.bo.d);
      if(var2 != null && var1.d() == var2.shortValue() && this.b.bo.d == var1.c() && !this.b.bo.c(this.b)) {
         this.b.bo.a(this.b, true);
      }

   }

   public void a(jn var1) {
      this.b.v();
      mt var2 = this.d.a(this.b.ap);
      if(var2.d(var1.c(), var1.d(), var1.e())) {
         aor var3 = var2.o(var1.c(), var1.d(), var1.e());
         if(var3 instanceof apm) {
            apm var4 = (apm)var3;
            if(!var4.a() || var4.b() != this.b) {
               this.d.f("Player " + this.b.b_() + " just tried to change non-editable sign");
               return;
            }
         }

         int var6;
         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            boolean var5 = true;
            if(var1.f()[var8].length() > 15) {
               var5 = false;
            } else {
               for(var6 = 0; var6 < var1.f()[var8].length(); ++var6) {
                  if(!t.a(var1.f()[var8].charAt(var6))) {
                     var5 = false;
                  }
               }
            }

            if(!var5) {
               var1.f()[var8] = "!?";
            }
         }

         if(var3 instanceof apm) {
            var8 = var1.c();
            int var9 = var1.d();
            var6 = var1.e();
            apm var7 = (apm)var3;
            System.arraycopy(var1.f(), 0, var7.a, 0, 4);
            var7.e();
            var2.g(var8, var9, var6);
         }
      }

   }

   public void a(jc var1) {
      if(var1.c() == this.h) {
         int var2 = (int)(this.d() - this.i);
         this.b.h = (this.b.h * 3 + var2) / 4;
      }

   }

   private long d() {
      return System.nanoTime() / 1000000L;
   }

   public void a(jh var1) {
      this.b.bE.b = var1.d() && this.b.bE.c;
   }

   public void a(iq var1) {
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = this.d.a(this.b, var1.c()).iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         var2.add(var4);
      }

      this.b.a.a((ft)(new gi((String[])var2.toArray(new String[var2.size()]))));
   }

   public void a(iu var1) {
      this.b.a(var1);
   }

   public void a(iz var1) {
      et var2;
      add var3;
      add var4;
      if("MC|BEdit".equals(var1.c())) {
         var2 = new et(Unpooled.wrappedBuffer(var1.e()));

         try {
            var3 = var2.c();
            if(var3 == null) {
               return;
            }

            if(!ael.a(var3.q())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.b.bm.h();
            if(var4 != null) {
               if(var3.b() == ade.bA && var3.b() == var4.b()) {
                  var4.a("pages", (dy)var3.q().c("pages", 8));
               }

               return;
            }
         } catch (Exception var38) {
            c.error("Couldn\'t handle book info", (Throwable)var38);
            return;
         } finally {
            var2.release();
         }

         return;
      } else if("MC|BSign".equals(var1.c())) {
         var2 = new et(Unpooled.wrappedBuffer(var1.e()));

         try {
            var3 = var2.c();
            if(var3 == null) {
               return;
            }

            if(!aem.a(var3.q())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.b.bm.h();
            if(var4 != null) {
               if(var3.b() == ade.bB && var4.b() == ade.bA) {
                  var4.a("author", (dy)(new dx(this.b.b_())));
                  var4.a("title", (dy)(new dx(var3.q().j("title"))));
                  var4.a("pages", (dy)var3.q().c("pages", 8));
                  var4.a(ade.bB);
               }

               return;
            }
         } catch (Exception var36) {
            c.error("Couldn\'t sign book", (Throwable)var36);
            return;
         } finally {
            var2.release();
         }

         return;
      } else {
         DataInputStream var40;
         int var42;
         if("MC|TrSel".equals(var1.c())) {
            try {
               var40 = new DataInputStream(new ByteArrayInputStream(var1.e()));
               var42 = var40.readInt();
               zs var45 = this.b.bo;
               if(var45 instanceof aat) {
                  ((aat)var45).e(var42);
               }
            } catch (Exception var35) {
               c.error("Couldn\'t select trade", (Throwable)var35);
            }
         } else if("MC|AdvCdm".equals(var1.c())) {
            if(!this.d.ad()) {
               this.b.a((fj)(new fr("advMode.notEnabled", new Object[0])));
            } else if(this.b.a(2, "") && this.b.bE.d) {
               var2 = new et(Unpooled.wrappedBuffer(var1.e()));

               try {
                  byte var43 = var2.readByte();
                  agp var46 = null;
                  if(var43 == 0) {
                     aor var5 = this.b.o.o(var2.readInt(), var2.readInt(), var2.readInt());
                     if(var5 instanceof aox) {
                        var46 = ((aox)var5).a();
                     }
                  } else if(var43 == 1) {
                     sa var48 = this.b.o.a(var2.readInt());
                     if(var48 instanceof xn) {
                        var46 = ((xn)var48).e();
                     }
                  }

                  String var49 = var2.c(var2.readableBytes());
                  if(var46 != null) {
                     var46.a(var49);
                     var46.e();
                     this.b.a((fj)(new fr("advMode.setCommand.success", new Object[]{var49})));
                  }
               } catch (Exception var33) {
                  c.error("Couldn\'t set command block", (Throwable)var33);
               } finally {
                  var2.release();
               }
            } else {
               this.b.a((fj)(new fr("advMode.notAllowed", new Object[0])));
            }
         } else if("MC|Beacon".equals(var1.c())) {
            if(this.b.bo instanceof zx) {
               try {
                  var40 = new DataInputStream(new ByteArrayInputStream(var1.e()));
                  var42 = var40.readInt();
                  int var47 = var40.readInt();
                  zx var50 = (zx)this.b.bo;
                  aay var6 = var50.a(0);
                  if(var6.e()) {
                     var6.a(1);
                     aoq var7 = var50.e();
                     var7.d(var42);
                     var7.e(var47);
                     var7.e();
                  }
               } catch (Exception var32) {
                  c.error("Couldn\'t set beacon", (Throwable)var32);
               }
            }
         } else if("MC|ItemName".equals(var1.c()) && this.b.bo instanceof zu) {
            zu var41 = (zu)this.b.bo;
            if(var1.e() != null && var1.e().length >= 1) {
               String var44 = t.a(new String(var1.e(), Charsets.UTF_8));
               if(var44.length() <= 30) {
                  var41.a(var44);
               }
            } else {
               var41.a("");
            }
         }
      }

   }

   public void a(eo var1, eo var2) {
      if(var2 != eo.b) {
         throw new IllegalStateException("Unexpected change in protocol!");
      }
   }

}
