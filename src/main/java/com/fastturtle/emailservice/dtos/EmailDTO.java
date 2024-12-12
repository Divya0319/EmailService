package com.fastturtle.emailservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDTO {

    private String to;

    private String from;

    private String subject;

    private String body;
}
