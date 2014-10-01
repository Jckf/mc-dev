import java.io.File;
import java.io.FilenameFilter;

class ayo implements FilenameFilter {

   // $FF: synthetic field
   final ayn a;


   ayo(ayn var1) {
      this.a = var1;
   }

   public boolean accept(File var1, String var2) {
      return var2.endsWith(".mcr");
   }
}
