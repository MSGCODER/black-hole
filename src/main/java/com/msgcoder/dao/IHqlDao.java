package com.msgcoder.dao;

import org.hibernate.HibernateException;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiukk on 2015/9/1.
 */
public interface IHqlDao extends IDao {
    // 插入一条数据

    Serializable save(Object obj) throws HibernateException;

    // 删除一条数据
    boolean del(Object obj) throws HibernateException;

    // 更新一条数据
    boolean update(Object obj) throws HibernateException;

    // 更新一条数据
    boolean update(List obj, List params) throws HibernateException;

    // 通过数据库表主键，得到一个对象，如果对象不存在将返回null
    <T> T get(Class<T> c, Serializable s) throws HibernateException;

    // QBC查询
    <T> List<T> find(Class<T> c, T obj, String[] orders, int row, int pages) throws HibernateException;

    // QBC查询数据总数
    <T> int listCount(Class<T> c, Object obj) throws HibernateException;
}
