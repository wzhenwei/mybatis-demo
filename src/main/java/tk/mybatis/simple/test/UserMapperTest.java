package tk.mybatis.simple.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.mapper.BaseMapperTest;
import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author wangzhenwei
 * @date 2018/5/23 14:39
 */
public class UserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        // 获取 sqlSession
        SqlSession sqlSession = getSqlSession();
        try {
            //获UserMapper接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 调用selectById 方法, 查询 id = 1的用户
            SysUser user = userMapper.selectById(1L);
            // user 不为空
            Assert.assertNotNull(user);
            // userName = admin
            Assert.assertEquals("admin",user.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            //获UserMapper接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 调用selectById 方法, 查询 id = 1的用户
            List<SysUser> userList = userMapper.selectAll();
            // user 不为空
            Assert.assertNotNull(userList);
            // userName = admin
            Assert.assertTrue(userList.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectRolesByUserId(){
        SqlSession sqlSession = getSqlSession();
        try {
            //获UserMapper接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 调用selectById 方法, 查询 id = 1的用户
            List<SysRole> roleList = userMapper.selectRolesByUserId(1L);

            // user 不为空
            Assert.assertNotNull(roleList);
            // userName = admin
            Assert.assertTrue(roleList.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
