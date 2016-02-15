package cachelevel1;

import dto.product;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Cachelevel1 {

    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        //product p1 = new product(101, "Mobile", 34359);
        //s.save(p1);
        product p2 = (product) s.get(product.class, 101);
        System.out.println(p2);
        t.commit();
        s.close();
        sf.close();
    }
    
}
