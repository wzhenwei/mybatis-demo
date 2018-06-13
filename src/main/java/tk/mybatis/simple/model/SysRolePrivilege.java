package tk.mybatis.simple.model;

/**
 * 角色权限关联关系表
 * @author wangzhenwei
 * @date 2018/5/18 14:21
 */
public class SysRolePrivilege {

    /**
     * 角色id
     */
    private Long roleId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Long privilege) {
        this.privilege = privilege;
    }

    /**
     * 权限ID
     */
    private Long privilege;
}
