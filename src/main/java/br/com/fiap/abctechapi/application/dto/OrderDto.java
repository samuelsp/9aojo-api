package br.com.fiap.abctechapi.application.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
public class OrderDto {
    private Long operatorId;

    @Length.List({})
    private List<Long> assists;
    private OrderLocationDto start;
    private OrderLocationDto end;
}
