import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class cf extends z {

   private static final Map a = Maps.newHashMap();


   public String c() {
      return "replaceitem";
   }

   public int a() {
      return 2;
   }

   public String c(ae var1) {
      return "commands.replaceitem.usage";
   }

   public void a(ae var1, String[] var2) {
      if(var2.length < 1) {
         throw new dp("commands.replaceitem.usage", new Object[0]);
      } else {
         boolean var3;
         if(var2[0].equals("entity")) {
            var3 = false;
         } else {
            if(!var2[0].equals("block")) {
               throw new dp("commands.replaceitem.usage", new Object[0]);
            }

            var3 = true;
         }

         byte var4;
         if(var3) {
            if(var2.length < 6) {
               throw new dp("commands.replaceitem.block.usage", new Object[0]);
            }

            var4 = 4;
         } else {
            if(var2.length < 4) {
               throw new dp("commands.replaceitem.entity.usage", new Object[0]);
            }

            var4 = 2;
         }

         int var16 = var4 + 1;
         int var5 = this.e(var2[var4]);

         alq var6;
         try {
            var6 = f(var1, var2[var16]);
         } catch (dk var15) {
            if(atr.b(var2[var16]) != aty.a) {
               throw var15;
            }

            var6 = null;
         }

         ++var16;
         int var7 = var2.length > var16?a(var2[var16++], 1, 64):1;
         int var8 = var2.length > var16?a(var2[var16++]):0;
         amj var9 = new amj(var6, var7, var8);
         if(var2.length > var16) {
            String var10 = a(var1, var2, var16).c();

            try {
               var9.d(gg.a(var10));
            } catch (gf var14) {
               throw new di("commands.replaceitem.tagError", new Object[]{var14.getMessage()});
            }
         }

         if(var9.b() == null) {
            var9 = null;
         }

         if(var3) {
            var1.a(ag.d, 0);
            dt var17 = a(var1, var2, 1, false);
            aqu var11 = var1.e();
            bcm var12 = var11.s(var17);
            if(var12 == null || !(var12 instanceof vq)) {
               throw new di("commands.replaceitem.noContainer", new Object[]{Integer.valueOf(var17.n()), Integer.valueOf(var17.o()), Integer.valueOf(var17.p())});
            }

            vq var13 = (vq)var12;
            if(var5 >= 0 && var5 < var13.n_()) {
               var13.a(var5, var9);
            }
         } else {
            wv var18 = b(var1, var2[1]);
            var1.a(ag.d, 0);
            if(var18 instanceof ahd) {
               ((ahd)var18).bh.b();
            }

            if(!var18.d(var5, var9)) {
               throw new di("commands.replaceitem.failed", new Object[]{Integer.valueOf(var5), Integer.valueOf(var7), var9 == null?"Air":var9.C()});
            }

            if(var18 instanceof ahd) {
               ((ahd)var18).bh.b();
            }
         }

         var1.a(ag.d, var7);
         a(var1, this, "commands.replaceitem.success", new Object[]{Integer.valueOf(var5), Integer.valueOf(var7), var9 == null?"Air":var9.C()});
      }
   }

   private int e(String var1) {
      if(!a.containsKey(var1)) {
         throw new di("commands.generic.parameter.invalid", new Object[]{var1});
      } else {
         return ((Integer)a.get(var1)).intValue();
      }
   }

   public List a(ae var1, String[] var2, dt var3) {
      return var2.length == 1?a(var2, new String[]{"entity", "block"}):(var2.length == 2 && var2[0].equals("entity")?a(var2, this.d()):((var2.length != 3 || !var2[0].equals("entity")) && (var2.length != 5 || !var2[0].equals("block"))?((var2.length != 4 || !var2[0].equals("entity")) && (var2.length != 6 || !var2[0].equals("block"))?null:a(var2, alq.e.c())):a(var2, a.keySet())));
   }

   protected String[] d() {
      return MinecraftServer.M().I();
   }

   public boolean b(String[] var1, int var2) {
      return var1.length > 0 && var1[0].equals("entity") && var2 == 1;
   }

   static {
      int var0;
      for(var0 = 0; var0 < 54; ++var0) {
         a.put("slot.container." + var0, Integer.valueOf(var0));
      }

      for(var0 = 0; var0 < 9; ++var0) {
         a.put("slot.hotbar." + var0, Integer.valueOf(var0));
      }

      for(var0 = 0; var0 < 27; ++var0) {
         a.put("slot.inventory." + var0, Integer.valueOf(9 + var0));
      }

      for(var0 = 0; var0 < 27; ++var0) {
         a.put("slot.enderchest." + var0, Integer.valueOf(200 + var0));
      }

      for(var0 = 0; var0 < 8; ++var0) {
         a.put("slot.villager." + var0, Integer.valueOf(300 + var0));
      }

      for(var0 = 0; var0 < 15; ++var0) {
         a.put("slot.horse." + var0, Integer.valueOf(500 + var0));
      }

      a.put("slot.weapon", Integer.valueOf(99));
      a.put("slot.armor.head", Integer.valueOf(103));
      a.put("slot.armor.chest", Integer.valueOf(102));
      a.put("slot.armor.legs", Integer.valueOf(101));
      a.put("slot.armor.feet", Integer.valueOf(100));
      a.put("slot.horse.saddle", Integer.valueOf(400));
      a.put("slot.horse.armor", Integer.valueOf(401));
      a.put("slot.horse.chest", Integer.valueOf(499));
   }
}
