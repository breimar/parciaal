
package proyecto.pkg1;


public class Hipotenusa {
     private double catetoX;
    private double catetoY;
    private double hipotenusa;

    public Hipotenusa(double catetoX, double catetoY) {
        this.catetoX = catetoX;
        this.catetoY = catetoY;
    }

    public double getCatetoX() {
        return catetoX;
    }

    public void setCatetoX(double catetoX) {
        this.catetoX = catetoX;
    }

    public double getCatetoY() {
        return catetoY;
    }

    public void setCatetoY(double catetoY) {
        this.catetoY = catetoY;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }
    
     public void hipotenusa() 
    {
        hipotenusa = Math.sqrt(Math.pow(catetoX, 2) + Math.pow(catetoY, 2));
    }
    
}  


