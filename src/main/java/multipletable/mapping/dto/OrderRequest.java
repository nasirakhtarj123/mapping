package multipletable.mapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import multipletable.mapping.entity.Customer;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderRequest {

    private Customer customer;
    
}
