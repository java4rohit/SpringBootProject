package com.elk.elesticSearchAndLogging.entities;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private  double price;
}
