package com.cheling.dao;

/**
 * Created by jiukk on 2015/9/1.
 */
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * DAO接口
 * 该类只是提供一个公用接口，以便HQL查询与SQL查询重写与重用
 * 具体实现接口有IDao_Hql.java和IDao_Sql.java
 */

public interface IDao {
//    // 获取一个会话
//    Session getCurrSession() throws HibernateException;
//
//    // 开始一个事务
//    boolean beginTx() throws HibernateException;
//
//    // 提交事务
//    boolean commitTx() throws HibernateException;
//
//    // 回滚事务
//    boolean rollbackTx() throws HibernateException;
//
//    // 关闭session对象
//    boolean closeSession() throws HibernateException;

    // 通过查询语句删除或更新信息
    boolean delOrUpdate(String args, Object[] params) throws HibernateException;

    // 通过查询语句(集合)删除或更新信息
    boolean delOrUpdate(List args, List params) throws HibernateException;

    // 查询
    <T> List<T> find(String args) throws HibernateException;

    // 查询
    <T> List<T> find(String args, Object[] params) throws HibernateException;

    // 查询，带分页效果
    <T> List<T> find(String args, int row, int pages) throws HibernateException;

    // 查询，带分页效果
    <T> List<T> find(String args, List params, int row, int pages) throws HibernateException;

    // 查询数据总数
    int listCount(String args) throws HibernateException, NumberFormatException;

    // 查询数据总数
    int listCount(String args, List params) throws HibernateException, NumberFormatException;
}
