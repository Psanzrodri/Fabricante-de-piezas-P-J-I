package StockDeProductos;

import Pedidos.Pedidos;

abstract public class  USUARIO_BASE  {
    private  String Productos;
    private String Pedidos;

    public USUARIO_BASE(String Productos, String Pedidos){
        this.Productos = Productos;
        this.Pedidos = Pedidos;
    }
}
