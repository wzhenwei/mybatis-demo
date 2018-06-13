package tk.mybatis.simple.model;

/**
 * 权限表
 * @author wangzhenwei
 * @date 2018/5/18 14:30
 */
public class SysPrivilege {

    /**
     * 权限ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String privilege;

    /**
     * 权限URL
     */
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
