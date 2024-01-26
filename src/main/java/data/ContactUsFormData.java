package data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactUsFormData {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String message;
    private String companyName;
}
