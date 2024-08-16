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
                .setFirstName("Dmitriy")
                .setLastName("Dobrov")
                .setBankAccount(888891320)
                .setBirthDate(LocalDate.of(1983,2,1))
                .setPassportNumber(1952774)
                .setUniversityEducation("GGTU")
                .setPostId(4)
                .setDepartmentId(2);
    }
}
