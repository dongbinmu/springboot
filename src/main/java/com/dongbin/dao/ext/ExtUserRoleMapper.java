package com.dongbin.dao.ext;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dongbin on 2018/4/16.
 */
public interface ExtUserRoleMapper {

    List<String> getRoleListByUsername(@Param("name") String name);
}
