package ecommerce.springboot.microservice.supplierservice.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="Supplier")
@Data
public class Supplier {

    @Id
    private Long supplierId;
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;
}
