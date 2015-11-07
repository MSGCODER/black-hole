package com.msgcoder.service.impl;

import com.msgcoder.dao.BaseDao;
import com.msgcoder.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guanshiming on 2015/11/7.
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    @Qualifier("baseDaoImpl")
    private BaseDao<T> baseDao;

    public T get(Class<T> entityClazz, Serializable id) {
        return baseDao.get(entityClazz, id);
    }

    public Serializable save(T entity) {
        return baseDao.save(entity);
    }

    public void update(T entity) {
        baseDao.save(entity);
    }

    public void update(String hql) {
        baseDao.update(hql);
    }

    public void delete(T entity) {
        baseDao.delete(entity);
    }

    public void delete(Class<T> entityClazz, Serializable id) {
        baseDao.delete(entityClazz, id);
    }

    public List<T> findAll(Class<T> entityClazz) {
        return baseDao.findAll(entityClazz);
    }

    public long findCount(Class<T> entityClazz) {
        return baseDao.findCount(entityClazz);
    }

    public long findCount(String hql, Object... params) {
        return baseDao.findCount(hql, params);
    }

    public List<T> find(String hql) {
        return baseDao.find(hql);
    }

    public List<T> find(String hql, Object... params) {
        return baseDao.find(hql, params);
    }
}
