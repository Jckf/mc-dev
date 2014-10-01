
class ef extends ec {

   protected String b;


   public ef(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public dy a() {
      try {
         if(this.b.matches("[-+]?[0-9]*\\.?[0-9]+[d|D]")) {
            return new dk(Double.parseDouble(this.b.substring(0, this.b.length() - 1)));
         } else if(this.b.matches("[-+]?[0-9]*\\.?[0-9]+[f|F]")) {
            return new dm(Float.parseFloat(this.b.substring(0, this.b.length() - 1)));
         } else if(this.b.matches("[-+]?[0-9]+[b|B]")) {
            return new dg(Byte.parseByte(this.b.substring(0, this.b.length() - 1)));
         } else if(this.b.matches("[-+]?[0-9]+[l|L]")) {
            return new dr(Long.parseLong(this.b.substring(0, this.b.length() - 1)));
         } else if(this.b.matches("[-+]?[0-9]+[s|S]")) {
            return new dw(Short.parseShort(this.b.substring(0, this.b.length() - 1)));
         } else if(this.b.matches("[-+]?[0-9]+")) {
            return new dp(Integer.parseInt(this.b.substring(0, this.b.length())));
         } else if(this.b.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            return new dk(Double.parseDouble(this.b.substring(0, this.b.length())));
         } else if(!this.b.equalsIgnoreCase("true") && !this.b.equalsIgnoreCase("false")) {
            if(this.b.startsWith("[") && this.b.endsWith("]")) {
               if(this.b.length() > 2) {
                  String var1 = this.b.substring(1, this.b.length() - 1);
                  String[] var2 = var1.split(",");

                  try {
                     if(var2.length <= 1) {
                        return new dn(new int[]{Integer.parseInt(var1.trim())});
                     } else {
                        int[] var3 = new int[var2.length];

                        for(int var4 = 0; var4 < var2.length; ++var4) {
                           var3[var4] = Integer.parseInt(var2[var4].trim());
                        }

                        return new dn(var3);
                     }
                  } catch (NumberFormatException var5) {
                     return new dx(this.b);
                  }
               } else {
                  return new dn();
               }
            } else {
               if(this.b.startsWith("\"") && this.b.endsWith("\"") && this.b.length() > 2) {
                  this.b = this.b.substring(1, this.b.length() - 1);
               }

               this.b = this.b.replaceAll("\\\\\"", "\"");
               return new dx(this.b);
            }
         } else {
            return new dg((byte)(Boolean.parseBoolean(this.b)?1:0));
         }
      } catch (NumberFormatException var6) {
         this.b = this.b.replaceAll("\\\\\"", "\"");
         return new dx(this.b);
      }
   }
}
