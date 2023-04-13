package com.mashibing.service.impl;

import com.mashibing.dao.CourseDao;
import com.mashibing.service.CourseService;

/**
 * @author spikeCong
 * @date 2022/10/28
 **/
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void add() {
        System.out.println("CourseServiceImpl的add方法执行了......");
        courseDao.add();
    }
}
