package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;
import java.util.Map;

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

    List<SysUser> selectByUser(SysUser sysUser);

    SysUser selectByIdOrUserName(SysUser sysUser);

    int updateByIdSelective(SysUser sysUser);

    /**
     * 根据用户ID集合查询
     * @param idList
     * @return
     */
    List<SysUser> selectByIdList(List<Long> idList);

    List<SysUser> selectByIdArray(Long[] idArray);

    /**
     * 批量插入用户
     * @param userList
     * @return
     */
    int insertList(List<SysUser> userList);

    /**
     * 通过MAP 更新
     * @param map
     * @return
     */
    int updateByMap(Map<String , Object> map);
}
