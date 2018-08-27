package moe.cnkirito.wb;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
@Service
public class BookDubboProvider implements BookApi {

    @Override
    public String sale(String text) {
        System.out.println(text);
        return text;
    }
}
