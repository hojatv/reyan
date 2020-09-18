package com.islamversity.reyan.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document
@Data
@Builder
public class Surah {
    @Id
    Integer index;

    String name;

    @DBRef
    List<Aye> ayat;


}
