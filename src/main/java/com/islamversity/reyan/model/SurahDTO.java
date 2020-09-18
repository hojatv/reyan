package com.islamversity.reyan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurahDTO {
    Integer index;
    String name;
    List<AyeDTO> aya;

}
