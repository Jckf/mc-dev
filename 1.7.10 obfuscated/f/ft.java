import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ft {

   private static final Logger a = LogManager.getLogger();


   public static ft a(BiMap var0, int var1) {
      try {
         Class var2 = (Class)var0.get(Integer.valueOf(var1));
         return var2 == null?null:(ft)var2.newInstance();
      } catch (Exception var3) {
         a.error("Couldn\'t create packet " + var1, (Throwable)var3);
         return null;
      }
   }

   public static void a(ByteBuf var0, byte[] var1) {
      var0.writeShort(var1.length);
      var0.writeBytes(var1);
   }

   public static byte[] a(ByteBuf var0) {
      short var1 = var0.readShort();
      if(var1 < 0) {
         throw new IOException("Key was smaller than nothing!  Weird key!");
      } else {
         byte[] var2 = new byte[var1];
         var0.readBytes(var2);
         return var2;
      }
   }

   public abstract void a(et var1);

   public abstract void b(et var1);

   public abstract void a(fb var1);

   public boolean a() {
      return false;
   }

   public String toString() {
      return this.getClass().getSimpleName();
   }

   public String b() {
      return "";
   }

}
