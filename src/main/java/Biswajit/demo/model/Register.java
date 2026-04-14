package Biswajit.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "register")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "employeeCode", length = 10)
    private String employeeCode;

    @Column(name = "mobileNumber", length = 10)
    private Long mobileNumber;

    @Column(name = "password", length = 16)
    private String password;

    @Column(name = "gender", length = 4)
    private String gender;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "name", length = 100)
    private String name;
}
