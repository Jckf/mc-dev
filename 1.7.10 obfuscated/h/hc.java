import org.apache.commons.lang3.Validate;

public class hc extends ft {

   private String a;
   private int b;
   private int c = Integer.MAX_VALUE;
   private int d;
   private float e;
   private int f;


   public hc() {}

   public hc(String var1, double var2, double var4, double var6, float var8, float var9) {
      Validate.notNull(var1, "name", new Object[0]);
      this.a = var1;
      this.b = (int)(var2 * 8.0D);
      this.c = (int)(var4 * 8.0D);
      this.d = (int)(var6 * 8.0D);
      this.e = var8;
      this.f = (int)(var9 * 63.0F);
      if(this.f < 0) {
         this.f = 0;
      }

      if(this.f > 255) {
         this.f = 255;
      }

   }

   public void a(et var1) {
      this.a = var1.c(256);
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readFloat();
      this.f = var1.readUnsignedByte();
   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeFloat(this.e);
      var1.writeByte(this.f);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
