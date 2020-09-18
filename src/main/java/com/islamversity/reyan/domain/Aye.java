package com.islamversity.reyan.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Aye {
    @Id
    Integer index;

    String text;

    String bismillah;

    @DBRef
    Surah surah;
}
