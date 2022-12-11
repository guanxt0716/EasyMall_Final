package com.easymall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author guanxt and Lili
 * @since 2022-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id uuid 主键
     */
      @TableId(value = "user_id", type = IdType.AUTO)
    private String userId;

    /**
     * 用户登陆名称
     */
    private String userName;

    /**
     * 用户密码 md5
     */
    private String userPassword;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户状态 0(普通用户),1(管理员),2(超级管理员)
     */
    private Integer userType;


}
