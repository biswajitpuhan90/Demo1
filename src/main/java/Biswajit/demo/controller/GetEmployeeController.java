package Biswajit.demo.controller;


import Biswajit.demo.dto.request.GetEmployeeDetailsRequest;
import Biswajit.demo.dto.response.GetEmployeeDetailsResponse;
import Biswajit.demo.service.GetEmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetEmployeeController {

    private final GetEmployeeService service;

    public GetEmployeeController(GetEmployeeService service) {
        this.service = service;
    }

    @PostMapping("/get/employee/detail")
    private ResponseEntity<GetEmployeeDetailsResponse> response(@RequestBody GetEmployeeDetailsRequest request) {
        GetEmployeeDetailsResponse response = service.getEmployee(request);
        return ResponseEntity.status(200).body(response);
    }
}