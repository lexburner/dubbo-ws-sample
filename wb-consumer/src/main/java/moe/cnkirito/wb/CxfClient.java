package moe.cnkirito.wb;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
public class CxfClient {
    public static void main(String[] args) {
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
        factory.setAddress("http://localhost:8082/bookService");
        BookApi client = factory.create(BookApi.class);
        System.out.println(client.sale("kirito"));
    }
}
