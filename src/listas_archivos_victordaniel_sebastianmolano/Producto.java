package listas_archivos_victordaniel_sebastianmolano;

import javax.swing.JOptionPane;

public class Producto {
    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precio;
    public static final int COD = 0;
    public static final int DESC = 1;
    public static final int CANT = 2;
    public static final int PREC = 3; 

    public Producto(int codigo, String descripcion, int cantidad, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static Producto convertirAProducto(String linea)
    {
        String[] campos = Frame.split(linea, ";");
        if (campos.length < 4) JOptionPane.showMessageDialog(null, "Error al leer campos");
        else 
            return new Producto(Integer.parseInt(campos[COD]), 
                                campos[DESC], 
                                Integer.parseInt(campos[CANT]), 
                                Double.parseDouble(campos[PREC]));
        return null;
    }
    
    
}
