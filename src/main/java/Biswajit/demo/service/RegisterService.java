package Biswajit.demo.service;

import Biswajit.demo.dto.request.RegisterRequest;
import Biswajit.demo.dto.response.RegisterResponse;

public interface RegisterService {
    RegisterResponse registerResponse(RegisterRequest request);
}
