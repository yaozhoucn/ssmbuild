import com.yaozhou.pojo.Books;
import com.yaozhou.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WXHang on HANG at 2021/6/7 14:28
 * Desc：
 */
public class Mytest {
    @Test
    public void test(){
        //拿到spring的所有配置文件，所有bean
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) applicationContext.getBean("BooksServiceImp");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }

    }

}
