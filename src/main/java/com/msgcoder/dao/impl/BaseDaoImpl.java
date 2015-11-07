package com.msgcoder.dao.impl;

import com.msgcoder.dao.BaseDao;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiukk on 2015/11/7.
 */
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // 根据ID加载实体
    public T get(Class<T> entityClazz, Serializable id) {
        Session session = null;
        T t = null;
        try{
            session = getSessionFactory().openSession();
            t = (T)session.get(entityClazz, id);
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return t;
    }

    // 保存实体
    public Serializable save(T entity) {
        Session session = null;
        Serializable s = null;
        try{
            session = getSessionFactory().openSession();
            Transaction t = session.getTransaction();
            t.begin();
            s = session.save(entity);
            t.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return s;
    }

    // 更新实体
    public void update(T entity) {
        Session session = null;
        Serializable s = null;
        try{
            session = getSessionFactory().openSession();
            Transaction t = session.getTransaction();
            t.begin();
            session.saveOrUpdate(entity);
            t.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    // 根据hql更新
    public void update(String hql) {
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Transaction t = session.getTransaction();
            t.begin();
            session.createQuery(hql).executeUpdate();
            t.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    // 删除实体
    public void delete(T entity) {
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Transaction t = session.getTransaction();
            t.begin();
            session.delete(entity);
            t.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    // 根据ID删除实体
    public void delete(Class<T> entityClazz, Serializable id) {
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Transaction t = session.getTransaction();
            t.begin();
            session.createQuery("delete " + entityClazz.getSimpleName() + " en where en.id=?")
                    .setParameter(0, id)
                    .executeUpdate();
            t.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    // 获取所有实体
    public List<T> findAll(Class<T> entityClazz) {
        return find("select en from " + entityClazz.getSimpleName() + " en");
    }

    // 获取实体总数
    public long findCount(Class<T> entityClazz) {
        List<?> l = find("select count(*) from " + entityClazz.getSimpleName());
        if(l != null && l.size() == 1){
            return (Long)l.get(0);
        }
        return 0;
    }

    public long findCount(String hql, Object... params) {
        List<?> l = find(hql, params);
        if(l != null && l.size() == 1){
            return (Long)l.get(0);
        }
        return 0;
    }

    // 根据HQL查询实体
    public List<T> find(String hql){
        Session session = null;
        List<T> l = null;
        try{
            session = getSessionFactory().openSession();
            l = session.createQuery(hql).list();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return l;
    }
    // 根据带占位符参数的HQL查询实体
    public List<T> find(String hql, Object ... params){
        Session session = null;
        List<T> l = null;
        try{
            session = getSessionFactory().openSession();
            Query query = session.createQuery(hql);
            for(int i = 0, len = params.length; i < len; i++){
                query.setParameter(i, params[i]);
            }
            l = query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return l;
    }
    // 使用HQL进行分页查询操作
    protected List<T> findByPage(String hql, int pageNo, int pageSize){
        Session session = null;
        List<T> l = null;
        try{
            session = getSessionFactory().openSession();
            l = session.createQuery(hql)
                    .setFirstResult((pageNo - 1) * pageSize)
                    .setMaxResults(pageSize)
                    .list();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return l;
    }
    // 使用带占位符参数的HQL进行分页查询操作
    protected List<T> findByPage(String hql, int pageNo, int pageSize, Object ... params){
        Session session = null;
        List<T> l = null;
        try{
            session = getSessionFactory().openSession();
            Query query = session.createQuery(hql);
            for(int i = 0, len = params.length; i < len; i++){
                query.setParameter(i, params[i]);
            }
            l = query.setFirstResult((pageNo - 1) * pageSize)
                    .setMaxResults(pageSize)
                    .list();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
        return l;
    }
}
