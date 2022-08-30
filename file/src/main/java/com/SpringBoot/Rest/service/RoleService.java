package com.SpringBoot.Rest.service;

import com.SpringBoot.Rest.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> findAllRole();
    Set<Role> findByIdRoles(List<Long> roles);
}