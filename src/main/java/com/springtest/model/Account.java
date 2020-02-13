package com.springtest.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    private double amount;
//    @OneToMany(mappedBy = "users",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name="accounts_id_fk")
//    private Currency currency;


}
