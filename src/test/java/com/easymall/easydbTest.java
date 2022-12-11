package com.easymall;

import com.easymall.mapper.TUserMapper;
import com.easymall.pojo.TUser;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@MapperScan("com.easymall.mapper")
@SpringBootTest
public class easydbTest {
    @Autowired
    private TUserMapper tUserMapper;
    @Test
    void test01(){
        List<TUser> tUsers = tUserMapper.selectList(null);
        tUsers.forEach(System.out::println);
    }
}
