package listas_archivos_victordaniel_sebastianmolano;

import javax.swing.JOptionPane;

public class ListaEnlazada {

    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int size;
    public ListaEnlazada() {
        size = 0;
        primerNodo = null;
        ultimoNodo = null;
    }
    public void addFinal(Producto informacion) {
        Nodo p = new Nodo(informacion);
        if (primerNodo == null) {
            primerNodo = p;
        } else {
            ultimoNodo.setLink(p);
        }
        ultimoNodo = p;
        size++;
    }
    public void addOrdenado(Producto info) {
        Nodo nuevo = new Nodo(info);
        if (primerNodo == null) {
            primerNodo = nuevo;
        } else {
            Nodo anterior = null;
            Nodo actual = primerNodo;
            while (actual.getInfo().getCodigo() < info.getCodigo() && actual.getLink() != null) {
                anterior = actual;
                actual = actual.getLink();
            }
            if (actual.getInfo().getCodigo() == info.getCodigo()) {
                JOptionPane.showMessageDialog(null, "No se aceptan datos repetidos");
            } else {
                if (actual.getInfo().getCodigo() > info.getCodigo()) {
                    if (actual.getInfo().getCodigo() == primerNodo.getInfo().getCodigo()) {
                        nuevo.setLink(primerNodo);
                        primerNodo = nuevo;
                    } else if (anterior != null) {
                        anterior.setLink(nuevo);
                        nuevo.setLink(actual);
                    }
                } else {
                    actual.setLink(nuevo);
                    nuevo.setLink(null);
                }
            }
        }
        size++;
    }
    public Producto get(int index) {
        Nodo p = primerNodo;
        for (int i = 0; i < index; i++) {
            p = p.getLink();
        }
        return p.getInfo();
    }
    public Nodo getNodo(int index)
    {
        Nodo p = primerNodo;
        for (int i = 0; i < index; i++) {
            p = p.getLink();
        }
        return p;
    }
    public int getSize() {
        return size;
    }
    public boolean remove(int index)
    {
        Nodo actual = getNodo(index);
        if (actual == null) return false;
        if (index == 0)
            primerNodo = primerNodo.getLink();
        else
        {
            Nodo anterior = getNodo(index-1);
            anterior.setLink(actual.getLink());
            size--;
            return true;
        }
        return false;
    }
    public ListaEnlazada insert(Producto element){
        Nodo nuevo = new Nodo(element);
        if(ultimoNodo!=null){
            nuevo.setLink(ultimoNodo.getLink());
            ultimoNodo.setLink(nuevo);
        }
        ultimoNodo = nuevo;
        return this;
    }
}
