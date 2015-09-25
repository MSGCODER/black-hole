package com.msgcoder.dao;

import com.msgcoder.dao.entities.ArtWork;
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
    public void save(ArtWork artWork){
        hqlDaoImpl.save(artWork);
    }

    // 更新试驾信息
    public void update(ArtWork artWork){
        hqlDaoImpl.update(artWork);
    }

    // 获得所有试驾信息,按试驾时间的降序
    public List<ArtWork> getTestDriveInfoList(){
        // TestDriveInfo为持久对象类名
        List<ArtWork> artWorks =(List<ArtWork>) hqlDaoImpl.find("from ArtWork tdt order by id");
        return artWorks;
    }

    public ArtWork getTestDriveInfoByTel(String tel){
        List<ArtWork> artWorks =(List<ArtWork>) hqlDaoImpl.find("from ArtWork tdt where tdt.tel=?", new Object[]{tel});
        if (artWorks.size() > 0)
            return artWorks.get(0);
        else return null;
    }

    // 更新已联系信息
    public boolean updateIsContactedInfo(String tel){
        return hqlDaoImpl.delOrUpdate("update ArtWork tdt set tdt.isContacted=1 where tdt.tel=?",new Object[]{tel});
    }
}
