package com.starterkit.springboot.brs.model.bus;

import com.starterkit.springboot.brs.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "balance"/*,
        indexes = @Index(
                name = "idx_balance_code",
                columnList = "code",
                unique = true)*/)

public class Balance {
    @Id
    @Column(name = "balance_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User owner;


    @Column(name = "balance")
    private int balance;

}
