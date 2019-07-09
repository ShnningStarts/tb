package com.smart.service;

import org.apache.catalina.Role;

public interface RoleService {
    public Role createRole(Role role);
    public void deleteRole(Long roleId);
    public void correlationPerssions(Long roleId,Long ...permissionId);
    public void uncorrelationPerssions(Long roleId,Long ...permissionId);

}
