package com.example.gradlespringbootrestbasicdocker.domain.dto;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryRequestDTO {
    private Integer id;
    private String name;
    private boolean state;
}
