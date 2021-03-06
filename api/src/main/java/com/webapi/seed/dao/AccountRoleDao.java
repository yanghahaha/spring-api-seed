package com.webapi.seed.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.webapi.seed.entity.AccountRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xiaozhong
 * @since 2017-12-31
 */
@Mapper
public interface AccountRoleDao extends BaseMapper<AccountRole> {

    List<AccountRole> selectByUsername(String username);

}
