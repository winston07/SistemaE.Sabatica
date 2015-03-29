
package Factory;


public class FactoryConnectionDB {
 public static final int MYSQL=1;
 public static final int ORACLE=2;
 public static String[] configMYSQL={"union","root","root"};
 public static String[] configORACLE={"XE","upeu","upeu"};
 
 public static ConnectionDB open(int typeDb)
 {
   switch(typeDb)
   {
      case FactoryConnectionDB.MYSQL:
          return new MysqlConnectionFactory(configMYSQL);
      case FactoryConnectionDB.ORACLE:
          return new OracleConnectionFactory(configORACLE);
          default:
              return null;
   }
 }
}
