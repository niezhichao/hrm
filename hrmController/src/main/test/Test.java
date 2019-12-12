import com.nzc.hrm.dao.DeptDao;
import com.nzc.hrm.entity.po.DeptInfo;
import com.nzc.hrm.service.DeptInfoService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml"})
public class Test {
    @Autowired
    DeptDao deptDao;
    @org.junit.Test
    public void test(){
        DeptInfo deptInfo=new DeptInfo();
        deptInfo.setName("侦察股");
        deptInfo.setRemark("团机关");
        deptDao.insert(deptInfo);


    }
}
