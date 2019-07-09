package com.smart.service;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.util.PermissionUtils;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);

}
