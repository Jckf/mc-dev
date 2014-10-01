import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class me extends JList implements lr {

   private MinecraftServer a;
   private int b;


   public me(MinecraftServer var1) {
      this.a = var1;
      var1.a((lr)this);
   }

   public void a() {
      if(this.b++ % 20 == 0) {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < this.a.ah().e.size(); ++var2) {
            var1.add(((mw)this.a.ah().e.get(var2)).b_());
         }

         this.setListData(var1);
      }

   }
}
