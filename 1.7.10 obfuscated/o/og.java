import java.io.File;
import java.io.FilenameFilter;

final class og implements FilenameFilter {

   public boolean accept(File var1, String var2) {
      return var2.endsWith(".dat");
   }
}
