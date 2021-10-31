package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.models.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employees")
    public List<Employee> findAllData();

    @Select("select * from employees where id = #{id}")
    public Employee findById(long id);
}
