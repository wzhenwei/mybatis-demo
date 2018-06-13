package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.*;
import tk.mybatis.simple.model.SysRole;

import java.util.List;

/**
 * @author wangzhenwei
 * @version 1.0
 * @create 2018-06-13
 * @copyright 无锡雅座在线科技股份有限公司
 */
public interface RoleMapper {

    @Select({"select id , role_name roleName,enabled,create_by createBy,createTime createTime from sys_role where id = #{id}"})
    SysRole selectById(Long id);

    @ResultMap("resultMapId")
    @Select("select * from sys_role")
    List<SysRole> selectAll();

    @Insert({"insert into sys_role(id,role_name,enabled,create_by,create_time)values(#{id},#{roleName},#{enabled},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
    int insert(SysRole sysRole);

    // 返回递增主键
    @Insert({"insert into sys_role(role_name,enabled,create_by,create_time)values(#{roleName},#{enabled},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert2(SysRole sysRole);

    // 返回非递增主键
    @Insert({"insert into sys_role(role_name,enabled,create_by,create_time)values(#{roleName},#{enabled},#{createBy},#{createTime,jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",resultType = Long.class,before = false)
    int insert3(SysRole sysRole);


    @Update({"update sys_role set role_name = #{roleName} , enabled = #{enabled}, create_by = #{createBy} where id = #{id}"})
    int updateById(SysRole sysRole);

    @Delete("delete from sys_role where id=#{id}")
    int deleteById(Long id);
}
