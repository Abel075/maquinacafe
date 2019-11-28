/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipocafe;

/**
 *
 * @author Toshiba
 */
public class Expresso extends Cafe{
    
    
    @Override
    public String getDescripcion() {
        return "Expresso";//Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 100; //Retorno el precio del café expresso
    }

    @Override
    public String getClase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
