package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * @author wangzhenwei
 * @version 1.0
 * @create 2018-05-21
 * @copyright 无锡雅座在线科技股份有限公司
 */
public interface UserMapper {

    /**
     * 通过id 查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 根据用户ID查询
     * @return
     */
    List<SysRole> selectRolesByUserId(Long userId);

    int insert(SysUser sysUser);
}
