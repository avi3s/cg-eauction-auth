package com.cg.eauction.auth.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = User.withUsername("user1")
              .password("password")
              .roles("USER")
              .build();
        return user;
    }

//    @Override
//    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
//
//        try {
//            UserModel userModel = userServiceClient.fetchUserByEmailId(emailId);
//            if (Objects.nonNull(userModel) && StringUtils.isNotEmpty(String.valueOf(userModel.getUserId())) && Objects.nonNull(userModel.getUserTypeModel()) && StringUtils.isNotEmpty(userModel.getUserTypeModel().getUserTypeName())) {
//                return populateAuthorityList(userModel);
//            } else {
//                userModel = userServiceClient.fetchUserByMobileNo(emailId);
//                if (Objects.nonNull(userModel) && StringUtils.isNotEmpty(String.valueOf(userModel.getUserId())) && Objects.nonNull(userModel.getUserTypeModel()) && StringUtils.isNotEmpty(userModel.getUserTypeModel().getUserTypeName())) {
//                    return populateAuthorityList(userModel);
//                } else {
//                    throw new UsernameNotFoundException("User " + emailId + " was not found in the database");
//                }
//            }
//        } catch (Exception e) {
//            throw new UsernameNotFoundException("User " + emailId + " was not found in the database");
//        }
//    }
//
//    private CustomPasswordUser populateAuthorityList(UserModel userModel) {
//
//        Collection<GrantedAuthority> grantedAuthoritiesList = new ArrayList<>();
//        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(Constant.ROLE + userModel.getUserTypeModel().getUserTypeName());
//        grantedAuthoritiesList.add(grantedAuthority);
//        String name = StringUtils.trimToEmpty(userModel.getFirstName());
//        if (StringUtils.isNotEmpty(userModel.getMiddleName())) {
//            name = name + " " + StringUtils.trimToEmpty(userModel.getMiddleName());
//        }
//
//        if (StringUtils.isNotEmpty(userModel.getLastName())) {
//            name = name + " " + StringUtils.trimToEmpty(userModel.getLastName());
//        }
//
//        CustomPasswordUser customUserModel = new CustomPasswordUser(userModel.getEmailId(), userModel.getPassword(), String.valueOf(userModel.getUserId()), name, userModel.getMobileNo(), userModel.getProfileImageURL(), grantedAuthoritiesList);
//        util.printLog(customUserModel, "loadUserByUsername");
//        return customUserModel;
//
//    }
}