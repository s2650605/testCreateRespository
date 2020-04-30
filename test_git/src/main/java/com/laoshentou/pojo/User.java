package com.laoshentou.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author shenxiang
 * @date 2020年04月30日, 0030 13:10
 */
@Table(name = "user")
@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable {
    @Id
    private int id;
    private String name;
}
