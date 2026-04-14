package Biswajit.demo.serviceImpl;

import Biswajit.demo.dto.request.RegisterRequest;
import Biswajit.demo.dto.response.RegisterData;
import Biswajit.demo.dto.response.RegisterResponse;
import Biswajit.demo.model.Register;
import Biswajit.demo.repo.RegisterRepo;
import Biswajit.demo.service.RegisterService;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    private final RegisterRepo registerRepo;

    public RegisterServiceImpl(RegisterRepo registerRepo) {
        this.registerRepo = registerRepo;
    }

    @Override
    public RegisterResponse registerResponse(RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        try {
            Register register = new Register();
            register.setMobileNumber(request.getMobileNumber());
            register.setEmployeeCode(request.getEmployeeCode());
            register.setName(request.getName());
            register.setGender(request.getGender());
            register.setEmail(request.getEmail());
            register.setPassword(request.getPassword());

            registerRepo.save(register);

            RegisterData data = new RegisterData();
            data.setName(register.getName());
            data.setEmployeeCode(register.getEmployeeCode());

            response.setStatusCode(200);
            response.setMessage("Data saved successfully");
            response.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
