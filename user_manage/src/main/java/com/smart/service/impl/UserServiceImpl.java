package com.smart.service.impl;

import com.querydsl.core.types.dsl.DatePath;
import com.smart.DTO.UserFindDto;
import com.smart.DTO.UserLogginDto;
import com.smart.DTO.UserSignInDto;
import com.smart.entity.RoleEntity;
import com.smart.entity.UserBaseEntity;
import com.smart.service.UserService;
import org.apache.shiro.authc.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import com.smart.respository.Dao.*;
import org.springframework.security.authentication.AccountStatusException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;




public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TrolleyRepository trolleyRepository;
    @Autowired
    WriteLogginInfoRepository writeLogginInfoRepository;
    @Autowired
    WriteUserChangeIngeRepository writeUserChangeIngeRepository;
    @Autowired
    AddressRespoditory addressRespoditory;
    @Autowired
    RoleRespository roleRespository;

  @Override
    public UserSignInDto  createUser(UserSignInDto userSignInDto)throws AccountStatusException{
      SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd HH-mm-ss");
       if (userRepository.exist(userSignInDto.getNumberPhone())){

           return null;
       }
       String id=dateFormat.format(new Date());
       userRepository.writeId(id);
       userRepository.writeEmail(userSignInDto.getEmail(),id);
       userRepository.writeName(userSignInDto.getName(), id);
       userRepository.writePassword(userSignInDto.getNumberPhone(),id);
       userRepository.writeCreateDay(Date(),id);
       userRepository.writeSex(userSignInDto.getSex(), id);
    }

    @Override
    public void changePassword(Long userId, String newPassword) {
    userRepository.writePassword(newPassword, userId.toString());
    writeLogginInfoRepository.writeLogginInfo(new Date().toString(), userId, , new Timestamp());
    }

    public void changeTelephone(String newTelephone,Long id) {
userRepository.writeNumberPhone(newTelephone, id.toString());
    }

    @Override
    public void correlationRoles(Long userId, Long roleId) {
    }

    @Override
    public void uncorrelationRoles(Long userId, Long roleId) {

    }

    @Override
    public Set<String> findPermission(String username) {
        return null;
    }

    @Override
    public RoleEntity  findRole(String userId) {
return  roleRespository.findRoleByUserId(userId);
    }

    @Override
    public List<UserFindDto > findByName(String username) {
        List<UserBaseEntity> userBaseEntities =userRepository.findUserByUserName(username);

    }

    @Override
    public UserFindDto  findUserByTelephone(String telephone) {

        UserBaseEntity userBaseEntity=userRepository.findUserByTelephone(telephone);
        return new UserFindDto(userBaseEntity.getName(),userBaseEntity.getId(),userBaseEntity.getSex(),addressRespoditory.findAddressByUserId(telephone).toString());

    }


    public UserFindDto  findUserByEmail(String email) {
      UserBaseEntity userBaseEntity=userRepository.findUserById(email);
        return new UserFindDto(userBaseEntity.getName(),userBaseEntity.getId(),userBaseEntity.getSex(),addressRespoditory.findAddressByUserId(email).toString());
    }

    @Override
    public UserSignInDto  findUserById(String id) {
        UserBaseEntity userBaseEntity=userRepository.findUserById(id);
        return new UserSignInDto (userBaseEntity.getName(),userBaseEntity.getId(),userBaseEntity.getSex(),addressRespoditory.findAddressByUserId(id).toString());


    }

    @Override
    public UserLogginDto Loggin(String userName, String password) {

    }
}
