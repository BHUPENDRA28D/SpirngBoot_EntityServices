package com.example.SpringBootEntityService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","bookings"})
public class Passenger extends  BaseModel {

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private  String email;

    @Column(nullable = false)
    private  String  password;  //encrypted password!

    @Column(nullable = false)
    private  String phoneNumber;

    @OneToMany(mappedBy = "passenger")
    @Fetch(FetchMode.SUBSELECT)
   private List<Booking> bookings = new ArrayList<>();
}
