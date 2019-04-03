import com.xiongchenming.commons.SystemConstantsUtils;
import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.dao.IGoodsDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class testSpring {
    @Autowired
    private IGoodsDAO dao;
    @Test
    public void testSelectgood(){
        try {
            int index = (1-1) * SystemConstantsUtils.page.PAGE_SIZE;
            List<WxbGood> goods = dao.selectGoodsByPage(index);
            for (WxbGood good : goods){
                System.out.println(good.getGoodName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsert(){
        WxbGood wxbGood = new WxbGood();
        wxbGood.setGoodId(UUID.randomUUID().toString().substring(0,8));
        wxbGood.setGoodName("dada");
        wxbGood.setCustomerId(UUID.randomUUID().toString().substring(0,8));
        wxbGood.setGoodPic("null");
        wxbGood.setGoodPic1("null");
        wxbGood.setGoodPic2("null");
        wxbGood.setPromoteDesc("dadadadad");
        wxbGood.setSkuTitle("1111111111");
        wxbGood.setSkuCost("1");
        wxbGood.setSkuPrice("1");
        wxbGood.setSkuPmoney("1");
        wxbGood.setCopyIds("1564");
        wxbGood.setCopyDesc("null");
        wxbGood.setForwardLink("null");
        wxbGood.setOrderNo(11);
        wxbGood.setTypeId("03");
        wxbGood.setTags("2");
        wxbGood.setState(0);
        wxbGood.setCreateTime(new Timestamp(new Date().getTime()));
        wxbGood.setToped(0);
        wxbGood.setRecomed(0);
        wxbGood.setToped(0);
        wxbGood.setRecomedTime(new Timestamp(new Date().getTime()));
        wxbGood.setSpcId("dasd");
        wxbGood.setZonId("dada");
        wxbGood.setSellNum(0);
        wxbGood.setWebsite("dada");
        wxbGood.setIswxpay(0);
        wxbGood.setIsfdfk(0);
        wxbGood.setLeixingId(0);
        wxbGood.setKfqq("dada");
        try {
            dao.insertGood(wxbGood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
