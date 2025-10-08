package fengcastelo.spring.developStock.Model.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name= "table_product")
public class Product {

    @Id
    private UUID id;
    private String name;
    private Double price;
    private Integer quantity;


}
