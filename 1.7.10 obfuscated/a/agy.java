import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class agy {

   private TreeMap a = new TreeMap();


   public agy() {
      this.a("doFireTick", "true");
      this.a("mobGriefing", "true");
      this.a("keepInventory", "false");
      this.a("doMobSpawning", "true");
      this.a("doMobLoot", "true");
      this.a("doTileDrops", "true");
      this.a("commandBlockOutput", "true");
      this.a("naturalRegeneration", "true");
      this.a("doDaylightCycle", "true");
   }

   public void a(String var1, String var2) {
      this.a.put(var1, new agz(var2));
   }

   public void b(String var1, String var2) {
      agz var3 = (agz)this.a.get(var1);
      if(var3 != null) {
         var3.a(var2);
      } else {
         this.a(var1, var2);
      }

   }

   public String a(String var1) {
      agz var2 = (agz)this.a.get(var1);
      return var2 != null?var2.a():"";
   }

   public boolean b(String var1) {
      agz var2 = (agz)this.a.get(var1);
      return var2 != null?var2.b():false;
   }

   public dh a() {
      dh var1 = new dh();
      Iterator var2 = this.a.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         agz var4 = (agz)this.a.get(var3);
         var1.a(var3, var4.a());
      }

      return var1;
   }

   public void a(dh var1) {
      Set var2 = var1.c();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         String var6 = var1.j(var4);
         this.b(var4, var6);
      }

   }

   public String[] b() {
      return (String[])this.a.keySet().toArray(new String[0]);
   }

   public boolean e(String var1) {
      return this.a.containsKey(var1);
   }
}
