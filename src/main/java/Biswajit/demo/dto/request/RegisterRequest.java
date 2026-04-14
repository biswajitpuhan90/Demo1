package Biswajit.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private Long mobileNumber;
    private String employeeCode;
    private String password;
    private String gender;
    private String email;
    private String name;
}
