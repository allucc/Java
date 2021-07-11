package win.icpc.tacocloud.controller.Entity;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;


/**
 * @author lucy
 * @date 2021/4/12 22:34
 */
@Data
public class Order {
    @NotNull(message = "test")
    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;
    @Size(min = 5, message = "Name must be at least 5 characters long")
    @NotBlank(message = "Street is required")
    private String street;
    @NotBlank(message = "City is required")
    private String city;
    @NotBlank(message = "State is required")
    private String state;
    @NotBlank(message = "Zip code is required")
    private String zip;
    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
    private Date placedAt;
    private Long id;
    private List<Taco> tacos;

    public void addDesign(Taco taco) {
        tacos.add(taco);
    }
}
