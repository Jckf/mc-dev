import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dq extends dy {

   private List b = new ArrayList();
   private byte c = 0;


   void a(DataOutput var1) {
      if(!this.b.isEmpty()) {
         this.c = ((dy)this.b.get(0)).a();
      } else {
         this.c = 0;
      }

      var1.writeByte(this.c);
      var1.writeInt(this.b.size());

      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         ((dy)this.b.get(var2)).a(var1);
      }

   }

   void a(DataInput var1, int var2, ds var3) {
      if(var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         var3.a(8L);
         this.c = var1.readByte();
         int var4 = var1.readInt();
         this.b = new ArrayList();

         for(int var5 = 0; var5 < var4; ++var5) {
            dy var6 = dy.a(this.c);
            var6.a(var1, var2 + 1, var3);
            this.b.add(var6);
         }

      }
   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      String var1 = "[";
      int var2 = 0;

      for(Iterator var3 = this.b.iterator(); var3.hasNext(); ++var2) {
         dy var4 = (dy)var3.next();
         var1 = var1 + "" + var2 + ':' + var4 + ',';
      }

      return var1 + "]";
   }

   public void a(dy var1) {
      if(this.c == 0) {
         this.c = var1.a();
      } else if(this.c != var1.a()) {
         System.err.println("WARNING: Adding mismatching tag types to tag list");
         return;
      }

      this.b.add(var1);
   }

   public dh b(int var1) {
      if(var1 >= 0 && var1 < this.b.size()) {
         dy var2 = (dy)this.b.get(var1);
         return var2.a() == 10?(dh)var2:new dh();
      } else {
         return new dh();
      }
   }

   public int[] c(int var1) {
      if(var1 >= 0 && var1 < this.b.size()) {
         dy var2 = (dy)this.b.get(var1);
         return var2.a() == 11?((dn)var2).c():new int[0];
      } else {
         return new int[0];
      }
   }

   public double d(int var1) {
      if(var1 >= 0 && var1 < this.b.size()) {
         dy var2 = (dy)this.b.get(var1);
         return var2.a() == 6?((dk)var2).g():0.0D;
      } else {
         return 0.0D;
      }
   }

   public float e(int var1) {
      if(var1 >= 0 && var1 < this.b.size()) {
         dy var2 = (dy)this.b.get(var1);
         return var2.a() == 5?((dm)var2).h():0.0F;
      } else {
         return 0.0F;
      }
   }

   public String f(int var1) {
      if(var1 >= 0 && var1 < this.b.size()) {
         dy var2 = (dy)this.b.get(var1);
         return var2.a() == 8?var2.a_():var2.toString();
      } else {
         return "";
      }
   }

   public int c() {
      return this.b.size();
   }

   public dy b() {
      dq var1 = new dq();
      var1.c = this.c;
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         dy var3 = (dy)var2.next();
         dy var4 = var3.b();
         var1.b.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         dq var2 = (dq)var1;
         if(this.c == var2.c) {
            return this.b.equals(var2.b);
         }
      }

      return false;
   }

   public int hashCode() {
      return super.hashCode() ^ this.b.hashCode();
   }

   public int d() {
      return this.c;
   }
}
