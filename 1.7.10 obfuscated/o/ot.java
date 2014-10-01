import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class ot {

   private ByteArrayOutputStream a;
   private DataOutputStream b;


   public ot(int var1) {
      this.a = new ByteArrayOutputStream(var1);
      this.b = new DataOutputStream(this.a);
   }

   public void a(byte[] var1) {
      this.b.write(var1, 0, var1.length);
   }

   public void a(String var1) {
      this.b.writeBytes(var1);
      this.b.write(0);
   }

   public void a(int var1) {
      this.b.write(var1);
   }

   public void a(short var1) {
      this.b.writeShort(Short.reverseBytes(var1));
   }

   public byte[] a() {
      return this.a.toByteArray();
   }

   public void b() {
      this.a.reset();
   }
}
