/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import ProductoDAO.ProductoDAO;
import MarcaDAO.MarcaDAO;
import Model.Marca;
import Model.Producto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author cetecom
 */
@Named(value = "productoBean")
@SessionScoped
public class ProductoBean implements Serializable {
     private short codigo;
     private Marca marca;
     private String descripcion;
    /**
     * Creates a new instance of MarcaBean
     */
    public ProductoBean() {
    }
    public void agregarProducto(short codmarca){
        marca = new Marca(codmarca); //enviar codmarca a Marca porque tiene un constructor para iniciar MArca con codigo
        Producto producto=new Producto(getCodigo(),getMarca(),getDescripcion());
        ProductoDAO marcaDAO=new ProductoDAO();
        marcaDAO.agregarProducto(producto);
    }
    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
    
}
