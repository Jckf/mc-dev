import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class afa {

   private static final afa a = new afa();
   private Map b = new HashMap();
   private Map c = new HashMap();


   public static afa a() {
      return a;
   }

   private afa() {
      this.a(ajn.p, new add(ade.j), 0.7F);
      this.a(ajn.o, new add(ade.k), 1.0F);
      this.a(ajn.ag, new add(ade.i), 1.0F);
      this.a((aji)ajn.m, new add(ajn.w), 0.1F);
      this.a(ade.al, new add(ade.am), 0.35F);
      this.a(ade.bd, new add(ade.be), 0.35F);
      this.a(ade.bf, new add(ade.bg), 0.35F);
      this.a(ajn.e, new add(ajn.b), 0.1F);
      this.a(ade.aD, new add(ade.aC), 0.3F);
      this.a(ajn.aG, new add(ajn.ch), 0.35F);
      this.a(ajn.aF, new add(ade.aR, 1, 2), 0.2F);
      this.a(ajn.r, new add(ade.h, 1, 1), 0.15F);
      this.a(ajn.s, new add(ade.h, 1, 1), 0.15F);
      this.a(ajn.bA, new add(ade.bC), 1.0F);
      this.a(ade.bG, new add(ade.bH), 0.35F);
      this.a(ajn.aL, new add(ade.bT), 0.1F);
      acu[] var1 = acu.values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         acu var4 = var1[var3];
         if(var4.i()) {
            this.a(new add(ade.aP, 1, var4.a()), new add(ade.aQ, 1, var4.a()), 0.35F);
         }
      }

      this.a(ajn.q, new add(ade.h), 0.1F);
      this.a(ajn.ax, new add(ade.ax), 0.7F);
      this.a(ajn.x, new add(ade.aR, 1, 4), 0.2F);
      this.a(ajn.bY, new add(ade.bU), 0.2F);
   }

   public void a(aji var1, add var2, float var3) {
      this.a(adb.a(var1), var2, var3);
   }

   public void a(adb var1, add var2, float var3) {
      this.a(new add(var1, 1, 32767), var2, var3);
   }

   public void a(add var1, add var2, float var3) {
      this.b.put(var1, var2);
      this.c.put(var2, Float.valueOf(var3));
   }

   public add a(add var1) {
      Iterator var2 = this.b.entrySet().iterator();

      Entry var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Entry)var2.next();
      } while(!this.a(var1, (add)var3.getKey()));

      return (add)var3.getValue();
   }

   private boolean a(add var1, add var2) {
      return var2.b() == var1.b() && (var2.k() == 32767 || var2.k() == var1.k());
   }

   public Map b() {
      return this.b;
   }

   public float b(add var1) {
      Iterator var2 = this.c.entrySet().iterator();

      Entry var3;
      do {
         if(!var2.hasNext()) {
            return 0.0F;
         }

         var3 = (Entry)var2.next();
      } while(!this.a(var1, (add)var3.getKey()));

      return ((Float)var3.getValue()).floatValue();
   }

}
