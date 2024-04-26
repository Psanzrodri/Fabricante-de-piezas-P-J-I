package StockDeProductos;

public class ADMIN extends USUARIO_BASE{
    private String Añadir;
    private String  Delete;

    public ADMIN(String Productos, String Pedidos){
        super(Productos, Pedidos);
        this.Añadir = Añadir;
        this.Delete = Delete;
    }
}

