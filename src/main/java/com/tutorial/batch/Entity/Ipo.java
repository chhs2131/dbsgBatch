package com.tutorial.batch.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ipo {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    @Id
    private Long id;

    private Long amount;
    private String txName;
    private String name;
    private LocalDateTime txDateTime;

    public Ipo(Long amount, String txName, String txDateTime) {
        this.amount = amount;
        this.txName = txName;
        this.txDateTime = LocalDateTime.parse(txDateTime, FORMATTER);
    }

    public Ipo(Long id, Long amount, String txName, String txDateTime) {
        this.id = id;
        this.amount = amount;
        this.txName = txName;
        this.txDateTime = LocalDateTime.parse(txDateTime, FORMATTER);
    }

    public Ipo(Long amount, String txName, LocalDateTime txDateTime) {
    }
}
