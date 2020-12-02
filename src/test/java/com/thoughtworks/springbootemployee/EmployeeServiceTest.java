package com.thoughtworks.springbootemployee;
import com.thoughtworks.springbootemployee.Repository.EmployeeRepository;
import com.thoughtworks.springbootemployee.Service.EmployeeService;
import com.thoughtworks.springbootemployee.controller.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;
    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void should_return_all_employees_when_get_all_given_all_employees() {
        //given
        final List<Employee> expected = Arrays.asList(new Employee(1,"david",22,"male",11111));
        when(employeeRepository.getAll()).thenReturn(expected);

        //when
        final List<Employee> employees = employeeService.getAll();

        //then
        assertEquals(expected,employees);
    }

}