//c04 - prgm 1 part -1
package package_graphics;

interface interface_graphics{
    public float pi=3.14F;
   public float recArea(int l, int h);
   public float cirArea(int r);
   public float squArea(int a);
   public float triArea(int l, int h);
}

public class shape implements interface_graphics {
    
    public float recArea(int l, int h){return l*h;}
    public float cirArea(int r){return r*r*pi;}
    public float squArea(int a){return a*a;}
    public float triArea(int l, int h){return l*h*(float)(.5);}
    
}
