package Biswajit.demo.service;

import Biswajit.demo.dto.request.GetEmployeeDetailsRequest;
import Biswajit.demo.dto.response.GetEmployeeDetailsResponse;

public interface GetEmployeeService {
    GetEmployeeDetailsResponse getEmployee(GetEmployeeDetailsRequest request);
}
