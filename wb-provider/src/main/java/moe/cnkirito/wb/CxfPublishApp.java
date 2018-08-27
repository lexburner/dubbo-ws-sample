package moe.cnkirito.wb;

import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;
import java.util.Collections;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
public class CxfPublishApp {
    public static void main(String[] args) {
//        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//        factory.setServiceClass(BookApi.class);
//        //服务发布地址
//        factory.setAddress("http://localhost:8082/bookService");
//        factory.setServiceBean(new BookApiWbProvider());
//        factory.create();
//        System.out.println("publish success");
        BookApiWbProvider implementor= new BookApiWbProvider();
        String address="http://localhost:8082/bookService";
        Endpoint.publish(address, implementor);

        System.out.println("web service started。。。");

    }
}
