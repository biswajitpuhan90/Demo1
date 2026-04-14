package Biswajit.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetEmployeeDetailsResponse {
    private int statusCode;
    private String message;
    private EmployeeData data;
}
