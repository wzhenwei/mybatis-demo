package tk.mybatis.simple.util;


import org.apache.ibatis.jdbc.SQL;

/**
 * @author wangzhenwei
 * @date 2018/6/13 16:19
 */
public class PrivilegeProvider {

    public String selectById(final Long id){
        // 也可以直接返回sql语句
        return new SQL(){
            {
                SELECT("id,privilege_name,privilege_url");
                FROM("sys_privilege");
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
