package org.cloud.project.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.base.R;
import org.cloud.project.ProjectApplication;
import org.cloud.project.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * boot专用测试
 *
 * @author 22004
 */
@SpringBootTest(classes = ProjectApplication.class)
@RunWith(SpringRunner.class)
public class PersonBootTest {
    @Resource
    private PersonController controller;

    @Test
    public void getList() {
        Page<Person> page = new Page<>();
        Person vo = new Person();
        R<Page<Person>> list = controller.getList(page, vo);
        System.out.println("1");
    }
}
