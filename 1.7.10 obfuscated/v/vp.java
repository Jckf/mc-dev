
class vp implements sj {

   // $FF: synthetic field
   final sj d;
   // $FF: synthetic field
   final vo e;


   vp(vo var1, sj var2) {
      this.e = var1;
      this.d = var2;
   }

   public boolean a(sa var1) {
      return !(var1 instanceof sv)?false:(this.d != null && !this.d.a(var1)?false:this.e.a((sv)var1, false));
   }
}
