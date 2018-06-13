package tk.mybatis.simple.mapper;


import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.simple.model.SysPrivilege;
import tk.mybatis.simple.util.PrivilegeProvider;

/**
 * @author wangzhenwei
 * @version 1.0
 * @create 2018-06-13
 * @copyright 无锡雅座在线科技股份有限公司
 */
public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class,method = "selectById")
    SysPrivilege selectById(Long id);
}
