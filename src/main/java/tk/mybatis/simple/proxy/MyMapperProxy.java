package tk.mybatis.simple.proxy;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Mapper接口上使用的动态代理
 * @author wangzhenwei
 * @date 2018/6/13 14:58
 */
public class MyMapperProxy<T> implements InvocationHandler {

    private Class<T> mapperInterface;
    private SqlSession sqlSession;

    public MyMapperProxy(Class<T> mapperInterface , SqlSession sqlSession){
        this.mapperInterface = mapperInterface;
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这里只考虑一种情况
        List<T> list = sqlSession.selectList(mapperInterface.getCanonicalName()+"."+method.getName());
        return list;
    }
}
