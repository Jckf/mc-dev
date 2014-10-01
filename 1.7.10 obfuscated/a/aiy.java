
public class aiy extends aia {

   protected arn J;


   public aiy() {
      this.J = new asl(ajn.bs);
   }

   protected void a(ahu var1) {
      this.a();
      if(this.b.nextInt(5) == 0) {
         int var2 = this.c + this.b.nextInt(16) + 8;
         int var3 = this.d + this.b.nextInt(16) + 8;
         int var4 = this.a.i(var2, var3);
         this.J.a(this.a, this.b, var2, var4, var3);
      }

      if(this.c == 0 && this.d == 0) {
         xa var5 = new xa(this.a);
         var5.b(0.0D, 128.0D, 0.0D, this.b.nextFloat() * 360.0F, 0.0F);
         this.a.d((sa)var5);
      }

   }
}
