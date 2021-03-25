package com.springbootbackendwebsocket.models.documents;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Mensaje implements Serializable{

        private String texto;

        private Long fecha;




    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
}
