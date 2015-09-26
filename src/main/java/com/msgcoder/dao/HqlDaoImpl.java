package com.msgcoder.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jiukk on 2015/9/1.
 */
@Component
public class HqlDaoImpl implements IHqlDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(Object obj) throws HibernateException {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Serializable id = session.save(obj);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public boolean del(Object obj) throws HibernateException {
        return false;
    }

    public boolean update(Object obj) throws HibernateException {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(obj);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean update(List obj, List params) throws HibernateException {
        return false;
    }

    public Object get(Class clazz, Serializable id) throws HibernateException {
        Session session = sessionFactory.openSession();
        return session.get(clazz, id);
    }

    public <T> List<T> find(Class<T> c, T obj, String[] orders, int row, int pages) throws HibernateException {
        return null;
    }

    public <T> int listCount(Class<T> c, Object obj) throws HibernateException {
        return 0;
    }

    public boolean delOrUpdate(String hql, Object[] params) throws HibernateException {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery(hql);
        if (null != params && params.length > 0) {
            // 循环给参数赋值
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        int result = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return result > 0 ? true : false;
    }

    public boolean delOrUpdate(List args, List params) throws HibernateException {
        return false;
    }

    public List find(String hql) throws HibernateException {
        if (null == hql || hql.equals("")) {
            return null;
        }
        Session session = sessionFactory.openSession();
        List list = session.createQuery(hql).list();
        session.close();
        return list;
    }

    public List find(String hql, Object[] params) throws HibernateException {
        if (null == hql || hql.equals("")) {
            return null;
        }
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        if (null != params && params.length > 0) {
            // 循环给参数赋值
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        List list = query.list();
        session.close();
        return list;
    }

    public <T> List<T> find(String args, int row, int pages) throws HibernateException {
        return null;
    }

    public <T> List<T> find(String args, List params, int row, int pages) throws HibernateException {
        return null;
    }

    public int listCount(String args) throws HibernateException, NumberFormatException {
        return 0;
    }

    public int listCount(String args, List params) throws HibernateException, NumberFormatException {
        return 0;
    }
}
