package com.ujjwal.Ujjwal.Ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private String method;
    private String status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "created_at")
    private final LocalDateTime localDateTime = LocalDateTime.now();


}
