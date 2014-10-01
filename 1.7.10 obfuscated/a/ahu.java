import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ahu {

   private static final Logger aC = LogManager.getLogger();
   protected static final ahv a = new ahv(0.1F, 0.2F);
   protected static final ahv b = new ahv(-0.5F, 0.0F);
   protected static final ahv c = new ahv(-1.0F, 0.1F);
   protected static final ahv d = new ahv(-1.8F, 0.1F);
   protected static final ahv e = new ahv(0.125F, 0.05F);
   protected static final ahv f = new ahv(0.2F, 0.2F);
   protected static final ahv g = new ahv(0.45F, 0.3F);
   protected static final ahv h = new ahv(1.5F, 0.025F);
   protected static final ahv i = new ahv(1.0F, 0.5F);
   protected static final ahv j = new ahv(0.0F, 0.025F);
   protected static final ahv k = new ahv(0.1F, 0.8F);
   protected static final ahv l = new ahv(0.2F, 0.3F);
   protected static final ahv m = new ahv(-0.2F, 0.1F);
   private static final ahu[] aD = new ahu[256];
   public static final Set n = Sets.newHashSet();
   public static final ahu o = (new aio(0)).b(112).a("Ocean").a(c);
   public static final ahu p = (new aip(1)).b(9286496).a("Plains");
   public static final ahu q = (new aic(2)).b(16421912).a("Desert").b().a(2.0F, 0.0F).a(e);
   public static final ahu r = (new aid(3, false)).b(6316128).a("Extreme Hills").a(i).a(0.2F, 0.3F);
   public static final ahu s = (new aif(4, 0)).b(353825).a("Forest");
   public static final ahu t = (new aiw(5, 0)).b(747097).a("Taiga").a(5159473).a(0.25F, 0.8F).a(f);
   public static final ahu u = (new aiv(6)).b(522674).a("Swampland").a(9154376).a(m).a(0.8F, 0.9F);
   public static final ahu v = (new air(7)).b(255).a("River").a(b);
   public static final ahu w = (new aii(8)).b(16711680).a("Hell").b().a(2.0F, 0.0F);
   public static final ahu x = (new aix(9)).b(8421631).a("Sky").b();
   public static final ahu y = (new aio(10)).b(9474208).a("FrozenOcean").c().a(c).a(0.0F, 0.5F);
   public static final ahu z = (new air(11)).b(10526975).a("FrozenRiver").c().a(b).a(0.0F, 0.5F);
   public static final ahu A = (new aij(12, false)).b(16777215).a("Ice Plains").c().a(0.0F, 0.5F).a(e);
   public static final ahu B = (new aij(13, false)).b(10526880).a("Ice Mountains").c().a(g).a(0.0F, 0.5F);
   public static final ahu C = (new aim(14)).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).a(l);
   public static final ahu D = (new aim(15)).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).a(j);
   public static final ahu E = (new aht(16)).b(16440917).a("Beach").a(0.8F, 0.4F).a(j);
   public static final ahu F = (new aic(17)).b(13786898).a("DesertHills").b().a(2.0F, 0.0F).a(g);
   public static final ahu G = (new aif(18, 0)).b(2250012).a("ForestHills").a(g);
   public static final ahu H = (new aiw(19, 0)).b(1456435).a("TaigaHills").a(5159473).a(0.25F, 0.8F).a(g);
   public static final ahu I = (new aid(20, true)).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2F, 0.3F);
   public static final ahu J = (new aik(21, false)).b(5470985).a("Jungle").a(5470985).a(0.95F, 0.9F);
   public static final ahu K = (new aik(22, false)).b(2900485).a("JungleHills").a(5470985).a(0.95F, 0.9F).a(g);
   public static final ahu L = (new aik(23, true)).b(6458135).a("JungleEdge").a(5470985).a(0.95F, 0.8F);
   public static final ahu M = (new aio(24)).b(48).a("Deep Ocean").a(d);
   public static final ahu N = (new aiu(25)).b(10658436).a("Stone Beach").a(0.2F, 0.3F).a(k);
   public static final ahu O = (new aht(26)).b(16445632).a("Cold Beach").a(0.05F, 0.3F).a(j).c();
   public static final ahu P = (new aif(27, 2)).a("Birch Forest").b(3175492);
   public static final ahu Q = (new aif(28, 2)).a("Birch Forest Hills").b(2055986).a(g);
   public static final ahu R = (new aif(29, 3)).b(4215066).a("Roofed Forest");
   public static final ahu S = (new aiw(30, 0)).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5F, 0.4F).a(f).c(16777215);
   public static final ahu T = (new aiw(31, 0)).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5F, 0.4F).a(g).c(16777215);
   public static final ahu U = (new aiw(32, 1)).b(5858897).a("Mega Taiga").a(5159473).a(0.3F, 0.8F).a(f);
   public static final ahu V = (new aiw(33, 1)).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3F, 0.8F).a(g);
   public static final ahu W = (new aid(34, true)).b(5271632).a("Extreme Hills+").a(i).a(0.2F, 0.3F);
   public static final ahu X = (new ais(35)).b(12431967).a("Savanna").a(1.2F, 0.0F).b().a(e);
   public static final ahu Y = (new ais(36)).b(10984804).a("Savanna Plateau").a(1.0F, 0.0F).b().a(h);
   public static final ahu Z = (new ail(37, false, false)).b(14238997).a("Mesa");
   public static final ahu aa = (new ail(38, false, true)).b(11573093).a("Mesa Plateau F").a(h);
   public static final ahu ab = (new ail(39, false, false)).b(13274213).a("Mesa Plateau").a(h);
   protected static final awl ac;
   protected static final awl ad;
   protected static final arm ae;
   public String af;
   public int ag;
   public int ah;
   public aji ai;
   public int aj;
   public aji ak;
   public int al;
   public float am;
   public float an;
   public float ao;
   public float ap;
   public int aq;
   public aia ar;
   protected List as;
   protected List at;
   protected List au;
   protected List av;
   protected boolean aw;
   protected boolean ax;
   public final int ay;
   protected asq az;
   protected ard aA;
   protected aso aB;


   protected ahu(int var1) {
      this.ai = ajn.c;
      this.aj = 0;
      this.ak = ajn.d;
      this.al = 5169201;
      this.am = a.a;
      this.an = a.b;
      this.ao = 0.5F;
      this.ap = 0.5F;
      this.aq = 16777215;
      this.as = new ArrayList();
      this.at = new ArrayList();
      this.au = new ArrayList();
      this.av = new ArrayList();
      this.ax = true;
      this.az = new asq(false);
      this.aA = new ard(false);
      this.aB = new aso();
      this.ay = var1;
      aD[var1] = this;
      this.ar = this.a();
      this.at.add(new ahx(wp.class, 12, 4, 4));
      this.at.add(new ahx(wo.class, 10, 4, 4));
      this.at.add(new ahx(wg.class, 10, 4, 4));
      this.at.add(new ahx(wh.class, 8, 4, 4));
      this.as.add(new ahx(yn.class, 100, 4, 4));
      this.as.add(new ahx(yq.class, 100, 4, 4));
      this.as.add(new ahx(yl.class, 100, 4, 4));
      this.as.add(new ahx(xz.class, 100, 4, 4));
      this.as.add(new ahx(ym.class, 100, 4, 4));
      this.as.add(new ahx(ya.class, 10, 1, 4));
      this.as.add(new ahx(yp.class, 5, 1, 1));
      this.au.add(new ahx(ws.class, 10, 4, 4));
      this.av.add(new ahx(we.class, 10, 8, 8));
   }

   protected aia a() {
      return new aia();
   }

   protected ahu a(float var1, float var2) {
      if(var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.ao = var1;
         this.ap = var2;
         return this;
      }
   }

   protected final ahu a(ahv var1) {
      this.am = var1.a;
      this.an = var1.b;
      return this;
   }

   protected ahu b() {
      this.ax = false;
      return this;
   }

   public arc a(Random var1) {
      return (arc)(var1.nextInt(10) == 0?this.aA:this.az);
   }

   public arn b(Random var1) {
      return new asp(ajn.H, 1);
   }

   public String a(Random var1, int var2, int var3, int var4) {
      return var1.nextInt(3) > 0?alc.b[0]:alc.a[0];
   }

   protected ahu c() {
      this.aw = true;
      return this;
   }

   protected ahu a(String var1) {
      this.af = var1;
      return this;
   }

   protected ahu a(int var1) {
      this.al = var1;
      return this;
   }

   protected ahu b(int var1) {
      this.a(var1, false);
      return this;
   }

   protected ahu c(int var1) {
      this.ah = var1;
      return this;
   }

   protected ahu a(int var1, boolean var2) {
      this.ag = var1;
      if(var2) {
         this.ah = (var1 & 16711422) >> 1;
      } else {
         this.ah = var1;
      }

      return this;
   }

   public List a(sx var1) {
      return var1 == sx.a?this.as:(var1 == sx.b?this.at:(var1 == sx.d?this.au:(var1 == sx.c?this.av:null)));
   }

   public boolean d() {
      return this.j();
   }

   public boolean e() {
      return this.j()?false:this.ax;
   }

   public boolean f() {
      return this.ap > 0.85F;
   }

   public float g() {
      return 0.1F;
   }

   public final int h() {
      return (int)(this.ap * 65536.0F);
   }

   public final float a(int var1, int var2, int var3) {
      if(var2 > 64) {
         float var4 = (float)ac.a((double)var1 * 1.0D / 8.0D, (double)var3 * 1.0D / 8.0D) * 4.0F;
         return this.ao - (var4 + (float)var2 - 64.0F) * 0.05F / 30.0F;
      } else {
         return this.ao;
      }
   }

   public void a(ahb var1, Random var2, int var3, int var4) {
      this.ar.a(var1, var2, this, var3, var4);
   }

   public boolean j() {
      return this.aw;
   }

   public void a(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void b(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      boolean var9 = true;
      aji var10 = this.ai;
      byte var11 = (byte)(this.aj & 255);
      aji var12 = this.ak;
      int var13 = -1;
      int var14 = (int)(var7 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      int var15 = var5 & 15;
      int var16 = var6 & 15;
      int var17 = var3.length / 256;

      for(int var18 = 255; var18 >= 0; --var18) {
         int var19 = (var16 * 16 + var15) * var17 + var18;
         if(var18 <= 0 + var2.nextInt(5)) {
            var3[var19] = ajn.h;
         } else {
            aji var20 = var3[var19];
            if(var20 != null && var20.o() != awt.a) {
               if(var20 == ajn.b) {
                  if(var13 == -1) {
                     if(var14 <= 0) {
                        var10 = null;
                        var11 = 0;
                        var12 = ajn.b;
                     } else if(var18 >= 59 && var18 <= 64) {
                        var10 = this.ai;
                        var11 = (byte)(this.aj & 255);
                        var12 = this.ak;
                     }

                     if(var18 < 63 && (var10 == null || var10.o() == awt.a)) {
                        if(this.a(var5, var18, var6) < 0.15F) {
                           var10 = ajn.aD;
                           var11 = 0;
                        } else {
                           var10 = ajn.j;
                           var11 = 0;
                        }
                     }

                     var13 = var14;
                     if(var18 >= 62) {
                        var3[var19] = var10;
                        var4[var19] = var11;
                     } else if(var18 < 56 - var14) {
                        var10 = null;
                        var12 = ajn.b;
                        var3[var19] = ajn.n;
                     } else {
                        var3[var19] = var12;
                     }
                  } else if(var13 > 0) {
                     --var13;
                     var3[var19] = var12;
                     if(var13 == 0 && var12 == ajn.m) {
                        var13 = var2.nextInt(4) + Math.max(0, var18 - 63);
                        var12 = ajn.A;
                     }
                  }
               }
            } else {
               var13 = -1;
            }
         }
      }

   }

   protected ahu k() {
      return new ain(this.ay + 128, this);
   }

   public Class l() {
      return this.getClass();
   }

   public boolean a(ahu var1) {
      return var1 == this?true:(var1 == null?false:this.l() == var1.l());
   }

   public ahw m() {
      return (double)this.ao < 0.2D?ahw.b:((double)this.ao < 1.0D?ahw.c:ahw.d);
   }

   public static ahu[] n() {
      return aD;
   }

   public static ahu d(int var0) {
      if(var0 >= 0 && var0 <= aD.length) {
         return aD[var0];
      } else {
         aC.warn("Biome ID is out of bounds: " + var0 + ", defaulting to 0 (Ocean)");
         return o;
      }
   }

   static {
      p.k();
      q.k();
      s.k();
      t.k();
      u.k();
      A.k();
      J.k();
      L.k();
      S.k();
      X.k();
      Y.k();
      Z.k();
      aa.k();
      ab.k();
      P.k();
      Q.k();
      R.k();
      U.k();
      r.k();
      W.k();
      aD[V.ay + 128] = aD[U.ay + 128];
      ahu[] var0 = aD;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         ahu var3 = var0[var2];
         if(var3 != null && var3.ay < 128) {
            n.add(var3);
         }
      }

      n.remove(w);
      n.remove(x);
      n.remove(y);
      n.remove(I);
      ac = new awl(new Random(1234L), 1);
      ad = new awl(new Random(2345L), 1);
      ae = new arm();
   }
}
