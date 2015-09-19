package com.cheling.dao;

import com.cheling.dao.entities.TestDriveInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jiukk on 2015/8/31.
 */
@Component

public class TestDriveInfoDao {
    @Autowired
    HqlDaoImpl hqlDaoImpl;

    // 添加试驾信息
    public void save(TestDriveInfo testDriveInfo){
        hqlDaoImpl.save(testDriveInfo);
    }

    // 更新试驾信息
    public void update(TestDriveInfo testDriveInfo){
        hqlDaoImpl.update(testDriveInfo);
    }

    // 获得所有试驾信息,按试驾时间的降序
    public List<TestDriveInfo> getTestDriveInfoList(){
        // TestDriveInfo为持久对象类名
        List<TestDriveInfo> testDriveInfos =(List<TestDriveInfo>) hqlDaoImpl.find("from TestDriveInfo tdt order by id");
        return testDriveInfos;
    }

    public TestDriveInfo getTestDriveInfoByTel(String tel){
        List<TestDriveInfo> testDriveInfos =(List<TestDriveInfo>) hqlDaoImpl.find("from TestDriveInfo tdt where tdt.tel=?", new Object[]{tel});
        if (testDriveInfos.size() > 0)
            return testDriveInfos.get(0);
        else return null;
    }

    // 更新已联系信息
    public boolean updateIsContactedInfo(String tel){
        return hqlDaoImpl.delOrUpdate("update TestDriveInfo tdt set tdt.isContacted=1 where tdt.tel=?",new Object[]{tel});
    }
}
