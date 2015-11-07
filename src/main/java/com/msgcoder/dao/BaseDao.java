package com.msgcoder.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiukk on 2015/11/7.
 */
public interface BaseDao<T> {
    // 根据ID加载实体
    T get(Class<T> entityClazz, Serializable id);
    // 保存实体
    Serializable save(T entity);
    // 更新实体
    void update (T entity);
    // 根据HQL更新
    void update (String hql);
    // 删除实体
    void delete(T entity);
    // 根据ID删除实体
    void delete(Class<T> entityClazz, Serializable id);
    // 获取所有实体
    List<T> findAll(Class<T> entityClazz);
    // 获取实体总数
    long findCount(Class<T> entityClazz);
    long findCount(String hql, Object ... params);
    // 根据HQL查询实体
    List<T> find(String hql);
    // 根据带占位符参数的HQL查询实体
    List<T> find(String hql, Object ... params);
}