package com.avenuecode.webmvcapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private String id;
    private String name;
    private Date birthday;

}
