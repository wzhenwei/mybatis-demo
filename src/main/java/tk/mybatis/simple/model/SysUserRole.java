package tk.mybatis.simple.model;

/**
 * 用户角色关联关系表
 * @author wangzhenwei
 * @date 2018/5/18 14:13
 */
public class SysUserRole {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 权限ID
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
