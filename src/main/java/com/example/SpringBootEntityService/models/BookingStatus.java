package com.example.SpringBootEntityService.models;

import jakarta.persistence.Entity;

public enum BookingStatus {

    SCHEDULED,

    CANCELLED,

    CAB_ARRIVED,

    ASSIGNING_DRIVER,

    IN_RIDE,

    COMPLETED
}

