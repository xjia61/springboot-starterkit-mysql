package com.starterkit.springboot.brs.model.bus;

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
        name = "trip_stop",
        indexes = @Index(
                name = "idx_stop",
                columnList = "stop_id",
                unique = false
        )
)
public class TripStop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn(name = "trip_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Trip trip;

    @JoinColumn(name = "stop_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Stop stop;
}
