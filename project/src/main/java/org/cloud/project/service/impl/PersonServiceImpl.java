package org.cloud.project.service.impl;

import com.github.yulichang.base.MPJBaseServiceImpl;
import org.cloud.project.dao.PersonDao;
import org.cloud.project.entity.Person;
import org.cloud.project.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * 人(Person)表服务实现类
 *
 * @author makejava
 * @since 2023-01-07 15:16:26
 */
@Service("personService")
public class PersonServiceImpl extends MPJBaseServiceImpl<PersonDao, Person> implements PersonService {

}

