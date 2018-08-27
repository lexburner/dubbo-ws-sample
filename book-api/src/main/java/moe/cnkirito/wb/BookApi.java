package moe.cnkirito.wb;

import javax.jws.WebService;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
@WebService
public interface BookApi {

    String sale(String text);

}
