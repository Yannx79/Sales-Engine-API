package com.nk.salesengineapi.application.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    private Long id;
    private String description;
    private String category;
    private String categoryDescription;
    private Double unitPrice;
    private Date created;

}
