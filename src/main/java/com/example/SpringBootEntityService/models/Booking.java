package com.example.SpringBootEntityService.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.spi.CascadeStyle;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

//@Table( indexes = { @Index(columnList = "driver_id")})
public class Booking extends BaseModel{

/*    //some composition we are trying to associate the entiy by composition.
    @OneToMany(mappedBy = "booking", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
   private Review review;  // defined a 1:1 relation btwn Booking and review;*/

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;



    private Long totalDistance;

    @ManyToOne(fetch=FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passenger;


    @OneToOne
    private  ExactLocation startLocation;
    @OneToOne
    private  ExactLocation endLocation;



}
