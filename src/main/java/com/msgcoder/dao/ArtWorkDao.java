package com.msgcoder.dao;

import com.msgcoder.dao.entities.ArtWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiukk on 2015/8/31.
 */
@Component

public class ArtWorkDao {
    @Autowired
    HqlDaoImpl hqlDaoImpl;

    // 添加一个项目
    public Serializable save(ArtWork artWork){
        Serializable id = hqlDaoImpl.save(artWork);
        return id;
    }

    // 更新一个项目
    public void update(ArtWork artWork){
        hqlDaoImpl.update(artWork);
    }

    // 获得所有试驾信息,按试驾时间的降序
    public List<ArtWork> getTestDriveInfoList(){
        // TestDriveInfo为持久对象类名
        List<ArtWork> artWorks =(List<ArtWork>) hqlDaoImpl.find("from ArtWork aw order by id");
        return artWorks;
    }

    public ArtWork getTestDriveInfoByTel(String tel){
        List<ArtWork> artWorks =(List<ArtWork>) hqlDaoImpl.find("from ArtWork aw where aw.tel=?", new Object[]{tel});
        if (artWorks.size() > 0)
            return artWorks.get(0);
        else return null;
    }

    // 更新已联系信息
    public boolean updateIsContactedInfo(String tel){
        return hqlDaoImpl.delOrUpdate("update ArtWork aw set tdt.isContacted=1 where aw.tel=?",new Object[]{tel});
    }
}
