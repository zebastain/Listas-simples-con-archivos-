package listas_archivos_victordaniel_sebastianmolano;

public class Nodo
{
    private Producto info;
    private Nodo link;
    public Nodo()
    {
        info = null;
        link = null;
    }
    public Nodo(Producto info)
    {
        this();
        this.info = info;
    }
    public Nodo(Producto info, Nodo link)
    {
        this(info);
        this.link = link;
    }
    public Producto getInfo() {
        return info;
    }

    public void setInfo(Producto info) {
        this.info = info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
}