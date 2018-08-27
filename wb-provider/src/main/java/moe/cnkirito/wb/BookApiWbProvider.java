package moe.cnkirito.wb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
@WebService(serviceName = "bookService",
        endpointInterface = "moe.cnkirito.wb.BookApi"
)
public class BookApiWbProvider implements BookApi {

    @Override
    public String sale(@WebParam(name = "text") String text) {
        System.out.println(text);
        return text;
    }
}
