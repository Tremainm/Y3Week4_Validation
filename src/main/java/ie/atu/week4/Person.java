package ie.atu.week4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotBlank
    private String name;
    @NotBlank
    private String title;
    @Min(value = 0, message = "ID must be greater than 0")
    private int employeeId;
    @Min(value = 17, message = "Age must be greater than 17")
    private int age;
    @Email
    private String email;
    @NotBlank
    private String position;
    @NotBlank
    private String department;
}
