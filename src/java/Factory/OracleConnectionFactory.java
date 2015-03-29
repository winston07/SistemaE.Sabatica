
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public final class OracleConnectionFactory extends ConnectionDB{

    public OracleConnectionFactory(String[] params) {
    this.params=params;
    this.open();
    }
    
    
    @Override
    public Connection open() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+this.params[0],this.params[1],this.params[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }    
}
