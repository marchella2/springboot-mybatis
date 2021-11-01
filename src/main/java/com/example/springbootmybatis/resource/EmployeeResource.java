package com.example.springbootmybatis.resource;

import com.example.springbootmybatis.mapper.EmployeeMapper;
import com.example.springbootmybatis.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    private EmployeeMapper employeeMapper;

    public EmployeeResource(EmployeeMapper empMapper){
        this.employeeMapper = empMapper;
    }

    @GetMapping("/alldata")
    public List<Employee> getAllData()
    {
        return employeeMapper.findAllData();
    }

}
