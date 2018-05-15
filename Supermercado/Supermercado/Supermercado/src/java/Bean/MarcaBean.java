/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import MarcaDAO.MarcaDAO;
import Model.Marca;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author cetecom
 */
@Named(value = "marcaBean")
@SessionScoped
public class MarcaBean implements Serializable {
     private short codigo;
     private String descripcion;
    /**
     * Creates a new instance of MarcaBean
     */
    public MarcaBean() {
    }
    public void agregarMarca(){
        Marca marca=new Marca(getCodigo(),getDescripcion());
        MarcaDAO marcaDAO=new MarcaDAO();
        marcaDAO.agregarMarca(marca);
    }
    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) { //llave primaria se genera el constructor con el id
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
