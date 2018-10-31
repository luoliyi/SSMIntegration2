package show.springmvccontroller;

import com.nf.dao.GoodsDAO;
import com.nf.interfaces.GoodsMapper;
import com.nf.luoliyi.entities.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(path = "/showController")
public class ShowController {

    @Autowired
    GoodsMapper goodsDAO;

    @ModelAttribute
    public void init(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        goodsDAO=applicationContext.getBean(GoodsDAO.class);
    }

    @RequestMapping(path = "/selectAllGoods",method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> selectAllGoods(Model model) {
        List<Goods> goodsList=goodsDAO.selectAllGoods();
        System.out.println(goodsList);
        return goodsList;
    }

    @RequestMapping(path = "/selectOneGoodsById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Goods selectAllGoods(Model model,@PathVariable int id) {
        Goods goods=goodsDAO.selectOneById(id);
        System.out.println(goods);
        return goods;
    }
}
