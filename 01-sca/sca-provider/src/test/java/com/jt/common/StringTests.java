package com.jt.common;


import com.jt.commom.utl.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * 注释描述的类为spring工程的单元测试类
 * */
@SpringBootTest
public class StringTests {

    @Test
    void testStringEmpty(){
        String content = null;
        boolean flag = StringUtils.isEmpty(content);
        System.out.println(flag);
    }

}
