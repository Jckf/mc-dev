import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mw extends yz implements aac {

   private static final Logger bL = LogManager.getLogger();
   private String bM = "en_US";
   public nh a;
   public final MinecraftServer b;
   public final mx c;
   public double d;
   public double e;
   public final List f = new LinkedList();
   private final List bN = new LinkedList();
   private final pg bO;
   private float bP = Float.MIN_VALUE;
   private float bQ = -1.0E8F;
   private int bR = -99999999;
   private boolean bS = true;
   private int bT = -99999999;
   private int bU = 60;
   private zb bV;
   private boolean bW = true;
   private long bX = System.currentTimeMillis();
   private int bY;
   public boolean g;
   public int h;
   public boolean i;


   public mw(MinecraftServer var1, mt var2, GameProfile var3, mx var4) {
      super(var2, var3);
      var4.b = this;
      this.c = var4;
      r var5 = var2.K();
      int var6 = var5.a;
      int var7 = var5.c;
      int var8 = var5.b;
      if(!var2.t.g && var2.N().r() != ahk.d) {
         int var9 = Math.max(5, var1.ao() - 6);
         var6 += this.Z.nextInt(var9 * 2) - var9;
         var7 += this.Z.nextInt(var9 * 2) - var9;
         var8 = var2.i(var6, var7);
      }

      this.b = var1;
      this.bO = var1.ah().a((yz)this);
      this.W = 0.0F;
      this.L = 0.0F;
      this.b((double)var6 + 0.5D, (double)var8, (double)var7 + 0.5D, 0.0F, 0.0F);

      while(!var2.a(this, this.C).isEmpty()) {
         this.b(this.s, this.t + 1.0D, this.u);
      }

   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("playerGameType", 99)) {
         if(MinecraftServer.I().ap()) {
            this.c.a(MinecraftServer.I().i());
         } else {
            this.c.a(ahk.a(var1.f("playerGameType")));
         }
      }

   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("playerGameType", this.c.b().a());
   }

   public void a(int var1) {
      super.a(var1);
      this.bT = -1;
   }

   public void d_() {
      this.bo.a((aac)this);
   }

   protected void e_() {
      this.L = 0.0F;
   }

   public float g() {
      return 1.62F;
   }

   public void h() {
      this.c.a();
      --this.bU;
      if(this.ad > 0) {
         --this.ad;
      }

      this.bo.b();
      if(!this.o.E && !this.bo.a((yz)this)) {
         this.k();
         this.bo = this.bn;
      }

      while(!this.bN.isEmpty()) {
         int var1 = Math.min(this.bN.size(), 127);
         int[] var2 = new int[var1];
         Iterator var3 = this.bN.iterator();
         int var4 = 0;

         while(var3.hasNext() && var4 < var1) {
            var2[var4++] = ((Integer)var3.next()).intValue();
            var3.remove();
         }

         this.a.a((ft)(new hq(var2)));
      }

      if(!this.f.isEmpty()) {
         ArrayList var6 = new ArrayList();
         Iterator var7 = this.f.iterator();
         ArrayList var8 = new ArrayList();

         apx var5;
         while(var7.hasNext() && var6.size() < gz.c()) {
            agu var9 = (agu)var7.next();
            if(var9 != null) {
               if(this.o.d(var9.a << 4, 0, var9.b << 4)) {
                  var5 = this.o.e(var9.a, var9.b);
                  if(var5.k()) {
                     var6.add(var5);
                     var8.addAll(((mt)this.o).a(var9.a * 16, 0, var9.b * 16, var9.a * 16 + 16, 256, var9.b * 16 + 16));
                     var7.remove();
                  }
               }
            } else {
               var7.remove();
            }
         }

         if(!var6.isEmpty()) {
            this.a.a((ft)(new gz(var6)));
            Iterator var10 = var8.iterator();

            while(var10.hasNext()) {
               aor var11 = (aor)var10.next();
               this.b(var11);
            }

            var10 = var6.iterator();

            while(var10.hasNext()) {
               var5 = (apx)var10.next();
               this.r().r().a(this, var5);
            }
         }
      }

   }

   public void i() {
      try {
         super.h();

         for(int var1 = 0; var1 < this.bm.a(); ++var1) {
            add var6 = this.bm.a(var1);
            if(var6 != null && var6.b().h()) {
               ft var8 = ((abs)var6.b()).c(var6, this.o, this);
               if(var8 != null) {
                  this.a.a(var8);
               }
            }
         }

         if(this.aS() != this.bQ || this.bR != this.bp.a() || this.bp.e() == 0.0F != this.bS) {
            this.a.a((ft)(new ib(this.aS(), this.bp.a(), this.bp.e())));
            this.bQ = this.aS();
            this.bR = this.bp.a();
            this.bS = this.bp.e() == 0.0F;
         }

         if(this.aS() + this.bs() != this.bP) {
            this.bP = this.aS() + this.bs();
            Collection var5 = this.bU().a(bah.f);
            Iterator var7 = var5.iterator();

            while(var7.hasNext()) {
               azx var9 = (azx)var7.next();
               this.bU().a(this.b_(), var9).a(Arrays.asList(new yz[]{this}));
            }
         }

         if(this.bG != this.bT) {
            this.bT = this.bG;
            this.a.a((ft)(new ia(this.bH, this.bG, this.bF)));
         }

         if(this.aa % 20 * 5 == 0 && !this.w().a(pc.L)) {
            this.j();
         }

      } catch (Throwable var4) {
         b var2 = b.a(var4, "Ticking player");
         k var3 = var2.a("Player being ticked");
         this.a(var3);
         throw new s(var2);
      }
   }

   protected void j() {
      ahu var1 = this.o.a(qh.c(this.s), qh.c(this.u));
      if(var1 != null) {
         String var2 = var1.af;
         pr var3 = (pr)this.w().b(pc.L);
         if(var3 == null) {
            var3 = (pr)this.w().a(pc.L, new pr());
         }

         var3.add(var2);
         if(this.w().b(pc.L) && var3.size() == ahu.n.size()) {
            HashSet var4 = Sets.newHashSet((Iterable)ahu.n);
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               String var6 = (String)var5.next();
               Iterator var7 = var4.iterator();

               while(var7.hasNext()) {
                  ahu var8 = (ahu)var7.next();
                  if(var8.af.equals(var6)) {
                     var7.remove();
                  }
               }

               if(var4.isEmpty()) {
                  break;
               }
            }

            if(var4.isEmpty()) {
               this.a((ph)pc.L);
            }
         }
      }

   }

   public void a(ro var1) {
      this.b.ah().a(this.aW().b());
      if(!this.o.O().b("keepInventory")) {
         this.bm.m();
      }

      Collection var2 = this.o.W().a(bah.c);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         azx var4 = (azx)var3.next();
         azz var5 = this.bU().a(this.b_(), var4);
         var5.a();
      }

      sv var6 = this.aX();
      if(var6 != null) {
         int var7 = sg.a(var6);
         sh var8 = (sh)sg.a.get(Integer.valueOf(var7));
         if(var8 != null) {
            this.a(var8.e, 1);
         }

         var6.b(this, this.ba);
      }

      this.a(pp.v, 1);
      this.aW().g();
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         boolean var3 = this.b.X() && this.b.ab() && "fall".equals(var1.o);
         if(!var3 && this.bU > 0 && var1 != ro.i) {
            return false;
         } else {
            if(var1 instanceof rp) {
               sa var4 = var1.j();
               if(var4 instanceof yz && !this.a((yz)var4)) {
                  return false;
               }

               if(var4 instanceof zc) {
                  zc var5 = (zc)var4;
                  if(var5.c instanceof yz && !this.a((yz)var5.c)) {
                     return false;
                  }
               }
            }

            return super.a(var1, var2);
         }
      }
   }

   public boolean a(yz var1) {
      return !this.b.ab()?false:super.a(var1);
   }

   public void b(int var1) {
      if(this.ap == 1 && var1 == 1) {
         this.a((ph)pc.D);
         this.o.e((sa)this);
         this.i = true;
         this.a.a((ft)(new gv(4, 0.0F)));
      } else {
         if(this.ap == 0 && var1 == 1) {
            this.a((ph)pc.C);
            r var2 = this.b.a(var1).l();
            if(var2 != null) {
               this.a.a((double)var2.a, (double)var2.b, (double)var2.c, 0.0F, 0.0F);
            }

            var1 = 1;
         } else {
            this.a((ph)pc.y);
         }

         this.b.ah().a(this, var1);
         this.bT = -1;
         this.bQ = -1.0F;
         this.bR = -1;
      }

   }

   private void b(aor var1) {
      if(var1 != null) {
         ft var2 = var1.m();
         if(var2 != null) {
            this.a.a(var2);
         }
      }

   }

   public void a(sa var1, int var2) {
      super.a(var1, var2);
      this.bo.b();
   }

   public za a(int var1, int var2, int var3) {
      za var4 = super.a(var1, var2, var3);
      if(var4 == za.a) {
         hp var5 = new hp(this, var1, var2, var3);
         this.r().r().a((sa)this, (ft)var5);
         this.a.a(this.s, this.t, this.u, this.y, this.z);
         this.a.a((ft)var5);
      }

      return var4;
   }

   public void a(boolean var1, boolean var2, boolean var3) {
      if(this.bm()) {
         this.r().r().b(this, new gc(this, 2));
      }

      super.a(var1, var2, var3);
      if(this.a != null) {
         this.a.a(this.s, this.t, this.u, this.y, this.z);
      }

   }

   public void a(sa var1) {
      super.a(var1);
      this.a.a((ft)(new hx(0, this, this.m)));
      this.a.a(this.s, this.t, this.u, this.y, this.z);
   }

   protected void a(double var1, boolean var3) {}

   public void b(double var1, boolean var3) {
      super.a(var1, var3);
   }

   public void a(aor var1) {
      if(var1 instanceof apm) {
         ((apm)var1).a((yz)this);
         this.a.a((ft)(new hj(var1.c, var1.d, var1.e)));
      }

   }

   private void bV() {
      this.bY = this.bY % 100 + 1;
   }

   public void b(int var1, int var2, int var3) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 1, "Crafting", 9, true)));
      this.bo = new aaf(this.bm, this.o, var1, var2, var3);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(int var1, int var2, int var3, String var4) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 4, var4 == null?"":var4, 9, var4 != null)));
      this.bo = new aag(this.bm, this.o, var1, var2, var3);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void c(int var1, int var2, int var3) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 8, "Repairing", 9, true)));
      this.bo = new zu(this.bm, this.o, var1, var2, var3, this);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(rb var1) {
      if(this.bo != this.bn) {
         this.k();
      }

      this.bV();
      this.a.a((ft)(new gn(this.bY, 0, var1.b(), var1.a(), var1.k_())));
      this.bo = new aad(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(api var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 9, var1.b(), var1.a(), var1.k_())));
      this.bo = new aal(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(xr var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 9, var1.b(), var1.a(), var1.k_())));
      this.bo = new aal(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(apg var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 2, var1.b(), var1.a(), var1.k_())));
      this.bo = new aaj(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(apb var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, var1 instanceof apc?10:3, var1.b(), var1.a(), var1.k_())));
      this.bo = new aaz(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(aov var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 5, var1.b(), var1.a(), var1.k_())));
      this.bo = new zz(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(aoq var1) {
      this.bV();
      this.a.a((ft)(new gn(this.bY, 7, var1.b(), var1.a(), var1.k_())));
      this.bo = new zx(this.bm, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(agm var1, String var2) {
      this.bV();
      this.bo = new aat(this.bm, var1, this.o);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
      aas var3 = ((aat)this.bo).e();
      this.a.a((ft)(new gn(this.bY, 6, var2 == null?"":var2, var3.a(), var2 != null)));
      ago var4 = var1.b(this);
      if(var4 != null) {
         et var5 = new et(Unpooled.buffer());

         try {
            var5.writeInt(this.bY);
            var4.a(var5);
            this.a.a((ft)(new gr("MC|TrList", var5)));
         } catch (IOException var10) {
            bL.error("Couldn\'t send trade list", (Throwable)var10);
         } finally {
            var5.release();
         }
      }

   }

   public void a(wi var1, rb var2) {
      if(this.bo != this.bn) {
         this.k();
      }

      this.bV();
      this.a.a((ft)(new gn(this.bY, 11, var2.b(), var2.a(), var2.k_(), var1.y())));
      this.bo = new aam(this.bm, var2, var1);
      this.bo.d = this.bY;
      this.bo.a((aac)this);
   }

   public void a(zs var1, int var2, add var3) {
      if(!(var1.a(var2) instanceof aax)) {
         if(!this.g) {
            this.a.a((ft)(new gq(var1.d, var2, var3)));
         }
      }
   }

   public void a(zs var1) {
      this.a(var1, var1.a());
   }

   public void a(zs var1, List var2) {
      this.a.a((ft)(new go(var1.d, var2)));
      this.a.a((ft)(new gq(-1, -1, this.bm.o())));
   }

   public void a(zs var1, int var2, int var3) {
      this.a.a((ft)(new gp(var1.d, var2, var3)));
   }

   public void k() {
      this.a.a((ft)(new gm(this.bo.d)));
      this.m();
   }

   public void l() {
      if(!this.g) {
         this.a.a((ft)(new gq(-1, -1, this.bm.o())));
      }
   }

   public void m() {
      this.bo.b((yz)this);
      this.bo = this.bn;
   }

   public void a(float var1, float var2, boolean var3, boolean var4) {
      if(this.m != null) {
         if(var1 >= -1.0F && var1 <= 1.0F) {
            this.bd = var1;
         }

         if(var2 >= -1.0F && var2 <= 1.0F) {
            this.be = var2;
         }

         this.bc = var3;
         this.b(var4);
      }

   }

   public void a(ph var1, int var2) {
      if(var1 != null) {
         this.bO.b(this, var1, var2);
         Iterator var3 = this.bU().a(var1.k()).iterator();

         while(var3.hasNext()) {
            azx var4 = (azx)var3.next();
            this.bU().a(this.b_(), var4).a();
         }

         if(this.bO.e()) {
            this.bO.a(this);
         }

      }
   }

   public void n() {
      if(this.l != null) {
         this.l.a((sa)this);
      }

      if(this.bA) {
         this.a(true, false, false);
      }

   }

   public void o() {
      this.bQ = -1.0E8F;
   }

   public void b(fj var1) {
      this.a.a((ft)(new gj(var1)));
   }

   protected void p() {
      this.a.a((ft)(new gt(this, (byte)9)));
      super.p();
   }

   public void a(add var1, int var2) {
      super.a(var1, var2);
      if(var1 != null && var1.b() != null && var1.b().d(var1) == aei.b) {
         this.r().r().b(this, new gc(this, 3));
      }

   }

   public void a(yz var1, boolean var2) {
      super.a(var1, var2);
      this.bT = -1;
      this.bQ = -1.0F;
      this.bR = -1;
      this.bN.addAll(((mw)var1).bN);
   }

   protected void a(rw var1) {
      super.a(var1);
      this.a.a((ft)(new in(this.y(), var1)));
   }

   protected void a(rw var1, boolean var2) {
      super.a(var1, var2);
      this.a.a((ft)(new in(this.y(), var1)));
   }

   protected void b(rw var1) {
      super.b(var1);
      this.a.a((ft)(new hr(this.y(), var1)));
   }

   public void a(double var1, double var3, double var5) {
      this.a.a(var1, var3, var5, this.y, this.z);
   }

   public void b(sa var1) {
      this.r().r().b(this, new gc(var1, 4));
   }

   public void c(sa var1) {
      this.r().r().b(this, new gc(var1, 5));
   }

   public void q() {
      if(this.a != null) {
         this.a.a((ft)(new hk(this.bE)));
      }
   }

   public mt r() {
      return (mt)this.o;
   }

   public void a(ahk var1) {
      this.c.a(var1);
      this.a.a((ft)(new gv(3, (float)var1.a())));
   }

   public void a(fj var1) {
      this.a.a((ft)(new gj(var1)));
   }

   public boolean a(int var1, String var2) {
      if("seed".equals(var2) && !this.b.X()) {
         return true;
      } else if(!"tell".equals(var2) && !"help".equals(var2) && !"me".equals(var2)) {
         if(this.b.ah().g(this.bJ())) {
            ok var3 = (ok)this.b.ah().m().b(this.bJ());
            return var3 != null?var3.a() >= var1:this.b.l() >= var1;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public String s() {
      String var1 = this.a.a.b().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      var1 = var1.substring(0, var1.indexOf(":"));
      return var1;
   }

   public void a(iu var1) {
      this.bM = var1.c();
      int var2 = 256 >> var1.d();
      if(var2 > 3 && var2 < 20) {
         ;
      }

      this.bV = var1.e();
      this.bW = var1.f();
      if(this.b.N() && this.b.M().equals(this.b_())) {
         this.b.a(var1.g());
      }

      this.b(1, !var1.h());
   }

   public zb u() {
      return this.bV;
   }

   public void a(String var1) {
      this.a.a((ft)(new gr("MC|RPack", var1.getBytes(Charsets.UTF_8))));
   }

   public r f_() {
      return new r(qh.c(this.s), qh.c(this.t + 0.5D), qh.c(this.u));
   }

   public void v() {
      this.bX = MinecraftServer.ar();
   }

   public pg w() {
      return this.bO;
   }

   public void d(sa var1) {
      if(var1 instanceof yz) {
         this.a.a((ft)(new hq(new int[]{var1.y()})));
      } else {
         this.bN.add(Integer.valueOf(var1.y()));
      }

   }

   public long x() {
      return this.bX;
   }

}
