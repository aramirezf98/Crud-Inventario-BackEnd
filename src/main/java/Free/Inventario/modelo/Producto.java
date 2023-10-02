package Free.Inventario.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;


@Entity //se crea la tabla en la base de datos
@Data //se generan los metodos set y get
@NoArgsConstructor //agrega un constructor vacio a esta clase
@AllArgsConstructor //agrega un constructor con todos los argumentos
@ToString // agrega el metodo toString

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento
    Integer idProducto; //estas 3 lineas crean la llave primaria
    //se crean las demas columnas, la primera sera la llave primaria idProducto
    String descripcion;
    Double precio;
    Integer existencia;

}
