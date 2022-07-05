package com.codegym.furama_spring.controller;

import com.codegym.furama_spring.model.employee.Employee;
import com.codegym.furama_spring.model.employee.User;
import com.codegym.furama_spring.service.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IPositionService iPositionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public ModelAndView showListEmployee(@RequestParam(name = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("employee_name").ascending();
        ModelAndView model = new ModelAndView("/employee/list");
        Page<Employee> employeeList = iEmployeeService.findAllEmployee(PageRequest.of(page, 4, sort));
        model.addObject("employeeList", employeeList);
        model.addObject("positionList", iPositionService.findAll());
        model.addObject("degreeList", iEducationDegreeService.findAll());
        model.addObject("divisionList", iDivisionService.findAll());
        return model;
    }


    @PostMapping("/save/user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        iUserService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/save/employee")
    public ResponseEntity<?> createEmployee(@Valid @RequestBody Employee employee){
        iEmployeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editEmployee(@Valid @RequestBody Employee employee){
        iEmployeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer id){
        iEmployeeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
