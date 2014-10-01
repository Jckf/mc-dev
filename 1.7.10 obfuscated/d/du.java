import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class du {

   public static dh a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      dh var2;
      try {
         var2 = a((DataInput)var1, ds.a);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(dh var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static dh a(byte[] var0, ds var1) {
      DataInputStream var2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      dh var3;
      try {
         var3 = a((DataInput)var2, var1);
      } finally {
         var2.close();
      }

      return var3;
   }

   public static byte[] a(dh var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static dh a(DataInputStream var0) {
      return a((DataInput)var0, ds.a);
   }

   public static dh a(DataInput var0, ds var1) {
      dy var2 = a(var0, 0, var1);
      if(var2 instanceof dh) {
         return (dh)var2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(dh var0, DataOutput var1) {
      a((dy)var0, var1);
   }

   private static void a(dy var0, DataOutput var1) {
      var1.writeByte(var0.a());
      if(var0.a() != 0) {
         var1.writeUTF("");
         var0.a(var1);
      }
   }

   private static dy a(DataInput var0, int var1, ds var2) {
      byte var3 = var0.readByte();
      if(var3 == 0) {
         return new dl();
      } else {
         var0.readUTF();
         dy var4 = dy.a(var3);

         try {
            var4.a(var0, var1, var2);
            return var4;
         } catch (IOException var8) {
            b var6 = b.a(var8, "Loading NBT data");
            k var7 = var6.a("NBT Tag");
            var7.a("Tag name", (Object)"[UNNAMED TAG]");
            var7.a("Tag type", (Object)Byte.valueOf(var3));
            throw new s(var6);
         }
      }
   }
}
