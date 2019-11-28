
package maquinacafe;

public abstract class Bebida {
    
    
    
    private int azucar,leche; 

    public int getAzucar() {
        return azucar;
    }

    public int getLeche() {
        return leche;
    }
    
  public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

     @Override
    public String toString() {
        return getClase() 
                +","+getDescripcion()+
                ",pidio:"+getAzucar()+" de azucar"+
                ",pidio:"+getLeche()+" de leche";
    }
   public abstract String getDescripcion();
    
    public abstract double getPrecio();
    
    public abstract String getClase(); 
    
}
    


