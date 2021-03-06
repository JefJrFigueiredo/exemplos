package br.eti.arthurgregorio.shirotest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.0.0, 12/07/2015
 */
@Entity
@ToString
@Table(name = "owners")
@EqualsAndHashCode(callSuper = true)
public class Owner extends PersistentEntity {

    @Getter
    @Setter
    @Column(name = "name", nullable = false)
    private String name;
}
