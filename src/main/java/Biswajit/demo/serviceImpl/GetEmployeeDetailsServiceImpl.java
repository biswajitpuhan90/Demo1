package Biswajit.demo.serviceImpl;

import Biswajit.demo.dto.request.GetEmployeeDetailsRequest;
import Biswajit.demo.dto.response.EmployeeData;
import Biswajit.demo.dto.response.GetEmployeeDetailsResponse;
import Biswajit.demo.model.Register;
import Biswajit.demo.repo.RegisterRepo;
import Biswajit.demo.service.GetEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class GetEmployeeDetailsServiceImpl implements GetEmployeeService {
    private final RegisterRepo registerRepo;

    public GetEmployeeDetailsServiceImpl(RegisterRepo registerRepo) {
        this.registerRepo = registerRepo;
    }

    @Override
    public GetEmployeeDetailsResponse getEmployee(GetEmployeeDetailsRequest request) {
        GetEmployeeDetailsResponse response=new GetEmployeeDetailsResponse();
        try{
            Register data = registerRepo.findByMobileNumber(request.getMobileNumber());
            if (data==null){
                return new GetEmployeeDetailsResponse(400,"data not found",null);
            }else {
                EmployeeData employeeData = new EmployeeData();
                employeeData.setEmployeeCode(data.getEmployeeCode());
                employeeData.setName(data.getName());
                employeeData.setEmail(data.getEmail());
                employeeData.setGender(data.getGender());



                  response.setStatusCode(200);
                  response.setMessage("Data Fatch success");
                  response.setData(employeeData);



            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
