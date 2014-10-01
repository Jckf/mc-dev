import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

public enum eo {

   a("HANDSHAKING", 0, -1),
   b("PLAY", 1, 0),
   c("STATUS", 2, 1),
   d("LOGIN", 3, 2);
   private static final TIntObjectMap e = new TIntObjectHashMap();
   private static final Map f = Maps.newHashMap();
   private final int g;
   private final BiMap h;
   private final BiMap i;
   // $FF: synthetic field
   private static final eo[] j = new eo[]{a, b, c, d};


   private eo(String var1, int var2, int var3) {
      this.h = HashBiMap.create();
      this.i = HashBiMap.create();
      this.g = var3;
   }

   protected eo a(int var1, Class var2) {
      String var3;
      if(this.h.containsKey(Integer.valueOf(var1))) {
         var3 = "Serverbound packet ID " + var1 + " is already assigned to " + this.h.get(Integer.valueOf(var1)) + "; cannot re-assign to " + var2;
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else if(this.h.containsValue(var2)) {
         var3 = "Serverbound packet " + var2 + " is already assigned to ID " + this.h.inverse().get(var2) + "; cannot re-assign to " + var1;
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else {
         this.h.put(Integer.valueOf(var1), var2);
         return this;
      }
   }

   protected eo b(int var1, Class var2) {
      String var3;
      if(this.i.containsKey(Integer.valueOf(var1))) {
         var3 = "Clientbound packet ID " + var1 + " is already assigned to " + this.i.get(Integer.valueOf(var1)) + "; cannot re-assign to " + var2;
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else if(this.i.containsValue(var2)) {
         var3 = "Clientbound packet " + var2 + " is already assigned to ID " + this.i.inverse().get(var2) + "; cannot re-assign to " + var1;
         LogManager.getLogger().fatal(var3);
         throw new IllegalArgumentException(var3);
      } else {
         this.i.put(Integer.valueOf(var1), var2);
         return this;
      }
   }

   public BiMap a() {
      return this.h;
   }

   public BiMap b() {
      return this.i;
   }

   public BiMap a(boolean var1) {
      return var1?this.b():this.a();
   }

   public BiMap b(boolean var1) {
      return var1?this.a():this.b();
   }

   public int c() {
      return this.g;
   }

   public static eo a(int var0) {
      return (eo)e.get(var0);
   }

   public static eo a(ft var0) {
      return (eo)f.get(var0.getClass());
   }

   // $FF: synthetic method
   eo(String var1, int var2, int var3, ep var4) {
      this(var1, var2, var3);
   }

   static {
      eo[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         eo var3 = var0[var2];
         e.put(var3.c(), var3);
         Iterator var4 = Iterables.concat(var3.b().values(), var3.a().values()).iterator();

         while(var4.hasNext()) {
            Class var5 = (Class)var4.next();
            if(f.containsKey(var5) && f.get(var5) != var3) {
               throw new Error("Packet " + var5 + " is already assigned to protocol " + f.get(var5) + " - can\'t reassign to " + var3);
            }

            f.put(var5, var3);
         }
      }

   }
}
