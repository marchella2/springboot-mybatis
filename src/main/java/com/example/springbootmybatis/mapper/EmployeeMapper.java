package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.models.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employees")
    public List<Employee> findAllData();

//    @Select("select * from employees where id = #{id}")
//    public Employee findById(long id);

    @Delete("delete from employees where first_name=#{firstName}")
    public void deleteById(Employee employee);

    @Insert("insert into employees(first_name, last_name, email_address) " +
            " values (#{firstName}, #{lastName}, #{emailId})")
    public void insert(Employee employee);

    @Update("update employees set email_address=#{emailId} where first_name=#{firstName}")
    public void update(Employee employee);
}
