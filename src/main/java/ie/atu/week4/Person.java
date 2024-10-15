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
    @NotBlank(message = "This value cannot be blank")
    private String name;
    @NotBlank(message = "This value cannot be blank")
    private String title;
    @Min(value = 1, message = "ID must be greater than 0")
    private int employeeId;
    @Min(value = 18, message = "Age must be greater than 17")
    private int age;
    @Email(message = "Invalid email address")
    private String email;
    @NotBlank(message = "This value cannot be blank")
    private String position;
    @NotBlank(message = "This value cannot be blank")
    private String department;
}
