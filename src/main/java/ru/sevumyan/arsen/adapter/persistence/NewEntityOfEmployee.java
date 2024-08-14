package ru.sevumyan.arsen.adapter.persistence;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.domain.Employee;

import java.time.LocalDate;

@NoArgsConstructor
@Component
public class NewEntityOfEmployee {

    public Employee newEmployee(){
        return new Employee()
                .setFirstName("Svyatoslav")
                .setLastName("Zenidarov")
                .setBankAccount(88889830)
                .setBirthDate(LocalDate.of(1984,4,12))
                .setPassportNumber(1952566)
                .setUniversityEducation("MGU")
                .setPostId(1)
                .setDepartmentId(1);
    }
}
