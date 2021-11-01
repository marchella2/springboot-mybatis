package com.example.springbootmybatis.resource;

import com.example.springbootmybatis.mapper.EmployeeMapper;
import com.example.springbootmybatis.models.Employee;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insertdata")
    public String insertData()
    {
        Employee emp = new Employee();
        emp.setFirst_name("Acel");
        emp.setLast_name("Marcel");
        emp.setEmail_address("marchellacel2@gmail.com");

        employeeMapper.insert(emp);

        return "Data berhasil tersimpan";
    }

    @PutMapping("/updatedata")
    public String updateData()
    {
        Employee emp = new Employee();
        emp.setFirst_name("Acel");
        emp.setEmail_address("marchella.putris2@gmail.com");

        employeeMapper.update(emp);
        return "Data berhasil diubah";
    }

    @DeleteMapping("/deletedata")
    public String deleteData()
    {
        Employee employee = new Employee();
        employee.setFirst_name("Acel");

        employeeMapper.delete(employee);
        return "Data berhasil dihapus";
    }

}
