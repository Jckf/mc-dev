import java.util.Collection;

public class jx implements id {

   private int a;
   private byte b;
   private bqd[] c;
   private int d;
   private int e;
   private int f;
   private int g;
   private byte[] h;


   public jx() {}

   public jx(int var1, byte var2, Collection var3, byte[] var4, int var5, int var6, int var7, int var8) {
      this.a = var1;
      this.b = var2;
      this.c = (bqd[])var3.toArray(new bqd[var3.size()]);
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
      this.h = new byte[var7 * var8];

      for(int var9 = 0; var9 < var7; ++var9) {
         for(int var10 = 0; var10 < var8; ++var10) {
            this.h[var9 + var10 * var7] = var4[var5 + var9 + (var6 + var10) * 128];
         }
      }

   }

   public void a(hd var1) {
      this.a = var1.e();
      this.b = var1.readByte();
      this.c = new bqd[var1.e()];

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         short var3 = (short)var1.readByte();
         this.c[var2] = new bqd((byte)(var3 >> 4 & 15), var1.readByte(), var1.readByte(), (byte)(var3 & 15));
      }

      this.f = var1.readUnsignedByte();
      if(this.f > 0) {
         this.g = var1.readUnsignedByte();
         this.d = var1.readUnsignedByte();
         this.e = var1.readUnsignedByte();
         this.h = var1.a();
      }

   }

   public void b(hd var1) {
      var1.b(this.a);
      var1.writeByte(this.b);
      var1.b(this.c.length);
      bqd[] var2 = this.c;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         bqd var5 = var2[var4];
         var1.writeByte((var5.a() & 15) << 4 | var5.d() & 15);
         var1.writeByte(var5.b());
         var1.writeByte(var5.c());
      }

      var1.writeByte(this.f);
      if(this.f > 0) {
         var1.writeByte(this.g);
         var1.writeByte(this.d);
         var1.writeByte(this.e);
         var1.a(this.h);
      }

   }

   public void a(ik var1) {
      var1.a(this);
   }
}
