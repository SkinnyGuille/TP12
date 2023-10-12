
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;


public class TP12 {

    
    public static void main(String[] args) {
        try{
       Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("cargo");
       
        //conexion de base de datos
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/construirsa", "root","");
            System.out.println("conectado con exito");
            
            //Insertar 3 empleados.
//              String sql="INSERT INTO empleado(dni, apellido, nombre, acceso, estado)"
//                      + " VALUES (789456,'Perez','Juan',1,true),(321654,'Orozco','Maria', 3,true)";
//              PreparedStatement ps = conexion.prepareStatement(sql);
//              int empleados = ps.executeUpdate();
//              System.out.println(empleados);
              
        //Insertar 2 herramientas.
//            
//            String sql ="INSERT INTO herramienta(nombre, descripcion, stock, estado) "
//                    + "VALUES ('Martillo', 'Herramienta de golpeo',12,true),('destornillador','Herramienta de ajuste',20,true),('Sierra','Herramienta de corte',2,true)";
//     PreparedStatement ps = conexion.prepareStatement(sql);
//      int registro = ps.executeUpdate();
//           System.out.println(registro);

      // Listar todas las herramientas con stock superior a 10.
//         String sql = "SELECT idherramienta, nombre, descripcion, stock, estado FROM herramienta WHERE stock > 10";
//         PreparedStatement ps1 = conexion.prepareStatement(sql);
//            ResultSet resultSet = ps1.executeQuery();
//
//            while (resultSet.next()) {
//                int idHerramienta = resultSet.getInt("idherramienta");
//                String nombre = resultSet.getString("nombre");
//                String descripcion = resultSet.getString("descripcion");
//                int stock = resultSet.getInt("stock");
//                String estado = resultSet.getString("estado");
//
//                System.out.println("ID: " + idHerramienta + ", Nombre: " + nombre + ", Descripcion: " + descripcion + ", Stock: " + stock + ", Estado: " + estado);
//            }
//            System.out.println("listado ordenado");
            
            //Dar de baja al primer empleado ingresado a la base de datos.
//         String sql4 = "DELETE FROM empleado WHERE empleado.idempleado = 1";
// PreparedStatement ps1 = conexion.prepareStatement(sql4);
//       int empleado =ps1.executeUpdate();
//        System.out.println(empleado);
//            System.out.println("se a eliminado el empleado");
          

            
            
            
            
            
            
            
            
            
            
            
            
   }catch (ClassNotFoundException cnf){
        JOptionPane.showMessageDialog(null,"error" + cnf.getMessage());
        
    }  catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"error en conexion"+ ex.getMessage());
        }
    
    }
}
    

