package com.easymall.service.impl;

import com.easymall.pojo.TUser;
import com.easymall.mapper.TUserMapper;
import com.easymall.service.TUserservice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guanxt and Lili
 * @since 2022-12-11
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserservice {

}
