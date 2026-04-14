package Biswajit.demo.repo;

import Biswajit.demo.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<Register, Long> {
    Register findByMobileNumber(Long mobileNumber);
}
