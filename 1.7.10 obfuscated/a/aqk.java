import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aqk implements aqc, azs {

   private static final Logger a = LogManager.getLogger();
   private List b = new ArrayList();
   private Set c = new HashSet();
   private Object d = new Object();
   private final File e;


   public aqk(File var1) {
      this.e = var1;
   }

   public apx a(ahb var1, int var2, int var3) {
      dh var4 = null;
      agu var5 = new agu(var2, var3);
      Object var6 = this.d;
      synchronized(this.d) {
         if(this.c.contains(var5)) {
            for(int var7 = 0; var7 < this.b.size(); ++var7) {
               if(((aql)this.b.get(var7)).a.equals(var5)) {
                  var4 = ((aql)this.b.get(var7)).b;
                  break;
               }
            }
         }
      }

      if(var4 == null) {
         DataInputStream var10 = aqj.c(this.e, var2, var3);
         if(var10 == null) {
            return null;
         }

         var4 = du.a(var10);
      }

      return this.a(var1, var2, var3, var4);
   }

   protected apx a(ahb var1, int var2, int var3, dh var4) {
      if(!var4.b("Level", 10)) {
         a.error("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if(!var4.m("Level").b("Sections", 9)) {
         a.error("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         apx var5 = this.a(var1, var4.m("Level"));
         if(!var5.a(var2, var3)) {
            a.error("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var5.g + ", " + var5.h + ")");
            var4.a("xPos", var2);
            var4.a("zPos", var3);
            var5 = this.a(var1, var4.m("Level"));
         }

         return var5;
      }
   }

   public void a(ahb var1, apx var2) {
      var1.G();

      try {
         dh var3 = new dh();
         dh var4 = new dh();
         var3.a("Level", (dy)var4);
         this.a(var2, var1, var4);
         this.a(var2.l(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected void a(agu var1, dh var2) {
      Object var3 = this.d;
      synchronized(this.d) {
         if(this.c.contains(var1)) {
            for(int var4 = 0; var4 < this.b.size(); ++var4) {
               if(((aql)this.b.get(var4)).a.equals(var1)) {
                  this.b.set(var4, new aql(var1, var2));
                  return;
               }
            }
         }

         this.b.add(new aql(var1, var2));
         this.c.add(var1);
         azr.a.a(this);
      }
   }

   public boolean c() {
      aql var1 = null;
      Object var2 = this.d;
      synchronized(this.d) {
         if(this.b.isEmpty()) {
            return false;
         }

         var1 = (aql)this.b.remove(0);
         this.c.remove(var1.a);
      }

      if(var1 != null) {
         try {
            this.a(var1);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return true;
   }

   private void a(aql var1) {
      DataOutputStream var2 = aqj.d(this.e, var1.a.a, var1.a.b);
      du.a(var1.b, (DataOutput)var2);
      var2.close();
   }

   public void b(ahb var1, apx var2) {}

   public void a() {}

   public void b() {
      while(this.c()) {
         ;
      }

   }

   private void a(apx var1, ahb var2, dh var3) {
      var3.a("V", (byte)1);
      var3.a("xPos", var1.g);
      var3.a("zPos", var1.h);
      var3.a("LastUpdate", var2.I());
      var3.a("HeightMap", var1.f);
      var3.a("TerrainPopulated", var1.k);
      var3.a("LightPopulated", var1.l);
      var3.a("InhabitedTime", var1.s);
      apz[] var4 = var1.i();
      dq var5 = new dq();
      boolean var6 = !var2.t.g;
      apz[] var7 = var4;
      int var8 = var4.length;

      dh var11;
      for(int var9 = 0; var9 < var8; ++var9) {
         apz var10 = var7[var9];
         if(var10 != null) {
            var11 = new dh();
            var11.a("Y", (byte)(var10.d() >> 4 & 255));
            var11.a("Blocks", var10.g());
            if(var10.i() != null) {
               var11.a("Add", var10.i().a);
            }

            var11.a("Data", var10.j().a);
            var11.a("BlockLight", var10.k().a);
            if(var6) {
               var11.a("SkyLight", var10.l().a);
            } else {
               var11.a("SkyLight", new byte[var10.k().a.length]);
            }

            var5.a((dy)var11);
         }
      }

      var3.a("Sections", (dy)var5);
      var3.a("Biomes", var1.m());
      var1.o = false;
      dq var16 = new dq();

      Iterator var18;
      for(var8 = 0; var8 < var1.j.length; ++var8) {
         var18 = var1.j[var8].iterator();

         while(var18.hasNext()) {
            sa var20 = (sa)var18.next();
            var11 = new dh();
            if(var20.d(var11)) {
               var1.o = true;
               var16.a((dy)var11);
            }
         }
      }

      var3.a("Entities", (dy)var16);
      dq var17 = new dq();
      var18 = var1.i.values().iterator();

      while(var18.hasNext()) {
         aor var21 = (aor)var18.next();
         var11 = new dh();
         var21.b(var11);
         var17.a((dy)var11);
      }

      var3.a("TileEntities", (dy)var17);
      List var19 = var2.a(var1, false);
      if(var19 != null) {
         long var22 = var2.I();
         dq var12 = new dq();
         Iterator var13 = var19.iterator();

         while(var13.hasNext()) {
            ahs var14 = (ahs)var13.next();
            dh var15 = new dh();
            var15.a("i", aji.b(var14.a()));
            var15.a("x", var14.a);
            var15.a("y", var14.b);
            var15.a("z", var14.c);
            var15.a("t", (int)(var14.d - var22));
            var15.a("p", var14.e);
            var12.a((dy)var15);
         }

         var3.a("TileTicks", (dy)var12);
      }

   }

   private apx a(ahb var1, dh var2) {
      int var3 = var2.f("xPos");
      int var4 = var2.f("zPos");
      apx var5 = new apx(var1, var3, var4);
      var5.f = var2.l("HeightMap");
      var5.k = var2.n("TerrainPopulated");
      var5.l = var2.n("LightPopulated");
      var5.s = var2.g("InhabitedTime");
      dq var6 = var2.c("Sections", 10);
      byte var7 = 16;
      apz[] var8 = new apz[var7];
      boolean var9 = !var1.t.g;

      for(int var10 = 0; var10 < var6.c(); ++var10) {
         dh var11 = var6.b(var10);
         byte var12 = var11.d("Y");
         apz var13 = new apz(var12 << 4, var9);
         var13.a(var11.k("Blocks"));
         if(var11.b("Add", 7)) {
            var13.a(new apv(var11.k("Add"), 4));
         }

         var13.b(new apv(var11.k("Data"), 4));
         var13.c(new apv(var11.k("BlockLight"), 4));
         if(var9) {
            var13.d(new apv(var11.k("SkyLight"), 4));
         }

         var13.e();
         var8[var12] = var13;
      }

      var5.a(var8);
      if(var2.b("Biomes", 7)) {
         var5.a(var2.k("Biomes"));
      }

      dq var17 = var2.c("Entities", 10);
      if(var17 != null) {
         for(int var18 = 0; var18 < var17.c(); ++var18) {
            dh var20 = var17.b(var18);
            sa var23 = sg.a(var20, var1);
            var5.o = true;
            if(var23 != null) {
               var5.a(var23);
               sa var14 = var23;

               for(dh var15 = var20; var15.b("Riding", 10); var15 = var15.m("Riding")) {
                  sa var16 = sg.a(var15.m("Riding"), var1);
                  if(var16 != null) {
                     var5.a(var16);
                     var14.a(var16);
                  }

                  var14 = var16;
               }
            }
         }
      }

      dq var19 = var2.c("TileEntities", 10);
      if(var19 != null) {
         for(int var21 = 0; var21 < var19.c(); ++var21) {
            dh var24 = var19.b(var21);
            aor var26 = aor.c(var24);
            if(var26 != null) {
               var5.a(var26);
            }
         }
      }

      if(var2.b("TileTicks", 9)) {
         dq var22 = var2.c("TileTicks", 10);
         if(var22 != null) {
            for(int var25 = 0; var25 < var22.c(); ++var25) {
               dh var27 = var22.b(var25);
               var1.b(var27.f("x"), var27.f("y"), var27.f("z"), aji.e(var27.f("i")), var27.f("t"), var27.f("p"));
            }
         }
      }

      return var5;
   }

}
