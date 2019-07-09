package com.smart.service;

import com.smart.DTO.UserFindDto;
import com.smart.DTO.UserLogginDto;
import com.smart.DTO.UserSignInDto;
import com.smart.entity.RoleEntity;
import com.smart.entity.UserBaseEntity;

import java.util.List;
import java.util.Set;

public interface UserService {
public UserSignInDto createUser(UserSignInDto userSignInDto);
public void changePassword(Long userId,String newPassword);
public void correlationRoles(Long userId,Long roleId);
public void uncorrelationRoles(Long userId,Long roleId);
public UserFindDto  findByName(String username);
public RoleEntity  findRole(String username);
public Set<String> findPermission(String username);
public void changeTelephone(String newTelephone);
public UserFindDto findUserByTelephone(String telephone);
public UserSignInDto  findUserById(String id);
public UserFindDto findUserByEmail(String email);
public UserLogginDto  Loggin(String userName, String password);

}
