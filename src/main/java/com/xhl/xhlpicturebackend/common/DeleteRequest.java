package com.xhl.xhlpicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author szdaiyifei
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
