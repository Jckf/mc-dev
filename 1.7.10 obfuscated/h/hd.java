
public class hd extends ft {

   private int a;
   private boolean b;
   private ahk c;
   private int d;
   private rd e;
   private int f;
   private ahm g;


   public hd() {}

   public hd(int var1, ahk var2, boolean var3, int var4, rd var5, int var6, ahm var7) {
      this.a = var1;
      this.d = var4;
      this.e = var5;
      this.c = var2;
      this.f = var6;
      this.b = var3;
      this.g = var7;
   }

   public void a(et var1) {
      this.a = var1.readInt();
      short var2 = var1.readUnsignedByte();
      this.b = (var2 & 8) == 8;
      int var3 = var2 & -9;
      this.c = ahk.a(var3);
      this.d = var1.readByte();
      this.e = rd.a(var1.readUnsignedByte());
      this.f = var1.readUnsignedByte();
      this.g = ahm.a(var1.c(16));
      if(this.g == null) {
         this.g = ahm.b;
      }

   }

   public void b(et var1) {
      var1.writeInt(this.a);
      int var2 = this.c.a();
      if(this.b) {
         var2 |= 8;
      }

      var1.writeByte(var2);
      var1.writeByte(this.d);
      var1.writeByte(this.e.a());
      var1.writeByte(this.f);
      var1.a(this.g.a());
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c.a()), Boolean.valueOf(this.b), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f)});
   }
}
